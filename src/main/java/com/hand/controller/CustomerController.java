package com.hand.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hand.dto.Customer;
import com.hand.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	public @ResponseBody List<Customer> list(@RequestParam(defaultValue = "0") int page) {
//		System.out.println(page);
		List<Customer> list = customerService.getListByPage(page);
//		System.out.println(list);
		return list;
	}

	@RequestMapping("/login")
	public String login(@RequestParam String name, HttpSession session) {
		if (customerService.login(name)) {
			session.setAttribute("currentUser", name);
			return "redirect:index.jsp";
		} else {
			return "redirect:login.jsp";
		}
	}
	
	@RequestMapping("/toAdd")
	public String toAdd() {
		
		return "toAdd.jsp";
	}
	
}
