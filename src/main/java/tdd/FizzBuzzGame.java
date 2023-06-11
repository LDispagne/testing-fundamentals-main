package tdd;

public class FizzBuzzGame {

    /**
     * When printing the number we need to pay attention to some rules:
     * - Numbers divisible by 3 should appear as `Fizz` instead of number;
     * - Numbers divisible by 5 should appear as `Buzz` instead of number;
     * - Numbers divisible by 3 and 5 should appear as `FizzBuzz` instead of number.
     */

    public String[] fizzBuzz(int n) {
        String[] result = new String[n];

        for (int i = 1; i <= n; i++) {
            result[i - 1] = String.valueOf(i);
            //String.valueOf will convert any number in String
            if (i % 15 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }
        return result;
    }
}