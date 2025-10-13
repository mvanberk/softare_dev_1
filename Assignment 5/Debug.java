//Software Dev I, Assignment 5.1 - Martijn van Berk

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
    P2();
    P3();
    P5();
    }

    public static int P2() {
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println();
        return factorial(n);
    }

    public static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static int P3() {
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(addOdds(n));
        System.out.println();
        return addOdds(n);
    }

    public static int addOdds(int n){
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        return sum;
    }

    public static void P5() {
        System.out.println("Problem 5");
        System.out.println("Enter a word and I will give it back to you backwards:");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for (int i = word.length() - 1; i >= 0; i--)
            System.out.print(word.charAt(i));
        System.out.println();
    }

}
