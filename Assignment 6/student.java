// Software Dev 1: Assignment 6 - Martijn van Berk

public class student {

    String name;
    String year;
    double gpa;
    int id;

    public student(String n, String y, double g, int i) {
        name = n;
        year = y;
        gpa = g;
        id = i;
    }

    // 2. GPA method
    boolean honorRoll() {
        if (this.gpa > 3.6 && this.gpa <= 4.0) {
            System.out.println(this.name + " is an honor roll student.");
            return true;
        }
        if (this.gpa >= 0 && this.gpa <= 3.6) {
            System.out.println(this.name + " is not an honor roll student.");
            return false;
        } 
        else {
            System.out.println("Unable to determine if " + this.name + " is an honor roll student. " +
                    "please check if " + this.name + " has a valid GPA (0-4)");
            return false;
        }
    }

    // 4. Free lunch method
    static int freeLunchId = 0;

    boolean freeLunch() {
        if (freeLunchId == 0 ) { //check if freeLunchId already exists because otherwise it would regenerate the winning id every time the function runs and allow multiple winners
            int min = 1;
            int max = 5;
            freeLunchId = min + (int) (Math.random() * ((max - min) + 1)); // this was necessary to set a range for random (basically multiple random() by the range and use the int conversion with +1 to make the range inclusive rather than exclusive of the max value)
        }
        if (this.id == freeLunchId) {
            System.out.println(this.name + " gets a free lunch today!");
            return true;
        }
        else {
            System.out.println("Unfortunately, " + this.name + " does not get a free lunch today!");
            return false;
        }
    }
}
