class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length <= 1) return false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        return set.size() != nums.length;
    }
}