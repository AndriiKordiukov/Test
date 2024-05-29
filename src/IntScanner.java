import java.util.Scanner;

public class IntScanner {
    // Returns true if 's' is a number, else - false
    public static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }
    // Driver code
    public static void main(String[] args) {
        // Saving the input in a string
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String str = inputValue.nextLine();

        while (!isNumber(str)) {
            System.out.println("Please a valid number: ");
            str = inputValue.nextLine();
        }
            System.out.println("Your number is " + str);
    }
}

/*    public static boolean isNumberInput(String input) {
        try {
            // Attempt to parse the input as an integer
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            // If parsing fails, it's not an integer
            return false;
        }
    }*/