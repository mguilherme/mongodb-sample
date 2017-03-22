package com.guilherme.miguel.repository;

import com.guilherme.miguel.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Miguel Guilherme
 */
public interface MovieRepository extends MongoRepository<Movie, String> {
}
