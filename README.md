LinkedList product = multiplyPolynomials(poly1, poly2);
LinkedList simplifiedProduct = simplifyPolynomial(product);

help
import List.LinkedList;
import List.Node;
import java.util.HashMap;
import java.util.Map;

/**
 * Simplifies a polynomial represented as a LinkedList by combining like terms.
 * 
 * @param poly The polynomial to simplify.
 * @return A new LinkedList representing the simplified polynomial.
 */
private static LinkedList simplifyPolynomial(LinkedList poly) {
    // Temporary storage for accumulating coefficients of like terms.
    Map<String, Integer> terms = new HashMap<>();

    // Traverse the original polynomial, accumulating coefficients for like terms.
    for (Node current = poly.getHead(); current != null; current = current.getNext()) {
        // Create a unique key for each term based on its exponents.
        String key = current.getExpX() + "_" + current.getExpY() + "_" + current.getExpZ();
        terms.put(key, terms.getOrDefault(key, 0) + current.getCoeff());
    }

    // Create a new polynomial with combined terms.
    LinkedList simplified = new LinkedList();
    for (Map.Entry<String, Integer> entry : terms.entrySet()) {
        String[] exps = entry.getKey().split("_");
        int coeff = entry.getValue();
        if (coeff != 0) { // Only add non-zero coefficients.
            int expX = Integer.parseInt(exps[0]);
            int expY = Integer.parseInt(exps[1]);
            int expZ = Integer.parseInt(exps[2]);
            // Assuming insertInOrder correctly places terms based on exponents.
            simplified.insertInOrder(coeff, expX, expY, expZ);
        }
    }

    return simplified;
}
