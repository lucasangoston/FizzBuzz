import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }
    /*
    @Test
    void getFizz() {
        assertEquals(" Fizz ", FizzBuzz.getFizzBuzz(3,5, 10));
    }

    @Test
    void getBuzz() {
        assertEquals(" Buzz ", FizzBuzz.getFizzBuzz(3,5,10));
    }

    @Test
    void getFizzBuzz() {
        assertEquals(" FizzBuzz ", FizzBuzz.getFizzBuzz(3,5,10));
    }*/
}