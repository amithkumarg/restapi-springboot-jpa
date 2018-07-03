package com.oss.shop.rs.dto;

import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.oss.shop.model.EventInventory;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@JacksonXmlRootElement(localName = "events")
public class EventInventorys {
	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "event")
	private List<EventInventory> events;
}
