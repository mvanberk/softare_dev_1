public class Main {
    public static void main(String[] args) {

        int[] myArray = {10, 3, 295, 38, 20, 3, 4, 267, 2445, 10, 5566, 87, 93, 17, 10, 2, 87, 267, 3176, 3, 82};

        System.out.println("All ya favorite numbers:");
        for (int i = 0; i < myArray.length; i++) {

            int dupecount = 0; //init duplicate counter
            for (int m = 0; m < myArray.length; m++) { //second loop compares i to every other int (m) in loop.
                if (myArray[m] == myArray[i]) {//if this loop comes across the same value it adds one to the dupecount
                    dupecount++;
                }
            }

            boolean firsttime = true; //init bool for detecting duplicates
            for (int m = i+1; m < myArray.length; m++) {//separate loop because different start point. (i+1 so we dont count the first match, itself, as a dupe)
                if (myArray[m] == myArray[i]) {
                    firsttime = false; //set bool value at end of loop which we can then use outside this loop
                }
            }

            if (firsttime == true) {//if there are no duplicates following this index, then print the statement. 
                System.out.println(myArray[i] + " is in the array " + dupecount + " time(s).");
            }
        }
    }
}
/* This one was tough. definitely had to do some googling. the count was easy, checking for dupes was tough.
It became a little easier when I remembered about booleans though haha. my variable name didnt work out as I intended:
I meant to print the statement if it was the first time the number came up, not the last time, but it works so oh well.
 */
