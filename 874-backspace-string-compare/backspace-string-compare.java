class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {

            // process s
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            char chS = (i >= 0) ? s.charAt(i) : '\0';
            char chT = (j >= 0) ? t.charAt(j) : '\0';

            if (chS != chT) return false;

            i--;
            j--;
        }
        return true;
    }
}
