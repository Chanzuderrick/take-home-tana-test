import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateSolution {
    public static List<Integer> rotateListRight(List<Integer> originalList, int n) {
        //Null check, if this condition is true(returns the original list) i.e no rotations needed
        if(originalList.isEmpty()){
            return originalList;
        }
        int len= originalList.size();
        n= n%len;

        //if n is a multiple of length no effective rotation will be done
        if(n==0){
            return originalList;
        }
        //This is an empty list, like an empty canvas to populate as we rotate

        List<Integer> rotatedList = new ArrayList<Integer>();
        //add the elements from the end that wrap to the beginning!

        //That is from index(length -n) to (len -1)> the last element

        for(int i= len-n; i<len; i++){
            rotatedList.add(originalList.get(i));
        }

        //add the remaining elements from the beginning fo the original list
        //That is from index 0 to (len-n-1)
        for(int i=0; i<len-n; i++){
            rotatedList.add(originalList.get(i));
        }
        return rotatedList;

    }

    public static void main(String[] args) throws Exception {
        System.out.print("---List Rotation---");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original:" + list1 + ",n=1");
        
        List<Integer> rotated1 = rotateListRight(list1, 1);
        System.out.println("Rotated:" + rotated1); //expected [5,1,2,3,4]
        
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\nOriginal:" + list2 + ",n=2");

        List<Integer> rotated2 = rotateListRight(list2, 2);
        System.out.println("Rotated:" + rotated2); //expected [4,5,1,2,3]

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\nOriginal:" + list3 + ",n=5");

        List<Integer> rotated3 = rotateListRight(list3, 5);
        System.out.println("Rotated:" + rotated3); //expected [4,5,1,2,3]

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\nOriginal:" + list4 + ",n=7");

        List<Integer> rotated4 = rotateListRight(list4, 7);
        System.out.println("Rotated:" + rotated4); //expected [4,5,1,2,3]

    
        
        

        
    }
}
