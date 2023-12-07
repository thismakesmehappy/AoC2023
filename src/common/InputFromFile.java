package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputFromFile {

    public static List<String> readLinesFromFile(String inputFileName) throws FileNotFoundException {
        List<String> lines;
        File inputFile = new File(inputFileName);
        Scanner textScanner = new Scanner(inputFile);

        lines = readLines(textScanner);
        textScanner.close();

        return lines;
    }

    private static List<String> readLines(Scanner textScanner) {
        String currentLine;
        List<String> lines = new ArrayList<String>();

        while (textScanner.hasNextLine()) {
            currentLine = textScanner.nextLine();
            lines.add(currentLine);
        }

        return lines;
    }
}
