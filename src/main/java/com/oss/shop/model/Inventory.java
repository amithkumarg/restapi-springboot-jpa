package com.oss.shop.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Inventory Entity
 * @author AmithKumar
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inventory", uniqueConstraints = { 
		@UniqueConstraint(columnNames = {"event_id", "seat_id"}) })
public class Inventory implements Serializable {
	
	private static final long serialVersionUID = -5537887717677243982L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inventory_id", unique = true)
	private Integer id;
	
	@Column(name = "event_id")
	private Integer eventId;
	
	@Column(name = "seat_id")
	private Integer seatId;
	
	@Column(name = "available")
	private Boolean available;
}
