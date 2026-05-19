package ru.yandex.practicum;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testSumWithPositiveNumbersShouldReturnCorrectSum() {
        int a = 5;
        int b = 10;
        int result = calculator.sum(a, b);
        assertEquals(15, result);
    }

    @Test
    void testSumWithNegativeNumbersShouldReturnCorrectSum() {
        int a = -5;
        int b = -10;
        int result = calculator.sum(a, b);
        assertEquals(-15, result);
    }

    @Test
    void testSumWithPositiveAndNegativeNumberShouldReturnCorrectSum() {
        int a = 5;
        int b = -3;
        int result = calculator.sum(a, b);
        assertEquals(2, result);
    }

    @Test
    void testSumWithZeroShouldReturnSameNumber() {
        int a = 0;
        int b = 10;
        int result = calculator.sum(a, b);
        assertEquals(10, result);
    }

    @Test
    void testSumWithTwoZerosShouldReturnZero() {
        int a = 0;
        int b = 0;
        int result = calculator.sum(a, b);
        assertEquals(0, result);
    }

    @Test
    void testSumWithLargeNumbersShouldReturnCorrectSum() {
        int a = Integer.MAX_VALUE;
        int b = 1;
        int result = calculator.sum(a, b);
        assertEquals(Integer.MIN_VALUE, result); // Проверка переполнения
    }
}