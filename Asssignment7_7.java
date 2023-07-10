// 💡 **Question 7**
// Given two strings s and t, return true *if they are equal when both are typed into empty text editors*. '#' means a backspace character.
// Note that after backspacing an empty text, the text will continue empty.

import java.util.ArrayList;
import java.util.List;

public class Asssignment7_7 {
    public static boolean backS(String s, String t) {
        return St(s).equals(St(t));
    }

    private static String St(String str) {
        List<Character> resultList = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                resultList.add(ch);
            } else if (!resultList.isEmpty()) {
                resultList.remove(resultList.size() - 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : resultList) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean result = backS(s, t);
        System.out.println(result);  // Output: true
    }
}
