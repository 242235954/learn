import java.util.HashMap;
//import java.util.Hashtable;
import java.util.Map;

class Solution {
    public int[] threeSum(int[] nums, int target) {
      Map<Integer,int[]> hashtable = new HashMap<>();
      for(int i = 0; i<nums.length-1; i++){          //将数组中任意两个元素的和，以及这两个元素下标组成的数组 存入哈希表
        for(int j = i+1; j<nums.length; j++){
          hashtable.put(nums[i]+nums[j],new int[]{i,j});
        }
      }
      int[] result = new int[3];
      for(int i = 0; i<nums.length;i++){                  
        if(hashtable.containsKey(target-nums[i])){    //若哈希表中有当前元素所对应的目标值
          //将目标值对应的下标数组复制到答案数组的前两位
          System.arraycopy(hashtable.get(target-nums[i]), 0, result, 0, 2);
          result[2] = i;       //将当前元素的下标存入答案数组的第三位
          return result;       //返回答案数组
        }
      }
      return new int[0];
    }
}