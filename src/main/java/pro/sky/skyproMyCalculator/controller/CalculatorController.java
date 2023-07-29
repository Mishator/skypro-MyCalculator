package pro.sky.skyproMyCalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyproMyCalculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreetings() {
        return "Добро пожаловать в калькулятор";
    }
        @GetMapping("/plus")
        public String sum (@RequestParam int num1,@RequestParam int num2){
            return calculatorService.sum(num1, num2);
        }
        @GetMapping("/minus")
        public String subtract (@RequestParam int num1,@RequestParam int num2){
            return calculatorService.subtract(num1, num2);
        }
        @GetMapping("/multiply")
        public String multiply (@RequestParam int num1,@RequestParam int num2){
            return calculatorService.multiply(num1, num2);
        }
        @GetMapping("/divide")
        public String divide (@RequestParam int num1,@RequestParam int num2){
            return calculatorService.divide(num1, num2);
        }

}
