package com.g31.jpa.repository;

import com.g31.jpa.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long>{
    
}
