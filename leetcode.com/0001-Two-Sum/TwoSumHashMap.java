/* Test Case
[1,2]
3
[1,2,3]
4
[1,2,3]
5
[1,3,5,8]
8
[1,3,5,8]
9
*/

import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        map.put(nums[0], 0);
        for (int j = 1; j < nums.length; j ++) {
            var i = map.get(target - nums[j]);
            if (i != null) {
                return new int[] { i, j };
            }
            map.put(nums[j], j);
        }
        return new int[] { -1, -1 };
    }
}