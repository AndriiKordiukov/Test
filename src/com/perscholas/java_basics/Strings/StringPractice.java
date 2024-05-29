package com.perscholas.java_basics.Strings;

public class StringPractice {
    public static void main(String[] args) {
        String A="hello";
        String B="java";
        // Length sum
        System.out.println(A.length()+B.length());
        // Comparing A and B lexicographically
        if (A.compareTo(B)>0)
            System.out.println("Yes");
        else if (A.compareTo(B)<0)
            System.out.println("No");
        else
            System.out.println("Equal");
        // Capitalizing first letters of A and B
        char ch = A.charAt(0);              // first letter
        Character chUp = new Character(ch); // Creating Character object
        chUp = Character.toUpperCase(ch);   // Make it capital
        A = A.replace(ch,chUp); // Replacing
        ch = B.charAt(0);
        chUp = Character.toUpperCase(ch);
        B = B.replace(ch,chUp);

        System.out.println(A + " " + B);

        // Java String Reverse

        String word = "madam";
        StringBuilder sb  = new StringBuilder(word);
        String revers = sb.reverse().toString();
        if (A.equals(revers))
            System.out.println("Yes");
        else
            System.out.println("No");

        // String Tokens
        String s = "                a                    ";
        String[] splits = s.split("[^a-zA-Z]+"); // remove everything except english letters
        System.out.println(splits.length);
        for (int i = 0; i < splits.length; i++)
            System.out.println(splits[i]);
    }
}
