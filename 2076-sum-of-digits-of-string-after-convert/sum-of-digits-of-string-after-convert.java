class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            sb.append((int)c - 96);
        }
        int sum = 0;
        for (int i=0; i<k; i++) {
            int a = 0;
            for (char c: sb.toString().toCharArray()) {
                a += c - '0';
            }
            sb.replace(0, sb.length(), String.valueOf(a));
            sum = a;
        }
        return sum;
    }
}