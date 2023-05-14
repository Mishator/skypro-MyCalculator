package pro.sky.skyproMyCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping(path = "/calculator")
    public String greeting() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }
}
