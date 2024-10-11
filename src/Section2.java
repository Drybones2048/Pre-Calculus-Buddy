import java.util.Scanner;
import java.lang.Math;
import java.nio.charset.*;

class Section2 extends Section1{
    public static Scanner input = new Scanner(System.in);
    public static final double DEG_TO_RAD = (Math.PI/180); //creates two unchangeable variables for conversion
    public static final double RAD_TO_DEG = (180/Math.PI);
    public static void vDotProduct() {
        //takes x of the first ordered pair
        System.out.println("Enter x1 value: ");
        double x1 = input.nextDouble();

        //takes y of the first ordered pair
        System.out.println("Enter y1 value: ");
        double y1 = input.nextDouble();

        //takes x of the second ordered pair
        System.out.println("Enter x2 value: ");
        double x2 = input.nextDouble();

        //takes y of the second ordered pair
        System.out.println("Enter y2 value: ");
        double y2 = input.nextDouble();

        System.out.println("");

        System.out.println("The dot product is: ");
        double finalOutput = x1 * x2 + y1 * y2;
        System.out.println(finalOutput);
    } public static void HMT(){
        System.out.println("Are there two or four pairs of points");
        System.out.println("1) Two");
        System.out.println("2) Four");
        int hmtOption = input.nextInt();

        if(hmtOption == 1) {
            System.out.println("Enter an x1 value: "); //finds the head minus tail when one vectors is given
            double x1 = input.nextDouble();

            System.out.println("Enter an y1 value: "); //takes y of the first ordered pair
            double y1 = input.nextDouble();

            System.out.println("Enter an x2 value: "); //takes x of the second ordered pair
            double x2 = input.nextDouble();

            System.out.println("Enter an y2 value: "); //takes x of the second ordered pair
            double y2 = input.nextDouble();

            //does the head minus tail formula
            double deltaXhmt1 = x2 -x1;
            double deltayhmt1 = y2 - y1;

            //puts the amswer together
            System.out.println("The Head Minus tail is: ");
            System.out.println("");
            System.out.println("(" + deltaXhmt1 + "," + deltayhmt1 + ")");

        } if(hmtOption == 2) {
            System.out.println("Enter an x1 value: "); //finds the head minus tail when two vectors are given
            double x1 = input.nextDouble();

            System.out.println("Enter an y1 value: "); //takes y of the first ordered pair
            double y1 = input.nextDouble();

            System.out.println("Enter an x2 value: "); //takes x of the second ordered pair
            double x2 = input.nextDouble();

            System.out.println("Enter an y2 value: "); //takes y of the second ordered pair
            double y2 = input.nextDouble();

            System.out.println("Enter an x3 value: "); //takes x of the third ordered pair
            double x3 = input.nextDouble();

            System.out.println("Enter an y3 value: "); //takes y of the second ordered pair
            double y3 = input.nextDouble();

            System.out.println("Enter an x4 value: "); //takes the x coordinate of the forth ordered pair
            double x4 = input.nextDouble();

            System.out.println("Enter an y4 value: "); //takes the y coordinate of the forth ordered pair
            double y4 = input.nextDouble();

            double deltaXhmt1 = x2 -x1;
            double deltayhmt1 = y2 - y1;

            double deltaXhmt2 = x4 -x3;
            double deltayhmt2 = y4 - y3;

            //finds the head minus tail and tells you if the vectors are equal or not
            if (deltaXhmt1 == deltaXhmt2 && deltayhmt1 == deltayhmt2){
                System.out.println("u = v");
            } else {
                System.out.println("u is not equal to v");
            }
        }
    } public static void vectorMagnitude(){
        System.out.println("Enter an x1 value: "); //finds the magnitude of two vectors combined
        double x1 = input.nextDouble();

        System.out.println("Enter an y1 value: "); //takes y of the first ordered pair
        double y1 = input.nextDouble();

        System.out.println("Enter an x2 value: "); //takes x of the second ordered pair
        double x2 = input.nextDouble();

        System.out.println("Enter an y2 value: "); //takes y of the second ordered pair
        double y2 = input.nextDouble();

        double stepsTofind1 = (x2 - x1);
        double stepsTofind2 = (y2 - y1);

        double magitudeFinder = Math.sqrt((stepsTofind1 * stepsTofind1) + (stepsTofind2 * stepsTofind2));

        System.out.println("");
        System.out.println("The magnitude of the two vectors is: ");
        System.out.println(magitudeFinder);
    } public static void vectorAddition() {
        System.out.println("Would you like to do:");
        System.out.println("1) Vector Addition");
        System.out.println("2) Vector Subtraction");
        System.out.println("3) Vector Multiplication and scalar distribution");
        int vectorChoice = input.nextInt();

        if(vectorChoice == 1) {
            System.out.println("Enter an x1 value: "); //takes x of the first ordered pair
            double x1 = input.nextDouble();

            System.out.println("Enter an y1 value: "); //takes y of the first ordered pair
            double y1 = input.nextDouble();

            System.out.println("Enter an x2 value: "); //takes x of the second ordered pair
            double x2 = input.nextDouble();

            System.out.println("Enter an y2 value: "); //takes y of the second ordered pair
            double y2 = input.nextDouble();

            //finds each component for it to be assembled in the ordered pair
            double vectorAdditonmath = x1 + x2;
            double vectorAdditionmath2 = y1 + y2;

            System.out.println("");
            System.out.println("The Vector Addition is: ");
            System.out.println("[" + vectorAdditonmath + "," + vectorAdditionmath2 + "]");

        } else if(vectorChoice == 2) {
            System.out.println("Enter an x1 value: "); //takes x of the first ordered pair
            double x1 = input.nextDouble();

            System.out.println("Enter an y1 value: "); //takes y of the first ordered pair
            double y1 = input.nextDouble();

            System.out.println("Enter an x2 value: "); //takes x of the second ordered pair
            double x2 = input.nextDouble();

            System.out.println("Enter an y2 value: "); //takes y of the second ordered pair
            double y2 = input.nextDouble();

            //finds each component for it to be assembled in the ordered pair
            double vectorSubtractionmath = x1 - x2;
            double vectorSubtractionmath2 = y1 - y2;

            System.out.println("");
            System.out.println("The Vector subtraction is: ");
            System.out.println("[" + vectorSubtractionmath + "," + vectorSubtractionmath2 + "]");
        } else if(vectorChoice == 3) {
            System.out.println("Enter the first distribution factor: "); //takes first distribution factor input
            double distributionFactor = input.nextDouble();

            System.out.println("Enter the second distribution factor: "); //takes second distribution factor input
            double distributionFactor2 = input.nextDouble();

            System.out.println("Enter an x1 value: "); //takes x of the first ordered pair
            double x1 = input.nextDouble();

            System.out.println("Enter an y1 value: "); //takes y of the first ordered pair
            double y1 = input.nextDouble();

            System.out.println("Enter an x2 value: "); //takes x of the second ordered pair
            double x2 = input.nextDouble();

            System.out.println("Enter an y2 value: "); //takes y of the second ordered pair
            double y2 = input.nextDouble();

            //finds the final first ordered pair values
            double vectorMultfinalthingyx1 = (distributionFactor * x1);
            double vectorMultfinalthingyy1 = (distributionFactor * y1);

            //finds the final second ordered pair values
            double vectorMultfinalthingyx2 = (distributionFactor2 * x2);
            double vectorMultfinalthingyy2 = (distributionFactor2 * y2);

            //gets the final ordered pair values
            double vectorMultfinal = vectorMultfinalthingyx1 + vectorMultfinalthingyx2;
            double vectorMultfinal2 = vectorMultfinalthingyy1 + vectorMultfinalthingyy2;
            //System.out.println(vectorMultfinalthingyy1 + " " + vectorMultfinalthingyy2);

            //puts final ordered pair together
            System.out.println("[" + vectorMultfinal + "," + vectorMultfinal2 + "]");
        }

    } public static void angleBetweenVectors(){
        System.out.println("Enter an x1 value: "); //takes x of the first ordered pair
        double x1 = input.nextDouble();

        System.out.println("Enter an y1 value: "); //takes y of the first ordered pair
        double y1 = input.nextDouble();

        System.out.println("Enter an x2 value: "); //takes x of the second ordered pair
        double x2 = input.nextDouble();

        System.out.println("Enter an y2 value: "); //takes y of the second ordered pair
        double y2 = input.nextDouble();

        //finds the dot product but does not print it
        double finalOutput = x1 * x2 + y1 * y2;
        //debug System.out.println(finalOutput);


        //finds the magnitude of vector u
        double magnitudeFind1 = Math.sqrt(x1*x1 + y1*y1);
        //debug System.out.println(magnitudeFind1);

        //finds the magnitude of vector v
        double magnitudeFind2 = Math.sqrt(x2*x2 + y2*y2);
        //debug System.out.println(magnitudeFind2);

        //finds the angle between the two vectors
        //debug System.out.println(finalOutput + " / " + magnitudeFind1 + " x " + magnitudeFind2); order of operations was bad
        double angleBetween = finalOutput / (magnitudeFind1 * magnitudeFind2);
        //System.out.println(angleBetween);
        double cosOfangleBetween = Math.acos(angleBetween);
        //System.out.println(Math.acos(angleBetween));

        System.out.println("");
        System.out.println("The angle between the vectors given is: ");

        //finds the answer in radians
        System.out.println(cosOfangleBetween * RAD_TO_DEG);

    } public static void linearCombination(){
        System.out.println("Enter an x1 value: "); //takes x of the first ordered pair
        double x1 = input.nextDouble();

        System.out.println("Enter an y1 value: "); //takes y of the first ordered pair
        double y1 = input.nextDouble();

        System.out.println("Enter an x2 value: "); //takes x of the second ordered pair
        double x2 = input.nextDouble();

        System.out.println("Enter an y2 value: "); //takes y of the second ordered pair
        double y2 = input.nextDouble();

        //does the math to find linear combination form
        double linerCombinationx = x2 - x1;
        double linerCombinationy = y2 - y1;

        //puts together results in linear combination form
        System.out.println(linerCombinationx + "i" + linerCombinationy + "j");
    } public static void resolveVector(){
        System.out.println("Enter the directional angle given: "); //inputs distributin factor
        double directionalAngleinput = input.nextDouble();

        System.out.println("Enter the magnitude of the vector given: "); //enter the magnitude given
        double magnitudeFindinput = input.nextDouble();

        //does the math and converts it to degrees
        double componentMathdooer1 = ((magnitudeFindinput * (Math.cos(directionalAngleinput * DEG_TO_RAD))) );
        double componentMathdooer2 = ((magnitudeFindinput * (Math.sin(directionalAngleinput	* DEG_TO_RAD))) );

        //puts final result together
        System.out.println("(" + componentMathdooer1 + ", " + componentMathdooer2 + ")");
    } public static void orthogonalVector(){
        System.out.println("Enter an x1 value: "); //takes x of the first ordered pair
        double x1 = input.nextDouble();

        System.out.println("Enter an y1 value: "); //takes y of the first ordered pair
        double y1 = input.nextDouble();

        System.out.println("Enter an x2 value: "); //takes x of the second ordered pair
        double x2 = input.nextDouble();

        System.out.println("Enter an y2 value: "); //takes y of the second ordered pair
        double y2 = input.nextDouble();

        double finalOutput = x1 * x2 + y1 * y2;

        if (finalOutput == 0) { //check for orth
            System.out.println("The result is orthogonal");
        } else {//if (y1 % y2 != 0) || (y2 % y1 != 0) || (x1 % x2 != 0) || (x2 % x1 != 0){ //check for para
            System.out.println("The result is parralel or neither ");
        }
    } public static void vectorProjection(){
        System.out.println("Enter an x1 value: "); //takes x of the first ordered pair
        double x1 = input.nextDouble();

        System.out.println("Enter an y1 value: "); //takes y of the first ordered pair
        double y1 = input.nextDouble();

        System.out.println("Enter an x2 value: "); //takes x of the second ordered pair
        double x2 = input.nextDouble();

        System.out.println("Enter an y2 value: "); //takes y of the second ordered pair
        double y2 = input.nextDouble();

        //finds the dot product
        double finalOutput = x1 * x2 + y1 * y2;

        //finds the magnitude of the second ordered pair inputted
        double magnitudeFind2 = (x2*x2) + (y2*y2);

        //finds the u1 coordinates
        double assembleU1pt1 = (x2 * magnitudeFind2);
        double assembleU1pt2 = (y2 * magnitudeFind2);

        //prints the u1 statement
        System.out.println("u1" + "=" + "[" + assembleU1pt1 + "/" + magnitudeFind2 + "," + assembleU1pt2 + "/" + magnitudeFind2 + "]");

        double assembleU2x = ((x1 * magnitudeFind2) - assembleU1pt1);
        double assembleU2y = ((y1 * magnitudeFind2) - assembleU1pt2);

        //prints the u2 statement
        System.out.println("u2" + "=" + "[" + assembleU2x + "/" + magnitudeFind2 + "," + assembleU2y + "/" + magnitudeFind2 + "]");

    } public static void workEquations(){
        //takes the input of chooseing what prolem it is
        System.out.println("Is the angle above the horizontal given in the equaton?");
        System.out.println("1) Yes");
        System.out.println("2) Yes, but the item in question is also elevated");
        double workChoicegiver2 = input.nextDouble();

        if (workChoicegiver2 == 1) {
            //inputs the constant force
            System.out.println("What is the constant force acting on the object?");
            int workConstantforcein2 = input.nextInt() ;

            //inputs the angle above the horizontal in the equation
            System.out.println("What is the constant angle acting on the object above the horizontal?");
            double workAbovehorizontalIn2 = input.nextDouble();

            //inputs the amount of feet an object is dragged
            System.out.println("What is the distance the object is dragged?");
            double workFeetdraggedIn2 = input.nextDouble();

            //does the math to convert
            double workEquation1final = (workConstantforcein2 * workFeetdraggedIn2) * Math.cos(workAbovehorizontalIn2 * DEG_TO_RAD );

            //prints the final result
            System.out.println(workEquation1final);
        } else if (workChoicegiver2 == 2){
            //asks for the angle in which the object is being pulled at from above
            System.out.println("What is the angle above the horizontal");
            int workAngleaboveHorizontalin2 = input.nextInt();

            //asks for the angle of the ramp or other sourced of incline the object is going up
            System.out.println("What is the angle of the incline you are given");
            int workAngleonRampin2 = input.nextInt();

            //takes the user input of the amount of force that the object is recieving
            System.out.println("What is the amount of force used on the object");
            int workForceusedin2 = input.nextInt();

            //takes the user input about the distance that the object is being pulled
            System.out.println("How far is the object being pulled or pushed");
            int workDistancepulled2 = input.nextInt();

            //finds the adjusted angle
            double determineAdjustedangle = workAngleaboveHorizontalin2 - workAngleonRampin2;

            //finds the work used
            double finalWorkfind = (workForceusedin2 * workDistancepulled2) * Math.cos(determineAdjustedangle * DEG_TO_RAD);

            System.out.println("The work is");
            System.out.println(finalWorkfind + "N");
        }
    } public static void polarEquationConic(){
        //makes decision of what kind of problem that is being presented
        System.out.println("Are you given e and k for the equation");
        System.out.println("1) Yes");
        System.out.println("2) No");
        double polarEquationcoice2 = input.nextDouble();

        //asks user to dtermine if sin or cos is used
        if (polarEquationcoice2 == 1) {
            System.out.println("Is x or y given");
            System.out.println("1) x");
            System.out.println("2) y");
            double eInputequation2 = input.nextDouble();

            //program runs if x is used, determining a cos equation
            if (eInputequation2 == 1) {
                int x;

                System.out.println("Is e a fraction");
                System.out.println("1) Yes");
                System.out.println("2) No");
                double fractionDetermine2 = input.nextDouble();

                //asks user if the number next to cos given is an fraction, due to it having a different solving method
                if (fractionDetermine2 == 1) {
                    //inputs the numerator for e
                    System.out.println("Input the numerator of the fraction for e");
                    double inputNumeratore2 = input.nextDouble();

                    //inputs the denominator for e
                    System.out.println("Input the denominator of the fraction for e");
                    double inputDenominatore2 = input.nextDouble();

                    //adds the input for the x given in the equation
                    System.out.println("Input the x given in the equation");
                    double xInput2 = input.nextDouble();

                    //creates the stop for almost the final part of the equation
                    double assembleCosfinalNumerator = (inputNumeratore2 * Math.abs(xInput2))/inputDenominatore2;


                    //prints the final simplified euqation
                    double fractionResultvalue = inputNumeratore2 / inputDenominatore2;

                    //prints negative equation if x is negative
                    if (xInput2 < 0) {
                        System.out.println("");
                        System.out.println("The final polar equation is: ");
                        System.out.println((inputDenominatore2 * assembleCosfinalNumerator) + "/" + (inputDenominatore2 * 1) + " - " + inputNumeratore2 + " cos0");
                        System.out.println("");

                        //will print what kind of graph to expect from the numbers given
                        if (fractionResultvalue > 1) {
                            System.out.println("The graph is a hyperbola with a directrix at " + xInput2);
                        } else if (fractionResultvalue == 1) {
                            System.out.println("The graph is a hyperbola with a directrix at " + xInput2);
                        } else {
                            System.out.println("The graph is an elipse with a directrix at " + xInput2 );
                        }

                        //makes graph negative if x is negative
                    } else {
                        System.out.println("");
                        System.out.println("The final polar equation is: ");
                        System.out.println((inputDenominatore2 * assembleCosfinalNumerator) + "/" + (inputDenominatore2 * 1) + " + " + inputNumeratore2 + " cos0");
                        System.out.println("");

                        //determines what kind of graph the equation will be
                        if (fractionResultvalue > 1) {
                            System.out.println("The graph is a hyperbola with a directrix at " + xInput2);
                        } else if (fractionResultvalue == 1) {
                            System.out.println("The graph is a hyperbola with a directrix at " + xInput2);
                        } else {
                            System.out.println("The graph is an elipse with a directrix at " + xInput2 );
                        }
                    }

                    //if a fraction is not given for e and it is just an intergerm, the code will run similating a regular nuber
                } if (fractionDetermine2 == 2) {
                    System.out.println("Input the e given in the equation"); //adds the input for e given in the equation
                    double eInput2 = input.nextDouble();

                    System.out.println("Input the x given in the equation"); //adds the input for the x given in the equation
                    double xInput2 = input.nextDouble();

                    double finalResultvalueTop = (eInput2 * Math.abs(xInput2));

                    //puts equation together based on what the user inputted
                    if (xInput2 < 0) {
                        System.out.println(finalResultvalueTop + "/" + "1" + "-" + eInput2 + " cos0");
                        System.out.println("");
                    } else {
                        System.out.println(finalResultvalueTop + "/" + "1" + "+" + eInput2 + " cos0");
                    }

                    //determines what kind of graph to expect given the input from the user
                    if (eInput2 > 1) {
                        System.out.println("The graph is a hyperbola with a directrix at " + xInput2);
                    } else if (eInput2 == 1) {
                        System.out.println("The graph is a hyperbola with a directrix at " + xInput2);
                    } else {
                        System.out.println("The graph is an elipse with a directrix at " + xInput2 );
                    }
                }
            }


            //starts the equation of due to the user saying that sin will be used
            if (eInputequation2 == 2) {
                int x;

                System.out.println("Is e a fraction");
                System.out.println("1) Yes");
                System.out.println("2) No");
                double fractionDetermine2 = input.nextDouble();

                //asks user if e is a fraction, and if so it changes the way it is solved
                if (fractionDetermine2 == 1) {
                    //inputs the numerator for e
                    System.out.println("Input the numerator of the fraction for e");
                    double inputNumeratore2 = input.nextDouble();

                    //inputs the denominator for e
                    System.out.println("Input the denominator of the fraction for e");
                    double inputDenominatore2 = input.nextDouble();

                    //adds the input for the x given in the equation
                    System.out.println("Input the y given in the equation");
                    double yInput2 = input.nextDouble();

                    //creates the stop for almost the final part of the equation
                    double assembleSinfinalNumerator = (inputNumeratore2 * Math.abs(yInput2))/inputDenominatore2;

                    //prints the final simplified equation
                    double fractionResultvalue = inputNumeratore2 / inputDenominatore2;

                    //prints negative equation if y is negative
                    if (yInput2 < 0) {
                        System.out.println("");
                        System.out.println("The final polar equation is: ");
                        System.out.println((inputDenominatore2 * assembleSinfinalNumerator) + "/" + (inputDenominatore2 * 1) + " - " + inputNumeratore2 + " sin0");
                        System.out.println("");

                        //tells the user what the graph will look like and what to expect for the equation iputted
                        if (fractionResultvalue > 1) {
                            System.out.println("The graph is a hyperbola with a directrix at " + yInput2);
                        } else if (fractionResultvalue == 1) {
                            System.out.println("The graph is a hyperbola with a directrix at " + yInput2);
                        } else {
                            System.out.println("The graph is an elipse with a directrix at " + yInput2 );
                        }

                        //makes graph negative if y is negative
                    } else {
                        System.out.println("");
                        System.out.println("The final polar equation is: ");
                        System.out.println((inputDenominatore2 * assembleSinfinalNumerator) + "/" + (inputDenominatore2 * 1) + " + " + inputNumeratore2 + " sin0");
                        System.out.println("");

                        //determines what kind of graph the equation will be
                        if (fractionResultvalue > 1) {
                            System.out.println("The graph is a hyperbola with a directrix at " + yInput2);
                        } else if (fractionResultvalue == 1) {
                            System.out.println("The graph is a hyperbola with a directrix at " + yInput2);
                        } else {
                            System.out.println("The graph is an elipse with a directrix at " + yInput2 );
                        }
                    }

                    //this code will run if the e is not a fraction and just a regular interger
                } if (fractionDetermine2 == 2) {
                    //adds the input for e given in the equation
                    System.out.println("Input the e given in the equation");
                    double eInput2 = input.nextDouble();

                    //adds the input for the y given in the equation
                    System.out.println("Input the x given in the equation");
                    double yInput2 = input.nextDouble();

                    double finalResultvalueTop = (eInput2 * Math.abs(yInput2));

                    // puts the sin equation together
                    if (yInput2 < 0) {
                        System.out.println(finalResultvalueTop + "/" + "1" + "-" + eInput2 + " sin0");
                        System.out.println("");
                    } else {
                        System.out.println(finalResultvalueTop + "/" + "1" + "+" + eInput2 + " sin0");
                    }

                    //states what kind of graph the elipse is
                    if (eInput2 > 1) {
                        System.out.println("The graph is a hyperbola with a directrix at " + yInput2);
                    } else if (eInput2 == 1) {
                        System.out.println("The graph is a hyperbola with a directrix at " + yInput2);
                    } else {
                        System.out.println("The graph is an elipse with a directrix at " + yInput2 );
                    }
                }
            }
            //sets up formulas if e and x/y are given for the equation
        } if (polarEquationcoice2 == 2) {
            //adds the input for the number that will be reduced in the top of the equation
            System.out.println("What is the number given at the top of the equation");
            double polarTopnumberInput2 = input.nextDouble();

            //adds the input for the number that is usually 1 in teh equation (the number that is next to e)
            System.out.println("What is the number next to e in the denominator of the fraction");
            double polarOnesubInput2 = input.nextDouble();

            //adds the input for e in the equation
            System.out.println("What is e in the denominator of the given equation");
            double polarEbottomNumberinput2 = input.nextDouble();

            System.out.println("Is cos or sin given");
            System.out.println("1) sin");
            System.out.println("2) cos");
            Double cosSinchoice2 = input.nextDouble();

            //reduces the top of the equation to simplify it
            double polarTopnumberReducer = polarTopnumberInput2 / polarOnesubInput2;

            //reduces the number that should be one to one
            double polarOnesimplifier =  polarOnesubInput2 / polarOnesubInput2;

            //simplifies e in the expression
            double polarEexpressionSimplifier = polarEbottomNumberinput2 / polarOnesubInput2;

            //divides teh top number by e for later calculations
            double polarEexpressionSimplifier2 = polarTopnumberReducer / polarEexpressionSimplifier;

            //runs this code if the user says that sin is used for the problem needing to be solved
            if (cosSinchoice2 == 1) {
                if ((polarEexpressionSimplifier < 1) && (polarEexpressionSimplifier > 0)) {
                    //figures out that it is a fraction and asks for user to input the numerator of fraction
                    System.out.println("divide by the number that is in front of the addition or subraction sign, what is the numerator of the fraction");
                    Double fractionDeterminerNumerator2 = input.nextDouble();

                    //figures out that it is a fraction and asks for user to input the denominator of fraction
                    System.out.println("divide by the number that is in front of the addition or subraction sign, what is the denominator of the fraction");
                    Double fractionDeterminerDenominator2 = input.nextDouble();

                    //figure out if e is a fraction and properly solves for it
                    if (polarEexpressionSimplifier2 % 2 != 0) {
                        System.out.println("the numerator of the problem given is a fraction, input the numerator of that fraction here");
                        double eFraction2 = input.nextDouble();

                        System.out.println("the numerator of the problem given is a fraction, input the denominator of that fraction here");
                        double eFraction4 = input.nextDouble();

                    }
                    //if e in the equation is not a fraction, then this code will run to display the result
                    System.out.println("y = " + (fractionDeterminerDenominator2 * polarTopnumberReducer) / fractionDeterminerNumerator2);
                }else {
                    System.out.println("y = " + polarEexpressionSimplifier2);
                }

                if (polarEexpressionSimplifier > 0) {
                    //determines if e is a fraction
                    if ((polarEexpressionSimplifier < 1) && (polarEexpressionSimplifier > 0)) {
                        //figures out that it is a fraction and asks for user to input the numerator of fraction
                        System.out.println("divide by the number that is in front of the addition or subraction sign, what is the numerator of the fraction");
                        Double fractionDeterminerNumerator2 = input.nextDouble();

                        //figures out that it is a fraction and asks for user to input the denominator of fraction
                        System.out.println("divide by the number that is in front of the addition or subraction sign, what is the denominator of the fraction");
                        Double fractionDeterminerDenominator2 = input.nextDouble();

                        //figure out if e is a fraction and properly solves for it
                        if (polarEexpressionSimplifier2 % 2 != 0) {
                            System.out.println("the numerator of the problem given is a fraction, input the numerator of that fraction here");
                            double eFraction2 = input.nextDouble();

                            System.out.println("the numerator of the problem given is a fraction, input the denominator of that fraction here");
                            double eFraction4 = input.nextDouble();

                            System.out.println("x = " + (eFraction4 / fractionDeterminerDenominator2 ) / fractionDeterminerNumerator2 );
                        }
                        System.out.println("x = " + (fractionDeterminerDenominator2 * polarTopnumberReducer) / fractionDeterminerNumerator2);
                    } else {
                        System.out.println("y = " + polarEexpressionSimplifier2);
                    }
                }
            }

            //displays the type of graph of the equation that the user inputted
            if (Math.abs(polarEexpressionSimplifier) > 1) {
                System.out.println("");
                System.out.println("The graph is a hyperbola " + "e = " + Math.abs(polarEexpressionSimplifier));
            } else if (Math.abs(polarEexpressionSimplifier) == 1) {
                System.out.println("");
                System.out.println("The graph is a parabola " + "e = " + Math.abs(polarEexpressionSimplifier));
            } else {
                System.out.println("");
                System.out.println("The graph is a elipse " + "e = " + Math.abs(polarEexpressionSimplifier));

                //runs the code if cos is given instead of sin
            } if (cosSinchoice2 == 2) {
                //determines if the e in front of the sin is negative or positive
                if (polarEexpressionSimplifier < 0) {
                    //determines if e is a fraction
                    if ((polarEexpressionSimplifier < 1) && (polarEexpressionSimplifier > 0)) {
                        System.out.println("x = " + polarEexpressionSimplifier * polarTopnumberReducer);
                    }

                    else {
                        System.out.println("x = " + polarEexpressionSimplifier2);
                    }
                } if (polarEexpressionSimplifier > 0) {
                    //determines if e is a fraction
                    if ((polarEexpressionSimplifier < 1) && (polarEexpressionSimplifier > 0)) {
                        //figures out that it is a fraction and asks for user to input the numerator of fraction
                        System.out.println("divide by the number that is in front of the addition or subraction sign, what is the numerator of the fraction");
                        Double fractionDeterminerNumerator2 = input.nextDouble();

                        //figures out that it is a fraction and asks for user to input the denominator of fraction
                        System.out.println("divide by the number that is in front of the addition or subraction sign, what is the denominator of the fraction");
                        Double fractionDeterminerDenominator2 = input.nextDouble();

                        //figure out if e is a fraction and properly solves for it
                        if (polarEexpressionSimplifier2 % 2 != 0) {
                            System.out.println("the numerator of the problem given is a fraction, input the numerator of that fraction here");
                            double eFraction2 = input.nextDouble();

                            System.out.println("the numerator of the problem given is a fraction, input the denominator of that fraction here");
                            double eFraction4 = input.nextDouble();

                            System.out.println("x = " + (eFraction4 / fractionDeterminerDenominator2 ) / fractionDeterminerNumerator2 );
                        }
                        System.out.println("x = " + (fractionDeterminerDenominator2 * polarTopnumberReducer) / fractionDeterminerNumerator2);
                    }

                    else {
                        //prints if just a regular interger is e, not a fraction
                        System.out.println("x = " + polarEexpressionSimplifier2);


                    }
                    //determines what kind of graph the result is
                    if (Math.abs(polarEexpressionSimplifier) > 1) {
                        System.out.println("");
                        System.out.println("The graph is a hyperbola " + "e = " + Math.abs(polarEexpressionSimplifier));
                    } else if (Math.abs(polarEexpressionSimplifier) == 1) {
                        System.out.println("");
                        System.out.println("The graph is a parabola " + "e = " + Math.abs(polarEexpressionSimplifier));
                    } else {
                        System.out.println("");
                        System.out.println("The graph is a elipse " + "e = " + Math.abs(polarEexpressionSimplifier));
                    }
                    //determines what kind of graph the result is
                }
            }


        }
    } public static void magnitudeOfOneVector(){
        //finds the head minus tail when one vectors is given
        System.out.println("Enter an x value: ");
        double x1 = input.nextDouble();

        //takes y of the first ordered pair
        System.out.println("Enter an y value: ");
        double y1 = input.nextDouble();

        Double oneVectorMagnitude = (x1*x1) + (y1*y1);

        System.out.println("The magnitude of the vector given is");
        System.out.println("");
        System.out.println("The square root of " + oneVectorMagnitude);
    } public static void polarGraph(){
        //asks is there is a number in front of theta to narrow down the graph choices
        System.out.println("Is there a number given in the equation in front of theta?");
        System.out.println("1) Yes");
        System.out.println("2) Yes, and r is squared too");
        System.out.println("3) No");
        int limaconQuestion2 = input.nextInt();

        //statement runs if there is no number in front of theta
        if (limaconQuestion2 == 3) {
            //input for a
            System.out.println("What is the number in the front of the equation before the addition or subtraction sign");
            int aInput2 = input.nextInt();

            //input for b
            System.out.println("What is the number in front of sin or cos?");
            int bInput2 = input.nextInt();

            //determines what kind of graph is used
            if (aInput2 / bInput2 < 1) {
                System.out.println("The graph is an Inner Loop Limacon");
            } else if (aInput2 / bInput2 == 1) {
                System.out.println("The graph is a Cardioid");
            } else if ((aInput2 / bInput2 > 1) && (aInput2 / bInput2 < 2)) {
                System.out.println("The graph is a Dimpled Limacon");
            } else {
                System.out.println("The graph is a Convex Limacon");
            }
        } else if (limaconQuestion2 == 1){
            //adds the input for n
            System.out.println("What is the number in front of Theta in the Triginometric function(n)");
            int aInputNumberinFrontofTheta2 = input.nextInt();

            if (aInputNumberinFrontofTheta2 % 2 == 0) {
                System.out.println("There are " + 2 * aInputNumberinFrontofTheta2 + " petals in the rose curve");
                System.out.println("With a period from 0 to 2pie");
            } else {
                System.out.println("There are " + aInputNumberinFrontofTheta2 + " petals in the rose curve");
                System.out.println("With a period from 0 to pie");
            }
        } else {
            System.out.println("Is the trigometric function sin or cos");
            System.out.println("1) sin");
            System.out.println("2) cos");
            int sinCoschoice2 = input.nextInt();

            if (sinCoschoice2 == 1) {
                System.out.println("The graph is an lemniscate slanted");
            } else {
                System.out.println("The graph is an lemniscate on the x axis");
            }
        }

        input.close();
    } public static void directionAngleVector(){
        System.out.println("Enter the x value of the vector:"); //enter x value
        double x = input.nextDouble();

        System.out.println("Enter the y value of the vector:"); //enter y value
        double y = input.nextDouble();

        System.out.println("\nMagnitude:");
        double v = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("sqare root(" + (Math.pow(x, 2) + Math.pow(y, 2)) + ") == " + v); //calculation

        System.out.println("\nDirection Angle:"); //gives the direction angle
        double theta = Math.atan(y/x);

        System.out.println("θ = "+ theta + " + π = " + (theta + Math.PI)); //adds pi to the equation
    } public static void directionVector(){
        System.out.println("Enter |u|:"); //vector value input
        double u = input.nextDouble();

        System.out.println("Enter θ (in decimal):"); //theta input
        double theta = input.nextDouble();

        System.out.println("\nResult: \n<" + (u*Math.cos(theta)) + "," + (u*Math.sin(theta)) + ">");
    } //here to create a new function in section2
}