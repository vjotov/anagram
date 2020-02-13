package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.hamcrest.Matchers.hasProperty;

public class AnagramTest {
    @Test
    void nullValueTest() {
        assertEquals(Anagram.process(null),"");
    }

    @Test
    void oneWordTest() {
        assertEquals(Anagram.process("asdf"),"fdsa");
    }

    @Test
    void twoWordsTest() {
        assertEquals(Anagram.process("asdf zxcvb"),"fdsa bvcxz");
    }

    @Test
    void twoWordsWithCharactersTest() {
        assertEquals(Anagram.process("a@s#df 1zx3cvb"),"f@d#sa 1bv3cxz");
    }

    @Test
    void numbersTest() {
        assertEquals(Anagram.process("192837"),"192837");
    }
}
