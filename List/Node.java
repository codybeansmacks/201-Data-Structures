package List;

public class Node {
    protected int coefficient;
    protected int expX;
    protected int expY;
    protected int expZ;
    protected Node next;

    public Node(int coefficient, int expX, int expY, int expZ) {
        this.coefficient = coefficient;
        this.expX = expX;
        this.expY = expY;
        this.expZ = expZ;
        this.next = null;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (coefficient == -1) {
            result.append("-");
        } else if (coefficient != 1) {
            result.append(coefficient);
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
            result.append(coefficient);
        }
        return result.toString();
    }

}
