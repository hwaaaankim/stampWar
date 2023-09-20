package com.dev.stampWar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.stampWar.model.member.AiImageModel;

@Repository
public interface AiImageRepository extends JpaRepository<AiImageModel, Long>{

}
