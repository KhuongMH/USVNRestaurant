package com.khuongtest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.khuongtest.dao.AccountDAO;
import com.khuongtest.dao.FoodDAO;
import com.khuongtest.model.Food;
import com.khuongtest.service.AccountService;

@Controller
public class AdminController {
	
	@Autowired(required = true)
	private AccountService accountService;
	
	@RequestMapping(value = "/AdminPanel", method = { RequestMethod.GET, RequestMethod.HEAD })
	public String index(Model model, HttpServletRequest request) {
//		if (request.getSession().getAttribute("login") != null) {
//			if (request.getSession().getAttribute("login").equals(Boolean.TRUE)) {
//				model.addAttribute("listRestaurants", restaurantDAO.findAll());
//				return "pages/admin/main";
//			}
//		}
		return "admin/login";
	}
//
//	@RequestMapping(value = "/AdminPanel/login", method = RequestMethod.POST)
//	public String login(@RequestParam(value = "username") String username,
//			@RequestParam(value = "password") String password, HttpServletRequest request) {
//		if (accountDAO.checkAdminLogin(username,password)) {
//			request.getSession().setAttribute("login", true);
//			return "pages/admin/main";
//		}
//		request.getSession().setAttribute("login", false);
//		return "pages/admin/login";
//	}
//
//	@RequestMapping(value = "/AdminPanel/cFood", method = RequestMethod.GET)
//	public String createFood(Model model, HttpServletRequest request) {
//		if (request.getSession().getAttribute("login") != null) {
//			if (request.getSession().getAttribute("login").equals(Boolean.TRUE)) {
//				Food food = new Food();
//				model.addAttribute("newFood", food);
//				return "pages/admin/enterfood";
//			}
//		}
//		return "pages/admin/login";
//	}
}
