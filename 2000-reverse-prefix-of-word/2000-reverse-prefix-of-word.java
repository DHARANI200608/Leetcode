class Solution {
    public String reversePrefix(String word, char ch) {

        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        String result = "";

        for (int i = index; i >= 0; i--) {
            result = result + word.charAt(i);
        }

        for (int i = index + 1; i < word.length(); i++) {
            result = result + word.charAt(i);
        }

        return result;
    }
}