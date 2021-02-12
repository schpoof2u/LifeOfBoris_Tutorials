/**
 * Blinmaker
 */
package Blinmaker;
import java.util.Scanner;
public class Blinmaker {
public static void main(String[]args){
    System.out.println("Hello World!");//how to write a line in java, it prints the message in string form and then moves cursor on the next line
    //uninitialized variables
    int eggsAmount;
    int flourAmount;
    int milkAmount;
    //initialized variables
    int eggsMin=1;
    int milkMin=200;//is in milliliters or ml
    int flourMin=100;// is in grams
    //I am going to be diverting from tutorial and replacing the word blin with pancake because I am american and also I think that is the american equaivilent, along with other minor changes
    System.out.println("Pancake maker is starting up.....");
    //Egg Section:
    System.out.println("How many eggs do you have?");
    Scanner userInput=new Scanner(System.in);
    eggsAmount=userInput.nextInt();
    System.out.println("You have "+eggsAmount+" eggs");
    //Flour Section:
    System.out.println("How many grams of flour do you have?");
    flourAmount=userInput.nextInt();
    System.out.println("You have "+flourAmount+" grams of flour");
    //Milk Section:
    System.out.println("How many mililiters of milk do you have?");
    milkAmount=userInput.nextInt();
    System.out.println("You have "+milkAmount+" mililiters of milk");
    //functionality of program:
    if(eggsAmount<eggsMin || milkAmount<milkMin || flourAmount<flourMin){
        System.out.println("you can't make any pancakes");
    }
    else{
        //flour proportions for pancake
        int flourPortions=flourAmount/flourMin;
        System.out.println("you have "+flourPortions+" usable grams of flour");
        //milk proportions for pancake
        int milkPortions=milkAmount/milkMin;
        System.out.println("you have "+milkPortions+" usable mililiters of milk ");
        //egg proportions for pancake
        int eggPortions=eggsAmount/eggsMin;
        System.out.println("you have "+eggPortions+" usable mililiters of milk ");
        int leastNumPancakes;
        if(eggPortions<=milkPortions || eggPortions<=flourPortions){
            leastNumPancakes=eggPortions;
            System.out.println("You can make "+leastNumPancakes+" pancakes");
            System.out.println("you will need "+eggPortions+" eggs");
            System.out.println("you will need "+milkMin*leastNumPancakes+" mililiters of milk");
            System.out.println("you will need "+flourMin*leastNumPancakes+" grams of flour");
        } else if(milkPortions<=eggPortions || milkPortions<=flourPortions){
            leastNumPancakes=milkPortions;
            System.out.println("You can make "+leastNumPancakes+" pancakes");
            System.out.println("you will need "+eggsMin*leastNumPancakes+" eggs");
            System.out.println("you will need "+milkMin*leastNumPancakes+" mililiters of milk");
            System.out.println("you will need "+flourMin*leastNumPancakes+" grams of flour");
        }
        else{
            leastNumPancakes=flourPortions;
            System.out.println("You can make "+leastNumPancakes+" pancakes");
            System.out.println("you will need "+eggsMin*leastNumPancakes+" eggs");
            System.out.println("you will need "+milkMin*leastNumPancakes+" mililiters of milk");
            System.out.println("you will need "+flourPortions+" grams of flour");
        }
        System.out.println("Pancake maker shuting down.....");
    }
}
    
}