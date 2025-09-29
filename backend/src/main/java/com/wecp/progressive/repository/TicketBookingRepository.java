package com.wecp.progressive.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.TicketBooking;
@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBooking,Integer>{
   // @Query("SELECT t FROM TicketBooking t WHERE t.email=:email")
    public List<TicketBooking> findByEmail(String email);
    @Transactional
    @Modifying
    @Query("DELETE FROM TicketBooking t WHERE t.match.firstTeamId = :teamId OR t.match.secondTeamId =: teamId")
    public void deleteByTeamId(int teamId);
    @Transactional
    @Modifying
    @Query("DELETE FROM TicketBooking t WHERE t.match.matchId=:matchId")
    public void deleteByMatchId(int matchId);
}
