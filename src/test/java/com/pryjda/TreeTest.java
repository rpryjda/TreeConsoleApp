package com.pryjda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    Tree instance;
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        instance = new Tree();
    }

    @Test
    void shouldDisplayTreeInUpDirection() {
        //given (arrange)
        System.setOut(new PrintStream(outContent));
        String expected = "    *" + System.getProperty("line.separator") +
                "   ***" + System.getProperty("line.separator") +
                "  *****" + System.getProperty("line.separator") +
                " *******" + System.getProperty("line.separator") +
                "*********" + System.getProperty("line.separator");

        //when (act)
        instance.displayTree(5, Direction.UP);
        String result = outContent.toString();

        //then (assert)
        assertEquals(expected, result);
    }

    @Test
    void shouldDisplayTreeInLeftDirection() {
        //given (arrange)
        System.setOut(new PrintStream(outContent));
        String expected = "    *" + System.getProperty("line.separator") +
                "   **" + System.getProperty("line.separator") +
                "  ***" + System.getProperty("line.separator") +
                " ****" + System.getProperty("line.separator") +
                "*****" + System.getProperty("line.separator") +
                " ****" + System.getProperty("line.separator") +
                "  ***" + System.getProperty("line.separator") +
                "   **" + System.getProperty("line.separator") +
                "    *" + System.getProperty("line.separator");

        //when (act)
        instance.displayTree(5, Direction.LEFT);
        String result = outContent.toString();

        //then (assert)
        assertEquals(expected, result);
    }

    @Test
    void shouldThrowExceptionWhenProvideWrongLevelOfTree(){

        String expectedMessage = "level of tree should be above zero";

       IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
               ()->instance.displayTree(-1,Direction.UP));

       assertEquals(expectedMessage, exception.getMessage());

    }
}