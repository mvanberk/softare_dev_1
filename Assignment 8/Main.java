import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //1 & 2: import file into program
        File inputfile = new File("practice.txt");
        List<String> gradeList = new ArrayList<String>();
        List<String> highGpaList = new ArrayList<String>();
        try {
            Scanner input = new Scanner(inputfile);
            while (input.hasNext()) {
                gradeList.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //3. Determining which students have above a 3.5 GPA, add them to new gradeList.
        for (int i = 1; i < gradeList.size(); i=i+2) {
            double gpa = Double.parseDouble(gradeList.get(i));
            if (gpa > 3.5){
                highGpaList.add(gradeList.get(i-1));
            }
        }

        //4 & 5. Set clear variables to count names and print results to console.
        int totalStudentCount = gradeList.size()/2;
        int highGpaStudentCount = highGpaList.size();
        System.out.println("Out of " + totalStudentCount + " students total there are " + highGpaStudentCount +
                " students with a GPA greater than 3.5:");
        System.out.print(highGpaList);

    }
}

/* 6. this assignment forced me to learn data persistence in java haha. I had to mess around with the file
location a bit but eventually figured it out. it seems different interpreters prefer different locations?
conceptually this is pretty straight forward. just read a file, run a loop that adds each line to a list, and use
the list to get what you want. The syntax is always a pain for me though. had to refer to the slides a lot to make
sure I typed it right.
 */
