package problem2;

/**
 * Problem 2: Swap Two Numbers Without a Temporary Variable.
 */
public class Exercise {

    public int[] swapNumbers(int first, int second) {
        first = first + second;   // first holds the sum
        second = first - second;  // second becomes the old first
        first = first - second;   // first becomes the old second
        return new int[]{first, second};
    }
}
