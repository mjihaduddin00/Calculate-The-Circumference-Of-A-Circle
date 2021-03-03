/* 
Calculate the circumference of a circle

*/

public class Solution {
    public static void main(String[] args) {
        printCircleCircumference(5);
    }

    public static void printCircleCircumference(int radius) {
        double circumference = 2 * 3.14 * radius;
        System.out.print(circumference);
    }
}