package com.io.pragra.repo;

import com.io.pragra.domain.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Long> {

    List<Movie> findAllByMovieName(String movieName);

    List<Movie> findAllByMovieLanguage(String movieLanguage);


}
