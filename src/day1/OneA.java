package day1;

import common.InputFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OneA {
    private int getNumber(String line) {
        int first = 0, last = 0, combined = 0;
        Pattern pattern = Pattern.compile("\\d.*\\d", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        boolean found = matcher.find();

        if (!found) {
            pattern = Pattern.compile("\\d");
            matcher = pattern.matcher(line);
            if (matcher.find()) {
                first = Integer.parseInt(matcher.group());
                last = first;
            }
        } else {
            String substring = matcher.group();
            first = Integer.parseInt(String.valueOf(substring.charAt(0)));
            last = Integer.parseInt(String.valueOf(substring.charAt(substring.length() - 1)));
        }
        combined = 10 * first + last;

        return combined;
    }

    private List<Integer> getAllNumbers(List<String> lines) {
        List<Integer> numbers = new ArrayList<>();
        for (String line : lines) {
            numbers.add(getNumber(line));
        }

        return numbers;
    }

    private int getTotal(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

    public int getTotal(String input) throws FileNotFoundException {
        List<String> lines = InputFromFile.readLinesFromFile(input);
        List<Integer> numbers = getAllNumbers(lines);

        return getTotal(numbers);
    }
}
