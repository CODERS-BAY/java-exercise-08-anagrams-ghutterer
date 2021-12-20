package anagram;

import java.util.Arrays;

public class AnagramFinder {

    public static void main(String[] args) {
       String str1 = "Whats up";
       String str2 = "suthpaw";

        if(areAnagrams(str1,str2)){
            System.out.println("They are anagrams");
        }else
            System.out.println("They are not anagrams");

    }


    public static boolean areAnagrams(String string1, String string2) {
        String str1 = removeJunk(string1);
        String str2 = removeJunk(string2);

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        str1 = sort(str1);
        str2 = sort(str2);

        return str1.equals(str2);
    }

    protected static String removeJunk(String string) {
        int length = string.length();
        StringBuilder sb = new StringBuilder(length);


        for (int i =0; i<string.length(); i++) {
           char c = string.charAt(i);
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    protected static String sort(String string) {
        char[] charArray = string.toCharArray();

        Arrays.sort(charArray);
      return Arrays.toString(charArray);


    }

    /*
        Add more private methods if needed
     */
}
