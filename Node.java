package Polynomial;

public class Node {
    Node next;
    int cooefficient;
    int exponent;

    public Node(int cooefficient, int value) {
        this.next = null;
        this.cooefficient = cooefficient;
        this.exponent = value;
    }
}
