package com.company;
//8. Write a program which prints ""Hello world"" to the console using methods transformIntToChar and printList only

    import java.util.ArrayList;
public class Task8 {
        public static void main(String[] args) {
// write your code here

            String hello = "Hello World!";
            char [] values = hello.toCharArray();
            int[] v = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                v[i] = values[i];
            }
            ArrayList<Character> characters= transformIntToChar(v);
            for (Character c: characters ) {
                System.out.printf(c.toString());
            }

        }

        private static ArrayList<Character> transformIntToChar(int... values) {
            ArrayList<Character> buffer = new ArrayList<>();
            for (int i : values) {
                buffer.add(((char) i));
            }
            return buffer;
        }
    }



