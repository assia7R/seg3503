import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzbuzzTest {

    @Test
    void getFizzBuzz1() {
        assertEquals("Fizz", Fizzbuzz.FizzBuzzP(9));
    }

    @Test
    void getFizzBuzz2() {
        assertEquals("Buzz", Fizzbuzz.FizzBuzzP(10));
    }


    @Test
    void getFizzBuzz3() {
        assertEquals("7", Fizzbuzz.FizzBuzzP(7));
    }

    
    @Test
    void getFizzBuzz4() {
        assertThrows(IllegalArgumentException.class, () -> { Fizzbuzz.FizzBuzzE(null);});
    }

    
    @Test
    void getFizzBuzz5() {
        assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzP(0));
    }
}