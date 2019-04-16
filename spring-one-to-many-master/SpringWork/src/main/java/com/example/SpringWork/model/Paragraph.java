package com.example.SpringWork.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Paragraph {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer parid;
	private String name;
	
	@ManyToOne
	@JoinColumn
	@JsonIgnore
	private Section section;

	

	public Integer getParid() {
		return parid;
	}

	public void setParid(Integer parid) {
		this.parid = parid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
	
	

}
