import java.io.IOException;

public class StringCalculator {

    public static int add(final String numbers) throws IllegalArgumentException {

        String[] numbersArray = numbers.split(",|\n");
        int returnValue = 0;
        for (String number : numbersArray) {
            if (numbers.charAt(0) == '-'){//no negative
                throw new IllegalArgumentException("Not allowed negative numbers");
            }
            if (numbers.length() > 3) {//no numbers more than 1000git add
                return returnValue = 1;
            }
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }

        return returnValue;
    }
}
