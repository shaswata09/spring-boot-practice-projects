package com.springboot.lil.learningspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.lil.learningspring.data.entity.Guest;
import com.springboot.lil.learningspring.data.entity.Reservation;
import com.springboot.lil.learningspring.data.entity.Room;
import com.springboot.lil.learningspring.data.repository.GuestRepository;
import com.springboot.lil.learningspring.data.repository.ReservationRepository;
import com.springboot.lil.learningspring.data.repository.RoomRepository;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

	@RestController
	@RequestMapping
	public class RoomController {
		@Autowired
		private RoomRepository roomRepository;
		@Autowired
		private GuestRepository guestRepository;
		@Autowired
		private ReservationRepository reservationRepository;

		@GetMapping(path = "/rooms")
		public Iterable<Room> getRooms() {
			return roomRepository.findAll();
		}

		@GetMapping(path = "/guests")
		public Iterable<Guest> getGuests() {
			return guestRepository.findAll();
		}

		@GetMapping(path = "/reservations")
		public Iterable<Reservation> getReservations() {
			return reservationRepository.findAll();
		}

	}

}
