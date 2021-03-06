package com.Ajay.flightReservation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ajay.flightReservation.models.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

	Users findByEmail(String email);
}
