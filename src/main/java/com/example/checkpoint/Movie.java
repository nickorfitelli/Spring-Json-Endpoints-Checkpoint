package com.example.checkpoint;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Movie {
    private String title;
    private int minutes;
    private String genre;
    private double rating;
    private int metascore;
    private  String description;
    private int votes;
    private double gross;
    private String year;
    public  Credits[] credits;

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Minutes")
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @JsonProperty("Genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @JsonProperty("Rating")
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @JsonProperty("Metascore")
    public int getMetascore() {
        return metascore;
    }

    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }

    @JsonProperty("Credits")
    public Credits[] getCredits() {
        return credits;
    }

    public void setCredits(Credits[] credits) {
        this.credits = credits;
    }

    @JsonProperty("Gross")
    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    @JsonProperty("Votes")
    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Year")
    public String  getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    static class Credits {
       public Person person;

        @JsonProperty("Person")
        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }

        static class Person{
            private String role;
            private String firstName;
            private String lastName;

            @JsonProperty("Role")
            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            @JsonProperty("FirstName")
            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            @JsonProperty("LastName")
            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }
        }
    }


}

