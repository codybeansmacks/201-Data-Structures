import List.*;

import java.io.*;

/**
 * Main class for performing polynomial arithmetic operations.
 * This class reads from an input file containing operations and polynomials, performs the specified
 * arithmetic operations on the polynomials, and writes the results to an output file.
 */
public class Main {

    /**
     * The main method that drives the program, handling file input/output and initiating polynomial operations.
     * 
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            int testCases = Integer.parseInt(reader.readLine().trim());
            for (int i = 0; i < testCases; i++) {
                String[] parts = reader.readLine().trim().split(" ");
                char operation = parts[0].charAt(0);
                LinkedList poly1 = parsePolynomial(parts[1]);
                LinkedList poly2 = parsePolynomial(parts[2]);

                LinkedList result = performOperation(operation, poly1, poly2);
                writer.write((result != null) ? result.toString() : "0");
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Parses a polynomial from a string format into a LinkedList representation.
     * 
     * @param polynomial The polynomial in string format.
     * @return The LinkedList representation of the polynomial.
     */
    private static LinkedList parsePolynomial(String polynomial) {
        // Method body...
    }

    /**
     * Performs the specified arithmetic operation on two polynomials.
     * 
     * @param operation The operation to be performed ('+', '-', or '*').
     * @param poly1 The first polynomial operand.
     * @param poly2 The second polynomial operand.
     * @return The result of the arithmetic operation as a new LinkedList.
     */
    private static LinkedList performOperation(char operation, LinkedList poly1, LinkedList poly2) {
        // Method body...
    }

    /**
     * Adds two polynomials together.
     * 
     * @param poly1 The first polynomial.
     * @param poly2 The second polynomial.
     * @return The sum of the two polynomials.
     */
    private static LinkedList addPolynomials(LinkedList poly1, LinkedList poly2) {
        // Method body...
    }

    /**
     * Subtracts the second polynomial from the first.
     * 
     * @param poly1 The polynomial to be subtracted from.
     * @param poly2 The polynomial to subtract.
     * @return The difference of the two polynomials.
     */
    private static LinkedList subtractPolynomials(LinkedList poly1, LinkedList poly2) {
        // Method body...
    }

    /**
     * Multiplies two polynomials together.
     * 
     * @param poly1 The first polynomial.
     * @param poly2 The second polynomial.
     * @return The product of the two polynomials.
     */
    private static LinkedList multiplyPolynomials(LinkedList poly1, LinkedList poly2) {
        // Method body...
    }

    // Other methods as defined in your class...
}

    /**
     * Compares two polynomial terms to determine their order based on the exponents of x, y, and z.
     * 
     * @param a The first term for comparison.
     * @param b The second term for comparison.
     * @return A positive number if term a has higher order, a negative number if term b has higher order, or 0 if they have the same order.
     */
    private static int compareTerms(Node a, Node b) {
        // Method body...
    }

    /**
     * Inserts a new term into the polynomial or combines it with an existing term if one with the same exponents already exists.
     * This method ensures the polynomial remains in correct order after insertion.
     * 
     * @param list The polynomial linked list where the term will be inserted.
     * @param coeff The coefficient of the term to be inserted.
     * @param expX The exponent of x in the term.
     * @param expY The exponent of y in the term.
     * @param expZ The exponent of z in the term.
     */
    private static void insertOrCombine(LinkedList list, int coeff, int expX, int expY, int expZ) {
        // Method body...
    }
