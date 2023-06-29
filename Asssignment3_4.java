// Question 4
// Given a sorted array of distinct integers and a target value, return the index if the
// target is found. If not, return the index where it would be if it were inserted in
// order.

import java.util.*;

public class Asssignment3_4 {
    public static void main(String[] args) {
        int k[] = { 1,3,5,6};
        int n=5;
        Arrays.sort(k);
        System.out.println( findSingle(k,n));
 
    }
    private static int findSingle(int k[],int n){
        
        int p=-1; 
        for (int i = 0; i < k.length; i++) {
            if(n==k[i]){
                p=i;
            }
            
        }
        return p;
    }

}
