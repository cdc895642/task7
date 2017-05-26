package com.softserve.edu.task7.math;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cdc89 on 26.05.2017.
 * find integer numbers which square less than the given number
 */
public class NumberFinder {
    List<Integer> results;

    public NumberFinder(String input) {
        results = new ArrayList<>();
        findFromString(input);
    }

    private void findFromString(String input) {
        int initNum = getInitialNumber(input);
        findNumbers(initNum);
    }

    private void findNumbers(int initNum) {
        if (initNum<0){
            throw new IllegalArgumentException("Error - inserted negative integer.");
        }
        double tempMaxNum = Math.sqrt(initNum);
        int maxValue = tempMaxNum == (int) tempMaxNum ? (int) tempMaxNum - 1 : (int) tempMaxNum;
        for (int i=maxValue;i>=0;i--){
            results.add(new Integer(i));
        }
    }

    /**
     * print integer numbers which square less than the given number
     */
    public void printValues() {
        results.stream().limit(1).forEach(System.out::print);
        results.stream().skip(1).map(x->","+x).forEach(System.out::print);
    }

    private int getInitialNumber(String input) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        try {
            return numberFormat.parse(input).intValue();
        } catch (ParseException e) {
            throw new IllegalArgumentException("Inserted incorrect value. Please insert positive " +
                    "integer value !");
        }
    }
}
