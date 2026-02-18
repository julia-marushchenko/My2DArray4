/**
 *  Java program to demonstrate 2D array.
 */

package com.myarrays;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating 2D array.
        double[][] array = {
                {2.0, 3.1, 5.4, 6.8},
                {8.9, 9.7, 6.5},
                {5.8, 7.1, 8.5, 5.3},
                {2.7, 6.4},
                {2.0, 9.1, 3.5, 7.8, 3.2},
                {4.9, 3.2, 1.8}
        };

        // Printing 4th row of array.
        for (double element : array[4]) {

            System.out.print(element + " "); // Output: 2.0 9.1 3.5 7.8 3.2

        }
    }
}
