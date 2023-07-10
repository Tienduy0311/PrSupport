package com.company.base.controller;

import com.company.base.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BaseController {

	@Autowired
	private IBaseService baseService;

	@GetMapping("/base")
	public ResponseEntity<String> base() {
		String mess = "Base Spring Boot!";
		return ResponseEntity.ok(mess);
	}
}
