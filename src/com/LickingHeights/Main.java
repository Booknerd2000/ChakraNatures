package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int cpu,user,cpuPoints,userPoints;
        cpuPoints = 0;
        userPoints = 0;

        String cpuChakra, userChakra;

        String[] chakra = new String[5];
        chakra[0] = "fire";
        chakra[1] = "wind";
        chakra[2] = "lightning";
        chakra[3] = "earth";
        chakra[4] = "water";

        System.out.println("Fire = 0 \nWind = 1 \nLightning = 2\nEarth = 3\nWater = 4\n");

        cpu = (int) (Math.random() * 5);
        cpuChakra = chakra[cpu];
        System.out.println(cpuChakra);

        user = keyboard.nextInt();
        userChakra = chakra[user];
        System.out.println();


        switch(cpuChakra){
            case "fire":
                if(userChakra == "wind" || userChakra == "lightning") {
                    cpuPoints++;
                }else if (userChakra == cpuChakra) {
                    System.out.println("tie");
                } else {
                    userPoints++;
                }
                break;

            case "wind":
                if (userChakra == "lightning" || userChakra == "earth") {
                    cpuPoints++;
                }else if (userChakra == cpuChakra) {
                    System.out.println("tie");
                } else {
                    userPoints++;
                }
                break;

            case "lightning":
                if (userChakra == "earth" || userChakra == "water") {
                    cpuPoints++;
                }else if (userChakra == cpuChakra) {
                    System.out.println("tie");
                } else {
                    userPoints++;
                }
                break;

            case "earth":
                if (userChakra == "water" || userChakra == "fire") {
                    cpuPoints++;
                }else if (userChakra == cpuChakra) {
                    System.out.println("tie");
                } else {
                    userPoints++;
                }
                break;

            case "water":
                if (userChakra == "fire" || userChakra == "wind") {
                    cpuPoints++;
                }else if (userChakra == cpuChakra) {
                    System.out.println("tie");
                } else {
                    userPoints++;
                }
                break;
        }
        System.out.println("cpuPoint"+cpuPoints+"userPoints"+cpuPoints);
    }
}
