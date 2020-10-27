package com.project.professor.allocation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Professor")
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "cpf", nullable = false, unique = true)
	private Integer cpf;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	
	public Professor(Long id, Integer cpf, String name) {
		
		this.id = id;
		this.cpf = cpf;
		this.name = name;
	}

	public Professor() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCPF() {
		return cpf;
	}

	public void setCPF(Integer cPF) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
