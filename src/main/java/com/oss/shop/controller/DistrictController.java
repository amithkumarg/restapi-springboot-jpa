package com.oss.shop.controller;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.oss.shop.repo.DistrictRepo;

@RestController
public class DistrictController {

	@Autowired
	private DistrictRepo districtRepo;

	/**
	 * return all districts
	 * 
	 * @return
	 */
	@GetMapping("/districts")
	@ResponseBody
	public Object listDistricts() {
		return districtRepo.findAll();
	}
	
	@GetMapping("/district/{date}")
	@ResponseBody
	public Object listDistrictByDate(@PathVariable String date) {
		final LocalDate dt = LocalDate.parse(date);
		return districtRepo.findByDate(dt);
	}
}
