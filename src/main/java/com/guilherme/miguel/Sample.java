package com.guilherme.miguel;

import com.guilherme.miguel.domain.Movie;
import com.guilherme.miguel.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Miguel Guilherme
 */
@Slf4j
@Component
public class Sample implements CommandLineRunner {

    private MovieRepository movieRepository;

    public Sample(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie = new Movie(UUID.randomUUID().toString(), "The Lord of the rings");
        movieRepository.save(movie);

        log.info("Movie: {}", movieRepository.findOne(movie.getId()));
    }
}
