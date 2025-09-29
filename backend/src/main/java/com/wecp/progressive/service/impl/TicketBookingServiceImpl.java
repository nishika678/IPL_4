package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.TicketBooking;
import com.wecp.progressive.repository.TicketBookingRepository;
import com.wecp.progressive.service.TicketBookingService;
@Service
public class TicketBookingServiceImpl  implements TicketBookingService{
    @Autowired
    TicketBookingRepository ticketBookingRepository;
    @Override
    public List<TicketBooking> getAllTicketBookings(){
        return ticketBookingRepository.findAll();
    }
    @Override
    public int createBooking(TicketBooking ticketBooking){
       TicketBooking obj=ticketBookingRepository.save(ticketBooking);
        return obj.getBookingId();
    }
    @Override
    public void cancelBooking(int bookingId){
        ticketBookingRepository.deleteById(bookingId);
    }
    @Override
public List<TicketBooking> getBookingsByUserEmail(String email){
    return ticketBookingRepository.findByEmail(email);
}
=======
public class TicketBookingServiceImpl  {

>>>>>>> 6e71d0a7cea40b4733e76d59923d1584d967e0e3
}