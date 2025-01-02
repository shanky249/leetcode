class Solution {
    public int titleToNumber(String columnTitle) {
        int colNum = 0;

        for (int i=0; i<columnTitle.length();i++) {
            colNum += (int) (Math.pow(26, i) * ((int)columnTitle.charAt(columnTitle.length() - i - 1) - 64));
        }

        return colNum;
    }
}