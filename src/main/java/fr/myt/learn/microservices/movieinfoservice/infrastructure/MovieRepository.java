package fr.myt.learn.microservices.movieinfoservice.infrastructure;

import fr.myt.learn.microservices.movieinfoservice.domain.models.Movie;

public interface MovieRepository {

    Movie getMovie(String movieId);
}
