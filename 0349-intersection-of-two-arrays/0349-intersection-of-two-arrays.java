class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] result = new int[1001];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    boolean found = false;

                    for (int k = 0; k < index; k++) {
                        if (result[k] == nums1[i]) {
                            found = true;
                        }
                    }

                    if (found == false) {
                        result[index] = nums1[i];
                        index++;
                    }

                    break;
                }
            }
        }

        int[] answer = new int[index];

        for (int i = 0; i < index; i++) {
            answer[i] = result[i];
        }

        return answer;
    }
}