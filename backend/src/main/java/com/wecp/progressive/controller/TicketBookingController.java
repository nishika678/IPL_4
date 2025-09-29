package com.wecp.progressive.controller;

import com.wecp.progressive.entity.TicketBooking;
<<<<<<< HEAD
import com.wecp.progressive.repository.TicketBookingRepository;
import com.wecp.progressive.service.TicketBookingService;
import com.wecp.progressive.service.impl.TicketBookingServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/ticket")
public class TicketBookingController {

private TicketBookingService ticketBookingService;
@Autowired

public TicketBookingController(TicketBookingService ticketBookingService) {
    this.ticketBookingService = ticketBookingService;
}
@ExceptionHandler(SQLException.class)
public  ResponseEntity<?> handleException(SQLException sqlex){
    return (new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
}
@GetMapping
    public ResponseEntity<List<TicketBooking>> getAllBookings(){
        return new ResponseEntity<>(ticketBookingService.getAllTicketBookings(),HttpStatus.OK);
        
    }
@PostMapping
    public ResponseEntity<Integer> createBooking(@RequestBody TicketBooking ticketBooking) {
        
            return new ResponseEntity<>(ticketBookingService.createBooking(ticketBooking),HttpStatus.CREATED);

        
    }
@DeleteMapping("/{bookingId}")
    public ResponseEntity<Void> cancelBooking(@PathVariable int bookingId){
            ticketBookingService.cancelBooking(bookingId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        
    }
@GetMapping("/user/{email}")
    public ResponseEntity<List<TicketBooking>> getBookingsByUserEmail(@PathVariable String email){
        return new ResponseEntity<>(ticketBookingService.getBookingsByUserEmail(email),HttpStatus.OK);
    
}
=======
import org.springframework.http.ResponseEntity;

import java.util.List;

public class TicketBookingController {

    public ResponseEntity<List<TicketBooking>> getAllBookings() {
        return null;
    }

    public ResponseEntity<Integer> createBooking(TicketBooking ticketBooking) {
        return null;
    }

    public ResponseEntity<Void> cancelBooking(int bookingId) {
        return null;
    }

    public ResponseEntity<List<TicketBooking>> getBookingsByUserEmail(String email) {
        return null;
    }
>>>>>>> 6e71d0a7cea40b4733e76d59923d1584d967e0e3
}
