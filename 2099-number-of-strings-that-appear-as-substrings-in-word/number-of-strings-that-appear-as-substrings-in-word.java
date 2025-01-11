class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String item: patterns) {
            if (word.contains(item)) {
                count++;
            }
        }
        return count;
    }
}