import java.util.Hashtable;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Hashtable<Integer, Integer> hashtable = new Hashtable<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (hashtable.containsKey(required)) {
                int first = hashtable.get(required);
                answer[0] = first;
                answer[1] = i;
                break;
            }
            else {
                hashtable.put(nums[i], i);
            }
        }
        return answer;
    }
}