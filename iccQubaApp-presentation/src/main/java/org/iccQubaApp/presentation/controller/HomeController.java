package org.iccQubaApp.presentation.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.iccQubaApp.IAccountService;
import org.iccQubaApp.persistence.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	private IAccountService accountService;

	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		
		return new ModelAndView("home");
	}
	@RequestMapping("/listAccount")
	public String accountDetails(Model model) {
		List<Account> listAccount = accountService.findAllAccount("test");
		model.addAttribute("listAccount", listAccount);
		return "listAccount";
	}
}
