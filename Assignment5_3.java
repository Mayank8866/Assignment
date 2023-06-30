//Question 3
//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
import java.util.Arrays;
class Assignment5_3{
    public static void main(String[] args) {
        int a[]={ -4,-1,0,3,10};
       // 0,1,9,16,
       int i;
      for(i=0; i<a.length; i++){
       a[i]=a[i]*a[i];
      }
      Arrays.sort(a);
      for(int j:a){
        System.out.print(j +" ");
      }
    }
}
