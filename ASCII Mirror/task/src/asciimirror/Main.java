package asciimirror;

import java.util.Scanner;

public class Main {

    static final String[] STAGE1_PICTURE = {
            "                    _______ ",
            "                   < hello >",
            "                    ------- ",
            "            ^__^   /        ",
            "    _______/(oo)  /         ",
            "/\\/(       /(__)            ",
            "   | w----||                ",
            "   ||     ||                "
    };

    static final String[] STAGE2_PICTURE = {
            "            ^__^",
            "    _______/(oo)",
            "/\\/(       /(__)",
            "   | w----||    ",
            "   ||     ||    "
    };

    static final String[] MESSAGES = {
            "Input the file path:"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(MESSAGES[0]);
        String userInput = scanner.nextLine();

        System.out.println(userInput);
        for (String line : STAGE2_PICTURE) {
            System.out.println(line);
        }
    }
}