package com.example.trainbooking.command.api.events;

import com.example.trainbooking.command.api.data.TrainBooking;
import com.example.trainbooking.command.api.data.TrainRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TrainBookingEventHandler {

    private TrainRepository trainRepository;

    public TrainBookingEventHandler(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    @EventHandler
    public void on(TrainBookingEvent event) {
        TrainBooking trainBooking = new TrainBooking();
        BeanUtils.copyProperties(event, trainBooking);
        trainRepository.save(trainBooking);


    }

}
