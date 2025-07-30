/*
 * Question 1: implement the function getLongestString to return the longest s
ring which matches the conditions
 * i)String should have non-repetitive identical characters
 * ii)String should only contain among given list of characters
*/
public class GetLongestString1 {
    static String getLongestString(String characters, String[] strings ){ //function whose parameters are characters and string of arrays
        //we use static method because we can call the method without creating an object

        String longest = " "; //temporary variable to store current longest valid string
        for (int i = 0; i < strings.length; i++) {//we loop through each string in the arrays of strings
            String s = strings[i];//stores current string being checked

            //we check to see if all characters are valid
            boolean isValid = true; //initialize

            for (int j = 0; j < s.length(); j++) {//we go through each character in the current string
                char c = s.charAt(j);

                if (characters.indexOf(c) == -1) { //checks if the character is in characters
                    isValid = false;
                    break;
                }

            }

            //we then check to see if there is a repeating character

            boolean isRepeating = false;

            //we then start with position 1 and compare each character with the one before it

            for (int j = 1; j < s.length(); j++) { 
                if (s.charAt(j) == s.charAt(j - 1)) {//checks if 2 characters next to each other are the same
                    isRepeating = true;
                    break;

                }
            }

            //if its valid and its the longest then we get it from here
            if (isValid && !isRepeating && (s.length() > longest.length())) {
                longest = s;
            }

        }
        return longest;
        
        
    }
    public static void main(String[] args) throws Exception { //main method
        String validCharacter = "ABCD"; //contains allowed characters
        String[] strings = { "AABCDA", "ABCDZADC", "ABCDCBCA", "ABCDBDCA" }; //array of Strings to check
        
        String result = getLongestString(validCharacter,strings); //calling the function
        
    System.out.println(result); //displays the result which is the longest valid string
    }
}
