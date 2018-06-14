package com.oss.shop.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.oss.shop.controller.EventController;
import com.oss.shop.model.EventInventory;
import com.oss.shop.repo.EventInventoryRepo;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.Collections;
import java.util.List;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import org.hamcrest.core.Is;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@RunWith(SpringRunner.class)
@WebMvcTest(EventController.class)
public class EventControllerTest {
  
  @Autowired
  private MockMvc mvc;
  
  @MockBean
  private EventInventoryRepo eventInventoryRepo;
  
  @Test
  public void testListEvents() throws Exception{
    EventInventory eventInventory = new EventInventory();
    eventInventory.setEventCode("TestEvent");
    
    List<EventInventory> allEvents = Collections.singletonList(eventInventory);
    
    given(eventInventoryRepo.findAll()).willReturn(allEvents);
    
    mvc.perform(get("/events").contentType(APPLICATION_JSON))
    .andExpect(status().isOk())
    .andExpect(jsonPath("$", hasSize(1)))
    .andExpect(jsonPath("$[0].eventCode", Is.is(eventInventory.getEventCode())));
  }
  
  @Test
  public void testFindEvent() throws Exception{
    //TODO
  }
  
  @Test
  public void testEventSummary() throws Exception{
    //TODO
  }
  
}
