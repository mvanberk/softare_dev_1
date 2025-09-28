//This program calculates and reports a user's tax reduction based on user input.

import java.util.Scanner;

class Debug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //prompt user for yearly salary
        System.out.println("Enter your yearly salary");
        int salary = sc.nextInt();

        //prompt user for yearly expenses
        System.out.println("Enter your yearly expenses");
        int expenses = sc.nextInt();

        //prompt user for household size
        System.out.println("Enter the amount of people in your household");
        int people = sc.nextInt();

        //for loop that calculates additonalTaxReduction var (starts at 2% and adds 2% per person)
        int additionalTaxReduction = 0;
        for(int i = 0; i <= people; i++){
            additionalTaxReduction += 2;
        }

        //adds value of additionalTaxReduction to new taxReduction var
        int taxReduction = 0;
        taxReduction += additionalTaxReduction;

        /* adds 10% tax reduction to the taxReduction var if user's salary is over $50,000 and
        household size is greater than 3. Reports the total tax reduction to the user. */
        if(salary > 50000 && people > 3){
            taxReduction += 10;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");

        /* adds 9% tax reduction to the taxReduction var if user's salary is over $30,000 and
        household size is greater than 4. Reports the total tax reduction to the user. */
        } else if(salary > 30000 && people > 4){
            taxReduction += 9;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");

        /* adds 5% tax reduction to the taxReduction var if user's salary is over $70,000 and
        household size is greater than 2. Reports the total tax reduction to the user. */
        } else if(salary > 70000 && people > 2){
            taxReduction += 5;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");

        } else {
            System.out.println("No applicable reduction on taxes found.");
        }
    }
}
/* I skipped comments on commonly used lines of code as any java programmer is going to be familiar with these.
I added comments to anything that used unique variables and relationships between variables and calculations.
This helps the reader understand what variables mean and what is actually happening in this specific program.
 */
