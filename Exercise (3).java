package problem3;

/**
 * Problem 3: Find Two Elements That Sum to a Target.
 */
public class Exercise {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // j > i, so the indices always differ
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0]; // no valid pair
    }
}
