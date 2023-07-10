// 💡 **Question 3**
// Given two non-negative integers, num1 and num2 represented as string, return *the sum of* num1 *and* num2 *as a string*.

import java.util.Scanner;

public class Assignment7_3 {
    public static int sToN(char ch[]) {
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case '0':
                    sum = sum * 10 + 0;
                    break;
                case '1':
                    sum = sum * 10 + 1;
                    break;
                case '2':
                    sum = sum * 10 + 2;
                    break;
                case '3':
                    sum = sum * 10 + 3;
                    break;
                case '4':
                    sum = sum * 10 + 4;
                    break;
                case '5':
                    sum = sum * 10 + 5;
                    break;
                case '6':
                    sum = sum * 10 + 6;
                    break;
                case '7':
                    sum = sum * 10 + 7;
                    break;
                case '8':
                    sum = sum * 10 + 8;
                    break;
                case '9':
                    sum = sum * 10 + 9;
                    break;
            }
         

        }   return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String k = sc.next();
        sc.close();
        // System.out.println(s+k);
        char ch[] = s.toCharArray();
        char a[] = k.toCharArray();
        int result = sToN(ch);
        result += sToN(a);
        System.out.println(result);

    }

}
