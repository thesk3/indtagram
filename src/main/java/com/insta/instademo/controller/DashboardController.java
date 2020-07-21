package com.insta.instademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin("*")
public class DashboardController {

//	@Autowired
//	DashboardService dashboardService;
	
//	@GetMapping("/getUserList")
	

@Autowired
loginRepository repository;

	@RequestMapping(value = "/login")
	public @ResponseBody String getme(@RequestBody LoginVO  vo) {

		System.out.println("in login--->"+vo.toString());
		String s="hello";
		repository.save(vo);

		return s;
	}
	@RequestMapping(value = "/dummy")
	public @ResponseBody String dummy() {

		String s="dummy data workde";

		return s;
	}
	
	@RequestMapping("/getAll")
	public @ResponseBody List addToUserList() {
		
		List<LoginVO> ls=repository.findAll();
		System.out.println("in message--->"+ls);
		return ls;
	}



}
