package org.example;

import junit.framework.TestCase;
import org.example.convertor.Convertor;;


public class ConvertorTest extends TestCase {
    public void testIsDigit() {
        String text = "123";
        String expected = "123";Ф
        String actual = Convertor.deleteWords(text);
        assertEquals(expected, actual);
    }

    public void testIsVowel(){
        char symbol = 'a';
        assertEquals(true, Convertor.isVowel(symbol));
    }

    public void testIsConsonant(){
        char symbol = 'h';
        assertEquals(true, Convertor.isConsonant(symbol));
    }

    public void testAllSentencesIsNotCorrectResult(){
        String text = "Hello world, my name is Ivan and I am 19 years old";
        String expected = "Hello world, my name is Ivan and I am 19 years old";
        String actual = Convertor.deleteWords(text);
        assertEquals(expected, actual);
    }

    public void testAllSentencesIsCorrectResult(){
        String text = "Omg is the best game in the world";
        String expected = "is game in";
        String actual = Convertor.deleteWords(text);
        assertEquals(expected, actual);
    }
}
