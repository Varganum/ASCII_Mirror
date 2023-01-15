package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static final String[] MESSAGES = {
            "Input the file path:",
            "File not found!"
    };

    public static void main(String[] args) {

        System.out.println(MESSAGES[0]);

        try (Scanner fileScanner = new Scanner(new File((new Scanner(System.in).nextLine())))) {
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(MESSAGES[1]);
        }
    }
}