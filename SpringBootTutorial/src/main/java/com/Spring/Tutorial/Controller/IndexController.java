package com.Spring.Tutorial.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;

import com.Spring.Tutorial.Entity.InventoryEntity;
import com.Spring.Tutorial.Repository.InventoryRepository;
import com.Spring.Tutorial.Service.InventoryService;

@Controller
public class IndexController {
	
	@Autowired
	InventoryRepository Inv;
	@Autowired
	private final InventoryService inv;
    
    public IndexController(InventoryService inv) {
        this.inv = inv;
    }
	
	@GetMapping("/Index")
	public String Index(Model model) {
		
		model.addAttribute("user", new InventoryEntity());
	    model.addAttribute("InvList", Inv.findAll());
		return "Index";
	}
	
	@PostMapping("/users")
    public String createUser(@ModelAttribute("user") InventoryEntity user) {
        inv.saveUser(user);
        return "redirect:/Index"; 
    }
	
	@PostMapping("/delete/{timesheetID}")
    public String deleteInventoryItem(@PathVariable int timesheetID, RedirectAttributes redirectAttributes) {
        inv.deleteById(timesheetID);
        redirectAttributes.addFlashAttribute("message", "Timesheet deleted successfully");
        return "redirect:/Index"; 
    }

}
