package com.test.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
public class NoticeController {
	@GetMapping("list")	// list, detail, deit, reg, del
	public String list(Model model) {
		
		model.addAttribute("test", "Hello");
		
		return "list";
	}
	
	@GetMapping("detail")	// list, detail, deit, reg, del
	public String detail() {
		return "detail";
	}
} 
