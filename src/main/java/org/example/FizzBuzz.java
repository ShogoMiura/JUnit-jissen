package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FizzBuzz {

    public String convert(int num) {
        String result;
        if (num % 15 == 0){
            result = "FizzBuzz";
        } else if (num % 5 == 0){
            result = "Buzz";
        } else if (num % 3 == 0){
            result = "Fizz";
        }else {
            result = Integer.toString(num);
        }
        return result;
    }
}