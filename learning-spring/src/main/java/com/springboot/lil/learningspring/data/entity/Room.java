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
@Table(name = "ROOM")
public class Room {
	@Id
	@Column(name = "ROOM_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private long roomId;

	@Column(name = "NAME")
	@Getter
	@Setter
	private String roomName;

	@Column(name = "ROOM_NUMBER")
	@Getter
	@Setter
	private String roomNumber;

	@Column(name = "BED_INFO")
	@Getter
	@Setter
	private String bedInfo;
}
