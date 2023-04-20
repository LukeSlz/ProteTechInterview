package com.example.techintprote.services;

import com.example.techintprote.repositories.Fibonacci;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FibonacciService {
    private final Fibonacci fibonacciRepository;

    public FibonacciService(Fibonacci fibonacciRepository) {
        this.fibonacciRepository = fibonacciRepository;
    }

    public String getFibonacci(int x, int y){
        return fibonacciRepository.executeFibonacci(x, y);
    }
    public List getFibonacciValues(){
        return fibonacciRepository.getTime();
    }
    public String getFibonacciTime(){
        return fibonacciRepository.time();
    }
}
