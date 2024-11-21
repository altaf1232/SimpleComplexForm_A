package com.simplecomplexform;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

    // Handle NullPointerException
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(NullPointerException.class)
    public String exceptionHandlerNull(Model model) {
        model.addAttribute("message", "This is your NullPointerException.");
        return "error/null_page"; // Adjust the path if necessary
    }

    // Handle NumberFormatException
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NumberFormatException.class)
    public String exceptionHandlerNumberFormat(Model model) {
        model.addAttribute("message", "This is your NumberFormatException.");
        return "error/number_format_page"; // Optional: Use a specific page
    }

    // Handle Generic Exceptions
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public String exceptionHandlerGeneric(Model model) {
        model.addAttribute("message", "This is a generic exception.");
		return "error/generic_error_page"; // Optional: Use a generic error page
	}
}
