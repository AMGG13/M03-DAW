package Objetos;

import java.util.Random;

public class Password {

    private String password = "";
    private static final Random r = new Random();
    private char cap;

    public String generatePassword(int characterNumber) {
        int probably;
        for (int i = 0; i < characterNumber; i++) {
            probably = r.nextInt(100) + 1;
            if (probably <= 30) {
                password += returnChar();
            } else if (probably > 60 && probably <= 85) {
                password += returnInt();
            } else if (probably > 85) {
                password += returnRareSymbol();
            } else if (probably > 30 && probably <= 60) {
                password += returnCharCap();
            }
        }
        return password;
    }

    private int returnInt() {
        return r.nextInt(10);
    }

    private char returnCharCap() {
        return cap = (char) (r.nextInt(26) + 'A');
    }

    private char returnChar() {
        return cap = (char) (r.nextInt(26) + 'a');
    }

    private String returnRareSymbol() {
        String symbol[] = { "!", " ", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<",
                "=", ">", "?", "@", "[", "\\", "]", "^", "_", "`", "{", "|", "}", "~" };
        return symbol[r.nextInt(symbol.length)];
    }

    public char getCap() {
        return cap;
    }

    public void setCap(char cap) {
        this.cap = cap;
    }
}
