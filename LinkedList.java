package Polynomial;

import java.util.Scanner;

public class LinkedList {
    Node head = null;
    int degree = 0;

    public LinkedList(int degree) {
        this.degree = degree;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addTerm(int cooef, int exponenet) {
        Node node, temp;
        node = new Node(cooef, exponenet);
        if (head == null) {
            head = node;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

//    public void deleteFirstTerm() {
//        if (isEmpty()) {
//            return;
//        }
//        head = head.next;
//    }

//    public void deleteLastTerm() {
//        if (isEmpty()) {
//            return;
//        }
//        Node p = head, q = p.next;
//        while (q.next != null) {
//            p = p.next;
//            q = q.next;
//        }
//        p.next = null;
//    }

    public void display() {
        Node temp;
        temp = head;
        if (temp == null)
            System.out.println("List is Empty");
        else {
            while (temp != null) {

                if (temp.cooefficient != 0) {
                if (temp.exponent==0){
                    System.out.println(temp.cooefficient);
                    break;
                }
                    System.out.print(temp.cooefficient + "x^" + temp.exponent);
                    System.out.print(" + ");
                }
                temp = temp.next;

            }

        }
    }

    public void polynomial(int degree) {
        int d = degree;
        for (int i= degree ; i >= 0; i--) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter coefficient of power" + " " + i);
            int coe = input.nextInt();
            addTerm(coe, d);
            d--;
        }
    }

    public int evaluatePolynomial(LinkedList l, int x) {
        int sum = 0;
        Node temp;
        temp = head;
        if (temp == null)
            System.out.println("List is Empty");
        else {
            while (temp != null) {
                sum += temp.cooefficient * Math.pow(x, temp.exponent);
                temp = temp.next;

            }
            System.out.println(sum);
        }
        return sum;
    }

    public LinkedList add(LinkedList l2) {

        LinkedList result = new LinkedList(Math.max(this.degree, l2.degree));


        Node p1 = this.head, p2 = l2.head;


        while (p1 != null && p2 != null) {
            if (p1.exponent > p2.exponent) {

                result.addTerm(p1.cooefficient, p1.exponent);
                p1 = p1.next;
            } else if (p1.exponent < p2.exponent) {

                result.addTerm(p2.cooefficient, p2.exponent);
                p2 = p2.next;
            } else {

                result.addTerm(p1.cooefficient + p2.cooefficient, p1.exponent);
                p1 = p1.next;
                p2 = p2.next;
            }
        }


        while (p1 != null) {
            result.addTerm(p1.cooefficient, p1.exponent);
            p1 = p1.next;
        }


        while (p2 != null) {
            result.addTerm(p2.cooefficient, p2.exponent);
            p2 = p2.next;
        }


        return result;
    }
    public LinkedList multiply(LinkedList l2) {

        LinkedList result = new LinkedList(this.degree + l2.degree);


        Node p1 = this.head, p2 = l2.head;
        while (p1 != null) {
            while (p2 != null) {

                int newCoefficient = p1.cooefficient * p2.cooefficient;
                int newExponent = p1.exponent + p2.exponent;
                result.addTerm(newCoefficient, newExponent);
                p2 = p2.next;
            }


            p1 = p1.next;

            p2 = l2.head;
        }

        return result;
    }
    public LinkedList subtract(LinkedList l2) {

        LinkedList result = new LinkedList(Math.max(this.degree, l2.degree));


        Node p1 = this.head, p2 = l2.head;

        while (p1 != null || p2 != null) {

            if (p2 == null || (p1 != null && p1.exponent > p2.exponent)) {

                result.addTerm(p1.cooefficient, p1.exponent);
                p1 = p1.next;
            }

            else if (p1 == null || (p2 != null && p2.exponent > p1.exponent)) {

                result.addTerm(-p2.cooefficient, p2.exponent);
                p2 = p2.next;
            }

            else if (p1.exponent == p2.exponent) {

                int newCoefficient = p1.cooefficient - p2.cooefficient;
                if (newCoefficient != 0) {

                    result.addTerm(newCoefficient, p1.exponent);
                }

                p1 = p1.next;
                p2 = p2.next;
            }
        }

        return result;
    }
}
