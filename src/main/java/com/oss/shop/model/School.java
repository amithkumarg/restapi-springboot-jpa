package com.oss.shop.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, nullable = false)
    private Long number;
    
    @Column(nullable = false)
    private String name;

    private boolean closed;

    @Embedded
    private ContactInfo contactInfo;

    private String gradeLow;
    private String gradeHigh;
    private int enrollment;

    @ManyToOne
    @JoinColumn(name = "district_id", nullable = false)
    //@JsonBackReference //to avoid JSON recursion solution 1
    //@JsonIgnoreProperties("schools") //to avoid JSON recursion solution 2
    @JsonIgnore
    private District district;

} 