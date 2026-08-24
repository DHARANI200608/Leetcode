class Solution {
    public String toLowerCase(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            result = result + Character.toLowerCase(s.charAt(i));
        }

        return result;
    }
}