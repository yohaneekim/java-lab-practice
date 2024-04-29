package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) throws IOException {
        String inputFileName = "/Users/yohan/Desktop/input.txt";
        String outputFileName = "output.txt";

        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        List<String> reversedLines = new ArrayList<>();
        for (int i = lines.size() - 1; i >= 0; i--) {
            reversedLines.add(lines.get(i));
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
        for (String l : reversedLines) {
            writer.write(l + "\n");
        }
        writer.close();
    }
}
