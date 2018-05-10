package com.ln.event.mgr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ln.event.mgr.model.Seat.SeatType;
import lombok.Data;

/**
 * Event_Inventory Entity
 * 
 * @author AmithKumar
 *
 */
@Data
@Entity
@Table(name = "event_inventory")
public class EventInventory implements Serializable{

	private static final long serialVersionUID = -5121584953517150997L;
	
	@Id
	@Column(name = "inventory_id")
	@JsonIgnore
	private Integer inventoryId;
	
	@Column(name = "event_code")
	private String eventCode;
	
	@Column(name = "event_name")
	private String eventName;
	
	@Column(name = "venue_code")
	private String venueCode;
	
	@Column(name = "seat_code")
	private String seatCode;
	
	@Column(name = "aisle")
	private Boolean aisle;
	
	@Column(name = "available")
	private Boolean available;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "seat_type")
	private SeatType seatType;

}
