package com.testapp.delivery.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.delivery.dao.LoginDao;
import com.testapp.delivery.entity.LoginUser;



@RestController
@CrossOrigin("*")
public class LoginController {
	@Autowired
	LoginDao loginDao;

	@RequestMapping("/")
	@ResponseBody
	public String get() {

		return "hello";

	}

	@GetMapping("loginusers")
	public ResponseEntity<List<LoginUser>> getSongss() {

		List<LoginUser> list = null;

		list = loginDao.findAll();

		return new ResponseEntity<>(!list.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND);
		// !list.isEmpty() ? list : new ArrayList<>()

	}

}
