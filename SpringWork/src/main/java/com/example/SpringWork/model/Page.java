package com.example.SpringWork.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Page {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pgid;
	private String name;
	
	@ManyToOne
	@JoinColumn
	@JsonIgnore
	private Card card;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "page")
	List<Section> sections;

	public Integer getPgid() {
		return pgid;
	}

	public void setPgid(Integer pgid) {
		this.pgid = pgid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	
	

}
