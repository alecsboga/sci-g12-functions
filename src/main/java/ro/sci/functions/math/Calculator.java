package ro.sci.functions.math;

/**
 * Class description.
 */
public class Calculator {

    /**
     * Sum function
     * @param x
     * @param y
     * @return the sum of parameters
     */
    public int aduna(int x, int y) {
        return x + y;
    }

    /**
     * Recursive function to calculate fibonacci.
     * @param n - the number to calculate fibonacci cum for
     * @return fibonacci
     */
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
