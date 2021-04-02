package fr.myt.learn.microservices.movieinfoservice.infrastructure;

import fr.myt.learn.microservices.movieinfoservice.domain.models.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieProvider implements MovieRepository {

    @Override
    public Movie getMovie(String movieId) {
        return new Movie("Cool", "If only");
    }
}
