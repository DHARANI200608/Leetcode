class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int count = 0;

        boolean[] used = new boolean[magazine.length()];

        for (int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            for (int j = 0; j < magazine.length(); j++) {

                if (ch == magazine.charAt(j) && used[j] == false) {

                    count++;
                    used[j] = true;
                    break;
                }
            }
        }

        if (count == ransomNote.length()) {
            return true;
        } else {
            return false;
        }
    }
}