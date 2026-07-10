class Solution {
    public String reverseWords(String s) {

        // Remove extra spaces
        s = s.trim();

        // Split by one or more spaces
        String[] words = s.split("\\s+");

        StringBuilder result = new StringBuilder();

        // Traverse from last word to first
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}