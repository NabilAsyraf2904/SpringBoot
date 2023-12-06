package com.Spring.Tutorial.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/Index")
	public String Index() {
		
		return "Index";
	}

}
