package com.dev.stampWar.repository.exhibition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.stampWar.model.exhibition.ExhibitionImage;

@Repository
public interface ExhibitionImageRepository extends JpaRepository<ExhibitionImage, Long>{

}
