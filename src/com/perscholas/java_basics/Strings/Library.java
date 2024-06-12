package com.perscholas.java_basics.Strings;

import java.util.Map;

public class Library {
    private Integer number_of_books;
    private String name;
    private Map<String, Integer> bookGenres;

    // Getters
    public Integer getNumber_of_books() {
        return number_of_books;
    }
    public String getName() {
        return name;
    }
    public Map<String, Integer> getBookGenres() {
        return bookGenres;
    }
    // Setters
    public void setNumber_of_books(Integer number_of_books) {
        this.number_of_books = number_of_books;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBookGenres(Map<String, Integer> bookGenres) {
        this.bookGenres = bookGenres;
    }
}