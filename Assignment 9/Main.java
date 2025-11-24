import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stax = new Stack<>();
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);

        LinkedList<Integer> linky = new LinkedList<>();
        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

        //1. min & max stack value
        System.out.println("Stack:");
        int min = stax.peek(); //initialize min variable to top stack value
        int max = stax.peek(); //initialize max variable to top stack value
        int elementCount = 0;
        while (stax.size() > 0) { //go through stack one item at a time and check if current min is greater than top stack value
            if (stax.peek() < min) {
                min = stax.peek();
            }
            if (stax.peek() > max) {
                max = stax.peek();
            }
            stax.pop(); //pop top value and go to next value for min/max checks
            elementCount++; //2. increment counter for each loop iteration
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("element count: " + elementCount);

        //3. middle of linked list
        System.out.println("\nLinkedList:");
        if (linky.size() % 2 == 0) { //if even, there is no middle value
            int twoMiddleAvg = (linky.get(linky.size() / 2) + linky.get((linky.size() / 2) - 1)) / 2;
            System.out.println("Can't print a middle value because there are an even number of values." +
                    " Here is the average of the two middle values: " + twoMiddleAvg);
        } else {
            int middleValue = linky.get(linky.size() / 2);
            System.out.println("middle value: " + middleValue);
        }
        
        //4. real life example: music playlist with 3 example operations

        Queue<String> musicPlaylist = new LinkedList<>();

        //add song to playlist
        musicPlaylist.add("Lost In The Static - After The Burial");
        musicPlaylist.add("Lucid - Polaris");
        musicPlaylist.add("Ghost of Me - Make Them Suffer");
        musicPlaylist.add("The Lines - Beartooth");
        musicPlaylist.add("The Void - Spiritbox");

        //remove a song
        musicPlaylist.remove("Lucid - Polaris");

        //next song
        musicPlaylist.remove();
    }
}
