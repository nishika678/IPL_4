package com.wecp.progressive.entity;

<<<<<<< HEAD
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TicketBooking {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer bookingId;
@Column(nullable=false)
private String email;
@Column(nullable=false)
private int numberOfTickets;
@ManyToOne(cascade=CascadeType.MERGE)
@JoinColumn(name="match_id")
private Match match;
public TicketBooking() {
}

public TicketBooking(String email, int numberOfTickets, Match match) {
    this.email = email;
    this.numberOfTickets = numberOfTickets;
    this.match = match;
}


public TicketBooking(Integer bookingId, String email, int numberOfTickets) {
    this.bookingId = bookingId;
    this.email = email;
    this.numberOfTickets = numberOfTickets;
}

public TicketBooking(Integer bookingId, String email, Match match, int numberOfTickets) {
    this.bookingId = bookingId;
    this.email = email;
    this.match = match;
    this.numberOfTickets = numberOfTickets;
}
public TicketBooking(String email, int numberOfTickets) {
    this.email = email;
    this.numberOfTickets = numberOfTickets;
}
public Integer getBookingId() {
    return bookingId;
}
public void setBookingId(Integer bookingId) {
    this.bookingId = bookingId;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public int getNumberOfTickets() {
    return numberOfTickets;
}
public void setNumberOfTickets(int numberOfTickets) {
    this.numberOfTickets = numberOfTickets;
}
public Match getMatch() {
    return match;
}
public void setMatch(Match match) {
    this.match = match;
}
=======
public class TicketBooking {
>>>>>>> 6e71d0a7cea40b4733e76d59923d1584d967e0e3

}