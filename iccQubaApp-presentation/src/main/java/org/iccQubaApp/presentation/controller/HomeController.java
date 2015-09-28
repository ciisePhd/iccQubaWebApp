package org.iccQubaApp.presentation.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.iccQubaApp.IServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	private IServiceTest serviceTest;

	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		
		return new ModelAndView("home");
	}
	@RequestMapping("/viewTest")
	public String accountDetails(Model model) {
		String msg = serviceTest.test("test");
		model.addAttribute("msg", msg);
		return "viewTest";
	}
}
