class Solution { // bin search
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        return binSearch(nums, target, start, end);
    }
    public int binSearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        else if (nums[end] == target) {
            return end;
        }
        else if (nums[start] == target) {
            return start;
        }
        else {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[start] < nums[mid] && target >= nums[start] && target <= nums[mid]) {
                return binSearch(nums, target, start , mid - 1);
            }
            else if (nums[start] > nums[mid] && target >= nums[mid] && target <= nums[end]) {
                return binSearch(nums, target, mid + 1, end);
            }
            else {
                return binSearch(nums, target, start + 1, end - 1);
            }
        }
    }
}