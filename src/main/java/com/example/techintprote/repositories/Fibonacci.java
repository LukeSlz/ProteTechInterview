package com.example.techintprote.repositories;

import org.springframework.stereotype.Repository;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;


@Repository
public class Fibonacci {
    private static List getDigits(int num) {
        List<Integer> digits = new ArrayList<Integer>();
        while(digits.size() < 2){
            digits.add(num % 10);
            num /= 10;
        }
        return digits;
    }

    public static List getTime() {
        Calendar now = Calendar.getInstance();
        int minutes = now.get(Calendar.MINUTE);
        //System.out.println(minutes);


        List values = getDigits(minutes);
        return values;
    }

    public String time(){
        Format f = new SimpleDateFormat("HH.mm.ss");
        String time = f.format(new Date()).replaceAll("\\.", ":");
        //System.out.println("The time is: " + time);
        Calendar now = Calendar.getInstance();
        int cant = now.get(Calendar.SECOND);
        //System.out.println("The amount of numbers to be shown is: " + cant + ", excluding seed");
        return ("The time is: " + time + "\n The amount of numbers to be shown is: " + cant + ", excluding seed \n");
    }

    public String executeFibonacci (int x, int y){
        time();
        Calendar now = Calendar.getInstance();
        int cant = now.get(Calendar.SECOND);
        //System.out.println("The amount of numbers to be shown is: " + cant + ", excluding seed");

        int[] arr = new int[cant+2];
        arr[arr.length-1] = x;
        arr[arr.length-2] = y;
        int i = arr.length-3;
        while (i >= 0){
            arr[i] = arr[i+1] + arr[i+2];
            i--;
        }
        return (Arrays.toString(arr).replaceAll("\\[|\\]|", ""));
    }
}
