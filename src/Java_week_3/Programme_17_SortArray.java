package Java_week_3;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17_SortArray {
    public static void main(String[] args) {
        //numeric array declaration
        int[] numArray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787
        };
        //String Array declaration
        String[] strArray = {
                "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"
        };
        System.out.println("Actual numerical array was : " + Arrays.toString(numArray));
        //sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted numerical array is : " + Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual string array was : " + Arrays.toString(strArray));
        //sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted string Array is : " + Arrays.toString(strArray));
    }
}
