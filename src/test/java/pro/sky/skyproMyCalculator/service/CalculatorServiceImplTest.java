package pro.sky.skyproMyCalculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.skyproMyCalculator.TestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void sum_first_success() {
        //подготовка входных данных
        int num1 = 2;
        int num2 = 2;
        //подготовка ожидаемого результата
        String expectedResult = TestUtils.buildResponse(2, 2, 4, '+');

        //начало
        String actualResult = String.valueOf(calculatorService.sum(num1, num2));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sum_second_success() {
        //подготовка входных данных

        //подготовка ожидаемого результата

        //начало теста
    }

 //   @Test
 //   void subtract() {
 //   }

 //   @Test
 //   void multiply() {
 //   }

 //   @Test
 //   void divide() {
 //   }
}