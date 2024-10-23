package com.example.trainbooking.command.api.saga;

import com.example.trainbooking.command.api.events.TrainBookingEvent;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.modelling.saga.SagaEventHandler;
import org.axonframework.modelling.saga.StartSaga;
import org.axonframework.spring.stereotype.Saga;

@Saga
@Slf4j
public class TrainBookingSaga {
    @StartSaga
    @SagaEventHandler(associationProperty = "trainBookingId")
    private void handle(TrainBookingEvent trainBookingEvent){
        log.info("Handling TrainBookingEvent");

    }


}
