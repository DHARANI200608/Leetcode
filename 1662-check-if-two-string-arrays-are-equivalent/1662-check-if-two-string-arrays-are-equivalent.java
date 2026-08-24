class Solution {
    public boolean arrayStringsAreEqual(String[] a, String[] b) {

        String s1 = "";
        String s2 = "";

        for (int i = 0; i < a.length; i++) {
            s1 = s1 + a[i];
        }

        for (int i = 0; i < b.length; i++) {
            s2 = s2 + b[i];
        }

        if (s1.equals(s2)) {
            return true;
        }

        return false;
    }
}