import java.io.IOException;

public class StringCalculator {

    public static int add(final String numbers) throws IllegalArgumentException {

        String[] numbersArray = numbers.split(",|\n");
        int returnValue = 0;
        for (String number : numbersArray) {
            if (numbers.charAt(0) == '-'){
                throw new IllegalArgumentException("Not allowed negative numbers");
            }
            if (numbers.length() > 3) {
                return returnValue = 1;
            }
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }

        return returnValue;
    }
}
