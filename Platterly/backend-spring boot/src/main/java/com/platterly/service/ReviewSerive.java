package com.platterly.service;

import java.util.List;

import com.platterly.Exception.ReviewException;
import com.platterly.model.Review;
import com.platterly.model.User;
import com.platterly.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
