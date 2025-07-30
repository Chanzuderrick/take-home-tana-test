/*
 * Question 2
 * youre given a number result and array of numbers.
 * function checks how many unique ways the arrays number can be added to match the result
*/

import java.util.Arrays;

public class UniqueSums {
    //classsic coin change problem
    //use dynamic programming to solve this problem
    //assuming dp[i] are the optimum wqys to find the sum[i]
    //so for example we want to find  for a result = 5
    //the number of subproblems will be 6(from index 0-6)
    //we are given a result = type int
    //and an array int numArray[] = {2,5,7,8,3}
   static int countWays(int result, int[]numbers)
   {
       //create a dp array to store the number of ways for each sum
       //from 0 to result == result+1

       int[] dp = new int[result + 1];
       //base case i.e starting with zero which taeks no numbers
       dp[0] = 1;
       //then iterate through each number available in the array
       //for each (num) we iterate through all the possible sums from num upto rrsult
       for (int num : numbers) {
           System.out.println("Current num:" + num);

           for (int i = num; i <= result; i++) {
               System.out.println("Processing sum i:" + i + ", looking up[" + (i - num) + "]");
           
           dp[i] = dp[i] + dp[i - num];
       }

       System.out.println("After processing number:" + num + ": " + Arrays.toString(dp));

       }
       return dp[result];

   }
   
   
    public static void main(String[] args) throws Exception {

        int result1 = 5;
        int[] numbers1 = { 1, 2, 5 };
        System.out.println("Target:" + result1 + ", Numbers:" + Arrays.toString(numbers1));
        int ways1 = countWays(result1, numbers1);
        System.out.println("Number of ways:" +ways1);

    }

}
