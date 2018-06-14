package com.oss.shop.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Seat Entity
 * 
 * @author AmithKumar
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "seat", uniqueConstraints = { 
		@UniqueConstraint(columnNames = "seat_code")})
public class Seat implements Serializable {
	
	private static final long serialVersionUID = -5537887717677243982L;
	
	public enum SeatType{
		adult,
		child;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seat_id", unique = true)
	private Integer id;
	
	@Column(name = "venue_code", nullable = false, length = 20)
    private String venueCode;
	
	@Column(name = "seat_code", unique = true, nullable = false, length = 3)
	private String code;
	
	@Column(name = "aisle")
	private Boolean aisle;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "seat_type", nullable = false)
	private SeatType seatType;


}
