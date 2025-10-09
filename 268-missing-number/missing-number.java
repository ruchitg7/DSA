class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int totalSum = 0;
        int i = 0;

        while (i < nums.length) {
            totalSum = totalSum + i;
            sum = sum + nums [i];
            i++;
        }

        totalSum = totalSum + i;

        return(totalSum-sum);
    }
}