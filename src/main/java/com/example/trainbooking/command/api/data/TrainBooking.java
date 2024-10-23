package com.example.trainbooking.command.api.data;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trainBooking")

public class TrainBooking {

    @Id
    private String trainBookingId;
    private String mailId;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private Long phoneNumber;
    private String orderStatus;



}
