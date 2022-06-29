import java.util.Hashtable;
class Solution {
    Hashtable<Integer, Integer> hashtable = new Hashtable<>();
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(nums[i])) {
                return true;
            }
            else {
                hashtable.put(nums[i], 1);    
            }
        }
        return false;
    }
}