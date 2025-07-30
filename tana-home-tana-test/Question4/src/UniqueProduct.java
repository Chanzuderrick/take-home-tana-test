/*
 * Question 4
 * we need to find a word that doesnt have a duplicate in an array
 * this word should be the first one
*/
public class UniqueProduct {
    static String firstUnique(String[] a) { //method which takes up a string of arrays
        if (a.length == 0) { //we check if the string is empty,if it is it returns null
            return null;
        }

        for (int i = 0; i < a.length; i++) { //we go through each item in the array and use its index i
            String c = a[i]; //stores current string in a variable called c
            int count = 0; //this is the counter

            for (String item : a) { //loop through each item in an array
                if (c.equals(item)) {
                    count++; //if they match we increase the counter by 1
                }
            }
            if (count == 1) { //if the counter is 1 it means the number doesn't have a duplicate, conditions are met.
                return c;
            }
        }
        return null; //no unique product we return null
    }
    public static void main(String[] args) throws Exception {
        String[] a = { "apple", "computer", "apple", "bag" }; //example array given
        String result = firstUnique(a);//we call the method and store it in result variable
        System.out.println(result);//display the result
    }
}
