import day1.OneA;
import day1.OneB;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        dayOne();
    }

    private static void dayOne() throws FileNotFoundException {
        System.out.println("DAY 1");
        System.out.println("=====");
        OneA oneA = new OneA();
        String testFile = "input/day1/test_A";
        int total = oneA.getTotal(testFile);
        System.out.println("1A Test: " + total);

        String inputFile = "input/day1/input_A";
        total = oneA.getTotal(inputFile);
        System.out.println("1A: " + total);

        OneB oneB = new OneB();
        String testFileB = "input/day1/test_B";
        total = oneB.getTotal(testFileB);
        System.out.println("1B Test: " + total);

        //        inputFile = "input/day1/test_B";
        total = oneB.getTotal(inputFile);
        System.out.println("1B: " + total);
        System.out.println();
    }
}