package com.platterly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platterly.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
