package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Bruno Flávio Ferreira
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */

public class FizzBuzz implements Render {
    public String render(int number) {
        if(number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        if(number % 3 == 0)
            return "Fizz";
        if(number % 5 == 0)
            return "Buzz";
        return String.valueOf(number);
    }

}
