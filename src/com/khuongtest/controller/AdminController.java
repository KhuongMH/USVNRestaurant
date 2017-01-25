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
		if (request.getSession().getAttribute("login") != null) {
			if (request.getSession().getAttribute("login").equals(Boolean.TRUE)) {
//				model.addAttribute("listRestaurants", restaurantDAO.findAll());
				return "admin/main";
			}
		}
		return "admin/login";
	}

	@RequestMapping(value = "/AdminPanel/login", method = RequestMethod.POST)
	public String login(@RequestParam(value = "phone") String phone,
			@RequestParam(value = "password") String password, HttpServletRequest request) {
		if (accountService.checkAdminLogin(phone,password)) {
			request.getSession().setAttribute("login", true);
			return "admin/main";
		}
		request.getSession().setAttribute("login", false);
		return "admin/login";
	}
	
	@RequestMapping(value = "/AdminPanel/Restaurant", method = { RequestMethod.GET, RequestMethod.HEAD })
	public String restaurant(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("login") != null) {
			if (request.getSession().getAttribute("login").equals(Boolean.TRUE)) {
//				model.addAttribute("listRestaurants", restaurantDAO.findAll());
				return "admin/l_restaurant";
			}
		}
		return "admin/login";
	}
	
	@RequestMapping(value = "/AdminPanel/Food", method = { RequestMethod.GET, RequestMethod.HEAD })
	public String food(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("login") != null) {
			if (request.getSession().getAttribute("login").equals(Boolean.TRUE)) {
//				model.addAttribute("listRestaurants", restaurantDAO.findAll());
				return "admin/l_food";
			}
		}
		return "admin/login";
	}
	
	@RequestMapping(value = "/AdminPanel/Account", method = { RequestMethod.GET, RequestMethod.HEAD })
	public String account(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("login") != null) {
			if (request.getSession().getAttribute("login").equals(Boolean.TRUE)) {
//				model.addAttribute("listRestaurants", restaurantDAO.findAll());
				return "admin/l_account";
			}
		}
		return "admin/login";
	}

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
