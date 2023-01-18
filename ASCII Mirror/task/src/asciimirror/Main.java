package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static final String[] MESSAGES = {
            "Input the file path:",
            "File not found!"
    };

    public static void main(String[] args) {

        ArrayList<StringBuilder> linesOfFile = new ArrayList<>();
        int maxLineLength = 0;
        StringBuilder currentString;
        StringBuilder mirroredString;

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
            Arrays.fill(spaces, ' ');


            for (StringBuilder line : linesOfFile) {
                if (line.length() < maxLineLength) {
                    line.insert(line.length(), spaces, 0, maxLineLength - line.length());
                }
                System.out.print(line + " | ");
                mirroredString = mirrorString(line);
                System.out.println(mirroredString);
            }
        } catch (FileNotFoundException e) {
            System.out.println(MESSAGES[1]);
        }
    }

    private static StringBuilder mirrorString(StringBuilder stringToMirror) {
        StringBuilder modifying = stringToMirror.reverse();
        int resultLength = modifying.length();
        char[] charsOfString = new char[resultLength];
        modifying.getChars(0, resultLength, charsOfString, 0);
        for (int i = 0; i < resultLength; i++) {
            switch (charsOfString[i]) {
                case '<' -> charsOfString[i] = '>';
                case '>' -> charsOfString[i] = '<';
                case '[' -> charsOfString[i] = ']';
                case ']' -> charsOfString[i] = '[';
                case '{' -> charsOfString[i] = '}';
                case '}' -> charsOfString[i] = '{';
                case '(' -> charsOfString[i] = ')';
                case ')' -> charsOfString[i] = '(';
                case '/' -> charsOfString[i] = '\\';
                case '\\' -> charsOfString[i] = '/';
                default -> {}
            }
        }

        return (new StringBuilder()).append(charsOfString);
    }
}