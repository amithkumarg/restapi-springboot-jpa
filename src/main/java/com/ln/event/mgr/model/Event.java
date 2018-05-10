package com.ln.event.mgr.model;

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
 * Event Entity
 * 
 * @author AmithKumar
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "event", uniqueConstraints = { 
		@UniqueConstraint(columnNames = "event_code"),
		@UniqueConstraint(columnNames = "event_name") })
public class Event implements Serializable {

	private static final long serialVersionUID = -6640289907377623936L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id", unique = true)
	private Integer id;
	
	@Column(name = "event_code", unique = true, nullable = false, length = 20)
	private String code;
	
	@Column(name = "event_name", unique = true, nullable = false, length = 50)
	private String name;

}
