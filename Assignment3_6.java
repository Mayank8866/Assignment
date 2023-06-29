// Question 6
// Given a non-empty array of integers nums, every element appears twice except
// for one. Find that single one.

import java.util.*;

public class Assignment3_6 {
    public static void main(String[] args) {
        int k[] = { 1, 2,3, 4, 5, 5, 4, 1, 3 };
        Arrays.sort(k);
        System.out.println(findSingle(k,k.length-1));
 
    }
    private static int findSingle(int k[],int n){
        
        for (int i = 0; i < k.length-1; i++) {

            if (k[i] == k[i + 1]) {
                k[i] = -1;
                k[i+1]=-1;
               
            }
        }
         Arrays.sort(k);
          return k[k.length-1];
    }

}
