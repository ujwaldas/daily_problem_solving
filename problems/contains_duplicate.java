// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Example 1:

// Input: nums = [1,2,3,1]

// Output: true

// Explanation:

// The element 1 occurs at the indices 0 and 3.

import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenElements = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(seenElements.contains(nums[i])){
                return true;
            }
            seenElements.add(nums[i]);
        }
        return false;
    }
}