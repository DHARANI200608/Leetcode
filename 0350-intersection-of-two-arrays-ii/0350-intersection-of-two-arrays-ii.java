class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] count = new int[1001];

        for (int i = 0; i < nums1.length; i++) {
            count[nums1[i]]++;
        }

        int[] result = new int[1000];
        int index = 0;

        for (int i = 0; i < nums2.length; i++) {

            if (count[nums2[i]] > 0) {

                result[index] = nums2[i];
                index++;

                count[nums2[i]]--;
            }
        }

        int[] answer = new int[index];

        for (int i = 0; i < index; i++) {
            answer[i] = result[i];
        }

        return answer;
    }
}