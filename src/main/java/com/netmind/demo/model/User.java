package com.netmind.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

	@Id
	private Long id;

	@Column(name = "userName")
	private String userName;

	@Column(name = "pwd")
	private String pwd;

	// Ignore this field in the database
	@Transient
	private String token;

}
