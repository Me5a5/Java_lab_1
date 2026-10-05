import java.util.Arrays;

/**
 * Simple ready-to-run tests for all four problems (no external libraries).
 *
 * Run from the StudentID-Prog-II-Lab2 folder:
 *   javac -d out Problem1/Exercise.java Problem2/Exercise.java Problem3/Exercise.java Problem4/Exercise.java Tests/TestCases.java
 *   java -cp out TestCases
 */
public class TestCases {

    private static int passed = 0;
    private static int failed = 0;

    private static void check(String name, Object expected, Object actual) {
        if (expected.equals(actual)) {
            passed++;
            System.out.println("PASS: " + name);
        } else {
            failed++;
            System.out.println("FAIL: " + name + " (expected " + expected + ", got " + actual + ")");
        }
    }

    public static void main(String[] args) {
        // Problem 1
        problem1.Exercise p1 = new problem1.Exercise();
        check("P1 positive", 5, p1.countDigits(12345));
        check("P1 negative", 3, p1.countDigits(-987));
        check("P1 zero", 1, p1.countDigits(0));
        check("P1 single digit", 1, p1.countDigits(7));
        check("P1 MIN_VALUE", 10, p1.countDigits(Integer.MIN_VALUE));

        // Problem 2
        problem2.Exercise p2 = new problem2.Exercise();
        check("P2 example", "[20, 10]", Arrays.toString(p2.swapNumbers(10, 20)));
        check("P2 negatives", "[-3, 5]", Arrays.toString(p2.swapNumbers(5, -3)));
        check("P2 equal values", "[4, 4]", Arrays.toString(p2.swapNumbers(4, 4)));
        check("P2 with zero", "[0, 9]", Arrays.toString(p2.swapNumbers(9, 0)));

        // Problem 3
        problem3.Exercise p3 = new problem3.Exercise();
        check("P3 example 1", "[0, 1]", Arrays.toString(p3.twoSum(new int[]{2, 7, 11, 15}, 9)));
        check("P3 example 2", "[1, 2]", Arrays.toString(p3.twoSum(new int[]{3, 2, 4}, 6)));
        check("P3 no pair", "[]", Arrays.toString(p3.twoSum(new int[]{1, 2, 3}, 10)));
        check("P3 duplicates", "[0, 1]", Arrays.toString(p3.twoSum(new int[]{3, 3}, 6)));
        check("P3 negatives", "[0, 2]", Arrays.toString(p3.twoSum(new int[]{-1, 4, 1}, 0)));
        check("P3 zeros", "[1, 3]", Arrays.toString(p3.twoSum(new int[]{5, 0, 2, 0}, 0)));
        check("P3 single element", "[]", Arrays.toString(p3.twoSum(new int[]{5}, 5)));
        check("P3 empty array", "[]", Arrays.toString(p3.twoSum(new int[]{}, 0)));

        // Problem 4
        problem4.Exercise p4 = new problem4.Exercise();
        check("P4 example 1", "a2b1c2", p4.compressString("aabcc"));
        check("P4 example 2", "a1b1c1", p4.compressString("abc"));
        check("P4 empty", "", p4.compressString(""));
        check("P4 example 4", "a3b2c1", p4.compressString("aaabbc"));
        check("P4 non-consecutive", "a2b1a2", p4.compressString("aabaa"));
        check("P4 single char", "x1", p4.compressString("x"));

        System.out.println();
        System.out.println("Passed: " + passed + ", Failed: " + failed);
    }
}
