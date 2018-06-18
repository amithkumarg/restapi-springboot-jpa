package com.oss.shop.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oss.shop.model.District;

public interface DistrictRepo extends JpaRepository<District, Long> {
	@Query(value = "SELECT * FROM lnevent.district"
			+ " WHERE updated >= ?1"
			, nativeQuery = true)
	List<District> findByDate(LocalDate date);
}
