package com.simplecomplexform;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController {

    @RequestMapping("/fileform")
    public String showUploadForm() {
        return "fileform";
    }

    @RequestMapping(value = "uploadimage")
    public ModelAndView fileUpload(@RequestParam("profile") MultipartFile file, HttpSession s) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("fileUpload Handler");
        
        // Log file details
        System.out.println("Content Type: " + file.getContentType());
        System.out.println("Size: " + file.getSize());
        System.out.println("Original Filename: " + file.getOriginalFilename());
        System.out.println("Name: " + file.getName());

        // Define a safe upload directory
        String uploadDir = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources";
        File directory = new File(uploadDir);
        if (!directory.exists()) {
            directory.mkdirs(); // Create directories if they don't exist
        }

        // Define the full path
        String path = uploadDir + File.separator + file.getOriginalFilename();
        System.out.println("Upload Path: " + path);

        try {
            // Save the file
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(file.getBytes());
            fos.close();
            System.out.println("File Uploaded Successfully");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error during file upload");
        }

        modelAndView.setViewName("fileUploadSuccess");
        return modelAndView;
    }
}
