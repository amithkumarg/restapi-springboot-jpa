package com.oss.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.oss.shop.repo.SchoolRepo;

import java.util.Arrays;
import java.util.Collections;

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

	@GetMapping("/schoolfilter")
	@ResponseBody
	public Object listSchoolsById() {
		return schoolRepo.findSchoolByIdIn(Arrays.asList(1L, 2L));
	}

	@GetMapping("/schoolnofilter")
	@ResponseBody
	public Object listSchoolsByNoId() {
		return schoolRepo.findSchoolByIdIn(null);
	}
}
