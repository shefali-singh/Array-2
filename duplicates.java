// Time Complexity : O(n)
// Space Complexity :O(1)

import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList();
      for(int i=0;i<nums.length;i++) {
          int index = Math.abs(nums[i])-1;
          if(nums[index]>=0)
              nums[index]=nums[index]*-1;
      }  
     for(int i=0;i<nums.length;i++){
         if(nums[i]>0)
             res.add(i+1);
     }
        return res;
    }
}
