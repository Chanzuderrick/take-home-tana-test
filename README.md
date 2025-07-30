# take-home-tana-test
This repo contains java solutions to tana java tests. Each file has a different solution to a different question.
The programming language used is java. JDK version used is java JDK-21. The ide used is VS Code.

##Questions entail
##Question1: Get Longest Valid String
it entails getting the longest string which doesn't have non-repetitive characters and it should be within ABCD.
I used arrays and for loops to solve the problem as seen in the code. 
I initialized the longest String, checked for validity of the characters.
Then, I checked if there are repeating characters.
Then, I Displayed the string which is valid and doesn't have repeating characters.

##Question2: Unique Sum Ways
We are given number result and an array of numbers.
The function should check how many unique ways the array's numbers can be added to match the result.
I used dynamic approach using subset sum counting. 
Create a dp array where dp[i] represents the number in the array, update the dp table by adding the numbers
in the array, update the dp table by adding the number of ways to form(current_sum-number) to the ways to form current sum.

##Question3: Make array zero first
This question is basically telling us to get the gcd of the given numbers. We first begin by calculating the gcd of the numbers
and then we check if they can result into the format given. a[0],0,0.
I used for loop, if statement and arrays.

##Question 4: First Unique Product
We find a word that doesn't have a duplicate and it's the first word. I used arrays and for loop. I also used if statement. I basically went over all the elements by using the for loop and got the first unique product by the help of the if statement.
I first did the null check to see if the array has elements.

##Question5: Distance between closest minimums
first of all, I used INTEGER wrapper classes. I set the distance to be a maximum value. Then with the help of arrays.sort I sorted the 
characters in ascending order.Then I used a for loop and a condition to check the distance. Then I displayed the minimum distance between the elements in the array.

##Question6:Three Most Common Strings in a sentence
I used tokenization and frequency counting with custom sorting. Split sentence into words, count frequencies using HashMaps, 
sort by frequency(descending) then alphabetically(ascending), take top 3 and finally sort the result alphabetically.

##Question7: Rotate List N times to the Right
Linked List pointer manipulation with modular arithmetic. Calculate effective rotations using modulo operation, find the
new tail (length - n positions from start), break the list at that point, and reconnect to form the rotated list.

