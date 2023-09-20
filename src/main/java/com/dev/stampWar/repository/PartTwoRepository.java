package com.dev.stampWar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.stampWar.model.EventTwo;

@Repository
public interface PartTwoRepository extends JpaRepository<EventTwo, Long>{

}
