package com.example.trainbooking.command.api.controller;

import com.example.trainbooking.command.api.command.CreateTrainBookingCommand;
import com.example.trainbooking.command.api.model.TrainBookingRestModel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/trainBooking")
public class TrainBookingController {


    private CommandGateway commandGateway;

    public TrainBookingController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;

    }
   @PostMapping
    public String createTrainBooking(@RequestBody TrainBookingRestModel trainBookingRestModel) {
        String trainBookingId = UUID.randomUUID().toString();

        CreateTrainBookingCommand createTrainBookingCommand =
                CreateTrainBookingCommand.builder().
                        trainBookingId(trainBookingId)
                        .mailId(trainBookingRestModel.getMailId())
                        .address(trainBookingRestModel.getAddress())
                        .password(trainBookingRestModel.getPassword())
                        .firstName(trainBookingRestModel.getFirstName())
                        .lastName(trainBookingRestModel.getLastName())
                        .phoneNumber(trainBookingRestModel.getPhoneNumber())
                        .orderStatus("CREATED")
                        .build();

        commandGateway.sendAndWait(createTrainBookingCommand);

        return "Created train booking with id " + trainBookingId;


    }

}
