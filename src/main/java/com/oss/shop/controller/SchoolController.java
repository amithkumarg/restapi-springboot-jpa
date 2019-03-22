package com.oss.shop.controller;

import com.oss.shop.repo.SchoolRepo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@Api
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

