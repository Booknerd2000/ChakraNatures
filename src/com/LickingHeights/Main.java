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
        chakra[0] = "Fire";
        chakra[1] = "Wind";
        chakra[2] = "Lightning";
        chakra[3] = "Earth";
        chakra[4] = "Water";

        System.out.println("\033[4m" +"\033[1;36m"+"Chakra Natures"+"\033[49m");
        System.out.println("\n" +
                "                 ......             .                                              \n"+
                "     .          ..   ...           . .                                             \n" +
                "    ..              ....         .           ..........           .....     .....  \n" +
                "   ... .   ............         . .        ..............        .      .  .      .\n" +
                " ....  ..     ..............  .    .      ....    ........      ..   ...  ..   ... \n" +
                "... ......                ...     . .     .........  .....     ...       ...       \n" +
                ".... .....            ..   ..   ..   .     ...  ... .....     ....... .......      \n" +
                "  ......               .....   .            ............    ..................     ");

        System.out.println("   Fire          Wind          Lightning        Earth              Water");
        System.out.println("    0             1                2              3                  4\n");
        System.out.println("\033[4m" +"Pick a Chakra"+"\033[49m");

        while(mainLoop){
            while(gameLoop){

                cpu = (int) (Math.random() * 5);
                cpuChakra = chakra[cpu];


                user = keyboard.nextInt();
                userChakra = chakra[user];
                System.out.println("\033[0;30m"+userChakra+"  V.S  "+cpuChakra+"\033[49m");

                cpuPoints= cpuWin(cpuChakra,userChakra,cpuPoints);
                //System.out.println(cpuPoints);
                userPoints= cpuLose(userChakra,cpuChakra,userPoints);
                //System.out.println(userPoints);
                if (userChakra==cpuChakra){
                    System.out.println("Draw");
                }

                System.out.println("\033[0;30m"+"You    CPU\n " +userPoints+"      "+cpuPoints+"\033[49m");

                if (userPoints==5 || cpuPoints==5){
                    gameLoop = false;
                }
            }
            if (userPoints==5){
                System.out.println("\033[0;33m"+"YOU WIN"+"\033[49m");
            } else if(cpuPoints==5){
                System.out.println("\033[0;31m"+"YOU LOSE"+"\033[49m");
            }
            System.out.println("\033[1;34m"+"Want to play again?\n[yes=1] or [no=2]"+"\033[49m");
            System.out.println("Type your number twice. ex. \"1\"[enter]+\"1\"[enter] ");
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
            case "Fire":
                if(userChakra == "Wind" || userChakra == "Lightning") {
                    cpuPoints++;
                    System.out.println("\033[0;31m"+"Defeat"+"\033[49m");
                }
                break;

            case "Wind":
                if (userChakra == "Lightning" || userChakra == "Earth") {
                    cpuPoints++;
                    System.out.println("\033[0;31m"+"Defeat"+"\033[49m");
                }
                break;

            case "Lightning":
                if (userChakra == "Earth" || userChakra == "Water") {
                    cpuPoints++;
                    System.out.println("\033[0;31m"+"Defeat"+"\033[49m");
                }
                break;

            case "Earth":
                if (userChakra == "Water" || userChakra == "Fire") {
                    cpuPoints++;
                    System.out.println("\033[0;31m"+"Defeat"+"\033[49m");
                }
                break;

            case "Water":
                if (userChakra == "Fire" || userChakra == "Wind") {
                    cpuPoints++;
                    System.out.println("\033[0;31m"+"Defeat"+"\033[49m");
                }
                break;
        }
        return cpuPoints;
    }
    public static int cpuLose(String userChakra,String cpuChakra,int userPoints){
        switch(userChakra){
            case "Fire":
                if(cpuChakra == "Wind" || cpuChakra == "Lightning") {
                    userPoints++;
                    System.out.println("\033[1;36m"+"Victory"+"\033[49m");
                }
                break;

            case "Wind":
                if (cpuChakra == "Lightning" || cpuChakra == "Earth") {
                    userPoints++;
                    System.out.println("\033[1;36m"+"Victory"+"\033[49m");
                }
                break;

            case "Lightning":
                if (cpuChakra == "Earth" || cpuChakra == "Water") {
                    userPoints++;
                    System.out.println("\033[1;36m"+"Victory"+"\033[49m");
                }
                break;

            case "Earth":
                if (cpuChakra == "Water" || cpuChakra == "Fire") {
                    userPoints++;
                    System.out.println("\033[1;36m"+"Victory"+"\033[49m");
                }
                break;

            case "Water":
                if (cpuChakra == "Fire" || cpuChakra == "Wind") {
                    userPoints++;
                    System.out.println("\033[1;36m"+"Victory"+"\033[49m");
                }
                break;
        }
        return userPoints;
    }
}
