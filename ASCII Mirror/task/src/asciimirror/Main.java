package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final String[] MESSAGES = {
            "Input the file path:",
            "File not found!"
    };

    public static void main(String[] args) {

        ArrayList<StringBuilder> linesOfFile = new ArrayList<>();
        int maxLineLength = 0;
        StringBuilder currentString;

        System.out.println(MESSAGES[0]);

        try (Scanner fileScanner = new Scanner(new File((new Scanner(System.in).nextLine())))) {

            while (fileScanner.hasNext()) {
                currentString = new StringBuilder(fileScanner.nextLine());
                linesOfFile.add(currentString);
                if (currentString.length() > maxLineLength) {
                    maxLineLength = currentString.length();
                }
            }

            char[] spaces = new char[maxLineLength];
            for (int i = 0; i < spaces.length; i++) {
                spaces[i] = ' ';
            }

            for (StringBuilder line : linesOfFile) {
                if (line.length() < maxLineLength) {
                    line.insert(line.length(), spaces, 0, maxLineLength - line.length());
                }
                System.out.println(line + " | " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(MESSAGES[1]);
        }
    }
}