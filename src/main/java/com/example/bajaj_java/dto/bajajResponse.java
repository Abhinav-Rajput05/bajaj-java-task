package com.example.bajaj_java.dto;

import java.util.List;

public class bajajResponse {

    private boolean is_success;
    private String user_id;
    private String email;
    private String roll_number;
    private List<String> odd_numbers;
    private List<String> even_numbers;
    private List<String> alphabets;
    private List<String> special_characters;
    private String sum;
    private String concat_string;

    public bajajResponse() {
    }

    public bajajResponse(boolean is_success,
                         String user_id,
                         String email,
                         String roll_number,
                         List<String> odd_numbers,
                         List<String> even_numbers,
                         List<String> alphabets,
                         List<String> special_characters,
                         String sum,
                         String concat_string) {
        this.is_success = is_success;
        this.user_id = user_id;
        this.email = email;
        this.roll_number = roll_number;
        this.odd_numbers = odd_numbers;
        this.even_numbers = even_numbers;
        this.alphabets = alphabets;
        this.special_characters = special_characters;
        this.sum = sum;
        this.concat_string = concat_string;
    }

    public boolean isIs_success() {
        return is_success;
    }

    public void setIs_success(boolean is_success) {
        this.is_success = is_success;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(String roll_number) {
        this.roll_number = roll_number;
    }

    public List<String> getOdd_numbers() {
        return odd_numbers;
    }

    public void setOdd_numbers(List<String> odd_numbers) {
        this.odd_numbers = odd_numbers;
    }

    public List<String> getEven_numbers() {
        return even_numbers;
    }

    public void setEven_numbers(List<String> even_numbers) {
        this.even_numbers = even_numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public List<String> getSpecial_characters() {
        return special_characters;
    }

    public void setSpecial_characters(List<String> special_characters) {
        this.special_characters = special_characters;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getConcat_string() {
        return concat_string;
    }

    public void setConcat_string(String concat_string) {
        this.concat_string = concat_string;
    }
}