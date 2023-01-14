package asciimirror;

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

    public static void main(String[] args) {
        for (String line : STAGE1_PICTURE) {
            System.out.println(line);
        }
    }
}