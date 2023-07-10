// 💡 **Question 5**
// Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
// If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

import java.util.*;

public class Assignment7_5 {
    public static void main(String[] args) {
Scanner  sc=new Scanner(System.in);
String s=sc.next();

  char a[]=s.toCharArray(); 
  int i=0;int j=(sc.nextInt()-1)%(a.length-1);
  while(i<=j){
     char t=a[i];
        a[i]=a[j];
        a[j]=t;
    i++;
    j--;
  }
 String k=new String(a);
  System.out.println(k);
  sc.close();
        
    } 
}
