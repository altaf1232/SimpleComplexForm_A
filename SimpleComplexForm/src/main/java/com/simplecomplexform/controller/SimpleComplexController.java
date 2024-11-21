
package com.simplecomplexform.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SimpleComplexController {

	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {

		System.out.println(userId);
		System.out.println(userName);
		Integer.parseInt(userName);
		return "home";

	}

	@RequestMapping("/home")
	public String home() {

		System.out.println("going to home view.....");

		String str = null;
		System.out.println(str.length());

		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) { // data ko nikalane key liye ham used karte hai
																			// @RequestParama //@RequestParama() key
																			// aander hamko likhana
		// huta hai aapne form field ka name ju diya hai hamare form key ander aaur uss
		// form ka name //home.jsp iss ma hamre form ka name="querybox" iss ko likhan
		// hai
		String url = "https://www.google.com/search?q=" + query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}

	// handling exception in our spring mvc
	//@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	//@ExceptionHandler({ NullPointerException.class })
	//public String expectionHandlerNull(Model m) {
		//m.addAttribute("this is your null pointer Exception ");

		//return "null_page";
	//}

	//@ExceptionHandler({ NumberFormatException.class })
	//public String expectionHandlerNumberFormat(Model m) {
		//m.addAttribute("this is your NumberFormat Exception ");

		//return "null_page";
	//}
	//har eaak expection ko handel karta hai 
	//@ExceptionHandler({ Exception.class })
	//public String expectionHandlerGenric(Model m) {
		//m.addAttribute("this is your NumberFormat Exception ");

		//return "null_page";
	//}
}