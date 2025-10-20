// Deal or No Deal by Martijn van Berk
// Software Dev I - Midterm Project

import java.util.*;

public class Main {

    static List<Integer> cases = new ArrayList<Integer>(); //in class so that all functions can access this list
    static int elimCount = 0; //counts each round of elimination
    static int chosenCase = 0;
    static int chosenCaseValue = 0;
    static int offer = 0;
    static boolean offerAccepted = false;

    public static void main(String[] args) {
        createCases();
        System.out.println("Welcome to Deal or No Deal!");
        System.out.println();
        chooseCase();
        eliminateCases();
        if (offerAccepted) {
            System.out.print("Congrats, you've finished the game! You won $" + offer);
        }
    }

    public static void createCases() { //create list w/ specific $ values for all 26 cases and randomize the order.
        cases.add(1);
        cases.add(2);
        cases.add(5);
        cases.add(10);
        cases.add(25);
        cases.add(50);
        cases.add(75);
        cases.add(100);
        cases.add(200);
        cases.add(300);
        cases.add(400);
        cases.add(500);
        cases.add(750);
        cases.add(1000);
        cases.add(5000);
        cases.add(10000);
        cases.add(25000);
        cases.add(50000);
        cases.add(75000);
        cases.add(100000);
        cases.add(200000);
        cases.add(300000);
        cases.add(400000);
        cases.add(500000);
        cases.add(750000);
        cases.add(1000000);
        Collections.shuffle(cases);
    }

    public static void printRemainingCases() {
        for (int i = 0; i < 26; i++) {
            if (cases.get(i) > 0) {
                System.out.print("[" + (i + 1) + "] ");
            }
        }
        System.out.println();
    }

    public static void chooseCase() {//has the player choose a case, stores index and value of case, sets list value to $0.
        System.out.println("There are 26 cases in front of you, please select which case number you want to pick:");
        printRemainingCases();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0 && i < 27) { //user entry validation
            chosenCase = i - 1;
            chosenCaseValue = cases.get(chosenCase);
            cases.set(chosenCase, 0);
        } else {
            System.out.println("Incorrect number entered. Please enter a number between 1 and 26.");
            chooseCase();
        }
    }

    public static void eliminateCases() { //player selects a remaining case, prints the value, then sets case value to $0
        int casesLeft = 0; //checks how many cases left and triggers final round if needed
        for (int i = 0; i < 26; i++) {
            if (cases.get(i) > 0) {
                casesLeft++;
            }
        }
        if (casesLeft == 1) {
            lastRound();
            return;
        }

        for (int i = 1; i < 7 - elimCount; i++) { //eliminate cases
            System.out.println();
            System.out.println("from the remaining cases, please select which case number you want to eliminate:");
            printRemainingCases();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n > 0 && n < 27) { //user entry validation
                int elimCase = n - 1;
                System.out.println("case " + n + " had $" + cases.get(elimCase) + " in it!");
                cases.set(elimCase, 0);
            } else {
                System.out.println("Incorrect number entered. Please enter a number between 1 and 26.");
                chooseCase();
            }
        }
        elimCount++;
        if (elimCount > 5) {
            elimCount = 5;
        }
        banker();
    }

    public static int offer() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (cases.get(i) > 0) {
                sum = sum + cases.get(i);
                count++;
            }
        }
        offer = (sum/count)/2 + (elimCount*100000);
        return offer;
    }

    public static void banker() {
        System.out.println();
        System.out.print("The host's phone rings ");
        addSuspense();
        System.out.println("The banker has offered to buy your case for $" + offer() + ". Do you take the offer?");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            offerAccepted = true;
        }
        else {
            System.out.println("You've declined the banker's offer. you'll now proceed to the next round.");
            eliminateCases();
        }

    }

    public static void lastRound() {
        int winnings = 0;
        System.out.println();
        System.out.print("There are only two cases left... the one you picked at the start of the game and case: ");
        printRemainingCases();
        System.out.println("Do you wish to swap the cases? You'll take home whichever case you pick!");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            for (int i = 0; i < 26; i++) {
                if (cases.get(i) > 0) {
                    winnings = cases.get(i);
                }
            }
        }
        if (response.equalsIgnoreCase("no")) {
            winnings = chosenCaseValue;
        }
        System.out.println("Congrats! The case you picked contained $" + winnings);
        return;
    }

    public static void addSuspense() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i < 4; i = i + 1) { //for loop that just slowly prints "..." for suspense
            System.out.print(".");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}
