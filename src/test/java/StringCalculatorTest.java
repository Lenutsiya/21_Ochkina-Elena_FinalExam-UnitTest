import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
public class StringCalculatorTest {
    private StringCalculator stringCalculator;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        stringCalculator = null;
    }

    @Test

    public void test1() throws IOException {
        //stringCalculator.add("-1.5");
        String number = "-1.5";
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.add(number));
    }
    @Test
    public void test2() throws IOException {
        //stringCalculator.add("100000");
        assertEquals(1, stringCalculator.add("100000"));


    }


}
