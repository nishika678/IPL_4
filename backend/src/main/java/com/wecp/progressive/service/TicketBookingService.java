package com.wecp.progressive.service;

import com.wecp.progressive.entity.TicketBooking;

import java.util.List;

<<<<<<< HEAD
import org.springframework.stereotype.Service;
@Service
=======
>>>>>>> 6e71d0a7cea40b4733e76d59923d1584d967e0e3
public interface TicketBookingService {
    List<TicketBooking> getAllTicketBookings();

    int createBooking(TicketBooking ticketBooking);

    void cancelBooking(int bookingId);

    List<TicketBooking> getBookingsByUserEmail(String email);

}
