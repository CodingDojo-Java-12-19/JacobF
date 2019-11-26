// IMPORTS
import java.util.ArrayList;

// SOURCE CODE 
public class BasicJava {
    public static void main(String[] args) {
        int[] testArr = {1,3,5,7,9,13};
        int[] testArr2 = {1,-3,5,-7,-9,13};
        int[] testArr3 = {5,10,0,15,20};

        BasicJava.printTo255();
        BasicJava.printOdds255();
        BasicJava.printSum();
        BasicJava.iterateArray(testArr);
        BasicJava.printMax(testArr);
        BasicJava.printAverage(testArr);
        BasicJava.arrayWithOdds255();
        BasicJava.greaterThanY(testArr, 3);
        BasicJava.squaredValues(testArr);
        BasicJava.removeNegatives(testArr2);
        BasicJava.maxMinAvg(testArr3);
        BasicJava.shiftValues(testArr);
    }

    // Problem 1: Print 1-255
    public static void printTo255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    // Problem 2: Print odd numbers between 1-255
    public static void printOdds255() {
        for (int i = 1; i <= 255; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    // Problem 3: Print Sum
    public static void printSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("Number: " + i + " " + "Sum: " + sum);
        }
    }

    // Problem 4: Iterating through an array
    public static void iterateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Problem 5: Find Max
    public static void printMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    // Problem 6: Get Average
    public static void printAverage(int[] arr) {
        int sum = 0;
        int avg;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println(avg);
    }

    // Problem 7: Array with Odd Numbers
    public static void arrayWithOdds255() {
        ArrayList<Integer> y =  new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++) {
            if (i % 2 == 1) {
                y.add(i);
            }
        }
        System.out.println(y);
    }

    // Problem 8: Greater Than Y
    public static void greaterThanY(int[] arr, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                count += 1;
            }
        }
        System.out.println(count);
    }

    // Problem 9: Square the values
    public static void squaredValues(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]*arr[i]);
        }
        System.out.println(newArr);
    }

    // Problem 10: Eliminate Negative Numbers
    public static void removeNegatives(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                newArr.add(0);
            } else {
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }

    // Problem 11: Max, Min, and Average
    public static void maxMinAvg(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        int avg;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        avg = sum / arr.length;
        newArr.add(max);
        newArr.add(min);
        newArr.add(avg);
        System.out.println(newArr);
        System.out.println("Max is " + max + " Min is " + min + " Average is " + avg);
    }

    // Problem 12: Shifting the Values in the Array
    public static void shiftValues(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length-1) {
                newArr.add(arr[i]);
                newArr.add(0);
            } else {
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }

}