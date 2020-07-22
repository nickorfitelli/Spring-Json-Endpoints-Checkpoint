package com.example.checkpoint;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/movies/movie")
    public Movie getMovie(){
        Movie movie = new Movie();
        Movie.Credits[] credits = new Movie.Credits[5];

        Movie.Credits.Person person1 = new Movie.Credits.Person();
        Movie.Credits.Person person2 = new Movie.Credits.Person();
        Movie.Credits.Person person3 = new Movie.Credits.Person();
        Movie.Credits.Person person4 = new Movie.Credits.Person();
        Movie.Credits.Person person5 = new Movie.Credits.Person();

        movie.setTitle("The Godfather");
        movie.setMinutes(175);
        movie.setGenre("Crime, Drama");
        movie.setRating(9.2);
        movie.setMetascore(100);
        movie.setDescription("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");
        movie.setVotes(1561591);
        movie.setGross(134.97);
        movie.setYear("1972");

        person1.setRole("Director");
        person1.setFirstName("Francis Ford");
        person1.setLastName("Copolla");

        person2.setRole("Star");
        person2.setFirstName("Marlon");
        person2.setLastName("Brando");

        person3.setRole("Star");
        person3.setFirstName("Al");
        person3.setLastName("Pacino");

        person4.setRole("Star");
        person4.setFirstName("James");
        person4.setLastName("Caan");

        person5.setRole("Star");
        person5.setFirstName("Diane");
        person5.setLastName("Keaton");

        credits[0] = new Movie.Credits();
        credits[1] = new Movie.Credits();
        credits[2] = new Movie.Credits();
        credits[3] = new Movie.Credits();
        credits[4] = new Movie.Credits();

        credits[0].setPerson(person1);
        credits[1].setPerson(person2);
        credits[2].setPerson(person3);
        credits[3].setPerson(person4);
        credits[4].setPerson(person5);

        movie.setCredits(credits);

        return movie;
    }

    @PostMapping("/movies/gross/total")
    public Map<String, Integer> sumTicketsTotal(@RequestBody() Movie movie) {
        int total = 0;
        for (Movie.Credits credits : movie.getCredits()) {
            total += movie.getGross();
        }
        Map<String, Integer> result = new HashMap<>();
        result.put("result", total);
        return result;
    }
}

