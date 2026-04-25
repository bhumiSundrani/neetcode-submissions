class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    largestUniqueNumber(nums) {
        let freq = new Map();
        let greatest = -1;

        for(const num of nums){
            freq.set(num, (freq.get(num) ?? 0) + 1);
        }

        for(const [key, value] of freq){
            const isUnique = value === 1;
            if(isUnique) greatest = Math.max(greatest, key);
        }

        return greatest;
    }
}
