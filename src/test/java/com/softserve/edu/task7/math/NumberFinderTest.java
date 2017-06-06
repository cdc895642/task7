package com.softserve.edu.task7.math;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by cdc89 on 06.06.2017.
 */
public class NumberFinderTest {
    @Test(expected = IllegalArgumentException.class)
    public void NumberString_NoDigit_ThrowIllegalArgumentException() {
        String input = "a100";
        NumberFinder numberFinder = new NumberFinder(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NumberString_NegativeDigit_ThrowIllegalArgumentException() {
        String input = "-100";
        NumberFinder numberFinder = new NumberFinder(input);
    }

    @Test
    public void PrintValues_10_PrintValues() {
        //Arrange
        String input = "100";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        String EXPECTED = "9,8,7,6,5,4,3,2,1,0";
        NumberFinder numberFinder = new NumberFinder(input);
        numberFinder.setOut(new PrintStream(outContent));

        //Act
        numberFinder.printValues();

        //Assert
        assertEquals(EXPECTED, outContent.toString());
    }

    @Test
    public void GetResults_100_GetList() {
        //Arrange
        String input = "100";
        List EXPECTED = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);

        //Act
        NumberFinder numberFinder = new NumberFinder(input);
        List result = numberFinder.getResults();

        //Assert
        assertEquals(EXPECTED, result);
    }
}
