package com.user.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id ;
	@javax.validation.constraints.NotNull
	@Size(min=2,message="first name must be at least 2 characters!")
	private String  firstName;
	@javax.validation.constraints.NotNull
	@Size(min=2,message="lastname must be at least 2 characters!")
	private String lastName;
	@javax.validation.constraints.NotNull
	@Email
	private String email;

}
