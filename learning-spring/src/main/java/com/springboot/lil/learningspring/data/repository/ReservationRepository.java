package com.springboot.lil.learningspring.data.repository;

import java.sql.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.lil.learningspring.data.entity.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
	Iterable<Reservation> findByResDate(Date date);
}
