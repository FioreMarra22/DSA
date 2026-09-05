class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Hashmap, I need a map from number to the index and i read before write to stop an element from matching to itself
        Map<Integer,Integer> seen = new HashMap<>();

        //Loop to fill the map
        for (int i = 0; i < nums.length; i++){
            //Key is the difference
            int complement = target - nums[i];
            if(seen.containsKey(complement)){
                return new int[]{seen.get(complement),i};
            }
            seen.put(nums[i], i);

        }
        return new int[]{};
    }
}