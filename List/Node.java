package List;

public class Node {
    protected int coeff; // Coefficient of the polynomial term
    protected int expX, expY, expZ; // Exponents for x, y, z
    protected Node next; // Link to the next node in the list

    // Constructor for the polynomial term node
    public Node(int coeff, int expX, int expY, int expZ) {
        this.coeff = coeff;
        this.expX = expX;
        this.expY = expY;
        this.expZ = expZ;
        this.next = null;
    }

    // Getters and setters for the node's data
    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }

    public int getExpX() {
        return expX;
    }

    public void setExpX(int expX) {
        this.expX = expX;
    }

    public int getExpY() {
        return expY;
    }

    public void setExpY(int expY) {
        this.expY = expY;
    }

    public int getExpZ() {
        return expZ;
    }

    public void setExpZ(int expZ) {
        this.expZ = expZ;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // Custom toString method to format the polynomial term
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (coeff == -1) {
            result.append("-");
        } else if (coeff != 1) {
            result.append(coeff);
        }
        if (expX > 0) {
            result.append("x");
            if (expX > 1) {
                result.append("^").append(expX);
            }
        }
        if (expY > 0) {
            result.append("y");
            if (expY > 1) {
                result.append("^").append(expY);
            }
        }
        if (expZ > 0) {
            result.append("z");
            if (expZ > 1) {
                result.append("^").append(expZ);
            }
        }
        if (result.length() == 0 || (result.length() == 1 && result.charAt(0) == '-')) {
            result.append(coeff);
        }
        return result.toString();
    }

}
