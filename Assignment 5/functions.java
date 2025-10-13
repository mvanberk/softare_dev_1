//Software Dev I, Assignment 5.2 - Martijn van Berk

import java.util.Scanner;
import java.lang.Math;

public class functions {
    public static void main(String[] args) {
        savings_growth();
    }
    public static void savings_growth() {
        System.out.println("This function helps show the impact of account type on your retirement savings.");
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money do you currently have saved up?");
        double present_value = sc.nextDouble();
        System.out.println("How much money will you contribute to your savings per year?");
        double contribution_value = sc.nextDouble();
        System.out.println("How many years until you plan to retire?");
        double payment_periods = sc.nextDouble();
        double interest = 0.0007;
        System.out.println("If you keep your money in a checking account, in " + Math.round(payment_periods) + " years you'll have $" +
                Math.round(compound_interest(present_value, interest, payment_periods, contribution_value)));
        interest = 0.0039;
        System.out.println("If you keep your money in a traditional savings account, in " + Math.round(payment_periods) + " years you'll have $" +
                Math.round(compound_interest(present_value, interest, payment_periods, contribution_value)));
        interest = 0.0173;
        System.out.println("If you keep your money in a high-yield savings account, in " + Math.round(payment_periods) + " years you'll have $" +
                Math.round(compound_interest(present_value, interest, payment_periods, contribution_value)));
        interest = 0.07;
        System.out.println("If you keep your money in an investment account, in " + Math.round(payment_periods) + " years you'll have $" +
                Math.round(compound_interest(present_value, interest, payment_periods, contribution_value)));
    }
    public static double compound_interest(double present_value, double interest, double payment_periods, double contribution_value){
        double principal_future_value = (present_value * (Math.pow((1 + interest), payment_periods)));
        double contributions_future_value = ((contribution_value * ((Math.pow((1 + interest), payment_periods) -1) / interest)) * (1 + interest));
        return principal_future_value + contributions_future_value;
    }
}
