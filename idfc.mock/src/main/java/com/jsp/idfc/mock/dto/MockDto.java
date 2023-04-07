package com.jsp.idfc.mock.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class MockDto {
	@Id
	private int id;
	private String name;
	private String email; 
}
