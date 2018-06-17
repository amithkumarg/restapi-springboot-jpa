package com.oss.shop.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private Integer number;

    private String  name;
    private String  type;
    private int     enrollment;
    private Date    updated;

    @Embedded
    private ContactInfo contactInfo;
        
    @OneToMany(mappedBy = "district")
    //@JsonManagedReference //to avoid JSON recursion solution 1
    //@JsonIgnoreProperties("district") //to avoid JSON recursion solution 2
    @JsonIgnore
    private Set<School> schools;

}
