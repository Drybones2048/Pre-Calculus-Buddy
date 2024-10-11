import java.util.Scanner;
import java.lang.Math;
import java.nio.charset.*;

class Section3 extends Section2{
    public static Scanner input = new Scanner(System.in);
    public static final double DEG_TO_RAD = (Math.PI/180); //creates two unchangeable variables for conversion
    public static final double RAD_TO_DEG = (180/Math.PI);
    public static void arrangeLetters() {
        System.out.println("What is the number of letters or items that you are asked to arrange?");
        int numOfOptions = input.nextInt();

        int actualNumofOptions = numOfOptions*(numOfOptions - 1);
        System.out.println("");
        System.out.println("There are " + actualNumofOptions + " ways you can arrange the letters or items");
    } public static void combinationSolver() {
        System.out.println("How many items are we starting with?");
        int numOfItems = input.nextInt();

        System.out.println("How many outputs are you dealing with example) 3 numbers of a combination lock");
        int repeatTimes = input.nextInt();

        double differentCombos = Math.pow(numOfItems, repeatTimes);
        System.out.println("");
        System.out.println("There are " + differentCombos + " ways of repeating combos");
    } public static void permutation() {
        System.out.println("What is the number that you would like to use a permutation on?");
        int origionalNum = input.nextInt();

        System.out.println("");
        System.out.print("The permutation is ");
        for (int i = 0; i < origionalNum; i++) {
            int individualPermuNum = (origionalNum - i);

            System.out.print(individualPermuNum + ", ");
        }
        input.close();
    }
}