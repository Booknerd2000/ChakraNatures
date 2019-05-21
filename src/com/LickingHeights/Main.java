package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int cpu,user;
        String cpuChakra, userChakra;

        String[] chakra = new String[5];
        chakra[0] = "fire";
        chakra[1] = "wind";
        chakra[2] = "lightning";
        chakra[3] = "earth";
        chakra[4] = "water";

        cpu = (int) (Math.random() * 5);
        cpuChakra = chakra[cpu];
        System.out.println(cpuChakra);

        System.out.println("Fire = 0 \nWind = 1 \nLightning = 2\nEarth = 3\nWater = 4\n");
        user = keyboard.nextInt();
        userChakra = chakra[user];
        System.out.println();


        switch(cpuChakra){
            case "fire":
                if()
                break;
            case "wind":

                break;
            case "lightning":

                break;
            case "earth":

                break;
            case "water":

                break;
        }
    }
}
