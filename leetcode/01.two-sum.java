import java.util.HashMap;
//import java.util.Hashtable;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> hashtable = new HashMap<>();
      for(int i=0; i<nums.length; i++)
      {
        if(hashtable.containsKey(target-nums[i])){         //判断哈希表中是否已有当前元素的目标值
          return new int[]{hashtable.get(target-nums[i]) ,i};     //若有，返回目标值、当前元素的下标
        }
        hashtable.put(nums[i],i);                         //若没有，则将当前元素的值及其下标存入哈希表
      }
      return new int[0];
    }
}
// @lc code=end

