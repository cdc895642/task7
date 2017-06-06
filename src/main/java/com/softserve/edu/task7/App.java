package com.softserve.edu.task7;

import com.softserve.edu.task7.math.NumberFinder;

import java.io.PrintStream;

/**
 * entry point
 */
public class App {

    private static final String RULES = "set initial integer number as a "
            + "parameter of app";
    private static PrintStream out = System.out;

    public static void main(String[] args) {
        if (args.length == 0) {
            out.print(RULES);
            return;
        }
        try {
            NumberFinder finder = new NumberFinder(args[0]);
            finder.printValues();
        } catch (IllegalArgumentException e) {
            out.print(e.getMessage());
        }
    }

    public static void setOut(PrintStream out) {
        App.out = out;
    }
}
