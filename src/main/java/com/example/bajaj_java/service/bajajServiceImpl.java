package com.example.bajaj_java.service;

import com.example.bajaj_java.dto.bajajRequest;
import com.example.bajaj_java.dto.bajajResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class bajajServiceImpl implements bajajService {

    @Override
    public bajajResponse processData(bajajRequest request) {

        List<String> oddNumbers = new ArrayList<>();
        List<String> evenNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();

        int totalSum = 0;
        StringBuilder lettersForConcat = new StringBuilder();

        if (request == null || request.getData() == null) {
            return buildResponse(false, oddNumbers, evenNumbers, alphabets,
                    specialCharacters, totalSum, "");
        }

        for (String value : request.getData()) {

            if (value == null) {
                continue;
            }

            if (isNumber(value)) {
                int number = Integer.parseInt(value);
                totalSum += number;

                if (number % 2 == 0) {
                    evenNumbers.add(value);
                } else {
                    oddNumbers.add(value);
                }

            } else if (isAlphabet(value)) {
                alphabets.add(value.toUpperCase());

                for (char ch : value.toCharArray()) {
                    lettersForConcat.append(ch);
                }

            } else {
                specialCharacters.add(value);
            }
        }

        String concatString = makeConcatString(lettersForConcat.toString());

        return buildResponse(true, oddNumbers, evenNumbers, alphabets,
                specialCharacters, totalSum, concatString);
    }

    private boolean isNumber(String value) {
        return value.matches("-?\\d+");
    }

    private boolean isAlphabet(String value) {
        return value.matches("[a-zA-Z]+");
    }

    private String makeConcatString(String letters) {
        StringBuilder reversed = new StringBuilder(letters).reverse();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);

            if (i % 2 == 0) {
                answer.append(Character.toUpperCase(ch));
            } else {
                answer.append(Character.toLowerCase(ch));
            }
        }

        return answer.toString();
    }

    private bajajResponse buildResponse(boolean success,
                                        List<String> oddNumbers,
                                        List<String> evenNumbers,
                                        List<String> alphabets,
                                        List<String> specialCharacters,
                                        int sum,
                                        String concatString) {

        return new bajajResponse(
                success,
                "abhinav_rajput_17052004",
                "abhinavrajput2307645@acropolis.in",
                "0827AL231005",
                oddNumbers,
                evenNumbers,
                alphabets,
                specialCharacters,
                String.valueOf(sum),
                concatString
        );
    }
}