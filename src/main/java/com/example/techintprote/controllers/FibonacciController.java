package com.example.techintprote.controllers;

import com.example.techintprote.repositories.Fibonacci;
import com.example.techintprote.services.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FibonacciController {
    @Autowired
    private FibonacciService fibonacciService;

    @GetMapping("/getFibonacci")
    public String getFibonacci(){
        List values = fibonacciService.getFibonacciValues();
        int x = (int) values.get(1);
        int y = (int) values.get(0);

        return (
                fibonacciService.getFibonacciTime() + fibonacciService.getFibonacci(x, y)
        );
    }

}
