private static LinkedList multiplyPolynomials(LinkedList poly1, LinkedList poly2) {
    LinkedList result = new LinkedList(); // Start with an empty polynomial for the result.

    for (Node ptr1 = poly1.getHead(); ptr1 != null; ptr1 = ptr1.getNext()) {
        LinkedList tempPoly = new LinkedList();
        for (Node ptr2 = poly2.getHead(); ptr2 != null; ptr2 = ptr2.getNext()) {
            // For each pair of terms, multiply and treat as a new temporary polynomial.
            int coeff = ptr1.getCoeff() * ptr2.getCoeff();
            int expX = ptr1.getExpX() + ptr2.getExpX();
            int expY = ptr1.getExpY() + ptr2.getExpY();
            int expZ = ptr1.getExpZ() + ptr2.getExpZ();
            
            // Create a temporary polynomial for the single term product.
            tempPoly.insertInOrder(coeff, expX, expY, expZ);
        }
        // Add the temporary polynomial to the running result to combine like terms.
        result = addPolynomials(result, tempPoly);
    }
    
    return result;
}
