package algorithm.query;

/**
 * @author: maxinhang.
 * @version: 2024/2/25 23:08.
 */
public class BinarySearch {

    /**
     * 大于等于给定值的第一个元素.
     *
     * @param nums
     * @param target
     * @return
     */
    public int query(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target <= nums[mid]) {
                if (mid == 0 || nums[mid - 1] < target) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
