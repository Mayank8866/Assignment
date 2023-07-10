// 💡 **Question 4**
// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

import java.util.*;

public class Assignment7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        revses(s);
        sc.close();
    }

    public static void revses(String s) {
        char ch[] = s.toCharArray();
        String k = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' '&&i!=ch.length-1) {
                k += ch[i];

            }  else if(i==ch.length-1){
                k+=ch[ch.length-1];
                System.out.print(revW(k) + " ");
                

            }
            else {
                System.out.print(revW(k) + " ");
                k="";
            }

        }
    }

    public static String revW(String s) {
        char ch[] = s.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }

}
