package com.dev.stampWar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.stampWar.model.EventParticipant;

@Repository
public interface EventParticipantRepository extends JpaRepository<EventParticipant, Long>{

}
