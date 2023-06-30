// Question 1
// Given three integer arrays arr1, arr2 and arr3 sorted in strictly 
//   increasing order, return a sorted array of only the integers that appeared in all three arrays.
class Assignment4_1{
    public static void main(String[] args) {
       int a1[] = {1,2,3,4,5};
       int a2[]  = {1,2,5,7,9};
       int a3[]  = {1,3,4,5,8};
       int i,j,k;
      for(i=0; i<a1.length; i++){
        for(j=0; j<a2.length; j++){
          if(a1[i]==a2[j]){
            for(k=0; k<a3.length; k++){
                if(a2[j]==a3[k]){
                    System.out.print(a3[k]+" ");
                }
        }
  }
         
    }
      }
}}
