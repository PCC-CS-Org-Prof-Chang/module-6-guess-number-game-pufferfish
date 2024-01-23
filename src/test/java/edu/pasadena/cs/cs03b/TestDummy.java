package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestDummy {

   @Test
   public void testDummy()
   {
     // action
     String strResult = GuessNumberGame.dummy();
     // assertion
     assertEquals("This is a Dummy Test", strResult);

   }
}
