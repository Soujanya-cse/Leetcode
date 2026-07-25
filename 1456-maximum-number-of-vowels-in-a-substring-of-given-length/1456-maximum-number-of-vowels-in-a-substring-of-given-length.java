class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currentVowels = 0;
        
        // Use a boolean array for O(1) fast vowel lookup
        boolean[] isVowel = new boolean[26];
        isVowel['a' - 'a'] = true;
        isVowel['e' - 'a'] = true;
        isVowel['i' - 'a'] = true;
        isVowel['o' - 'a'] = true;
        isVowel['u' - 'a'] = true;
        
        // Count vowels in the first window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel[s.charAt(i) - 'a']) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;
        
        // Slide the window across the rest of the string
        for (int i = k; i < s.length(); i++) {
            // Add the new character entering the window
            if (isVowel[s.charAt(i) - 'a']) {
                currentVowels++;
            }
            // Remove the old character leaving the window
            if (isVowel[s.charAt(i - k) - 'a']) {
                currentVowels--;
            }
            
            // Update the maximum count found so far
            if (currentVowels > maxVowels) {
                maxVowels = currentVowels;
            }
        }
        
        return maxVowels;
    }
}