
import java.util.*;

public class StarPatterns {

    /* 
Hollow Rectangle Pattern
*****
*   *
*   *
*****
     */
    public static void hollowRectangle() {
        int rows = 4;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    /* 
Half Pyramid pattern
*
**
***
****
     */
    public static void halfPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* 
Inverted and Rotated Half Pyramid
    *
   **
  ***
 ****
     */
    public static void invertedRotatedHalfPyramid(int rows) {
        int blankCount = rows - 1;
        for (int i = 1; i <= rows; i++) {
            int temp = blankCount;
            for (int j = 1; j <= rows; j++) {
                if (temp > 0) {
                    System.out.print(" ");
                    temp--;
                } else {
                    System.out.print("*");
                }
            }
            blankCount--;
            temp = blankCount;
            System.out.println();
        }
    }

    /* 
    Inverted Half Pyramid With Numbers
    12345
    1234
    123
    12
    1
     */
    public static void invertedHalfPyramidNumbers(int rows) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /* 
    Floyd's Triangle
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
     */
    public static void floydTrianglePattern(int rows) {
        int count = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    /* 
    Zero One Triangle Patterns
    1
    0 1
    1 0 1
    0 1 0 1
     */
    public static void zeroOneTrianglePattern(int rows) {
        boolean flag = true;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(flag ? 1 : 0);
                flag = !flag;
            }
            System.out.println();
        }
    }

    /* 
    *.....*
    **...**
    ***.***
    *******
    ***.***
    **...**
    *.....*
     */
    public static void butterflyPattern(int rows) {
        int count = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j <= count || j >= (rows - count + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (count == (rows - count + 1)) {
                break;
            }
            count++;
            if (count > (rows - count + 1)) {
                break;
            }
            System.out.println();
        }
        System.out.println();
        count = rows / 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j <= count || j > (rows - count)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (count == 0) {
                break;
            }
            count--;
            System.out.println();
        }
    }

    /* 
    Solid Rhombus Pattern
    .....******
    ....******.
    ...******..
    ..******...
    .******....
    ******.....
     */
    public static void solidRhombusPattern(int rows) {
        int blankCount = rows - 1;
        int temp = blankCount;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows + blankCount); j++) {
                if (j > temp && j <= (rows + blankCount - (blankCount - temp))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            temp--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowRectangle();

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        // halfPyramid(rows);
        // invertedRotatedHalfPyramid(rows);
        // invertedHalfPyramidNumbers(rows);
        // floydTrianglePattern(rows);
        // zeroOneTrianglePattern(rows);
        // butterflyPattern(rows);
        solidRhombusPattern(rows);
    }
}
