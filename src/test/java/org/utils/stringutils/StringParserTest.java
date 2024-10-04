package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringParserTest {

    // Test method naming
    // methodBeingTested_input_expectedOutcome
    @Test
    void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException {    // happy path
        // setup
        StringParser stringParser = new StringParser();
        String inputString = "hello|world";
        String separator = "\\|";
        // execute
        List<String> stringParts = stringParser.splitString(inputString, separator);
        assertEquals(2, stringParts.size());
    }

    @Test
    void splitString_nullInput_expectException() throws InvalidStringInputException {
        StringParser stringParser = new StringParser();
        String inputString = null;
        String separator = "\\|";

//        List<String> stringParts = stringParser.splitString(inputString, separator);
//        assertEquals(0, stringParts.size());
        // We are testing for the exception itself -> need to put the method in another method
        assertThrows(InvalidStringInputException.class,
                () -> stringParser.splitString(inputString, separator));
    }
}
