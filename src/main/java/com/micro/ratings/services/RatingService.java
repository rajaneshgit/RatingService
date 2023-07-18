package com.micro.ratings.services;

import com.micro.ratings.model.Rating;

import java.util.List;

public interface RatingService {

    Rating save(Rating rating);
    List<Rating> findRatingsByUserId(String userId);
    List<Rating> findRatingsByHotelId(String hotelId);
    List<Rating> findAll();

}
