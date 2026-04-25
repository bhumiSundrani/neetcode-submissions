class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length <= 1) return false;
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        int i = 1;
        while(i < nums.length){
            if(set.contains(nums[i])) return true;
            set.add(nums[i++]);
        }
        return false;
    }
}