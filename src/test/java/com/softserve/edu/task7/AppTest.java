package com.softserve.edu.task7;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void Main_NoInput_PrintRules() {
        //Arrange
        final String RULES = "set initial integer number as a parameter of app";
        String[] args = new String[]{};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        App.setOut(new PrintStream(outContent));

        //Act
        App.main(args);

        //Assert
        assertEquals(outContent.toString(),RULES);
    }
}
