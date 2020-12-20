package com.springboot.lil.learningspring.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
	@Id
	@Column(name = "RESERVATION_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private long reservationId;

	@Column(name = "ROOM_ID")
	@Getter
	@Setter
	private long roomId;

	@Column(name = "GUEST_ID")
	@Getter
	@Setter
	private long guestId;

	@Column(name = "RES_DATE")
	@Getter
	@Setter
	private Date resDate;
}
