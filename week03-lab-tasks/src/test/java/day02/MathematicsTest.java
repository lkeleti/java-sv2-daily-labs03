package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathematicsTest {
    @Test
    void isPrimeTest() {
        Mathematics mathematics = new Mathematics();
        assertFalse(mathematics.isPrime(4));
        assertTrue(mathematics.isPrime(2));
        assertTrue(mathematics.isPrime(3));
        assertTrue(mathematics.isPrime(7));
        assertFalse(mathematics.isPrime(6));
        assertFalse(mathematics.isPrime(27));
        assertFalse(mathematics.isPrime(30));
    }
}
