package org.learn.java8.string;

public class StringReverseVowelUntouch {

    public static void main(String[] args) {

    }
    public static String stringRevVowelsUnTouch(String name) {

        for(int i=0;i<name.length();i++) {
            for(int j=name.length()-1;j>0;j--) {
                if(isVowel(name.charAt(i)) & isVowel(name.charAt(j))) {
                    char temp;
                    temp = name.charAt(i);


                }
            }
        }

        return null;
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c=='a' || c=='e'||c=='i'||c=='o'||c=='u');
    }
}
