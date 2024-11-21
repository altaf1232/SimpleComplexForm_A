package com.simplecomplexform.home;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Correct import for Spring MVC's Model
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // Mapping for the home page
    @RequestMapping("/")
    public String home() {
        return "homes"; // View name for the home page
    }

    // Handle request for "/welcome"
    @RequestMapping("/welcome")
     public String welcome(@RequestParam("user") String name, Model model) {
        // Log the received name
        System.out.println(name);
        
        // Add the name to the model (fixed the method usage)
        model.addAttribute("name", name);
        
        return "welcome"; // View name for the welcome page
    }
    
    
}
