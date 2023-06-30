
// 💡 **Question 2**

// Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*

// - answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
// - answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.

class Assignmet4_2{
    public static void main(String[] args) {
       int a1[] = {1,2,3};
       int a2[]  = {2,4,6};
      // int a3[]  = {1,3,4,5,8};
       int i,j,f;
      for(i=0; i<a1.length; i++){
        f=0;
        for(j=0; j<a2.length; j++){
          if(a1[i]==a2[j]){f=1;
            break;
                             }                
        }if(f==0){
            System.out.print(a1[i] +"  ");

        }
  }
  for(i=0; i<a2.length; i++){
    f=0;
    for(j=0; j<a1.length; j++){
      if(a2[i]==a1[j]){f=1;
        break;
                         }                
    }if(f==0){
        System.out.print(a2[i] +"  ");

    }
}
    }
      }
