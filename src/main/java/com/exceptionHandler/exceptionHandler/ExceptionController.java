package com.exceptionHandler.exceptionHandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

	@GetMapping("/get")
	public String geEmployees() {
		return "Employees";
	}
	
	@GetMapping("/getAllEmployees")
	public void getAllEmployees() throws ApiException {
		 throw new ApiException("throwing api exception");
	}
	@GetMapping("/wrongPage")
	public void WrongPageException() throws PageNotFoundException {
		 throw new PageNotFoundException("throwing Pagenotfound exception");
	}
	@GetMapping("/wrongMethod")
	public void WrongMethodException() throws NoMethodFoundException {
		 throw new NoMethodFoundException("throwing NoMethodFoundException exception");
	}
}	
