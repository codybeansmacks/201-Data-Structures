package List;

public class LinkedList {

    protected Node head;
    protected Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node getHead() {
        return head;
    }

    public void insertInOrder(int coeff, int expX, int expY, int expZ) {
        Node newNode = new Node(coeff, expX, expY, expZ);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            return;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null && compareNodes(newNode, temp) >= 0) {
            prev = temp;
            temp = temp.getNext();
        }

        if (prev == null) {
            newNode.setNext(head);
            head = newNode;
        } else {
            newNode.setNext(temp);
            prev.setNext(newNode);
            if (temp == null) tail = newNode;
        }
    }

    private int compareNodes(Node a, Node b) {
        if (a.getExpX() != b.getExpX()) return a.getExpX() - b.getExpX();
        if (a.getExpY() != b.getExpY()) return a.getExpY() - b.getExpY();
        return a.getExpZ() - b.getExpZ();
    }

    public void deleteFirst() {
        if (!isEmpty()) {
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
        }
    }

    public void deleteLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node temp = head;
                while (temp.getNext() != tail) {
                    temp = temp.getNext();
                }
                tail = temp;
                tail.setNext(null);
            }
        }
    }

    public void insertFirst(Node newNode) {
        if (isEmpty()) {
            tail = newNode;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void insertLast(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }


    public void deleteTerm(int coeff, int expX, int expY, int expZ) {
        if (isEmpty()) return;

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.getCoeff() == coeff && temp.getExpX() == expX && temp.getExpY() == expY && temp.getExpZ() == expZ) {
                if (prev == null) {
                    head = head.getNext();
                    if (head == null) tail = null;
                } else {
                    prev.setNext(temp.getNext());
                    if (prev.getNext() == null) tail = prev;
                }
                return;
            }
            prev = temp;
            temp = temp.getNext();
        }
    }

    public int numberOfElements() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }


    @Override
    public String toString() {
        if (head == null) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.toString());
            if (current.getNext() != null && current.getNext().getCoeff() > 0) {
                result.append("+");
            }
            current = current.getNext();
        }
        return result.toString();
    }

}