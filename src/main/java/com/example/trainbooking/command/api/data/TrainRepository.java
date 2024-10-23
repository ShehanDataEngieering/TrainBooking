package com.example.trainbooking.command.api.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<TrainBooking, String> {
    

}
