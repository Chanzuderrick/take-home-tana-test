/*
 * Question 5
 * youre given an array of integers
 * find the distance between the two closest minimums
 * minimum occurs at least two times
*/

import java.util.Arrays;
import java.lang.Math;

public class ClosestTwoElement {
    static int closestDistance(int[] nums) {
        /*
         * we initialize the distance
         * the distance cant be zero so we give it the maximum value possible
         * we find the maximum distance from the wrapper class of integers as an instance
        */
        int distance = Integer.MAX_VALUE;
        Arrays.sort(nums); //we first sort the arrays in ascending order
        for (int i = 0; i + 1 < nums.length; i++) {
            /*
             * we use a for loop to iterate over the elements
             * we use i+1 < nums.length so that we cannot exceed the elements
            */
            int currentDistance = nums[i + 1] - nums[i]; //it takes the number after and subtracts with the number before
            distance = Math.min(currentDistance, distance);// we compare and get the smallest distance

            if (distance == 0) { //if distance is 0 we dont continue 
                break;
            }
            

        } 
        return distance;
    }
    public static void main(String[] args){
        int[] numbers = new int[] { 1, 5, 9, 12, 14, 20 }; //example
        int closestDistanceArray = closestDistance(numbers);//call the function
        System.out.println(closestDistanceArray); //display the result
    }
}
