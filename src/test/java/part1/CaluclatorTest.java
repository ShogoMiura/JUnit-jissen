package part1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CaluclatorTest {
    @Test
    public void multiplyで乗算結果が取得できる() {
        Caluculator caluculator = new Caluculator();
        int expected = 12;
        int actual = caluculator.multiply(2, 6);
        assertThat(actual, is(expected));
    }

    @Test
    public void divideで除算結果が取得できる() {
        Caluculator caluculator = new Caluculator();
        float expected = 1.5f;
        float actual = caluculator.divide(3, 2);
        assertThat(actual, is(expected));
    }

}
