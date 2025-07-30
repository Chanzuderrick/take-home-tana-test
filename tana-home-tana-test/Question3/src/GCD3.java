/*
 * Question 3
 * Given a potentially non-zero integer array a with positive element
 * make it all zero except first element by repeatedly decrementing zero or more times
 * 
 * 
*/
public class GCD3 {
     //we start by calculating the gcd of 2 numbers
    static int findGCD(int a, int b) {
        while (b != 0) { //Runs as long as b is not zero
            int remainder = a % b; //we use modulus to find the remainder
            a = b; //update a to value of b and b to value of remainder
            b = remainder;
        }
        //if b becomes 0, a holds the GCD
        
        return a;

        }

        //we want to check if we can reduce to a[0],0,0
        static int Reduce(int[] a){
            if(a.length !=3){
                return 0; //if array doesn't have 3 elements we return 0
            }

            int g = findGCD(a[0], findGCD(a[1],a[2])); //calculates the gcd of the three numbers

            if(g==a[0]){ //if the gcd equals the first element then its possible to reduce to a[0],0,0
                return 1;
            }
            return 0; //if its not possible we return 0
            
        

    }

    public static void main(String[] args) throws Exception {
        int a[] = { 1, 2, 3 };
        int b = Reduce(a); //calls the function and its stored in b
        System.out.println(b); //prints the result 

 
        
    }
}
