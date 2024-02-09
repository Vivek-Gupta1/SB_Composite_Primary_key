package com.vivek.entity;

import com.vivek.Pk.CompositeKey;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Emp_tbl")
public class Employee {

	private String name;
	private String stream;
	
	@EmbeddedId
	private CompositeKey pk;
}
