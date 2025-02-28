package ru.neoflex.practice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.operation.CalcOperation;
import ru.neoflex.practice.repository.CalcRepository;

import java.util.List;

@RestController
@Tag(name = "Калькулятор")
public class CalcController {

    private final CalcRepository repository;

    public CalcController(CalcRepository repository) {
        this.repository = repository;
    }

    @Operation(summary = "Сложение")
    @GetMapping("/plus/{a}/{b}")
    public Integer plus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return a + b;
    }

    @Operation(summary = "Вычитание")
    @GetMapping("/minus/{a}/{b}")
    public Integer minus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return a - b;
    }

    @Operation(summary = "Вывод результата")
    @GetMapping("/operation")
    public List<CalcOperation> getdb() {
        return repository.findAll();
    }
}

