package io.sham.ratingsdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.sham.ratingsdataservice.model.MovieRating;
import io.sham.ratingsdataservice.model.UserMovieRatings;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

	List<MovieRating> movieRatings = Arrays.asList(new MovieRating(1, 1, 9), new MovieRating(1, 2, 8),
			new MovieRating(1, 3, 8), new MovieRating(1, 4, 7), new MovieRating(1, 5, 6));

	@RequestMapping("/{userId}")
	public UserMovieRatings getMovieRatingForUser(@PathVariable Integer userId) {

		return new UserMovieRatings(userId, movieRatings);
	}
}
