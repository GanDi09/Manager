package ru.netology.Poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class filmaManagerTest {

    @Test
    public void shouldFilm() {

        String film1 = "film A";
        String film2 = "film B";
        String film3 = "film C";

        filmManager films = new filmManager();

        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);

        String[] actual = films.findAll();
        String[] expected = {film1, film2, film3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast() {

        String film1 = "film 1";
        String film2 = "film 2";
        String film3 = "film 3";
        String film4 = "film 4";
        String film5 = "film 5";
        String film6 = "film 6";

        filmManager films = new filmManager();

        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);
        films.addFilm(film4);
        films.addFilm(film5);

        String[] actual = films.findLast();
        String[] expected = {film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTen() {


        String film1 = "film 1";
        String film2 = "film 2";
        String film3 = "film 3";
        String film4 = "film 4";
        String film5 = "film 5";
        String film6 = "film 6";
        String film7 = "film 7";
        String film8 = "film 8";
        String film9 = "film 9";
        String film10 = "film 10";
        String film11 = "film 11";
        filmManager films = new filmManager(10);


        films.addFilm(film1);
        films.addFilm(film2);
        films.addFilm(film3);
        films.addFilm(film4);
        films.addFilm(film5);
        films.addFilm(film6);
        films.addFilm(film7);
        films.addFilm(film8);
        films.addFilm(film9);
        films.addFilm(film10);
        films.addFilm(film11);

        String[] actual = films.findLast();
        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        Assertions.assertArrayEquals(expected, actual);


    }

}


