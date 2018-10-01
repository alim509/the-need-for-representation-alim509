package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter in a short word to be encrypted.");
        String decryption = kbInput.next();
        char[] decryptionArray = decryption.toCharArray();
        String value = "";

        int decryptionLength = 0;
        int type = 0;

            decryptionLength = decryption.length();
            double number = (Math.random() + 0.2) * 5;
            type = (int)number;

        double percent = (Math.random() + 0.01) * decryptionLength ;
        int num;

        if (percent - (int)percent >= 0.50) {
            num = (int)Math.ceil(percent);
        } else {
            num = (int)Math.floor(percent);
        }

        int o = 0;

        for (int i = 0; i < decryptionLength; i++) {
            char character = decryption.charAt(num + o);
            int ascii = (int)character;

            if (type == 1) {
                value = Integer.toBinaryString(ascii);
            } else if (type == 2) {
                value = Integer.toOctalString(ascii);
            } else if (type == 3) {
                value = Integer.toString(ascii);
            } else if (type == 4) {
                value = Integer.toHexString(ascii);
            } else {
                String s = String.valueOf(character);
                value = s;
            }

            if (num + o > decryptionLength - 2) {
                o = -1;
                num = 0;
            }

            System.out.print(value);

            type++;
            o++;

            if (type <= 5) {
            } else {
                type = 1;
            }

        }

    }
}
