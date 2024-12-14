/**
 * Tanggal: 14/12/2024
 * Link: https://www.codewars.com/kata/587731fda577b3d1b0001196/train/java
 */

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("ripple button"));
        System.out.println(camelCase("navigation bar"));
        System.out.println(camelCase("round icon"));
    }

    public static String camelCaseSingle(String str) {
        String[] letters = str.split("");
        String result = "";

        for (int i = 0; i < letters.length; i++) {
            if (i == 0) {
                result += letters[i].toUpperCase();
            } else {
                result += letters[i];
            }
        }

        return result;
    }

    public static String camelCase(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            result += camelCaseSingle(word);
        }

        return result;
    }
}
