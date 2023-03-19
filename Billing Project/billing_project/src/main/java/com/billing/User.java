package com.billing;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "users")
public class User {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private Long number;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false, length = 30)
	private String password;

	

}
