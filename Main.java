package Polynomial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Which operation to execute ");
        System.out.println("1: Display polynomial");
        System.out.println("2: Evaluate polynomial" );
        System.out.println("3:Add Two polynomials");
        System.out.println("4:Subtract two polynomials");
        System.out.println("5:Multiply two polynomials");

        Scanner choise = new Scanner(System.in);
        int Choise = choise.nextInt();
        switch (Choise) {
            case 1:
                System.out.println("Enter degree of polynomial 1 ");
                Scanner input = new Scanner(System.in);
                int d = input.nextInt();
                LinkedList l = new LinkedList(d);
                l.polynomial(d);
                l.display();
                System.out.println(" ");
                break;
            case 2:
                System.out.println("Enter degree of polynomial");
                Scanner scanner3 = new Scanner(System.in);
                int d3 = scanner3.nextInt();
                LinkedList l3 = new LinkedList(d3);
                l3.polynomial(d3);
                System.out.println("Enter Value of x");
                Scanner input2 = new Scanner(System.in);
                int x = input2.nextInt();
                l3.evaluatePolynomial(l3, x);


                break;
            case 3:
                System.out.println("Enter degree of polynomial 1 ");
                Scanner input3 = new Scanner(System.in);
                int d1 = input3.nextInt();
                LinkedList l1 = new LinkedList(d1);
                l1.polynomial(d1);
                l1.display();
                System.out.println(" ");

                System.out.println("Enter degree of polynomial 2");
                Scanner scanner1 = new Scanner(System.in);
                int d2 = scanner1.nextInt();
                LinkedList l2 = new LinkedList(d2);
                l2.polynomial(d2);
                l2.display();
                System.out.println(" ");
                LinkedList additionResult = l1.add(l2);
                System.out.println("result of addition is:");
                additionResult.display();
                break;
            case 4:
                System.out.println("Enter degree of polynomial 1 ");
                Scanner input4 = new Scanner(System.in);
                int d4 = input4.nextInt();
                LinkedList l4 = new LinkedList(d4);
                l4.polynomial(d4);
                l4.display();
                System.out.println(" ");

                System.out.println("Enter degree of polynomial 2");
                Scanner scanner5 = new Scanner(System.in);
                int d5 = scanner5.nextInt();
                LinkedList l5 = new LinkedList(d5);
                l5.polynomial(d5);
                l5.display();
                System.out.println(" ");

                LinkedList subtractionResult = l4.subtract(l5);
                System.out.println("result of subtraction is:");
                subtractionResult.display();
                break;
            case 5:
                System.out.println("Enter degree of polynomial 1 ");
                Scanner input6 = new Scanner(System.in);
                int d6 = input6.nextInt();
                LinkedList l6 = new LinkedList(d6);
                l6.polynomial(d6);
                l6.display();
                System.out.println(" ");

                System.out.println("Enter degree of polynomial 2");
                Scanner scanner7 = new Scanner(System.in);
                int d7 = scanner7.nextInt();
                LinkedList l7= new LinkedList(d7);
                l7.polynomial(d7);
                l7.display();
                System.out.println(" ");

                LinkedList multiplicationResult = l6.multiply(l7);
                System.out.println("result of multiplication is:");
                multiplicationResult.display();
                break;
        }
    }


}
//    public static LinkedList add(LinkedList l1, LinkedList l2) {
//        LinkedList sum = null;
//        Node n1 = l1.head;
//        Node n2 = l2.head;
//        if (l1.degree == l2.degree) {
//            sum = new LinkedList(l1.degree);
//            Node sumNode = sum.head;
//            while (n1.next != null && n2.next != null) {
//                System.out.println("hello");
//                sumNode.cooefficient = n1.cooefficient + n2.cooefficient;
//                n1 = n1.next;
//                n2 = n2.next;
//                sumNode = sumNode.next;
//                sum.addTerm(sumNode.cooefficient, n1.exponent);
//            }
//
//        }
//        sum.display();
//        return sum;
//    }
