import java.util.Scanner;
import java.lang.Math;
import java.nio.charset.*;

class Section1 {
    public static Scanner input = new Scanner(System.in);
    public static final double DEG_TO_RAD = (Math.PI/180); //creates two unchangeable variales for conversion
    public static final double RAD_TO_DEG = (180/Math.PI);
    public static void lawOfSines(){
        System.out.println("How many angles are given in the equation");
        System.out.println("1) One");
        System.out.println("2) Two");
        int lawOfSinesAsk = input.nextInt();

        if(lawOfSinesAsk == 1){
            System.out.println("Does the angle (uppercase letter) have a lowercase form in the first or second side?");
            System.out.println("1) First side");
            System.out.println("2) Second side");
            int sideAngleChoice = input.nextInt();

            if(sideAngleChoice == 2){
                System.out.println("What is the angle that is given?");
                int onlyAngleinput = input.nextInt(); //asks for the angle

                System.out.println("What is the first side (lowercase letter) that is given?");
                double firstSideinput = input.nextDouble(); //asks for the first side given

                System.out.println("What is the second side (lowercase letter) that is given?");
                double secondSideinput = input.nextDouble(); //asks for the second side

                System.out.println("");
                double ssASolver1 = Math.asin((secondSideinput * Math.sin(onlyAngleinput * DEG_TO_RAD)) / firstSideinput);
                System.out.println("The first missing angle is:");
                System.out.println("B = " + ssASolver1 + " degrees");

                //calculates the second missing angle needing to be found
                System.out.println("");
                double 	ssASolver2 = 180 - (onlyAngleinput + ssASolver1);
                System.out.println("The second missing angle is:");
                System.out.println(ssASolver2 + " degrees");

                //calculates the final side that needs to be found
                System.out.println("");
                double ssASolver3 = (firstSideinput * Math.sin(ssASolver2)) / Math.sin(onlyAngleinput);
                System.out.println("The final side is:");
                System.out.println(ssASolver3);
            }

        } else {
            //prompt user by choosing alternate option
            System.out.println("Do the uppercase letters given have a lowercase form also given?");
            System.out.println("1) Yes");
            System.out.println("2) No");
            int correspondingAngleAsk = input.nextInt();

            if(correspondingAngleAsk == 1){
                //asks the user for the first angle in the problem
                System.out.println("What is the first angle in the given equation");
                double firstAngleask = input.nextDouble();

                //asks for the second angle
                System.out.println("What is the second angle in the given equation");
                double secondAngleask = input.nextDouble();

                //asks for regular side length
                System.out.println("What is the lowercase letter that is given's value");
                double sideAsk = input.nextDouble();

                //finds the other undetermined angle (last uppercase letter)
                double lastAnglefind = 180 - (firstAngleask + secondAngleask);
                System.out.println("");
                System.out.println("The final angle remaining is:");
                System.out.println("C = " + lastAnglefind + " degrees");

                //fix issue by converting to degrees later
                System.out.println("");
                double lowercaseUnknownLetterfind = (sideAsk * Math.sin(lastAnglefind * DEG_TO_RAD)) / Math.sin(firstAngleask * DEG_TO_RAD);
                System.out.println("Side c is:");
                System.out.println("c = " + lowercaseUnknownLetterfind);

                System.out.println("");
                double lowercaseUnknownLetterfindpt2 = 	(sideAsk * Math.sin(secondAngleask * DEG_TO_RAD)) / Math.sin(firstAngleask * DEG_TO_RAD);
                System.out.println("Side b is:");
                System.out.println("b = " + lowercaseUnknownLetterfindpt2);
            } else if(correspondingAngleAsk == 2){
                //Asks for the first angle in the given problem
                System.out.println("What is the first angle in the given equation");
                double firstAngleask = input.nextDouble();

                //Asks for the second angle in the given problem
                System.out.println("What is the second angle in the given equation");
                double secondAngleask = input.nextDouble();

                //Asks for the regular side length
                System.out.println("What is the lowercase letter that is given's value");
                double sideAsk = input.nextDouble();

                //finds the other undetermined angle (last uppercase letter)
                double lastAnglefind = 180 - (firstAngleask + secondAngleask);
                System.out.println("");
                System.out.println("The final angle remaining is:");
                System.out.println(lastAnglefind);

                //finds the first hidden side
                System.out.println("");
                double firstSidesimplifier = (sideAsk * Math.sin(firstAngleask * DEG_TO_RAD)) / Math.sin(lastAnglefind * DEG_TO_RAD);
                System.out.println("Side c is:");
                System.out.println("c = " + firstSidesimplifier);

                //finds the second hidden side
                System.out.println("");
                double firstSidesimplifier2 = (sideAsk * Math.sin(secondAngleask * DEG_TO_RAD)) / Math.sin(lastAnglefind * DEG_TO_RAD);
                System.out.println("Side b is:");
                System.out.println("b = " + firstSidesimplifier2);
            }

        }
        input.close();
    } //here to create a new function to section 1
}