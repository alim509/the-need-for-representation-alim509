package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter in a short word to be encrypted.");
        String decryption = kbInput.next();
        char[] decryptionArray = decryption.toCharArray();

        int decryptionLength = decryption.length();
        double number = (Math.random() + 0.2) * 5;
        int type = (int)number;

        double percent = Math.random() * decryptionLength;
        int num;

        if (percent - (int)percent >= 0.50) {
            num = (int)Math.ceil(percent);
        } else {
            num = (int)Math.floor(percent);
        }

        if (type == 1) {

        } else if (type == 2) {

        } else if (type == 3) {

        } else if (type == 4) {

        } else {

        }

    }
}
