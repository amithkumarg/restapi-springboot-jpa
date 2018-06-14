package com.oss.shop.rq.dto;

import java.io.Serializable;

import com.oss.shop.model.Seat.SeatType;

import lombok.Data;

/**
 * 
 * @author AmithKumar
 *
 */
@Data
public class EventSeat implements Serializable {

	private static final long serialVersionUID = -5835451949605222511L;
	private String eventCode;
	private SeatType seatType;
	private Boolean aisle;
	private Boolean available;

}
