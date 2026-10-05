package problem4;

/**
 * Problem 4: Compress a String Using Character Counts.
 */
public class Exercise {

    public String compressString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        // Append the last group
        result.append(str.charAt(str.length() - 1)).append(count);
        return result.toString();
    }
}
