/**
* This program prints math problems.
*
* @author Jedidiah Alfred
* @version 1.0
* @since 2023-02-09
*/
class MathOperators {
    /**
    * This program prints math problems.
    *
    * @param args Unused
    */
    public static void main(String[] args) {
        // Addition
        System.out.println("0 + 1 =" + (0 + 1));
        // Subtraction
        System.out.println("6 - 4 =" + (6 - 4));
        // Multiplication
        System.out.println("3 * 1 =" + (3 * 1));
        // Division with a normal output
        System.out.println("8 / 2 =" + (8 / 2));
        // Division with a decimal behind output
        System.out.println("25 / 5 =" + (25f / 5f));
        // Division with a decimal in front output
        System.out.println("4 / 8 =" + (4d / 8d));
        // Exponents to the power of a number
        System.out.println("5^2 =" + (Math.pow(5, 2)));
        // Exponents to the power of a number
        System.out.println("2^5 =" + (Math.pow(2, 5)));
        // Square root
        System.out.println("Square Root of 36 =" + (Math.sqrt(36)));
    }
}
