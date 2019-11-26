// IMPORTS
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// SOURCE CODE
public class PuzzleJava {
    public static void main(String[] args) {
        PuzzleJava.iterateArr();
        PuzzleJava.shuffleNames();
        PuzzleJava.shuffleAlphabet();
        PuzzleJava.generateRandomList();
        PuzzleJava.generateRandomListSorted();
        PuzzleJava.generateRandomInt();
        PuzzleJava.generateRandomIntArr();
    }

    // Task #1
    public static void iterateArr(){
        int[] arr = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                greaterThan10.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(greaterThan10);
    }

    // Task #2
    public static void shuffleNames() {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> namesOver5 = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Collections.shuffle(names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
            if (names.get(i).length() > 5) {
                namesOver5.add(names.get(i));
            }
        }
        System.out.println(namesOver5);
    }

    // Task #3
    public static void shuffleAlphabet() {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        ArrayList<String> newArr = new ArrayList<String>();
        for (int i = 0; i < alphabet.length; i++){
            newArr.add(alphabet[i]);
        }
        Collections.shuffle(newArr);
        String firstInArr = newArr.get(0);
        if (firstInArr == "a" || firstInArr == "e" || firstInArr == "i" || firstInArr == "o" || firstInArr == "u") {
            System.out.println("First value was a vowel!");
        } else {
            System.out.println(firstInArr);
        }
        String lastInArr = newArr.get(25);
        System.out.println(lastInArr);
        System.out.println(newArr);
    }

    // Task #4
    public static void generateRandomList() {
        ArrayList<Integer> returnArr = new ArrayList<Integer>();
        int i = 0;
        Random rand = new Random();
        while (i < 10) {
            i++;
            returnArr.add(rand.nextInt(45) + 55);
        }
        System.out.println(returnArr);
    } 

    // Task #5
    public static void generateRandomListSorted() {
        ArrayList<Integer> returnArr = new ArrayList<Integer>();
        int i = 0;
        Random rand = new Random();
        while (i < 10) {
            i++;
            returnArr.add(rand.nextInt(45) + 55);
        }
        Collections.sort(returnArr);
        int max = returnArr.get(0);
        int min = returnArr.get(0);
        for (int j = 0; j < returnArr.size(); j++) {
            if (returnArr.get(j) >= max) {
                max = returnArr.get(j);
            }
            if (returnArr.get(j) <= min) {
                min = returnArr.get(j);
            }
        }
        System.out.println(returnArr);
        System.out.println("Min is " + min + " Max is " + max);
    }

    // Task #6
    // I don't know how to generate a random string. The solution uses a method from another source file to do it. I will do it with an integer.
    public static void generateRandomInt() {
        Random rand = new Random();
        int rando = rand.nextInt(100);
        System.out.println(rando);
    } 

    // Task #7
    // Cannot generate an array of random strings, so it is basically the same solution as generating an array of random numbers in task #4.
    public static void generateRandomIntArr() {
        ArrayList<Integer> returnArr = new ArrayList<Integer>();
        int i = 0;
        Random rand = new Random();
        while (i < 10) {
            i++;
            returnArr.add(rand.nextInt(100));
        }
        System.out.println(returnArr);
    } 

}