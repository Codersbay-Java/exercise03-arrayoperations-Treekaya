package org.codersbay;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private final int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     */

    public void print() {
        System.out.println(Arrays.toString(numbers));
    }

    /**
     * @return the sorted numbers array.
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] sort() {
        int[] sorted = numbers;
        Arrays.sort(sorted);
        return sorted;
    }

    /**
     * @return the sorted array in reverse order
     */
    public int[] revertSort() {
        int[] reverted = new int[numbers.length];
        int index = 0;

        for (int i = numbers.length - 1; i >= 0; i--){
            reverted[index++] = numbers[i];
            //System.out.println(i +" was taken from " + index);
        }
        return reverted;
    }

    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {
        int[] reverted = new int[numbers.length];
        int index = 0;

        for (int i = numbers.length - 1; i >= 0; i--){
            reverted[index++] = numbers[i];
            //System.out.println(i +" was taken from " + index);
        }
        return reverted;
    }

    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
    public boolean contains(int value) {
        for (int item: numbers
             ) {
            if(item == value) return true;
        }
        return false;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
        double total = getTotal();
        return total / numbers.length;
    }

    public double getTotal(){
        double total = 0;

        for (int item: numbers
        ) {
            total += item;
        }

        return total;
    }

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {

        return (getTotal() - maxValue() - minValue()) / (numbers.length - 2);
    }

    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
        int highest = numbers[0];

        for (int item: numbers
        ) {
            if(item > highest) highest = item;
        }
        return highest;
    }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
        int highest = numbers[0];

        for (int item: numbers
        ) {
            if(item < highest) highest = item;
        }
        return highest;
    }

    /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private int someHelper(int[] tmp) {
        return 1;
    }
}