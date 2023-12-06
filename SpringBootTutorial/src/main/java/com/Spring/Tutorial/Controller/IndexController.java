package com.Spring.Tutorial.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.Spring.Tutorial.Repository.InventoryRepository;

@Controller
public class IndexController {
	
	@Autowired
	InventoryRepository Inv;
	
	@GetMapping("/Index")
	public String Index() {
		
		return "Index";
	}
	
	@GetMapping("")
	public String getInvList(Model model) {
	    
	    model.addAttribute("InvList", Inv.findAll());
	    return "Index"; 
	}

}
