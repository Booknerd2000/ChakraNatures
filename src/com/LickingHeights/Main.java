package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int cpu;
        String cpuChakra;

        String[] chakra = new String[5];
        chakra[0] = "fire";
        chakra[1] = "wind";
        chakra[2] = "lightning";
        chakra[3] = "earth";
        chakra[4] = "water";

        cpu = (int) (Math.random() * 5);
        cpuChakra = chakra[cpu];

        System.out.println(cpuChakra);

    }
}
