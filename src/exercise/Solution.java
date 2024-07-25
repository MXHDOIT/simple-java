package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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

//        String commonPrefix = new Solution().longestCommonPrefix(new String[]{"dog", "racecar", "car"});
//        System.out.println(commonPrefix);

//        int threeSumClosest = new Solution().threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
//        System.out.println(threeSumClosest);

//        int lviii = new Solution().romanToIntOptimized("MCMXCIV");
//        System.out.println(lviii);

//        boolean match = new Solution().isMatch("aa", "a*");
//        System.out.println(match);

//        List<String> stringList = new Solution().letterCombinations("3");
//        System.out.println(stringList);

//        List<List<Integer>> lists = new Solution().fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296);
//        System.out.println(lists);

//        int[][] ints = new int[1][3];
//        ints[0][0] = 1;
//        ints[0][1] = 0;
//        ints[0][2] = 10;
//        int countPaths = new Solution().countPaths(2, ints);
//        System.out.println(countPaths);

//        int kOr = new Solution().findKOr(new int[]{10,8,5,9,11,6,8}, 1);
//        System.out.println(kOr);

//        boolean valid = new Solution().isValid("()");
//        System.out.println(valid);
//
//        int[] ints = new Solution().divisibilityArray("998244353", 3);
//        System.out.println(ints);

//        List<String> stringList = new Solution().generateParenthesis(3);
//        System.out.println(stringList);

//        int minimumPossibleSum = new Solution().minimumPossibleSum(1, 1);
//        System.out.println(minimumPossibleSum);

//        int duplicates = new Solution().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
//        System.out.println(duplicates);

//        String hint = new Solution().getHint("1807", "7810");
//        System.out.println(hint);

//        String capiTalIzeTHeTitLe = new Solution().capitalizeTitle("capiTalIze tHe titLe");
//        System.out.println(capiTalIzeTHeTitLe);

//        String s = new Solution().maximumOddBinaryNumber("0101100111");
//        System.out.println(s);

//        long maxArrayValue = new Solution().maxArrayValue(new int[]{2, 3, 7, 9, 3});
//        System.out.println(maxArrayValue);

//        int divide = new Solution().divide(-7, 3);
//        System.out.println(divide);

//        int i = new Solution().strStr("sadbutsad", "ad");
//        System.out.println(i);

//        int allRooms = new Solution().firstDayBeenInAllRooms(new int[]{0, 0, 2});
//        System.out.println(allRooms);

//        List<Integer> list = new Solution().findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
//        System.out.println(list);

//        int[] ints = {1, 3, 2};
//        new Solution().nextPermutation(ints);
//        System.out.println(ints);

//        int[] ints = new Solution().searchRange(new int[]{8}, 8);
//        System.out.println(ints);

//        int index = new Solution().searchInsert(new int[]{1, 8, 70, 77}, 9);
//        System.out.println(index);

//        double num = new Solution().myPow(2.00000, -2);
//        System.out.println(num);
//
//        int helloWorld = new Solution().lengthOfLastWord("Hello World  ");
//        System.out.println(helloWorld);

//        int[] array = new int[]{1, 1, 1, 2, 2, 3};
//        int duplicates = new Solution().removeDuplicates2(array);
//        System.out.println(duplicates);

//        List<List<Integer>> lists = new Solution().combinationSum(new int[]{2,3,5}, 8);
//        System.out.println(lists);

//        String string = new Solution().smallestString("acbbc");
//        System.out.println(string);

//        int targetSumWays = new Solution().findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3);
//        System.out.println(targetSumWays);

//        List<List<Integer>> combinationSum2 = new Solution().combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);
//        System.out.println(combinationSum2);

//        int number = new Solution().sumOfTheDigitsOfHarshadNumber(18);
//        System.out.println(number);
//
//        String multiply = new Solution().multiply("9", "9");
//        System.out.println(multiply);

//        int jump = new Solution().jump(new int[]{0});
//        System.out.println(jump);

//        List<List<Integer>> permuteUnique = new Solution().permuteUnique(new int[]{1, 1, 3});
//        System.out.println(permuteUnique);

//        int index = new Solution().pivotIndex(new int[]{1, 2, 3});
//        System.out.println(index);

//        int count = new Solution().incremovableSubarrayCount(new int[]{6, 5, 7, 8});
//        System.out.println(count);

        int totalNQueens = new Solution().totalNQueens(1);
        System.out.println(totalNQueens);
    }

    /**
     * 通配符匹配.
     */
    public boolean isMatchPriority(String s, String p) {
        int lenP = p.length();
        int lenS = s.length();
        boolean[][] dp = new boolean[lenP + 1][lenS + 1];
        dp[0][0] = true;
        // 模式串："****"情况
        for (int i = 1; i <= lenP; i++) {
            if (p.charAt(i-1) != '*') {
                break;
            }
            dp[i][0] = true;
        }
        for (int i = 1; i <= lenP; i++) {
            for (int j = 1; j <= lenS; j++) {
                char chP = p.charAt(i - 1);
                char chS = s.charAt(j - 1);
                if (chP == '?' || chS == chP) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (chP == '*') {
                    dp[i][j] = dp[i - 1][j] | dp[i][j - 1];
                }
            }
        }

        return dp[lenP][lenS];
    }

    int result = 0;

    public int totalNQueens(int n) {
        int[] queens = new int[n];
        Set<Integer> cols = new HashSet<>();
        Set<Integer> diagonal1 = new HashSet<>();
        Set<Integer> diagonal2 = new HashSet<>();
        nQueens(n, 0, queens, cols, diagonal1, diagonal2);
        return result;
    }

    private void nQueens(int n, int row, int[] queens, Set<Integer> cols, Set<Integer> diagonal1, Set<Integer> diagonal2) {
        if (row == n) {
            result++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (cols.contains(i)) {
                continue;
            }
            if (diagonal1.contains(i - row)) {
                continue;
            }
            if (diagonal2.contains(i + row)) {
                continue;
            }
            queens[row] = i;
            cols.add(i);
            diagonal1.add(i - row);
            diagonal2.add(i + row);
            nQueens(n, row + 1, queens, cols, diagonal1, diagonal2);
            cols.remove(i);
            diagonal1.remove(i - row);
            diagonal2.remove(i + row);
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queens = new int[n];
        Set<Integer> cols = new HashSet<>();
        Set<Integer> diagonal1 = new HashSet<>();
        Set<Integer> diagonal2 = new HashSet<>();
        nQueens(result, queens, 0, n, cols, diagonal1, diagonal2);
        return result;
    }

    private void nQueens(List<List<String>> result, int[] queens, int row, int n, Set<Integer> cols, Set<Integer> diagonal1, Set<Integer> diagonal2) {
        if (row == n) {
            List<String> board = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                char[] rowCh = new char[n];
                Arrays.fill(rowCh, '.');
                rowCh[queens[i]] = 'Q';
                board.add(new String(rowCh));
            }
            result.add(board);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (cols.contains(i)) {
                continue;
            }
            if (diagonal1.contains(row - i)) {
                continue;
            }
            if (diagonal2.contains(row + i)) {
                continue;
            }
            queens[row] = i;
            cols.add(i);
            diagonal1.add(row - i);
            diagonal2.add(row + i);
            nQueens(result, queens, row + 1, n, cols, diagonal1, diagonal2);
            cols.remove(i);
            diagonal1.remove(row - i);
            diagonal2.remove(row + i);
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int tail = m + n - 1;

        while (index1 >= 0 || index2 >= 0) {
            if (index1 == -1) {
                nums1[tail--] = nums2[index2];
            } else if (index2 == -1) {
                nums1[tail--] = nums1[index1];
            } else {
                int num1 = nums1[index1];
                int num2 = nums2[index2];
                if (num1 > num2) {
                    index1--;
                    nums1[tail--] = num1;
                } else {
                    index2--;
                    nums1[tail--] = num2;
                }
            }
        }
    }

    /**
     * 了解数独.
     */
    boolean flag = false;

    public void solveSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] blocks = new boolean[9][9];
        List<int[]> space = new ArrayList<int[]>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char ch = board[i][j];
                if (ch >= '1' && ch <= '9') {
                    int num = ch - '0' - 1;
                    rows[i][num] = true;
                    cols[j][num] = true;
                    blocks[i / 3 * 3 + j / 3][num] = true;
                } else {
                    space.add(new int[]{i, j});
                }
            }
        }

        dfs(board, rows, cols, blocks, space, 0);
    }

    private void dfs(char[][] board, boolean[][] rows, boolean[][] cols, boolean[][] blocks, List<int[]> space, int position) {
        if (position == space.size()) {
            flag = true;
            return;
        }

        int row = space.get(position)[0];
        int col = space.get(position)[1];
        for (int i = 0; i < 9; i++) {
            if (!flag && !rows[row][i] && !cols[col][i] && !blocks[row / 3 * 3 + col / 3][i]) {
                rows[row][i] = cols[col][i] = blocks[row / 3 * 3 + col / 3][i] = true;
                board[row][col] = (char) (i + 1 + '0');
                dfs(board, rows, cols, blocks, space, position + 1);
                rows[row][i] = cols[col][i] = blocks[row / 3 * 3 + col / 3][i] = false;
            }
        }
    }

    public int incremovableSubarrayCount(int[] nums) {
        int result = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (isIncreasing(nums, i, j)) {
                    result++;
                }
            }
        }
        return result;
    }

    private boolean isIncreasing(int[] nums, int l, int r) {
        for (int i = 0; i < l - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                return false;
            }
        }

        for (int i = r + 1; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                return false;
            }
        }
        if (l > 0 && r < nums.length - 1 && nums[l - 1] >= nums[r + 1]) {
            return false;
        }

        return true;
    }

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int left = 0;
        int right = sum;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                left += nums[i - 1];
            }
            right -= nums[i];

            if (left == right) {
                return i;
            }
        }
        return -1;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        dps(nums, visited, result, temp);
        return result;
    }

    private void dps(int[] nums, boolean[] visited, List<List<Integer>> result, List<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i - 1] == nums[i] && !visited[i - 1])) {
                continue;
            }
            visited[i] = true;
            temp.add(nums[i]);
            dps(nums, visited, result, temp);
            visited[i] = false;
            temp.remove(temp.size() - 1);
        }
    }

    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int j = 0; j < m; j++) {
            int zd = -1;
            for (int i = 0; i < n; i++) {
                zd = Math.max(zd, matrix[i][j]);
            }
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = zd;
                }
            }
        }
        return matrix;
    }

    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        int endIndex = nums.length - 1;
        dp[endIndex] = 0;
        for (int i = endIndex - 1; i >= 0; i--) {
            int step = endIndex - i;
            if (nums[i] >= step) {
                dp[i] = 1;
            } else {
                int min = nums.length;
                for (int j = i + 1; j <= i + nums[i]; j++) {
                    min = Math.min(min, dp[j]);
                }
                dp[i] = min + 1;
            }
        }
        return dp[0];
    }

    public int jumpError(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while (true) {
            count++;
            int num = nums[index];
            if (index + num >= nums.length - 1) {
                return count;
            }
            int maxIndex = index + 1;
            for (int i = index + 1; i <= index + num; i++) {
                if (nums[maxIndex] <= nums[i]) {
                    maxIndex = i;
                }
            }
            index = maxIndex;
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String result = "";
        for (int i = num2.length() - 1; i >= 0; i--) {
            String multiply = multiply(num1, num2.charAt(i), num2.length() - 1 - i);
            result = sum(result, multiply);
        }

        return result;
    }

    private String sum(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }

    private String multiply(String num1, char ch, int zeroSize) {
        char[] num1CharArray = num1.toCharArray();
        int num1Index = num1CharArray.length - 1;
        int carry = 0;
        int chInt = ch - '0';
        StringBuilder sb = new StringBuilder();
        while (zeroSize-- > 0) {
            sb.append('0');
        }
        while (num1Index >= 0) {
            int num1Char = num1CharArray[num1Index] - '0';
            int num = num1Char * chInt + carry;
            char currentChar = (char) (num % 10 + '0');
            sb.insert(0, currentChar);
            carry = num / 10;
            num1Index--;
        }
        if (carry != 0) {
            sb.insert(0, carry);
        }
        return sb.toString();
    }


    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int y = x;
        while (x != 0) {
            sum = sum + x % 10;
            x /= 10;
        }
        return y % sum == 0 ? sum : -1;
    }

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    public int maximumPrimeDifference(int[] nums) {
        int beginIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrimeNumber(nums[i])) {
                beginIndex = i;
                break;
            }
        }
        int endIndex = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (isPrimeNumber(nums[i])) {
                endIndex = i;
                break;
            }
        }
        return endIndex - beginIndex;
    }

    private boolean isPrimeNumber(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return num >= 2;
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        sum2(candidates, target, 0, temp, result);
        return result;
    }

    private void sum2(int[] candidates, int target, int index, List<Integer> temp, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                break;
            }
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            temp.add(candidates[i]);
            sum2(candidates, target - candidates[i], i + 1, temp, result);
            temp.remove(temp.size() - 1);
        }
    }

    int max = 0;

    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        Map<Integer, Map<Integer, Integer>> dot2DotMap = new HashMap<>();
        for (int[] edge : edges) {
            int aDot = edge[0];
            int bDot = edge[1];
            int time = edge[2];
            Map<Integer, Integer> aDot2TimeMap = dot2DotMap.getOrDefault(aDot, new HashMap<>());
            aDot2TimeMap.put(bDot, time);
            dot2DotMap.put(aDot, aDot2TimeMap);
            Map<Integer, Integer> bDot2TimeMap = dot2DotMap.getOrDefault(bDot, new HashMap<>());
            bDot2TimeMap.put(aDot, time);
            dot2DotMap.put(bDot, bDot2TimeMap);

        }
        int[] visitedSizes = new int[values.length];
        visitedSizes[0]++;
        visit(values, dot2DotMap, 0, maxTime, visitedSizes);
        return max;
    }

    private void visit(int[] values, Map<Integer, Map<Integer, Integer>> dot2DotMap, int index, int maxTime, int[] visitedSizes) {
        if (index == 0) {
            int sum = 0;
            for (int i = 0; i < visitedSizes.length; i++) {
                if (visitedSizes[i] > 0) {
                    sum += values[i];
                }
            }
            max = Math.max(sum, max);
        }
        Map<Integer, Integer> bDot2TimeMap = dot2DotMap.get(index);
        if (bDot2TimeMap == null) {
            return;
        }
        for (Map.Entry<Integer, Integer> entry : bDot2TimeMap.entrySet()) {
            Integer dot = entry.getKey();
            Integer time = entry.getValue();
            if (maxTime >= time) {
                visitedSizes[dot]++;
                visit(values, dot2DotMap, dot, maxTime - time, visitedSizes);
                visitedSizes[dot]--;
            }
        }
    }

    /**
     * 目标和.
     */
    public int findTargetSumWays(int[] nums, int target) {
        int numSize = nums.length;
        int sum = 0;
        for (int i = 0; i < numSize; i++) {
            sum += nums[i];
        }
        if (sum - target < 0 || (sum - target) % 2 != 0) {
            return 0;
        }
        int subTotal = (sum - target) / 2;
        int[][] dp = new int[numSize + 1][subTotal + 1];
        for (int i = 0; i < numSize + 1; i++) {
            for (int j = 0; j < subTotal + 1; j++) {
                if (i == 0) {
                    if (j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 0;
                    }
                } else {
                    if (j < nums[i - 1]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                    }
                }
            }
        }
        return dp[numSize][subTotal];
    }

    /**
     * 执行子串操作后的字典序最小字符串.
     */
    public String smallestString(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < s.length() && s.charAt(index) == 'a') {
            if (index == s.length() - 1) {
                sb.append('z');
            } else {
                sb.append(s.charAt(index));
            }
            index++;
        }
        while (index < s.length() && s.charAt(index) != 'a') {
            sb.append((char) (s.charAt(index) - 1));
            index++;
        }
        while (index < s.length()) {
            sb.append(s.charAt(index));
            index++;
        }
        return sb.toString();
    }

    /**
     * 组合总和.
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                sum(candidates, target, i, new ArrayList<>(), result);
            }
        }
        return result;
    }

    public void sum(int[] candidates, int target, int index, List<Integer> combined, List<List<Integer>> result) {
        if (index == candidates.length) {
            return;
        }
        combined.add(candidates[index]);
        int newTarget = target - candidates[index];
        if (newTarget == 0) {
            result.add(new ArrayList<>(combined));
        } else if (newTarget > 0) {
            for (int i = index; i < candidates.length; i++) {
                sum(candidates, newTarget, i, combined, result);
            }
        }
        combined.remove(combined.size() - 1);
    }

    /**
     * 删除有序数组中的重复项目.
     */
    public int removeDuplicates2(int[] nums) {
        int left = 2;
        int right = 2;
        while (right < nums.length) {
            if (nums[left - 2] != nums[right]) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }

    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }

        int size = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            size++;
            index--;
        }
        return size;
    }

    /**
     * pow(x, n)
     */

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        return n < 0 ? 1 / myPowInner(x, n) : myPowInner(x, n);
    }

    public double myPowInner(double x, int n) {
        if (n == 0) {
            return 1;
        }


        double pow = myPowInner(x, n / 2);
        return n % 2 == 0 ? pow * pow : pow * pow * x;
    }

    /**
     * 有效的数独.
     */
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if (!(row(board, i) && col(board, j) && chunk(board, i, j))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean row(char[][] board, int i) {
        Set<Character> characters = new HashSet<>();
        for (int k = 0; k < board.length; k++) {
            char c = board[i][k];
            if (c != '.' && characters.contains(c)) {
                return false;
            }
            characters.add(c);
        }
        return true;
    }

    private boolean col(char[][] board, int j) {
        Set<Character> characters = new HashSet<>();
        for (int k = 0; k < board.length; k++) {
            char c = board[k][j];
            if (c != '.' && characters.contains(c)) {
                return false;
            }
            characters.add(c);
        }
        return true;
    }

    private boolean chunk(char[][] board, int i, int j) {
        Set<Character> characters = new HashSet<>();
        for (int col = i / 3 * 3; col < (i / 3 + 1) * 3; col++) {
            for (int row = j / 3 * 3; row < (j / 3 + 1) * 3; row++) {
                char c = board[col][row];
                if (c != '.' && characters.contains(c)) {
                    return false;
                }
                characters.add(c);
            }
        }
        return true;
    }

    /**
     * 搜索插入位置.
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = nums[mid];
            if (value < target) {
                left++;
            } else if (value > target) {
                right--;
            } else {
                return mid;
            }
        }
        return left;
    }

    /**
     * 在排序数组中查找元素的第一个和最后一个位置.
     */
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.fill(result, -1);
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = nums[mid];
            if (value < target) {
                left++;
            } else if (value > target) {
                right--;
            } else {
                result[0] = mid;
                while (result[0] >= 0 && nums[result[0]] == target) {
                    result[0]--;
                }
                result[0]++;
                result[1] = mid;
                while (result[1] < nums.length && nums[result[1]] == target) {
                    result[1]++;
                }
                result[1]--;
                break;
            }
        }

        return result;
    }

    /**
     * 最长有效括号.
     * dp[i] 表示以下标 i 字符结尾的最长有效括号的长度.
     */
    public int longestValidParentheses(String s) {
        int length = s.length();
        int[] dp = new int[length];
        int maxans = Integer.MIN_VALUE;
        for (int i = 1; i < length; i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }

    /**
     * 下一个排列.
     */
    public void nextPermutation(int[] nums) {
        //从倒数第二个元素逐个处理：在后面找到大于当前元素的最小值进行交换，如存在交换后将后面的进行升序排序后退出，不存在继续判断。如果数组中不存在这样的元素直接反转数组.
        for (int i = nums.length - 2; i >= 0; i--) {
            int currentValue = nums[i];
            int nextValue = Integer.MAX_VALUE;
            int nextIndex = -1;
            for (int j = i + 1; j < nums.length; j++) {
                int num = nums[j];
                if (num > currentValue && num < nextValue) {
                    nextValue = num;
                    nextIndex = j;
                }
            }
            if (nextIndex != -1) {
                nums[nextIndex] = nums[i];
                nums[i] = nextValue;
                Arrays.sort(nums, i + 1, nums.length);
                return;
            }
        }
        Arrays.sort(nums);
    }

    /**
     * 串联所有单词的子串.
     */
    public List<Integer> findSubstring(String s, String[] words) {
        int sLength = s.length();
        int wordLength = words[0].length();
        Map<String, Integer> wordValueMap = new HashMap<>();
        for (String word : words) {
            Integer value = wordValueMap.getOrDefault(word, 0);
            wordValueMap.put(word, value + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= sLength - wordLength * words.length; i++) {
            String substring = s.substring(i, i + wordLength * words.length);
            Map<String, Integer> subWordValueMap = new HashMap<>();
            boolean match = true;
            for (int j = 0; j < substring.length(); j += wordLength) {
                String string = substring.substring(j, j + wordLength);
                Integer value = subWordValueMap.getOrDefault(string, 0);
                subWordValueMap.put(string, value + 1);
                if (wordValueMap.getOrDefault(string, 0) < value + 1) {
                    match = false;
                    break;
                }
            }
            if (match) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * 访问完所有房间的第一天.
     */
    public int firstDayBeenInAllRooms(int[] nextVisit) {
//        状态机的解决思路
//                f[i] -> 第一次到i号所需要的时间，注意此时[0,n-1]房间访问次数都为偶数
//                step1：第一次到i-1号： f[i-1]
//                step2: 从i-1到next[i-1]: +1
//                step3: 从next[i-1]到i-1：f[i-1]-f[next[i-1]]
//                step4: 从i-1到i：+1
        final long MOD = 1_000_000_007;
        int n = nextVisit.length;
        long[] s = new long[n];
        for (int i = 0; i < n - 1; i++) {
            int j = nextVisit[i];
            s[i + 1] = (s[i] * 2 - s[j] + 2 + MOD) % MOD; // + MOD 避免算出负数
        }
        return (int) s[n - 1];
    }

    /**
     * 找到字符串中第一个匹配项的下标.
     * 暴力
     */
    public int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();

        for (int i = 0; i <= hLength - nLength; i++) {
            String substring = haystack.substring(i, i + nLength);
            if (substring.equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 两数相除.
     * 减法代替除法；正数边界；
     */
    public int divide(int dividend, int divisor) {
        boolean sign = (dividend > 0) ^ (divisor > 0);
        int result = 0;
        if (dividend > 0) {
            dividend = -dividend;
        }
        if (divisor > 0) divisor = -divisor;
        while (dividend <= divisor) {
            int temp_result = -1;
            int temp_divisor = divisor;
            while (dividend <= (temp_divisor << 1)) {
                if (temp_divisor <= (Integer.MIN_VALUE >> 1)) break;
                temp_result = temp_result << 1;
                temp_divisor = temp_divisor << 1;
            }
            dividend = dividend - temp_divisor;
            result += temp_result;
        }
        if (!sign) {
            if (result <= Integer.MIN_VALUE) return Integer.MAX_VALUE;
            result = -result;
        }
        return result;
    }

    /**
     * 合并后数组中的最大元素.
     */
    public long maxArrayValue(int[] nums) {
        long sum = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            sum = nums[i] <= sum ? nums[i] + sum : nums[i];
        }
        return sum;
    }

    /**
     * 最大二进制奇数.
     */
    public String maximumOddBinaryNumber(String s) {
        int length = s.length();
        int oneSize = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '1') {
                oneSize++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                stringBuilder.append('1');
            } else {
                if (oneSize > 1) {
                    stringBuilder.append('1');
                    oneSize--;
                } else {
                    stringBuilder.append('0');
                }
            }
        }
        return stringBuilder.toString();
    }

    /**
     * 标题首字母大写.
     */
    public String capitalizeTitle(String title) {
        String[] split = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if (s.length() <= 2) {
                sb.append(s.toLowerCase());
            } else {
                sb.append(s.substring(0, 1).toUpperCase());
                sb.append(s.substring(1).toLowerCase());
            }
            if (i != split.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    /**
     * 猜数字游戏.
     */
    public String getHint(String secret, String guess) {
        Map<Character, Integer> secretChMap = new HashMap<>();
        Map<Character, Integer> guessChMap = new HashMap<>();

        int aCount = 0;
        for (int i = 0; i < secret.length(); i++) {
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);
            if (ch1 == ch2) {
                aCount++;
            } else {
                Integer size1 = secretChMap.getOrDefault(ch1, 0);
                secretChMap.put(ch1, size1 + 1);
                Integer size2 = guessChMap.getOrDefault(ch2, 0);
                guessChMap.put(ch2, size2 + 1);
            }
        }

        int bCount = 0;
        for (Map.Entry<Character, Integer> entry : secretChMap.entrySet()) {
            Character ch = entry.getKey();
            Integer value = entry.getValue();
            Integer value2 = guessChMap.getOrDefault(ch, 0);
            bCount += Math.min(value, value2);
        }
        return aCount + "A" + bCount + "B";
    }

    /**
     * 删除有序数组中的重复项.
     */
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int index = 1;
        int endIndex = 1;

        while (index < length) {
            if (nums[index] != nums[index - 1]) {
                nums[endIndex++] = nums[index];
            }
            index++;
        }
        return endIndex;
    }

    /**
     * 翻转链表.
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /**
     * K个一组翻转链表.
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode prev = head;
        int index = 0;
        while (current != null && index < k) {
            index++;
            prev = current;
            current = current.next;
        }
        if (index == k) {
            //翻转
            prev.next = null;
            ListNode listNode = reverseList(head);
            listNode.next = reverseKGroup(current, k);
            return listNode;
        } else {
            return head;
        }
    }

    /**
     * 找出美丽数组的最小和.
     */
    public int minimumPossibleSum(int n, int target) {
        int[] result = new int[n];
        result[0] = 1;
        int sum = 1;

        int index = 1;
        int value = 2;
        while (index < n) {
            result[index] = value;
            if (twoSumNoExistTarget(result, index, target)) {
                index++;
                sum += value;
            }
            value++;
        }
        return sum;
    }

    public boolean twoSumNoExistTarget(int[] result, int right, int target) {
        int left = 0;
        while (left < right) {
            int num = result[left] + result[right];
            if (num == target) {
                return false;
            } else if (num < target) {
                left++;
            } else {
                right--;
            }
        }
        return true;
    }

    /**
     * 括号生成.
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        method("", n, n, result);
        return result;
    }

    private void method(String s, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            if (is(s)) {
                result.add(s);
            }
        } else {
            if (right < left) {
                return;
            }

            if (left > 0) {
                method(s + "(", left - 1, right, result);
            }
            if (right > 0) {
                method(s + ")", left, right - 1, result);
            }
        }
    }

    private boolean is(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || stack.pop() == ')') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /**
     * 合并两个有序链表.
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode currentNode = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        if (list1 != null) {
            currentNode.next = list1;
        }
        if (list2 != null) {
            currentNode.next = list2;
        }
        return head.next;
    }

    /**
     * 找出字符串的可整除数组.
     */
    public int[] divisibilityArray(String word, int m) {
        int length = word.length();
        int[] ints = new int[length];
        long num = 0;
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            num = num * 10 + (ch - '0');
            num = num % m;
            if (num == 0) {
                ints[i] = 1;
            }
        }
        return ints;
    }

    /**
     * 有效的括号.
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    Character peek = stack.peek();
                    if ((ch == ')' && peek == '(') || (ch == '}' && peek == '{')
                            || (ch == ']' && peek == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }


    /**
     * 删除链表的倒数第N个结点.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode prev = newHead;
        ListNode current = head;
        ListNode fast = head;

        while (n > 0 && fast != null) {
            fast = fast.next;
            n--;
        }
        if (n != 0) {
            return null;
        }
        while (fast != null) {
            prev = prev.next;
            current = current.next;
            fast = fast.next;
        }
        prev.next = current.next;
        return newHead.next;
    }

    /**
     * 找出数组中的K-or值.
     */
    public int findKOr(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int num : nums) {
                int bit = (num >> i) & 1;
                if (bit == 1) {
                    count++;
                }
            }
            if (count >= k) {
                result |= 1 << i;
            }
        }
        return result;
    }

    /**
     * 四数之和.
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            List<List<Integer>> lists = threeSum(nums, i + 1, target - nums[i]);
            if (lists.size() != 0) {
                for (List<Integer> list : lists) {
                    list.add(0, nums[i]);
                    result.add(list);
                }
            }
        }
        return result;
    }

    private List<List<Integer>> threeSum(int[] nums, int index, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = index; i < nums.length - 2; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                long num = (long) nums[left] + nums[right] + nums[i];
                if (num == target) {
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.add(nums[i]);
                    integers.add(nums[left]);
                    integers.add(nums[right]);
                    result.add(integers);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (num < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    /**
     * 到达目的地的方案数.
     */
    public int countPaths(int n, int[][] roads) {
        long[][] g = new long[n][n]; // 邻接矩阵
        for (long[] row : g) {
            Arrays.fill(row, Long.MAX_VALUE / 2); // 防止溢出
        }
        for (int[] r : roads) {
            int x = r[0];
            int y = r[1];
            int d = r[2];
            g[x][y] = d;
            g[y][x] = d;
        }

        long[] dis = new long[n];
        Arrays.fill(dis, 1, n, Long.MAX_VALUE / 2);
        int[] f = new int[n];
        f[0] = 1;
        boolean[] done = new boolean[n];
        while (true) {
            int x = -1;
            for (int i = 0; i < n; i++) {
                if (!done[i] && (x < 0 || dis[i] < dis[x])) {
                    x = i;
                }
            }
            if (x == n - 1) {
                // 不可能找到比 dis[n-1] 更短，或者一样短的最短路了（注意本题边权都是正数）
                return f[n - 1];
            }
            done[x] = true; // 最短路长度已确定（无法变得更小）
            for (int y = 0; y < n; y++) { // 尝试更新 x 的邻居的最短路
                long newDis = dis[x] + g[x][y];
                if (newDis < dis[y]) {
                    // 就目前来说，最短路必须经过 x
                    dis[y] = newDis;
                    f[y] = f[x];
                } else if (newDis == dis[y]) {
                    // 和之前求的最短路一样长
                    f[y] = (f[y] + f[x]) % 1_000_000_007;
                }
            }
        }
    }

    /**
     * 网络延迟时间.
     */
    public int networkDelayTime(int[][] times, int n, int k) {
        final int INF = Integer.MAX_VALUE / 2; // 防止加法溢出
        //邻接表
        int[][] g = new int[n][n];
        for (int[] row : g) {
            Arrays.fill(row, INF);
        }
        for (int[] time : times) {
            g[time[0] - 1][time[1] - 1] = time[2];
        }
        int[] dis = new int[n];
        Arrays.fill(dis, INF);
        dis[k - 1] = 0;
        boolean[] done = new boolean[n];
        int maxDis = 0;
        while (true) {
            int index = -1;
            for (int i = 0; i < n; i++) {
                if ((index < 0 || dis[i] < dis[index]) && !done[i]) {
                    index = i;
                }
            }
            if (index < 0) {
                return maxDis;
            }
            if (dis[index] == INF) {
                return -1;
            }
            maxDis = Math.max(maxDis, dis[index]);
            done[index] = true;
            for (int i = 0; i < n; i++) {
                if (g[index][i] != Integer.MAX_VALUE) {
                    dis[i] = Math.min(dis[index] + g[index][i], dis[i]);
                }
            }
        }
    }

    /**
     * 电话号码的字母组合.
     */
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    private void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer stringBuffer) {
        if (index == digits.length()) {
            combinations.add(stringBuffer.toString());
            return;
        }
        char ch = digits.charAt(index);
        String s = phoneMap.get(ch);
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            stringBuffer.append(charAt);
            backtrack(combinations, phoneMap, digits, index + 1, stringBuffer);
            stringBuffer.deleteCharAt(index);
        }
    }

    /**
     * 正则表达式匹配.
     * '.' 匹配任意单个字符
     * '*' 匹配零个或多个前面的那一个元素
     */
    public boolean isMatch(String s, String p) {
        int sLength = s.length() + 1;
        int pLength = p.length() + 1;
        boolean[][] dp = new boolean[sLength][pLength];
        dp[0][0] = true;
        for (int i = 2; i < pLength; i++) {
            dp[0][i] = dp[0][i - 2] && p.charAt(i - 1) == '*';
        }

        for (int i = 1; i < sLength; i++) {
            for (int j = 1; j < pLength; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
                } else {
                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.');
                }
            }
        }
        return dp[sLength - 1][pLength - 1];
    }

    /**
     * 合并K个升序链表.
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        int length = lists.length;
        Queue<ListNode> queue = new PriorityQueue<ListNode>(length, Comparator.comparing(e -> e.val));
        for (int i = 0; i < length; i++) {
            if (lists[i] != null) {
                queue.add(lists[i]);
            }
        }

        ListNode head = new ListNode(-1);
        ListNode currentNode = head;

        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            ListNode nextNode = node.next;
            if (nextNode != null) {
                queue.add(nextNode);
            }
            currentNode.next = node;
            currentNode = node;
        }

        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    /**
     * 罗马数字转整形.
     * <p>
     * I 1 V 5 X 10 L 50 C 100 D 500 M 1000
     */
    public int romanToInt(String s) {
        int result = 0;
        Map<String, Integer> romanToIntMap = getRomanToIntMap();
        int length = s.length();
        int index = 0;
        while (index < length) {
            if (index + 1 == length) {
                String sub = s.substring(index, index + 1);
                Integer num = romanToIntMap.get(sub);
                result += num;
                index++;
            } else {
                String sub = s.substring(index, index + 2);
                if (romanToIntMap.containsKey(sub)) {
                    Integer num = romanToIntMap.get(sub);
                    result += num;
                    index += 2;
                } else {
                    sub = s.substring(index, index + 1);
                    Integer num = romanToIntMap.get(sub);
                    result += num;
                    index++;
                }
            }
        }
        return result;
    }

    private Map<String, Integer> getRomanToIntMap() {
        Map<String, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put("I", 1);
        romanToIntMap.put("V", 5);
        romanToIntMap.put("X", 10);
        romanToIntMap.put("L", 50);
        romanToIntMap.put("C", 100);
        romanToIntMap.put("D", 500);
        romanToIntMap.put("M", 1000);
        romanToIntMap.put("IV", 4);
        romanToIntMap.put("IX", 9);
        romanToIntMap.put("XL", 40);
        romanToIntMap.put("XC", 90);
        romanToIntMap.put("CD", 400);
        romanToIntMap.put("CM", 900);
        return romanToIntMap;
    }

    public int romanToIntOptimized(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentNum = getValue(s.charAt(i));
            if (i == s.length() - 1) {
                result += currentNum;
            } else {
                int nextNum = getValue(s.charAt(i + 1));
                if (nextNum > currentNum) {
                    result -= currentNum;
                } else {
                    result += currentNum;
                }
            }
        }
        return result;
    }

    private int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    /**
     * 最接近的三数之和.
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < length - 2; i++) {
            int left = i + 1;
            int right = length - 1;
            while (left != right) {
                // 判断最小值
                int min = nums[i] + nums[left] + nums[left + 1];
                if (target < min) {
                    if (Math.abs(result - target) > Math.abs(min - target)) result = min;
                    break;
                }
                //判断最大值
                int max = nums[i] + nums[right] + nums[right - 1];
                if (target > max) {
                    if (Math.abs(result - target) > Math.abs(max - target)) result = max;
                    break;
                }

                int total = nums[i] + nums[left] + nums[right];
                if (Math.abs(total - target) < Math.abs(result - target)) {
                    result = total;
                }

                if (total == target) {
                    return total;
                } else if (total < target) {
                    left++;
                    while (left != right && nums[left] == nums[left - 1]) left++;
                } else {
                    right--;
                    while (left != right && nums[right] == nums[right + 1]) right--;
                }
            }
            while (i < nums.length - 2 && nums[i] == nums[i + 1]) i++;
        }
        return result;
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