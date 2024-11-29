## Project: Pre-Calculus Buddy
**Description**:  
Pre-Calculus Buddy is a Java-based command-line tool designed to assist with solving a variety of pre-calculus and early calculus problems. It provides a menu-driven interface to access different sections, each dedicated to specific mathematical topics and operations.

---

### Table of Contents
1. [Main Program Structure](#main-program-structure)
2. [Modules and Functionalities](#modules-and-functionalities)
3. [Dependencies](#dependencies)
4. [How to Run](#how-to-run)

---

### Main Program Structure
#### File: **`PreCalc.java`**
The central entry point for the program:
- Prompts the user to select from four sections of topics:
  1. **Section 1**: Trigonometry (Law of Sines).
  2. **Section 2**: Vector mathematics and polar coordinates.
  3. **Section 3**: Combinatorics and arrangements.
  4. **Section 4**: Basic calculus operations (derivatives and integrals).
- Uses inheritance to call methods from the corresponding section files.

---

### Modules and Functionalities
#### File: **`Section1.java`**
Focuses on trigonometric calculations:
- **Law of Sines**: The Law of Sines relates the ratios of sides to the sines of their opposite angles. It’s useful when solving triangles with Angle-Side-Angle (ASA) or Side-Angle-Angle (SAA) information. Example problems and detailed steps are available on resources like [Math is Fun](https://www.mathsisfun.com/algebra/trig-sine-law.html).

#### File: **`Section2.java`**
Handles vector operations and polar equations:
- **Dot Product**: Calculates the dot product of two vectors.
- **Vector Magnitude**: Finds the magnitude of vectors.
- **Head Minus Tail (HMT)**: Calculates vector differences.
- **Vector Addition/Subtraction/Multiplication**: Performs vector arithmetic and scalar multiplication.
- **Angle Between Vectors**: Finds the angle between two vectors.
- **Linear Combination**: Expresses vectors in terms of linear components.
- **Resolve Vector**: Decomposes a vector into its components.
- **Orthogonal Vector Check**: Determines if vectors are orthogonal or parallel.
- **Vector Projection**: Projects one vector onto another.
- **Work Equations**: Solves work problems in physics.
- **Polar Equations for Conics**: Analyzes conic sections from polar equations.
- **Magnitude of a Single Vector**: Calculates the magnitude of one vector.
- **Special Polar Graphs**: Classifies polar graph types like limacons and roses.
- **Direction Angle of a Vector**: Finds the angle direction of a vector.
- **Direction Vector**: Converts magnitude and angle to a vector.

#### File: **`Section3.java`**
Explores combinatorics:
- **Arrange Letters**: Finds the number of ways to arrange a set of items.
- **Combination Solver**: Calculates combinations with repetition.
- **Permutation**: Generates all permutations of a given number.

#### File: **`Section4.java`**
Supports basic calculus:
- **Derivatives**: Finds derivatives of functions.
- **Anti-Derivatives**: Computes anti-derivatives.
- **Cross-Product**: Performs cross-product of vectors.

---

### Dependencies
1. **Java Development Kit (JDK)**: The code requires Java 8+ for features like `Scanner` and `Math`.
2. **Standard Java Libraries**:  
   - `java.util.Scanner`: For user input.
   - `java.lang.Math`: For mathematical computations.
3. **Inheritance and Object-Oriented Design**:
   - Each section is encapsulated as a class, with inheritance connecting them.

---

### How to Run
1. Compile all files together using a Java compiler:
   ```bash
   javac PreCalc.java Section1.java Section2.java Section3.java Section4.java
   ```
2. Run the program:
   ```bash
   java PreCalc
   ```
3. Follow the on-screen prompts to navigate through sections and solve problems.
