package com.springboot.controllers;

import com.springboot.dtos.FlightBookingAcknowledgement;
import com.springboot.dtos.FlightBookingRequest;
import com.springboot.services.FlightBookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class FlightBookingController {

    private FlightBookingService service;

    public FlightBookingController(FlightBookingService service) {
        this.service = service;
    }

    @PostMapping("/flight")
    public ResponseEntity<FlightBookingAcknowledgement> bookFlightTicket(@RequestBody FlightBookingRequest request) {
        return new ResponseEntity<>(service.bookFlightTicket(request), HttpStatus.OK);
    }
}
