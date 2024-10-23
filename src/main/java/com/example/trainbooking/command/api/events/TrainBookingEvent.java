package com.example.trainbooking.command.api.events;

import lombok.Data;

@Data
public class TrainBookingEvent {

    private String trainBookingId;
    private String mailId;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private Long phoneNumber;


}
