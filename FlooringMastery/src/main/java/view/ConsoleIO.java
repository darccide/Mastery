package view;

import java.util.Scanner;

public class ConsoleIO {

    private static final String INVALID_NUMBER
            = "[INVALID] Enter a vaild number.";
    private static final String REQUIRED
            = "[INVALID] Value is required.";
    private static final String OUT_OF_RANGE
            = "[INVALID] Enter a number between %s and %s.";
    private static final String INVALID_POLAR
            = "[INVALID] Please enter 'y' or 'n'.";

    private final Scanner userInput = new Scanner(System.in);

    public void print(String message) {
        System.out.println(message);
    }

    public String readString(String prompt) {
        print(prompt);
        return userInput.nextLine();
    }

    public String readRequiredString(String prompt) {
        while (true) {
            String result = readString(prompt);
            if (!result.isBlank()) {
                return result;
            }
            print(REQUIRED);
        }
    }

    public double readDouble(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(readRequiredString(prompt));
            } catch (NumberFormatException ex) {
                print(INVALID_NUMBER);
            }
        }
    }

    public int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readRequiredString(prompt));
            } catch (NumberFormatException ex) {
                print(INVALID_NUMBER);
            }
        }
    }

    public int readInt(String prompt, int min, int max) {
        while (true) {
            int result = readInt(prompt);
            if (result >= min && result <= max) {
                return result;
            }
            print(String.format(OUT_OF_RANGE, min, max));
        }
    }

    public boolean readBoolean(String prompt) {
        while (true) {
            String input = readRequiredString(prompt).toLowerCase();
            if (input.equals("y")) {
                return true;
            } else if (input.equals("n")) {
                return false;
            }
            print(INVALID_POLAR);
        }
    }
}
