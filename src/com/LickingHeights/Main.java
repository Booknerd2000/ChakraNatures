package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int cpu,user,cpuPoints,userPoints,restart;
        cpuPoints = 0;
        userPoints = 0;

        String cpuChakra, userChakra;

        boolean gameLoop=true;
        boolean mainLoop=true;

        String[] chakra = new String[5];
        chakra[0] = "fire";
        chakra[1] = "wind";
        chakra[2] = "lightning";
        chakra[3] = "earth";
        chakra[4] = "water";

        System.out.println("Fire = 0 \nWind = 1 \nLightning = 2\nEarth = 3\nWater = 4\n");

        while(mainLoop){
            while(gameLoop){
                cpu = (int) (Math.random() * 5);
                cpuChakra = chakra[cpu];
                System.out.println(cpuChakra);

                user = keyboard.nextInt();
                userChakra = chakra[user];
                System.out.println(userChakra);

                cpuPoints= cpuWin(cpuChakra,userChakra,cpuPoints);
                //System.out.println(cpuPoints);
                userPoints= cpuLose(userChakra,cpuChakra,userPoints);
                //System.out.println(userPoints);
                if (userChakra==cpuChakra){
                    System.out.println("Draw");
                }

                System.out.println("cpuPoint "+cpuPoints+" userPoints "+userPoints);

                if (userPoints==5 || cpuPoints==5){
                    gameLoop = false;
                }
            }
            System.out.println("Want to play again\n[yes=1] [no=2]");
            restart=keyboard.nextInt();
            if(restart ==1){
                userPoints = 0;
                cpuPoints = 0;
                gameLoop = true;
            }else if (restart==2){
                mainLoop = false;
            }
        }

    }
    public static int cpuWin(String cpuChakra,String userChakra,int cpuPoints){

        switch(cpuChakra){
            case "fire":
                if(userChakra == "wind" || userChakra == "lightning") {
                    cpuPoints++;
                }
                break;

            case "wind":
                if (userChakra == "lightning" || userChakra == "earth") {
                    cpuPoints++;
                }
                break;

            case "lightning":
                if (userChakra == "earth" || userChakra == "water") {
                    cpuPoints++;
                }
                break;

            case "earth":
                if (userChakra == "water" || userChakra == "fire") {
                    cpuPoints++;
                }
                break;

            case "water":
                if (userChakra == "fire" || userChakra == "wind") {
                    cpuPoints++;
                }
                break;
        }
        return cpuPoints;
    }
    public static int cpuLose(String userChakra,String cpuChakra,int userPoints){
        switch(userChakra){
            case "fire":
                if(cpuChakra == "wind" || cpuChakra == "lightning") {
                    userPoints++;
                }
                break;

            case "wind":
                if (cpuChakra == "lightning" || cpuChakra == "earth") {
                    userPoints++;
                }
                break;

            case "lightning":
                if (cpuChakra == "earth" || cpuChakra == "water") {
                    userPoints++;
                }
                break;

            case "earth":
                if (cpuChakra == "water" || cpuChakra == "fire") {
                    userPoints++;
                }
                break;

            case "water":
                if (cpuChakra == "fire" || cpuChakra == "wind") {
                    userPoints++;
                }
                break;
        }
        return userPoints;
    }
}
