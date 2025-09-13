//Assignment 2: write a quiz
//by Martijn van Berk
//Cybersecurity major w/ minors in computer science, information technology & information systems

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //defining scanner
        int score = 0; //initialize score variable to 0 so we can add to it after each question.

        System.out.println("What is 2+5?"); //asking question 1
        int correct_answer1 = 7; //setting correct answer
        int answer1 = sc.nextInt(); //assigning the user's input to the answer1 variable. *setting up all these variable so I can copy and paste more code for the other questions*
        if (answer1 == correct_answer1) { //if statement for when the user's answer matches the correct answer
            score += 1; //adding 1 to the score variable. this is a simpler way of writing [ score = score +1 ]
            System.out.println("Correct! Your score is: " + score); //providing feedback to the user
        } else { //else statement for when the user's answer does not match the correct answer
            System.out.println("Incorrect! Your score is: " + score); //providing feedback to the user
        }

        System.out.println("What is the square root of 9?"); //asking question 2
        int correct_answer2 = 3; //setting correct answer
        int answer2 = sc.nextInt(); //assigning the user's input to the answer2 variable.
        if (answer2 == correct_answer2) { //if statement for when the user's answer matches the correct answer
            score += 1; //adding 1 to the score variable
            System.out.println("Correct! Your score is: " + score); //providing feedback to the user
        } else { //else statement for when the user's answer does not match the correct answer
            System.out.println("Incorrect! Your score is: " + score); //providing feedback to the user
        }

        System.out.println("What is the sum of all numbers in the range 1-100?"); //asking question 3
        int correct_answer3 = 5050; //setting correct answer
        int answer3 = sc.nextInt(); //assigning the user's input to the answer2 variable.
        if (answer3 == correct_answer3) { //if statement for when the user's answer matches the correct answer
            score += 1; //adding 1 to the score variable
            System.out.println("Correct! Your score is: " + score); //providing feedback to the user
        } else { //else statement for when the user's answer does not match the correct answer
            System.out.println("Incorrect! Your score is: " + score); //providing feedback to the user
        }

        System.out.println("You finished the quiz. You correctly answered " + score + " out of 3 questions."); //providing feedback to the user

//What I learned: I still haven't found a reason to like java over python. I was going to reuse the same variable and just set a new value because it would've meant I could copy the code for each question without renaming variables; however, can't do that in java.



    }
}
