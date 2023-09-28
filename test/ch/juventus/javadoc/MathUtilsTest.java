package ch.juventus.javadoc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    public void setup() {
        mathUtils = new MathUtils();
    }

    @Test
    public void testAddition() {
        double result = mathUtils.additions(List.of(3.0, 7.0));
        assertEquals(10, result);
    }

    @Test
    public void testSubtraction() {
        double result = mathUtils.subtraction(4.0, 2.0);
        assertEquals(2, result);
    }


    @Test
    public void testDivision() {
        double result = mathUtils.division(6.0, 2.0);
        assertEquals(3, result);
    }

    @Test
    public void testMultiplication() {
        double result = mathUtils.multiplication(3.0, 3.0);
        assertEquals(9, result);
    }
}
