package fr.myt.learn.microservices.movieinfoservice.application.controllers;

import fr.myt.learn.microservices.movieinfoservice.domain.models.Movie;
import fr.myt.learn.microservices.movieinfoservice.domain.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movie_info")
public class MovieInfoController {

    private final MovieService movieService;

    public MovieInfoController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        return this.movieService.fetchMovie(movieId);
    }

}
