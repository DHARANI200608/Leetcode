class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] year = new int[101];

        for (int i = 0; i < logs.length; i++) {
            int birth = logs[i][0];
            int death = logs[i][1];

            year[birth - 1950]++;
            year[death - 1950]--;
        }

        int population = 0;
        int maxPopulation = 0;
        int answer = 1950;

        for (int i = 0; i < year.length; i++) {

            population = population + year[i];

            if (population > maxPopulation) {
                maxPopulation = population;
                answer = i + 1950;
            }
        }

        return answer;
    }
}