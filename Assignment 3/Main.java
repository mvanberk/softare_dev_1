import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println();

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(sum);

        System.out.println();

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?
        sc = new Scanner(System.in);
        n = sc.nextInt();
        sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println();

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true) {
            System.out.println("I printed once!");
            run = false;
        }

        System.out.println();

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        System.out.println("Enter a word and I will give it back to you backwards:");
        sc = new Scanner(System.in);
        String word = sc.nextLine();
        for (int i = word.length() - 1; i >= 0; i--)
            System.out.print(word.charAt(i));
        System.out.println();

        System.out.println();

        //Challenge file
        //This one is actually easier than problem 5. It's the same thing but take away the reversing and then println instead of print.
        //I did struggle with P5 as I don't think we went over manipulating strings much. I had to look up a video that explained the .length() and .charAt() methods.
        //we stat at position 0, which is the first character in a string, and increment by one. the loop runs while i is less than the word length.
        //We do i < text.length() as the condition because string length is always gonna be one more than the highest positional number in a string.
        //(counting starts at 1, positions start at 0).
        //for each loop we print the character at position i. we use println rather than print so that each character is printed on a new line.

        System.out.println("Challenge file");
        System.out.println("Enter text and I will give it back to you in one long column:");
        sc = new Scanner(System.in);
        String text = sc.nextLine();
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
