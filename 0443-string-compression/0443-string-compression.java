class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int index = 0;

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;
 
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[index++] = current;

            if (count > 1) {
                char[] countChars = String.valueOf(count).toCharArray();

                for (char c : countChars) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}