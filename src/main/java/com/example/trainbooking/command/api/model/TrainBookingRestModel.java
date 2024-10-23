package com.example.trainbooking.command.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainBookingRestModel {
    private String mailId;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private Long phoneNumber;






}
