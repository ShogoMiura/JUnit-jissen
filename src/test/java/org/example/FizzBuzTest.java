package org.example;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.jupiter.api.Nested;

public class FizzBuzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void 引数1のとき文字列1を返す() {
        String expected = "1";
        String actual = fizzBuzz.convert(1);
        assertThat(actual, is(expected));
    }

    @Test
    public void 引数1がのとき文字列2を返す() {
        String expected = "2";
        String actual = fizzBuzz.convert(2);
        assertThat(actual, is(expected));
    }

    @Test
    public void 引数3が入力されたとき文字列Fizzを返す() {
        String expected = "Fizz";
        String actual = fizzBuzz.convert(3);
        assertThat(actual, is(expected));
    }

    @Test
    public void 引数6が入力されたとき文字列Fizzを返す() {
        String expected = "Fizz";
        String actual = fizzBuzz.convert(6);
        assertThat(actual, is(expected));
    }

    @Test
    public void 引数が5のとき文字列Buzzを返す() {
        String expected = "Buzz";
        String actual = fizzBuzz.convert(5);
        assertThat(actual, is(expected));
    }


    @Test
    public void 引数が15のとき文字列FizzBuzzを返す() {
        String expected = "FizzBuzz";
        String actual = fizzBuzz.convert(15);
        assertThat(actual, is(expected));
    }
}
