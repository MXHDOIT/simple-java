package exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: maxinhang.
 * @version: 2024/3/1 10:58.
 */
public class Solution {

    public static void main(String[] args) {
//        int paths = new Solution().uniquePaths(3, 3);
//        System.out.println(paths);

//        boolean validPartition = new Solution().validPartition(new int[]{4, 4, 4, 5, 6});
//        System.out.println(validPartition);

//        List<List<Integer>> permute = new Solution().permute(new int[]{1, 2, 3});
//        System.out.println(permute);

        String commonPrefix = new Solution().longestCommonPrefix(new String[]{"dog","racecar","car"});
        System.out.println(commonPrefix);
    }


    /**
     * 最长公共前缀.
     */
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return result;
        }
        result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //求两个字符串公共前缀
            result = commonPrefix(result, strs[i]);
        }
        return result;
    }

    private String commonPrefix(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                result.append(s1.charAt(i));
                i++;
                j++;
            } else {
                break;
            }
        }
        return result.toString();
    }

    /**
     * 全排列.
     */
    public List<List<Integer>> permute(int[] nums) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>(length);
        boolean[] visit = new boolean[length];
        dfs(result, tempList, visit, nums, length);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> tempList, boolean[] visit, int[] nums, int length) {
        if (tempList.size() == length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < visit.length; i++) {
            if (!visit[i]) {
                tempList.add(nums[i]);
                visit[i] = true;
                dfs(result, tempList, visit, nums, length);
                tempList.remove(tempList.size() - 1);
                visit[i] = false;
            }
        }
        return;
    }


    /**
     * 检查数组是否存在有效划分.
     */
    public boolean validPartition(int[] nums) {
        int length = nums.length;
        boolean[] dp = new boolean[length];
        dp[0] = false;
        dp[1] = nums[1] == nums[0];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && dp[i - 2]) {
                dp[i] = true;
            } else if (((nums[i] == nums[i - 1] && nums[i] == nums[i - 2]) || (nums[i] - 1 == nums[i - 1] && nums[i] - 2 == nums[i - 2])) && (i - 3 == -1 || dp[i - 3])) {
                dp[i] = true;
            } else {
                dp[i] = false;
            }
        }

        return dp[length - 1];
    }


    /**
     * 不同路径.
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}