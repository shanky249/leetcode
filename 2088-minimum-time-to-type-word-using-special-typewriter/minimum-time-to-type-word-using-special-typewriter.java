class Solution {
    public int minTimeToType(String word) {
        char cur = 'a';
        int count = 0;
        for (int i=0; i<word.length(); i++) {
            char next = word.charAt(i);
            int diff = Math.abs(cur - next);
            count+= Math.min(diff, 26-diff) + 1;
            cur = next;
        }
        return count;
    }
}