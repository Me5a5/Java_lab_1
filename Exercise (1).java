package problem1;

/**
 * Problem 1: Count the Number of Digits in an Integer.
 */
public class Exercise {

    public int countDigits(int number) {
        if (number == 0) {
            return 1; // zero has one digit
        }
        int count = 0;
        // Integer division works for negatives too, so the '-' sign is never counted
        // (and Integer.MIN_VALUE is safe because we never call abs()).
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
