class Solution {
    public String sortSentence(String s) {

        String[] words = s.split(" ");

        Arrays.sort(words, (a, b) -> {
            int n1 = a.charAt(a.length() - 1) - '0';
            int n2 = b.charAt(b.length() - 1) - '0';

            return n1 - n2;
        });

        String answer = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            word = word.substring(0, word.length() - 1);

            answer = answer + word + " ";
        }

        return answer.trim();
    }
}