package com.ln.event.mgr.rq.dto;

import java.io.Serializable;
import lombok.Data;
import com.ln.event.mgr.model.Seat.SeatType;

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
