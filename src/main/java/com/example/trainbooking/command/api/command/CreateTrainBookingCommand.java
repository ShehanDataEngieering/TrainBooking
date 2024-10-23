package com.example.trainbooking.command.api.command;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class CreateTrainBookingCommand {

    @TargetAggregateIdentifier
    private String trainBookingId;
    private String mailId;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private Long phoneNumber;
    private String orderStatus;




}
