package fr.myt.learn.microservices.movieinfoservice.domain.services;

import fr.myt.learn.microservices.movieinfoservice.domain.models.Movie;
import fr.myt.learn.microservices.movieinfoservice.infrastructure.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceProvider implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceProvider(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie fetchMovie(String movieId) {
        return this.movieRepository.getMovie(movieId);
    }
}
