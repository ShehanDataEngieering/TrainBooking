package com.example.trainbooking.command.api.aggregate;

import com.example.trainbooking.command.api.command.CreateTrainBookingCommand;
import com.example.trainbooking.command.api.events.TrainBookingEvent;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.BeanUtils;

public class TrainBookingAggregate {


    @AggregateIdentifier
    private String trainBookingId;
    private String mailId;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private Long phoneNumber;

    public TrainBookingAggregate() {

    }

    @CommandHandler
    public TrainBookingAggregate(CreateTrainBookingCommand createTrainBookingCommand) {

        TrainBookingEvent trainBookingEvent = new TrainBookingEvent();
        BeanUtils.copyProperties(createTrainBookingCommand, trainBookingEvent);
        AggregateLifecycle.apply(trainBookingEvent);


    }

    @EventSourcingHandler
    public void on(TrainBookingEvent event) {
        this.trainBookingId = event.getTrainBookingId();
        this.mailId = event.getMailId();
        this.password = event.getPassword();
        this.firstName = event.getFirstName();
        this.lastName = event.getLastName();
        this.address = event.getAddress();
        this.phoneNumber = event.getPhoneNumber();



    }


}
