package com.ln.event.mgr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ln.event.mgr.repo.EventInventoryRepo;
import com.ln.event.mgr.rq.dto.EventSeat;

/**
 * handles all valid requests for viewing event(s) data
 * 
 * @author AmithKumar
 *
 */
@RestController
public class EventController {

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



}
