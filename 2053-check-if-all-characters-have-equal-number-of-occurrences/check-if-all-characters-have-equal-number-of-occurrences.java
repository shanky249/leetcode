class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c: s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        return new HashSet<>(countMap.values()).size() == 1;
    }
}