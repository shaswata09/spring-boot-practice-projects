package com.springboot.lil.learningspring.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "GUEST")
public class Guest {
	@Id
	@Column(name = "GUEST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private long guestId;

	@Column(name = "FIRST_NAME")
	@Getter
	@Setter
	private String firstName;

	@Column(name = "LAST_NAME")
	@Getter
	@Setter
	private String lastName;

	@Column(name = "EMAIL_ADDRESS")
	@Getter
	@Setter
	private String emailAddress;

	@Column(name = "ADDRESS")
	@Getter
	@Setter
	private String address;

	@Column(name = "COUNTRY")
	@Getter
	@Setter
	private String country;

	@Column(name = "STATE")
	@Getter
	@Setter
	private String state;

	@Column(name = "PHONE_NUMBER")
	@Getter
	@Setter
	private String phoneNumber;

}
