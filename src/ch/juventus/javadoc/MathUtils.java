package ch.juventus.javadoc;

import java.util.List;

public class MathUtils {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * @param numbers values
     * @return total
     */
    private double additions(List<Double> numbers) {
        double sum = 0.0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * @param a value 1
     * @param b value 2
     * @return total
     */
    private double subtraction(double a, double b) {
        return  a - b;
    }

    /**
     * @param a value 1
     * @param b value 2
     * @return product
     */
    private double division(double a, double b) {
        return a / b;
    }

    /**
     * @param a value 1
     * @param b value 2
     * @return product
     */
    private double multiplication(double a, double b) {
        return a * b;
    }
}