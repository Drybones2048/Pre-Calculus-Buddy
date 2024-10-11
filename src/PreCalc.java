import java.util.*;
import java.lang.Math;
import java.nio.charset.*;



public class PreCalc extends Section4{


    public static void main (String[] args) {
        Scanner chapterSelect = new Scanner(System.in);
        System.out.println("What Section of Pre-Calculus would you like to use");
        System.out.println("1) Section 1");
        System.out.println("2) Section 2");
        System.out.println("3) Section 3");
        System.out.println("4) Section 4 (Calculus Concepts)");
        int sectionChoose = chapterSelect.nextInt();

        if(sectionChoose == 1){
            System.out.println("Topics: ");
            System.out.println("1) Law of Sines");
            int section1Choose = chapterSelect.nextInt();

            if(section1Choose == 1){
                Section1.lawOfSines();
            }
        } else if(sectionChoose == 2) {
            System.out.println("Topics: ");
            System.out.println("1) Find the dot product of a vector");
            System.out.println("2) Find the Head Minus Tail for Vectors");
            System.out.println("3) Find the magnitude of a vector when given two vectors");
            System.out.println("4) Vector Addition and Scalar Multiplication");
            System.out.println("5) Find the angle between vectors");
            System.out.println("6) Find Linear Combination");
            System.out.println("7) Resolving a vector into its components");
            System.out.println("8) Finding orthogonal vectors");
            System.out.println("9) Vector projection (in progress)");
            System.out.println("10) Work Equations");
            System.out.println("11) Polar Equations for conics (From section 8.5)");
            System.out.println("12) Magnitude of one vector");
            System.out.println("13) Special Polar Graph Type checker");
            System.out.println("14) Direction angle of a vector");
            System.out.println("15) Direction Vector");
            int section2Choose = chapterSelect.nextInt();

            if(section2Choose == 1) {
                Section2.vDotProduct();
            } else if(section2Choose == 2) {
                Section2.HMT();
            } else if(section2Choose == 3) {
                Section2.vectorMagnitude();
            } else if(section2Choose == 4) {
                Section2.vectorAddition();
            } else if(section2Choose == 5) {
                Section2.angleBetweenVectors();
            } else if(section2Choose == 6) {
                Section2.linearCombination();
            } else if(section2Choose == 7) {
                Section2.resolveVector();
            } else if(section2Choose == 8) {
                Section2.orthogonalVector();
            } else if(section2Choose == 9) {
                Section2.vectorProjection();
            } else if(section2Choose == 10) {
                Section2.workEquations();
            } else if(section2Choose == 11) {
                Section2.polarEquationConic();
            } else if(section2Choose == 12) {
                Section2.magnitudeOfOneVector();
            } else if(section2Choose == 13) {
                Section2.polarGraph();
            } else if(section2Choose == 14) {
                Section2.directionAngleVector();
            } else if(section2Choose == 15) {
                Section2.directionVector();
            }

        } else if(sectionChoose == 3) { //section 3 of Pre-Calculus
            System.out.println("What formula would you like to use to solve a problem?"); //creates input for the operation that will be used
            System.out.println("1) Ways to arrange letters");
            System.out.println("2) Number of combinations with repeat");
            System.out.println("3) Permutation");
            int formulaChooser = chapterSelect.nextInt();

            if(formulaChooser == 1) {
                Section3.arrangeLetters();
            } else if(formulaChooser == 2) {
                Section3.combinationSolver();
            } else if(formulaChooser == 3) {
                Section3.permutation();
            }
        } else if(sectionChoose == 4) { //section 4 of Pre-Calculus
            System.out.println("Would you like to derive or anti-derive?:");
            System.out.println("1) Derive");
            System.out.println("2) Anti-Derive");
            System.out.println("3) Cross-Product");
            int response = chapterSelect.nextInt();

            chapterSelect.nextLine();

            if(response == 1) {
                System.out.println("\nEnter the function:");
                String normFunction = chapterSelect.nextLine();
                System.out.println("\nThe derivative is:\n" + Section4.derivePiece(normFunction));

            } else if(response == 2) {
                System.out.println("\nEnter the function:");
                String normFunction = chapterSelect.nextLine();
                System.out.println("\nThe anti-derivative is:\n" + Section4.antiDerivePiece(normFunction));

            } else if(response == 3) {
                System.out.println(Section4.crossProduct());
            }

        }


    }
}

