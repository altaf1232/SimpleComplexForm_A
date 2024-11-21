package com.simplecomplexform.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplecomplexform.entity.Student;

@Controller
public class FormController {

	// Display the form
	@RequestMapping("/complex")
	public String showForm() {
		return "complex_form"; // View name for the form
	}

	// Handle form submission using @RequestParam
	@RequestMapping(path = "/handelform", method = RequestMethod.POST)
	public String handleFormWithRequestParam(@RequestParam("name") String name, @RequestParam("id") long id,
			Model model) {
		// Print received data
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);

		// Add data to the model to display in the success view
		model.addAttribute("name", name);
		model.addAttribute("id", id);

		return "success"; // Success view
	}

	// Handle form submission using @ModelAttribute
	@RequestMapping(path = "/handelform", method = RequestMethod.POST, params = "modelBinding")
	public String handleFormWithModelAttribute(@ModelAttribute("student") Student student) {
		// Auto-binding form data to the Student object
		System.out.println("Form Data: " + student);
		System.out.println("Address: " + student.getAddress());

		return "success"; // Success view
	}

	// Handle form submission with validation
	@RequestMapping(path = "/handelform", method = RequestMethod.POST, params = "withValidation")
	public String handleFormWithValidation(@ModelAttribute("student") Student student, BindingResult result) {
		// Check for validation errors
		if (result.hasErrors()) {
			System.out.println("Validation errors found.");
			return "complex_form"; // Return to the form with errors
		}

		// Print form data if valid
		System.out.println("Valid Form Data: " + student);
		System.out.println("Address: " + student.getAddress());

		return "success"; // Success view
	}
}
