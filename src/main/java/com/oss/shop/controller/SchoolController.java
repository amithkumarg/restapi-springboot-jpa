package com.oss.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.oss.shop.repo.SchoolRepo;

@RestController
public class SchoolController {

	@Autowired
	private SchoolRepo schoolRepo;

	/**
	 * return all schools
	 * 
	 * @return
	 */
	@GetMapping("/schools")
	@ResponseBody
	public Object listSchools() {
		return schoolRepo.findAll();
	}
}
