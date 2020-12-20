package com.springboot.lil.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

//	@RestController
//	@RequestMapping
//	public class RoomController {
//		@Autowired
//		private RoomRepository roomRepository;
//		@Autowired
//		private GuestRepository guestRepository;
//		@Autowired
//		private ReservationRepository reservationRepository;
//
//		@GetMapping(path = "/rooms")
//		public Iterable<Room> getRooms() {
//			return roomRepository.findAll();
//		}
//
//		@GetMapping(path = "/guests")
//		public Iterable<Guest> getGuests() {
//			return guestRepository.findAll();
//		}
//
//		@GetMapping(path = "/reservations")
//		public Iterable<Reservation> getReservations() {
//			return reservationRepository.findAll();
//		}
//	}

}
