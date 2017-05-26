package com.softserve.edu.task7;

import com.softserve.edu.task7.math.NumberFinder;

import java.text.NumberFormat;

/**
 * entry point
 */
public class App {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("set initial integer number as a parameter of app");
            return;
        }
        try{
        NumberFinder finder=new NumberFinder(args[0]);
        finder.printValues();
        } catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
        }

    }
}
