package com.oss.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;
import javax.ws.rs.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oss.shop.repo.EventInventoryRepo;
import com.oss.shop.rq.dto.EventSeat;
import com.oss.shop.rs.dto.EventInventorys;

/**
 * handles all valid requests for viewing event(s) data
 * 
 * @author AmithKumar
 *
 */
@RestController
@Validated
public class EventController {
	
	enum CODES{
		amith,
		krista
	}

  @Autowired
  private EventInventoryRepo eventInventoryRepo;

  /**
   * return all events all data
   * 
   * @return
   */
  @GetMapping("/events")
  @ResponseBody
  public Object listEvents() {
    return eventInventoryRepo.findAll();
  }

  /**
   * return only requested event data
   * 
   * @return
   */
  @GetMapping("/events/{eventCode}")
  @ResponseBody
  public Object findEvent(@PathVariable("eventCode") String eventCode) {
    return eventInventoryRepo.findByEventCode(eventCode);
  }
  
  /**
   * return only requested event data
   * 
   * @return
   */
	@GetMapping("/eventlist")
	@ResponseBody
	public Object findEventList(@TRequ(value="codes") String eventCodes) {
		System.out.println(eventCodes);
		return eventInventoryRepo.findByEventCode(eventCodes);
	}
	
  /**
   * return only requested event data
   * 
   * @return
   */
	@GetMapping("/eventvalid")
	@ResponseBody
	public Object findEventByParam(
			@NotNull(message = "Event Code can't empty or null") @RequestParam(name="code", required=false) String eventCode) {
		return eventInventoryRepo.findByEventCode(eventCode);
	}

  /**
   * return you event summary based on requested filters
   * 
   * @param eventSeat
   * @return
   */
  @PostMapping("/events")
  @ResponseBody
  public Object eventSummary(EventSeat eventSeat) {
    return eventInventoryRepo.count(eventSeat.getEventCode(), eventSeat.getAvailable(),
        eventSeat.getSeatType() == null ? null : eventSeat.getSeatType().name(),
        eventSeat.getAisle());
  }
  
   /**
   * return only requested event data
   * 
   * @return
   */
  @GetMapping("/events/xml/{eventCode}")
  @ResponseBody
  public Object findEventXMLList(@PathVariable("eventCode") String eventCode) {
    return new EventInventorys(eventInventoryRepo.findByEventCode(eventCode));
  }
  	
}
