private static void simplifyPolynomial(LinkedList polynomial) {
    if (polynomial.isEmpty()) return;

    Node current = polynomial.getHead();
    while (current != null && current.getNext() != null) {
        Node compareWith = current;
        while (compareWith.getNext() != null) {
            if (compareTerms(current, compareWith.getNext()) == 0) {
                // Combine like terms by adding their coefficients
                current.setCoeff(current.getCoeff() + compareWith.getNext().getCoeff());
                // Remove the like term
                compareWith.setNext(compareWith.getNext().getNext());
                if (compareWith.getNext() == null) {
                    polynomial.setTail(compareWith); // Update tail if we remove the last element
                }
            } else {
                compareWith = compareWith.getNext();
            }
        }
        current = current.getNext();
    }
}
