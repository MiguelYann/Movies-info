package fr.myt.learn.microservices.movieinfoservice.domain.services;

import fr.myt.learn.microservices.movieinfoservice.domain.models.Movie;

public interface MovieService {

    Movie fetchMovie(String movieId);

}
