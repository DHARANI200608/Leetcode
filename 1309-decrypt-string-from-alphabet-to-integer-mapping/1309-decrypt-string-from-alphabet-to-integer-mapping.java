class Solution {
    public String freqAlphabets(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {

                int num = Integer.parseInt(s.substring(i, i + 2));

                ans = ans + (char)('a' + num - 1);

                i = i + 2;
            }
            else {

                int num = Integer.parseInt(s.substring(i, i + 1));

                ans = ans + (char)('a' + num - 1);
            }
        }

        return ans;
    }
}