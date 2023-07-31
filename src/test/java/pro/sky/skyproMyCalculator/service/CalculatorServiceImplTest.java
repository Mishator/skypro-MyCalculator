package pro.sky.skyproMyCalculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.skyproMyCalculator.TestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void sum_first_success() {
        //подготовка входных данных
        int num1 = 2;
        int num2 = 2;
        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(2, 2, "4", "+");

        //начало теста
        String actualResult = calculatorService.sum(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sum_second_success() {
        //подготовка входных данных
        int num1 = 0;
        int num2 = 8;
        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(0, 8, "8", "+");

        //начало теста
        String actualResult = calculatorService.sum(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void subtract_success() {
        //подготовка входных данных
        int num1 = 1;
        int num2 = 8;
        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(1, 8, "-7", "-");

        //начало теста
        String actualResult = calculatorService.subtract(num1, num2);
        assertEquals(expectedResult, actualResult);

    }

    //подготовка входных данных
    @Test
    void multiply_success() {
        int num1 = 8;
        int num2 = 8;
        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(8, 8, "64", "*");

        //начало теста
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_success() {
        //подготовка входных данных
        int num1 = 4;
        int num2 = 2;
        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(4, 2, "2.0", "/");

        //начало теста
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_withException() {
        //подготовка входных данных
        int num1 = 4;
        int num2 = 0;
        //подготовка ожидаемого результата
        String expectedMessage = "На ноль делить нельзя!";

        //начало теста
        Exception exception = assertThrows(IllegalStateException.class,
                () -> calculatorService.divide(num1, num2));
        assertEquals(expectedMessage, exception.getMessage());

    }


}