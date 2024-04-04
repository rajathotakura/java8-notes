package org.learn.java8.string;

public class ReverseString {

    public static void main(String[] args) {

        String revName = reverseString("Rajaram");
        System.out.println(revName);
    }

    public static String reverseString(String name) {
        StringBuffer sb = new StringBuffer();
        for(int i=name.length()-1;i>=0;i--) {
            sb.append(name.charAt(i));
        }
        return sb.toString();
    }
}
