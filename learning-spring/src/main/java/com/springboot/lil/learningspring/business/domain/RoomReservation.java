package com.springboot.lil.learningspring.business.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class RoomReservation {
	@Getter
	@Setter
	private long roomID;
	@Getter
	@Setter
	private long guestId;
	@Getter
	@Setter
	private String roomName;
	@Getter
	@Setter
	private String roomNumber;
	@Getter
	@Setter
	private String firstName;
	@Getter
	@Setter
	private String lastName;
	@Getter
	@Setter
	private Date date;
}
