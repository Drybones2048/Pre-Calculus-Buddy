import java.util.Scanner;
import java.lang.Math;
import java.nio.charset.*;

class Section4 extends Section3{
    public static Scanner input = new Scanner(System.in);

    public static String derivePiece(String function) {
        //creates empty strings that will be used as strings that carry the exponents and the value at the front
        String frontVal = "";
        String exponent = "";

        for (int i = 0; i < function.length(); i++) { //parses the front and isolates the first value

            if (function.charAt(i) != 'x') {
                if (function.charAt(i) == '^') { //when the carrot is located the program will break
                    break;
                }

                frontVal += function.charAt(i);

            }
        }


        for (int j = function.length() - 1; j >= 0; j--) { //parses the back to get the full value of the exponent
            if (Integer.valueOf(function.substring(frontVal.length() + 2, function.length())) % 10 == 0) { //this is to solve the power of 10 exponent bug

                return (Integer.valueOf(frontVal) * Integer.valueOf(function.substring(frontVal.length() + 2, function.length()))) + "x^" + (Integer.valueOf(function.substring(frontVal.length() + 2, function.length())) - 1);
            }

            if (Integer.valueOf(function.substring(frontVal.length() + 2, function.length())) == 1) {
                return frontVal;
            }


            if (function.charAt(j) != '^') {
                if (function.charAt(j) == 'x') { //once the x is found, then it triggers the end of the exponent and stops the program
                    break;
                }

                exponent += function.charAt(j);

            }
        }


        return (Integer.valueOf(frontVal) * Integer.valueOf(exponent)) + "x^" + (Integer.valueOf(exponent) - 1); //returns the new derived function
    }

    public static String antiDerivePiece(String function) {
        //creates empty strings that will be used as strings that carry the exponents and the value at the front
        String frontVal = "";
        String exponent = "";

        for (int i = 0; i < function.length(); i++) { //parses the front and isolates the first value

            if (function.charAt(i) != 'x') {
                if (function.charAt(i) == '^') { //when the carrot is located the program will break
                    break;
                }

                frontVal += function.charAt(i);

            }
        }

        for (int j = function.length() - 1; j >= 0; j--) { //parses the back to get the full value of the exponent
            if (Integer.valueOf(function.substring(frontVal.length() + 2, function.length())) % 10 == 0) { //this is to solve the power of 10 exponent bug

                return (Integer.valueOf(frontVal) / Integer.valueOf(function.substring(frontVal.length() + 2, function.length()))) + "x^" + (Integer.valueOf(function.substring(frontVal.length() + 2, function.length())) + 1);
            }

            if (function.charAt(j) != '^') {
                if (function.charAt(j) == 'x') { //once the x is found, then it triggers the end of the exponent and stops the program
                    break;
                }

                exponent += function.charAt(j);

            }
        }
        input.close();
        return (frontVal + "/" + (Integer.valueOf(exponent) + 1)) + "x^" + (Integer.valueOf(exponent) + 1); //returns the new derived function
    }

    public static String crossProduct() { //used for the cross product concept in calculus 3
        int[][] crossProdS = new int[2][3];

        int[] vectorU = {0, 0, 0}; //vectors u
        int[] vectorV = {0, 0, 0}; //vectors v

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter u1:"); //inputs for the components of the 3d vectors u and v
        int u1 = input.nextInt();

        System.out.println("\nEnter u2:");
        int u2 = input.nextInt();

        System.out.println("\nEnter u3:");
        int u3 = input.nextInt();

        System.out.println("\nEnter v1:");
        int v1 = input.nextInt();

        System.out.println("\nEnter v2:");
        int v2 = input.nextInt();

        System.out.println("\nEnter v3:");
        int v3 = input.nextInt();

        vectorU[0] = u1;
        vectorU[1] = u2;
        vectorU[2] = u3;

        vectorV[0] = v1;
        vectorV[1] = v2;
        vectorV[2] = v3;


        System.out.println("Step 1: Set up the cross product\n");

        System.out.println("  |i  j  k|");


        int j = 0; //used for loading for loop

        for (int i = 0; i < 6; i++) {
            if (vectorU.length <= i) {
                crossProdS[1][j] = vectorV[j];
                j++;
            } else {
                crossProdS[0][i] = vectorU[i];
            }


        }

        //crossProdS[0][2] = vectorU[2];


        //System.out.println(Arrays.deepToString(crossProdS));

        System.out.println("  |" + vectorU[0] + "  " + vectorU[1] + "  " + vectorU[2] + "|\n  |" +
                vectorV[0] + "  " + vectorV[1] + "  " + vectorV[2] + "|"); //making a print statement to represent how the cross product looks

        System.out.println("\nStep 2: Duplicate the firt two columns");

        System.out.println("  i  j  k  i  j");
        System.out.println("  " + vectorU[0] + "  " + vectorU[1] + "  " + vectorU[2] + "  " + vectorU[0] + "  " + vectorU[1] + "\n  " +
                vectorV[0] + "  " + vectorV[1] + "  " + vectorV[2] + "  " + vectorV[0] + "  " + vectorV[1]);


        System.out.println("\nStep 3: Multiply Across\n");

        System.out.println((vectorU[1] * vectorV[2]) + "i" + " + " + (vectorU[2] * vectorV[0]) + "j" + " + " + (vectorU[0] * vectorV[1]) + "k" +
                " - " + (vectorU[0] * vectorV[2]) + "j" + " - " + (vectorU[2] * vectorV[1]) + "i" + " - " + (vectorU[1] * vectorV[0]) + "k");

        System.out.println("\nStep 4: Combine\n");

        System.out.println("<" + ((vectorU[1] * vectorV[2]) + (-1 * (vectorU[2] * vectorV[1]))) + ", " + ((vectorU[2] * vectorV[0]) + (-1 * (vectorU[0] * vectorV[2]))) + ", " + ((vectorU[0] * vectorV[1]) + (-1 * (vectorU[1] * vectorV[0]))) + ">");

        String finalValue = "<" + ((vectorU[1] * vectorV[2]) + (-1 * (vectorU[2] * vectorV[1]))) + ", " + ((vectorU[2] * vectorV[0]) + (-1 * (vectorU[0] * vectorV[2]))) + ", " + ((vectorU[0] * vectorV[1]) + (-1 * (vectorU[1] * vectorV[0]))) + ">";

        return finalValue;

    }
}