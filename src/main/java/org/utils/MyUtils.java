package org.utils;

import org.utils.exceptions.InvalidStringInputException;
import org.utils.stringutils.StringParser;

import java.util.List;

public class MyUtils {

    public static void main(String[] args) {
        StringParser sp = new StringParser();

        String str = "Hello|World|How are|you all";

        // | is a pipe, \\ is the escape character
        List<String> stringParts = null;
        try {
            stringParts = sp.splitString(str, "\\|");
        } catch (InvalidStringInputException e) {
            System.out.println(e.getMessage());
            System.out.println("Null encountered. Exception occurred.");
        }

        for (String part : stringParts) {
            System.out.println(part);
        }
    }

}
