package pro.sky.calculator.service;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public float addition(float a, float b) {
        return a + b;
    }

    public float subtraction(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float division(float a, float b) {
        return a / b;
    }
}