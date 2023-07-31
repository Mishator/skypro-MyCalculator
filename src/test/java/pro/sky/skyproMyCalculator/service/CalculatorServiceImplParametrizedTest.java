package pro.sky.skyproMyCalculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.skyproMyCalculator.TestUtils;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParametrizedTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> sumParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.stringResult(2, 2, "4", "+")),
                Arguments.of(0, 8, TestUtils.stringResult(0, 8, "8", "+")),
                Arguments.of(1, 1, TestUtils.stringResult(1, 1, "2", "+")));
    }

    @ParameterizedTest
    @MethodSource("sumParams")
    void sum(int num1, int num2, String expectedResult) {
        String actualResult = calculatorService.sum(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> subtractParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.stringResult(2, 2, "0", "-")),
                Arguments.of(0, 8, TestUtils.stringResult(0, 8, "-8", "-")),
                Arguments.of(4, 1, TestUtils.stringResult(4, 1, "3", "-")));
    }

    @ParameterizedTest
    @MethodSource("subtractParams")
    void subtract(int num1, int num2, String expectedResult) {
        String actualResult = calculatorService.subtract(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.stringResult(2, 2, "4", "*")),
                Arguments.of(0, 8, TestUtils.stringResult(0, 8, "0", "*")),
                Arguments.of(4, 1, TestUtils.stringResult(4, 1, "4", "*")));
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, String expectedResult) {
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.stringResult(2, 2, "1.0", "/")),
                Arguments.of(0, 8, TestUtils.stringResult(0, 8, "0.0", "/")),
                Arguments.of(4, 8, TestUtils.stringResult(4, 8, "0.5", "/")));
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, String expectedResult) {
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}