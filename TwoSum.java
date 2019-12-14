class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int[] answer = {0, 0};
        
        for (int num : nums) {
            int halfSum = target - nums[i];
            for ( int j = i + 1 ; j < nums.length; j++) {
                if (halfSum == nums[j]) {
                    return new int[] {i , j};
                }
            }
            i++;
        }
        return answer;
    }
}