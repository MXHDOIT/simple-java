package exercise;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
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

//        int totalNQueens = new Solution().totalNQueens(1);
//        System.out.println(totalNQueens);

//        int valueOfPartition = new Solution().findValueOfPartition(new int[]{1, 3, 2, 4});
//        System.out.println(valueOfPartition);

//        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        List<Integer> integers = new Solution().spiralOrder(matrix);
//        System.out.println(integers);

//        String permutation = new Solution().getPermutation(4, 9);
//        System.out.println(permutation);

//        List<List<Integer>> combine = new Solution().combine(1, 1);
//        System.out.println(combine);
//        String string = new Solution().simplifyPath("/home/");
//        System.out.println(string);
//        int[][] matrix = new int[][]{{2, 4}, {0, 2}, {0, 4}};
//        int[] ints = new Solution().shortestDistanceAfterQueries(5, matrix);
//        System.out.println(ints);

//        int minimumCost = new Solution().minimumCost(3, 2, new int[]{1, 3}, new int[]{5});
//        System.out.println(minimumCost);

//        boolean leetcode = new Solution().isSubstringPresent("abcd");
//        System.out.println(leetcode);

//        int[] w = {2, 3, 1};
//        int[] v = {3, 4, 2};
//        int C = 5;
//        int i = new Solution().knapsack01(C, w, v);
//        System.out.println(i);

//        int maxCoins = new Solution().maxCoins(new int[]{2, 4, 1, 2, 7, 8});
//        System.out.println(maxCoins);

//        int whiteTiles = new Solution().minimumWhiteTiles("01111111110111101111001111110111111111101101101111111110111011110111111101101110011110111011001", 72, 1);
//        System.out.println(whiteTiles);

//        List<List<String>> partition = new Solution().partition("aab");
//        boolean bcbddxy = new Solution().checkPartitioning("abcbdd");
//        System.out.println(bcbddxy);
//        int[] ints = new Solution().maximumBeauty(new int[][]{{1, 2}, {3, 2}, {2, 4}, {5, 6}, {3, 5}}, new int[]{1, 2, 3, 4, 5, 6});

//        int count = new Solution().countOfSubstrings("ieaouqqieaouqq", 1);
//        System.out.println(count);

//        boolean balanced = new Solution().isBalanced("24123");
//        System.out.println(balanced);

//        int aababbb = new Solution().largestVariance("aaaaa");
//        System.out.println(aababbb);

//        int longestCycle = new Solution().longestCycle(new int[]{7, -1, 5, 14, 9, 3, -1, 4, 2, 15, 12, 9, 2, -1, 17, 10, 15, 7});
//        System.out.println(longestCycle);
//        int i = new Solution().countGoodTriplets(new int[]{1, 1, 2, 2, 3}, 0, 0, 1);

        Solution solution = new Solution();
//        new Solution().numberOfArrays(new int[]{1, -3, 4}, 1, 6);
//        long subarrays = solution.countSubarrays(new int[]{2, 1, 4, 3, 5}, 10);
//        System.out.println(subarrays);
//        long countSubarrays = solution.countSubarrays(new int[]{1, 1, 2, 2, 2, 1, 1}, 3);
//        System.out.println(countSubarrays);

//        int timeToReach = solution.minTimeToReach(new int[][]{{0, 0, 0}, {0, 0, 0}});
//        System.out.println(timeToReach);
//        int[] evenNumbers = solution.findEvenNumbers(new int[]{2, 1, 3, 0});
//        System.out.println(evenNumbers);

        solution.minZeroArray(new int[]{2,0,2},new int[][]{{0,2,1},{0,2,1},{1,1,3}});
    }

    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            diff[start] -= 1;
            if (end + 1 < n) {
                diff[end + 1] += 1;
            }
        }
        int diffNum = 0;
        for (int i = 0; i < n; i++) {
            diffNum += diff[i];
            nums[i] += diffNum;
            if (nums[i] > 0) {
                return false;
            }
        }
        return true;
    }

    public int minZeroArray(int[] nums, int[][] queries) {
        int left = 0;
        int right = queries.length;
        int answer = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canReduceToZero(nums, queries, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    private boolean canReduceToZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] diff = new int[n];

        for (int i = 0; i < k; i++) {
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];
            int value = queries[i][2];
            diff[startIndex] -= value;
            if (endIndex + 1 < n) {
                diff[endIndex + 1] += value;
            }
        }

        int diffNum = 0;
        for (int i = 0; i < n; i++) {
            diffNum += diff[i];
            if (diffNum + nums[i] > 0) {
                return false;
            }
        }
        return true;
    }

    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (words[i].length() == words[j].length() && groups[i] != groups[j] && hammingDistance(words[i], words[j]) == 1) {
                    graph.get(i).add(j);
                }
            }
        }

        int[] dp = new int[n];
        int[] prevIndex = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prevIndex, -1);
        for (int i = 0; i < n; i++) {
            for (Integer index : graph.get(0)) {
                if (dp[i] + 1 > dp[index]) {
                    dp[index] = dp[i] + 1;
                    prevIndex[index] = i;
                }
            }
        }

        // 找最长路径的末尾
        int maxLen = 0, endIdx = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                endIdx = i;
            }
        }

        // 回溯路径
        List<String> result = new ArrayList<>();
        while (endIdx != -1) {
            result.add(words[endIdx]);
            endIdx = prevIndex[endIdx];
        }
        Collections.reverse(result);

        return result;
    }

    private int hammingDistance(String s1, String s2) {
        int dist = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                dist++;
            }
        }
        return dist;
    }

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<Integer> zeroStartIndexs = new ArrayList<>();
        List<Integer> oneStartIndexs = new ArrayList<>();
        int zeroStartValue = 0;
        int oneStartValue = 1;
        for (int i = 0; i < groups.length; i++) {
            int value = groups[i];
            if (value == zeroStartValue) {
                zeroStartIndexs.add(i);
                zeroStartValue = (zeroStartValue + 1) % 2;
            } else if (value == oneStartValue) {
                oneStartIndexs.add(i);
                oneStartValue = (oneStartValue + 1) % 2;
            }
        }
        List<String> result = new ArrayList<>();
        if (zeroStartIndexs.size() > oneStartIndexs.size()) {
            for (Integer zeroStartIndex : zeroStartIndexs) {
                result.add(words[zeroStartIndex]);
            }
        } else {
            for (Integer oneStartIndex : oneStartIndexs) {
                result.add(words[oneStartIndex]);
            }
        }
        return result;
    }

    public int lengthAfterTransformations1(String s, int t, List<Integer> nums) {
        int[] cnt = new int[26];
        for (char ch : s.toCharArray()) {
            ++cnt[ch - 'a'];
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            Integer step = nums.get(i);
            for (int j = 1; j <= step; j++) {
                int index = (j + i) % 26;
                List<Integer> list = map.getOrDefault(index, new ArrayList<>());
                list.add(i);
                map.put(index, list);
            }
        }

        for (int i = 0; i < t; i++) {
            int[] count = new int[26];
            for (int j = 0; j < 26; j++) {
                List<Integer> list = map.get(j);
                if (list == null || list.isEmpty()) {
                    continue;
                }
                for (Integer index : list) {
                    count[j] = (count[j] + cnt[index]) % MOD;
                }
            }
            cnt = count;
        }
        int sum = 0;
        for (int i : cnt) {
            sum = (sum + i) % MOD;
        }
        return sum;
    }

    public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
        int[] cnt = new int[26];
        for (char ch : s.toCharArray()) {
            ++cnt[ch - 'a'];
        }
        for (int i = 0; i < t; i++) {
            int[] count = new int[26];
            for (int j = 0; j < 26; j++) {
                int size = cnt[j];
                if (size == 0) {
                    continue;
                }
                Integer nextSize = nums.get(j);
                for (int k = 1; k <= nextSize; k++) {
                    int index = (j + k) % 26;
                    count[index] = (count[index] + size) % MOD;
                }
            }
            cnt = count;
        }
        int sum = 0;
        for (int i : cnt) {
            sum = (sum + i) % MOD;
        }
        return sum;
    }

    private static final int MOD = 1000000007;

    public int lengthAfterTransformations(String s, int t) {
        int[] cnt = new int[26];
        for (char ch : s.toCharArray()) {
            ++cnt[ch - 'a'];
        }

        for (int i = 0; i < t; i++) {
            int[] count = new int[26];
            count[0] = cnt[25];
            count[1] = (cnt[25] + cnt[0]) % MOD;
            for (int j = 2; j < 26; j++) {
                count[j] = cnt[j - 1];
            }
            cnt = count;
        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum = (sum + cnt[i]) % MOD;
        }
        return sum;
    }

    public int lengthAfterTransformations1(String s, int t) {
        int sum = 0;
        for (char ch : s.toCharArray()) {
            int transform = transform(ch, t);
            sum += transform;
        }
        return sum;
    }

    public int transform(char ch, int t) {
        if (t == 0) {
            return 1;
        }
        if (ch == 'z') {
            return transform('a', t - 1) + transform('b', t + 1);
        } else {
            char nextCh = (char) (ch + 1);
            return transform(nextCh, t - 1);
        }
    }

    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        Arrays.sort(digits);
        Set<Integer> sets = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    if ((digits[k] & 1) == 1) {
                        continue;
                    }
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    sets.add(num);
                }
            }
        }
        int[] result = new int[sets.size()];
        int index = 0;
        for (Integer set : sets) {
            result[index++] = set;
        }
        return result;
    }

    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[] maxDp = new int[length];
        int[] minDp = new int[length];
        maxDp[0] = nums[0];
        minDp[0] = nums[0];

        for (int i = 1; i < length; i++) {
            maxDp[i] = Math.max(nums[i], Math.max(maxDp[i - 1] * nums[i], minDp[i - 1] * nums[i]));
            minDp[i] = Math.min(nums[i], Math.min(maxDp[i - 1] * nums[i], minDp[i - 1] * nums[i]));
        }
        int max = maxDp[0];
        for (int i = 0; i < length; i++) {
            max = Math.max(max, maxDp[i]);
        }
        return max;
    }

    public int minTimeToReach2(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        boolean[][] visited = new boolean[n][m];
        Queue<State1> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new State1(0, 0, 0, 1));
        while (!priorityQueue.isEmpty()) {
            State1 poll = priorityQueue.poll();
            if (visited[poll.x][poll.y]) {
                continue;
            }
            if (poll.x == n - 1 && poll.y == m - 1) {
                return poll.dis;
            }
            visited[poll.x][poll.y] = true;
            for (int[] dir : dirs) {
                int x = poll.x + dir[0];
                int y = poll.y + dir[1];

                if (x >= 0 && x < n && y >= 0 && y < m && !visited[x][y]) {
                    int dis = Math.max(poll.dis, moveTime[x][y]) + poll.step;
                    priorityQueue.add(new State1(x, y, dis, (poll.step == 1 ? 2 : 1)));
                }
            }
        }
        return -1;
    }

    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        boolean[][] visited = new boolean[n][m];
        PriorityQueue<State1> priorityQueue = new PriorityQueue<>();
        State1 state = new State1(0, 0, 0);
        priorityQueue.add(state);
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!priorityQueue.isEmpty()) {
            State1 state1 = priorityQueue.poll();
            if (visited[state1.x][state1.y]) {
                continue;
            }
            visited[state1.x][state1.y] = true;
            if (state1.x == n - 1 && state1.y == m - 1) {
                return state1.dis;
            }
            for (int[] dir : dirs) {
                int x = state1.x + dir[0];
                int y = state1.y + dir[1];
                if (x >= 0 && x < n && y >= 0 && y < m && !visited[x][y]) {
                    int step = Math.max(state1.dis, moveTime[x][y]) + 1;
                    priorityQueue.add(new State1(x, y, step));
                }
            }
        }
        return -1;
    }

    static class State1 implements Comparable<State1> {
        int x, y, dis, step;

        State1(int x, int y, int dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }

        State1(int x, int y, int dis, int step) {
            this.x = x;
            this.y = y;
            this.dis = dis;
            this.step = step;
        }

        @Override
        public int compareTo(State1 other) {
            return Integer.compare(this.dis, other.dis);
        }
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num >= 10 && num < 100) || (num >= 1000 && num < 10000) || num == 100000) {
                count++;
            }
        }
        return count;
    }

    public long countSubarrays(int[] nums, int k) {
        int mx = 0;
        for (int x : nums) {
            mx = Math.max(mx, x);
        }

        long ans = 0;
        int cntMx = 0, left = 0;
        for (int x : nums) {
            if (x == mx) {
                cntMx++;
            }
            while (cntMx == k) {
                if (nums[left] == mx) {
                    cntMx--;
                }
                left++;
            }
            ans += left;
        }
        return ans;
    }

    /**
     * 滑动窗口.
     * * 连续子数组/子串
     * * 有单调性
     */
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long count = 0;
        long sum = 0;
        for (int left = 0, right = 0; right < n; right++) {
            sum += nums[right];
            while (sum * (right - left + 1) >= k) {
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    /**
     * 暴力.
     */
    public long countSubarrays1(int[] nums, long k) {
        int n = nums.length;
        long count = 0;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum * (j - i + 1) < k) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public int countSubarrays(int[] nums) {
        int count = 0;
        int n = nums.length;
        int left = 0;
        int right = 2;
        while (right < n) {
            int num = nums[left] + nums[right];
            if (num * 2 == nums[left + 1]) {
                count++;
            }
            left++;
            right = left + 2;
        }
        return count;
    }

    public int countCompleteSubarrays(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }
        int totalDistinct = numCount.size();
        numCount.clear();
        int left = 0;
        int result = 0;
        for (int right = 0; right < nums.length; right++) {
            numCount.put(nums[right], numCount.getOrDefault(nums[right], 0) + 1);
            while (numCount.size() == totalDistinct) {
                result += nums.length - right;
                numCount.put(nums[left], numCount.get(nums[left]) - 1);
                if (numCount.get(nums[left]) == 0) {
                    numCount.remove(nums[left]);
                }
                left++;
            }
        }
        return result;
    }

    public int countLargestGroup(int n) {
        // 数组用来统计每个数位和对应的数字个数
        int[] sumCount = new int[37];
        for (int i = 1; i <= n; i++) {
            int sum = getDigitSum(i);
            sumCount[sum]++;
        }
        int maxCount = 0;
        int largestGroupCount = 0;
        for (int count : sumCount) {
            if (count > maxCount) {
                maxCount = count;
                largestGroupCount = 1;
            } else if (count == maxCount) {
                largestGroupCount++;
            }
        }
        return largestGroupCount;
    }

    // 辅助方法计算数字的数位和
    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int idealArrays(int n, int maxValue) {
        int MOD = 1000000007;
        int[][] dp = new int[n + 1][maxValue];
        for (int i = 1; i <= maxValue; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= maxValue; j++) {
                for (int k = 1; k <= j; k++) {
                    if (j % k == 0) {
                        dp[i][j] += dp[i - 1][k];
                        dp[i][j] %= MOD;
                    }
                }
            }
        }

        int result = 0;
        for (int i = 1; i <= maxValue; i++) {
            result += dp[n][i];
            result %= MOD;
        }
        return result;
    }

    public int numberOfArrays(int[] differences, int lower, int upper) {
        int x = 0;
        int min = 0;
        int max = 0;
        for (int difference : differences) {
            x += difference;
            min = Math.min(min, x);
            max = Math.max(max, x);
            if (max - min > upper - lower) {
                return 0;
            }
        }
        int result = 0;
        for (int i = lower; i <= upper; i++) {
            if (min + i < lower || max + i > upper) {
                continue;
            }
            result++;
        }
        return result;
//        return upper - (max - min) - lower + 1;
    }

    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int answer : answers) {
            Integer size = map.getOrDefault(answer + 1, 0);
            map.put(answer + 1, size + 1);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer num = entry.getKey();
            Integer size = entry.getValue();
            result += size % num == 0 ? size : (size / num) * num + num;
        }
        return result;
    }

    public long countBadPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (j - i != nums[j] - nums[i]) {
                    count++;
                }
            }
        }
        return count;
    }

    public int countPairs(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                List<Integer> indexList = map.get(num);
                for (Integer index : indexList) {
                    count += (i * index) % k == 0 ? 1 : 0;
                }
                indexList.add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(num, list);
            }
        }
        return count;
    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int num1 = arr[i];
            for (int j = i + 1; j < n - 1; j++) {
                int num2 = arr[j];
                if (Math.abs(num1 - num2) <= a) {
                    for (int k = j + 1; k < n; k++) {
                        int num3 = arr[k];
                        if (Math.abs(num2 - num3) <= b && Math.abs(num1 - num3) <= c) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < k) {
                return -1;
            }
            min = Math.min(min, num);
            set.add(num);
        }
        return min == k ? set.size() - 1 : set.size();
    }

    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Set<Integer> numSet = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            if (numSet.contains(nums[i])) {
                int i1 = (i + 1) / 3;
                return (i + 1) % 3 == 0 ? i1 : i1 + 1;
            } else {
                numSet.add(nums[i]);
            }
        }
        return 0;
    }

    public long maximumTripletValueK(int[] nums) {
        long maxPrefix = 0;
        long maxDiff = 0;
        long max = 0;
        for (int x : nums) {
            max = Math.max(max, maxDiff * x);
            maxDiff = Math.max(maxDiff, maxPrefix - x);
            maxPrefix = Math.max(maxPrefix, x);
        }
        return max;
    }

    public long maximumTripletValuePrefix(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], nums[i + 1]);
        }
        int prefix = 0;
        long max = 0;
        for (int i = 1; i < n - 1; i++) {
            prefix = Math.max(prefix, nums[i - 1]);
            max = Math.max(max, (long) (prefix - nums[i]) * suffix[i]);
        }
        return max;
    }

    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    max = Math.max(max, (long) (nums[i] - nums[j]) * nums[k]);
                }
            }
        }
        return max;
    }

    public long mostPointsOptimized(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            //选择
            int[] question = questions[i];
            int value = question[0];
            int skipValue = question[1];

            long select = value;
            if (i + skipValue + 1 < n) {
                select = value + dp[i + skipValue + 1];
            }
            //不选择
            long notSelect = 0;
            if (i + 1 < n) {
                notSelect = dp[i + 1];
            }
            dp[i] = Math.max(select, notSelect);
        }
        return dp[0];
    }

    public long mostPoints(int[][] questions) {
        return mostPoints(questions, 0, 0);
    }

    public long mostPoints(int[][] questions, int index, int result) {
        if (index >= questions.length) {
            return result;
        }
        long skipNum = mostPoints(questions, index + 1, result);
        long notSkipNum = mostPoints(questions, index + questions[index][1] + 1, result + questions[index][0]);
        return Math.max(skipNum, notSkipNum);
    }

    public int percentageLetter(String s, char letter) {
        int count = 0;
        char[] chArray = s.toCharArray();
        for (char c : chArray) {
            if (c == letter) {
                count++;
            }
        }
        return count * 100 / s.length();
    }

    public String addSpaces(String s, int[] spaces) {
        Arrays.sort(spaces);
        int n = spaces.length;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (j < n && spaces[j] == i) {
                sb.append(" ");
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public int longestCycleOptimized(int[] edges) {
        int max = -1;
        int n = edges.length;
        int[] visitedTimes = new int[n]; //首次访问的时间
        int currentTime = 1;
        for (int i = 0; i < edges.length; i++) {
            int x = i;
            int startTime = currentTime;
            while (x != -1 && visitedTimes[x] == 0) {
                visitedTimes[x] = currentTime++;
                x = edges[x];
            }
            if (x != -1 && visitedTimes[x] >= startTime) {
                max = Math.max(max, currentTime - visitedTimes[x]);
            }
        }
        return max;
    }

    public int longestCycle(int[] edges) {
        int max = -1;
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < edges.length; i++) {
            if (visited.contains(i)) {
                continue;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                int node = edges[i];
                while (node != -1 && !visited.contains(node)) {
                    int newNode = edges[node];
                    if (list.contains(newNode)) {
                        int index = list.indexOf(newNode);
                        max = Math.max(list.size() - index + 1, max);
                        break;
                    }
                    list.add(node);
                    node = newNode;
                }
                visited.addAll(list);
            }
        }
        return max;
    }

    public int[][] differenceOfDistinctValues1(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Set<Integer> leftTop = new HashSet<>();
                int x = i - 1;
                int y = j - 1;
                while (x >= 0 && y >= 0) {
                    leftTop.add(grid[x][y]);
                    x--;
                    y--;
                }
                Set<Integer> rightBottom = new HashSet<>();
                x = i + 1;
                y = j + 1;
                while (x < n && y < m) {
                    rightBottom.add(grid[x][y]);
                    x++;
                    y++;
                }
                result[i][j] = Math.abs(leftTop.size() - rightBottom.size());
            }
        }
        return result;
    }

    public long maximumOr(int[] nums, int k) {
        long fix = 0;
        long allOr = 0;
        for (int num : nums) {
            fix |= allOr & num;
            allOr |= num;
        }

        long max = 0;
        for (int num : nums) {
            max = Math.max(max, allOr ^ num | fix | ((long) num << k));
        }
        return max;
    }

    public long maximumOr1(int[] nums, int k) {
        int n = nums.length;
        int[] suf = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] | nums[i + 1];
        }

        int max = 0;
        int pre = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, (suf[i] | pre | nums[i] << k));
            pre |= nums[i];
        }
        return max;
    }

    public boolean canBeValid(String s, String locked) {
        char[] charArray = s.toCharArray();
        char[] lockArray = locked.toCharArray();
        int min = 0;
        int max = 0;

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            int lock = lockArray[i] - '0';
            if (lock == 1) {
                if (ch == '(') {
                    min++;
                    max++;
                } else {
                    min--;
                    max--;
                }
                if (max < 0) {
                    return false;
                }
            } else {
                max++;
                min--;
            }
            if (min < 0) {
                min = 1;
            }
        }
        return min == 0;
    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int index = -1;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                count += mat[i][j];
            }
            if (count > max) {
                index = i;
            }
        }
        return new int[]{index, max};
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer size = map.getOrDefault(num, 0);
            map.put(num, size + 1);
        }
        List<List<Integer>> result = new ArrayList<>();
        while (true) {
            List<Integer> temp = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 0) {
                    temp.add(entry.getKey());
                    entry.setValue(entry.getValue() - 1);
                }
            }
            if (temp.size() == 0) {
                break;
            }
            result.add(temp);
        }
        return result;
    }

    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i][i])) {
                res = Math.max(res, nums[i][i]);
            }
            if (isPrime(nums[i][n - i - 1])) {
                res = Math.max(res, nums[i][n - i - 1]);
            }
        }
        return res;
    }

    public boolean isPrime(int num) {
        if (num == 1) {
            return true;
        }
        int factor = 2;
        while (factor * factor <= num) {
            if (num % factor == 0) {
                return true;
            }
            factor++;
        }
        return false;
    }

    public int minSwaps(String s) {
        char[] charArray = s.toCharArray();
        int result = 0;
        int count = 0;
        int j = charArray.length - 1;
        for (char c : charArray) {
            if (c == '[') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    while (charArray[j] == ']') {
                        j--;
                    }
                    charArray[j] = ']';
                    count++;
                    result++;
                }
            }
        }
        return result;
    }

    public int largestVariance(String s) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                result = Math.max(result, f(substring));
            }
        }
        return result;
    }

    public int f(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (char c : s.toCharArray()) {
            Integer size = map.getOrDefault(c, 0);
            map.put(c, size + 1);
        }
        for (Integer value : map.values()) {
            max = Math.max(value, max);
            min = Math.min(value, min);
        }
        return max - min;
    }

    public int scoreOfString(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char chA = s.charAt(i);
            char chB = s.charAt(i + 1);
            result += Math.abs((int) chA - chB);
        }
        return result;
    }

    public boolean isBalanced(String num) {
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                sum += (int) (num.charAt(i) - '0');
            } else {
                sum -= (int) (num.charAt(i) - '0');
            }
        }
        return sum == 0;
    }

    public long countOfSubstrings2(String word, int k) {
        return f2(word, k) - f2(word, k + 1);
    }

    private long f2(String word, int k) {
        Set<Character> characterSet = new HashSet<>();
        characterSet.add('a');
        characterSet.add('e');
        characterSet.add('i');
        characterSet.add('o');
        characterSet.add('u');
        int length = word.length();
        int left = 0;
        int x = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char charAt = word.charAt(i);
            if (characterSet.contains(charAt)) {
                map.merge(charAt, 1, Integer::sum);
            } else {
                x++;
            }

            while (x >= k && map.size() == 5) {
                char c = word.charAt(left++);
                if (characterSet.contains(c)) {
                    if (map.merge(c, -1, Integer::sum) == 0) {
                        map.remove(c);
                    }
                } else {
                    x--;
                }
            }
            result += left;
        }
        return result;
    }

    public int countOfSubstrings(String word, int k) {
        return f(word, k) - f(word, k + 1);
    }

    private int f(String word, int k) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('o');
        set.add('i');
        set.add('e');
        set.add('u');
        int length = word.length();
        int left = 0;
        int fu = 0;
        int result = 0;
        Map<Character, Integer> yuanMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            if (set.contains(ch)) {
                yuanMap.merge(ch, 1, Integer::sum);
            } else {
                fu++;
            }
            while (yuanMap.size() == 5 && fu >= k) {
                char charAt = word.charAt(left++);
                if (set.contains(charAt)) {
                    if (yuanMap.merge(charAt, -1, Integer::sum) == 0) {
                        yuanMap.remove(charAt);
                    }
                } else {
                    fu--;
                }
            }

            result += left;
        }

        return result;
    }


    public int countOfSubstrings1(String word, int k) {
        int minLength = k + 5;
        int length = word.length();
        int result = 0;
        for (int i = 0; i <= length - minLength; i++) {
            for (int j = i + minLength; j <= length; j++) {
                String substring = word.substring(i, j);
                Pair<Boolean, Integer> pair = getPair(substring);
                Boolean key = pair.getKey();
                if (!key) {
                    continue;
                }
                Integer value = pair.getValue();
                if (value == k) {
                    result++;
                }
                if (value > k) {
                    break;
                }
            }
        }
        return result;
    }

    public Pair<Boolean, Integer> getPair(String substring) {
        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;
        int fuSize = 0;
        for (int j = 0; j < substring.length(); j++) {
            char charAt = substring.charAt(j);
            if (charAt == 'a') {
                a = true;
            } else if (charAt == 'e') {
                e = true;
            } else if (charAt == 'i') {
                i = true;
            } else if (charAt == 'o') {
                o = true;
            } else if (charAt == 'u') {
                u = true;
            } else {
                fuSize++;
            }
        }
        return new Pair<>(a & e & i & o & u, fuSize);
    }

    public int sumOfBeauties(int[] nums) {
        int length = nums.length;
        int[] state = new int[length];
        int preMax = nums[0];

        for (int i = 1; i < length - 1; i++) {
            if (nums[i] > preMax) {
                state[i] = 1;
                preMax = nums[i];
            }
        }
        int sum = 0;
        int lastMin = nums[length - 1];
        for (int i = length - 2; i > 0; i--) {
            if (state[i] == 1 && nums[i] < lastMin) {
                sum += 2;
            } else if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                sum += 1;
            }
            lastMin = Math.min(lastMin, nums[i]);
        }

        return sum;
    }

    public int sumOfBeauties1(int[] nums) {
        int length = nums.length;

        int sum = 0;
        for (int i = 1; i < length - 1; i++) {
            if (isBeauties(nums, i)) {
                sum += 2;
            } else if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                sum += 1;
            }
        }
        return sum;
    }

    public boolean isBeauties(int[] nums, int index) {
        int length = nums.length;
        int num = nums[index];
        for (int i = 0; i <= index - 1; i++) {
            if (nums[i] >= num) {
                return false;
            }
        }
        for (int i = index + 1; i < length; i++) {
            if (nums[i] <= num) {
                return false;
            }
        }
        return true;
    }

    public int divisorSubstrings(int num, int k) {
        int count = 0;
        char[] chars = String.valueOf(num).toCharArray();
        int length = chars.length;
        for (int i = 0; i <= length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum = sum * 10 + (int) (chars[j] - '0');
            }
            if (sum != 0 && num % sum == 0) {
                count++;
            }
        }
        return count;
    }

    public int[] maximumBeauty(int[][] items, int[] queries) {
        //数组排序
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 1; i < items.length; i++) {
            items[i][1] = Math.max(items[i][1], items[i - 1][1]);
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            int begin = 0;
            int end = items.length - 1;
            while (begin < end) {
                int mid = begin + 1 + (end - begin) / 2;
                if (items[mid][0] > query) {
                    end = mid - 1;
                } else {
                    begin = mid;
                }
            }
            if (items[begin][0] <= query) {
                result[i] = items[begin][1];
            }
        }
        return result;
    }

    /**
     * a1 ^ a2 == a1 ^ a2 ^ a3 ^ a4   ===> a3 , a4 美丽子数组
     * a1 ^ a2 == a1 ^ a2 ^ a3 ^ a4 == a1 ^ a2 ^ a3 ^ a4 ^ a5  ==> a3 , a4 ; a3 , a4 , a5 ; a5 美丽子数组
     */
    public long beautifulSubarrays(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int current = 0;
        long count = 0;
        map.put(0, 1);
        for (int num : nums) {
            current ^= num;
            count += map.getOrDefault(current, 0);
            map.put(current, map.getOrDefault(current, 0) + 1);
        }
        return count;
    }

    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n < 2) {
            return "";
        }
        char[] chars = palindrome.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            if (chars[i] != 'a') {
                chars[i] = 'a';
                return new String(chars);
            }
        }
        chars[n - 1] = 'b';
        return new String(chars);
    }

    public boolean checkPartitioning(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    dp[i][j] = true;
                } else {
                    if (i + 1 < j - 1) {
                        dp[i][j] = dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
                    } else {
                        dp[i][j] = s.charAt(i) == s.charAt(j);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (dp[0][i]) {
                for (int j = i + 1; j < n; j++) {
                    if (dp[i + 1][j] && j + 1 < n && dp[j + 1][n - 1]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int palindromePartition(String s, int k) {
        int n = s.length();
        int[][] dp = new int[n][k];
        // 初始化 dp 数组
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        // 初始化边界条件
        for (int i = 0; i < n; i++) {
            dp[i][0] = getCost(s, 0, i);
        }
        // 动态规划过程
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < Math.min(k, i + 1); j++) {
                for (int l = j; l <= i; l++) {
                    dp[i][j] = Math.min(dp[i][j], dp[l - 1][j - 1] + getCost(s, l, i));
                }
            }
        }
        return dp[n - 1][k - 1];
    }

    public int getCost(String s, int sIndex, int eIndex) {
        if (sIndex >= eIndex) {
            return 0;
        }
        return s.charAt(sIndex) == s.charAt(eIndex) ? getCost(s, sIndex + 1, eIndex - 1) : getCost(s, sIndex + 1, eIndex - 1) + 1;
    }

    public int minCut(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; --i) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = true;
                } else {
                    if (i + 1 < j - 1) {
                        dp[i][j] = (s.charAt(i) == s.charAt(j)) & dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = s.charAt(i) == s.charAt(j);
                    }
                }
            }
        }

        int[] f = new int[s.length()];
        Arrays.fill(f, Integer.MAX_VALUE);
        for (int i = 0; i < s.length(); i++) {
            if (dp[0][i]) {
                f[i] = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    if (dp[j + 1][i]) {
                        f[i] = Math.min(f[i], f[j] + 1);
                    }
                }
            }
        }
        return f[s.length() - 1];
    }

    public List<List<String>> partition(String s) {
        //x,y x->y是否为回文串
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; --i) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = true;
                } else {
                    if (i + 1 < j - 1) {
                        dp[i][j] = (s.charAt(i) == s.charAt(j)) & dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = s.charAt(i) == s.charAt(j);
                    }
                }
            }
        }
        List<List<String>> result = new ArrayList<>();
        dfs(new ArrayList<>(), result, dp, 0, s);
        return result;
    }

    public void dfs(List<String> temp, List<List<String>> result, boolean[][] dp, int index, String s) {
        if (index == s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (dp[index][i]) {
                temp.add(s.substring(index, i + 1));
                dfs(temp, result, dp, i + 1, s);
                temp.remove(temp.size() - 1);
            }
        }
    }

    class Allocator {

        int length;
        int[] arr;

        public Allocator(int n) {
            length = n;
            arr = new int[n];
        }

        public int allocate(int size, int mID) {
            int count = 0;
            for (int i = 0; i < length; i++) {
                if (arr[i] != 0) {
                    count = 0;
                } else {
                    count++;
                    if (count == size) {
                        for (int j = i; j >= i - count + 1; j--) {
                            arr[j] = mID;
                        }
                        return i - count + 1;
                    }
                }
            }
            return -1;
        }

        public int freeMemory(int mID) {
            int count = 0;
            for (int i = 0; i < length; i++) {
                if (arr[i] == mID) {
                    arr[i] = 0;
                    count++;
                }
            }
            return count;
        }
    }

    class OrderedStream {

        String[] strings;

        int index = 1;

        public OrderedStream(int n) {
            strings = new String[n + 1];
        }

        public List<String> insert(int idKey, String value) {
            strings[idKey] = value;
            List<String> result = new ArrayList<>();
            if (idKey == index) {
                while (idKey < strings.length && strings[idKey] != null) {
                    result.add(strings[idKey++]);
                }
                index = idKey;
            }

            return result;
        }
    }

    public int minimumWhiteTiles1(String floor, int numCarpets, int carpetLen) {
        int length = floor.length();
        int[][] dp = new int[numCarpets + 1][length];
        for (int[] row : dp) {
            Arrays.fill(row, -1); // -1 表示没有计算过
        }
        return dfs1(floor.toCharArray(), length - 1, numCarpets, carpetLen, dp);
    }

    public int dfs1(char[] floor, int index, int numCarpets, int carpetLen, int[][] dp) {
        if (numCarpets * carpetLen >= index + 1) {
            return 0;
        }
        if (dp[numCarpets][index] != -1) {
            return dp[numCarpets][index];
        }

        // 1. 不覆盖
        int value = dfs1(floor, index - 1, numCarpets, carpetLen, dp) + (floor[index] - '0');
        // 2. 覆盖
        if (numCarpets > 0) {
            value = Math.min(dfs1(floor, index - carpetLen, numCarpets - 1, carpetLen, dp), value);
        }
        return dp[numCarpets][index] = value;
    }

    public int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
        return dfs(floor.toCharArray(), floor.length() - 1, numCarpets, carpetLen);
    }

    public int dfs(char[] floor, int index, int numCarpets, int carpetLen) {
        if (index < 0) {
            return 0;
        }
        // 1. 不覆盖
        int value = dfs(floor, index - 1, numCarpets, carpetLen) + (floor[index] - '0');
        // 2. 覆盖
        if (numCarpets > 0) {
            value = Math.min(dfs(floor, index - carpetLen, numCarpets - 1, carpetLen), value);
        }
        return value;
    }

    public int findSpecialInteger(int[] arr) {
        int m = arr.length / 4;
        for (int i : new int[]{m, m * 2 + 1}) {
            int x = arr[i];
            int j = lowerBound(arr, x);
            if (arr[j + m] == x) {
                return x;
            }
        }
        return arr[m * 3 + 2];
    }

    private int lowerBound(int[] arr, int x) {
        int left = -1;
        int right = arr.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    public int[] replaceElements(int[] arr) {
        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            if (i == arr.length - 1) {
                arr[i] = -1;
            } else {
                arr[i] = max;
            }
            max = Math.max(max, temp);
        }
        return arr;
    }

    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length / 3;
        int sum = 0;
        int index = piles.length - 2;
        for (int i = 0; i < n; i++) {
            sum += piles[index];
            index -= 2;
        }
        return sum;
    }

    public int knapsack01(int C, int[] w, int[] v) {
        int length = w.length;
        // 0-i 物品 容量C最大值
        int[][] dp = new int[length][C + 1];
        //1. 初始化
        for (int j = 0; j <= C; j++) {
            if (w[0] <= j) {
                dp[0][j] = v[0];
            }
        }

        for (int i = 1; i < length; i++) {
            for (int j = 1; j <= C; j++) {
                if (w[i] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[length - 1][C];
    }

    /**
     * 我的日程安排表1.
     * https://lfool.github.io/LFool-Notes/algorithm/%E7%BA%BF%E6%AE%B5%E6%A0%91%E8%AF%A6%E8%A7%A3.html
     */
    static class MyCalendar {
        public MyCalendar() {

        }

        public boolean book(int start, int end) {
            // 先查询该区间是否为 0
            if (query(root, 0, N, start, end - 1) != 0) return false;
            // 更新该区间
            update(root, 0, N, start, end - 1, 1);
            return true;
        }

        class Node {
            // 左右孩子节点
            Node left, right;
            // 当前节点值，以及懒惰标记的值
            int val, add;
        }

        private final static int N = (int) 1e9;
        private final Node root = new Node();

        private void update(Node node, int left, int right, int l, int r, int value) {
            if (l <= left && r >= right) {
                node.val += value;
                node.add += value;
                return;
            }
            pushDown(node);
            int mid = (right + left) >> 1;
            if (l <= mid) {
                update(node, left, mid, l, r, value);
            }
            if (r > mid) {
                update(node, mid + 1, right, l, r, value);
            }
            pushUp(node);
        }

        private int query(Node node, int left, int right, int l, int r) {
            if (l <= left && r >= right) return node.val;
            pushDown(node);
            int mid = (left + right) >> 1, ans = 0;
            if (l <= mid) ans = query(node.left, left, mid, l, r);
            if (r > mid) ans = Math.max(ans, query(node.right, mid + 1, right, l, r));
            return ans;
        }

        private void pushDown(Node node) {
            if (node.left == null) node.left = new Node();
            if (node.right == null) node.right = new Node();
            if (node.add == 0) return;
            node.left.val += node.add;
            node.right.val += node.add;
            node.left.add += node.add;
            node.right.add += node.add;
            node.add = 0;
        }

        private void pushUp(Node node) {
            // 每个节点存的是当前区间的最大值
            node.val = Math.max(node.left.val, node.right.val);
        }

    }

    static class MyCalendarViolence {
        private List<int[]> intervals = new ArrayList<>();

        public MyCalendarViolence() {

        }

        public boolean book(int startTime, int endTime) {
            for (int[] interval : intervals) {
                int left = interval[0];
                int right = interval[1];
                if (startTime >= right || endTime <= left) continue;
                return false;
            }
            intervals.add(new int[]{startTime, endTime});
            return true;
        }
    }

    public long minimumCost1(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        int hIndex = horizontalCut.length - 1;
        int vIndex = verticalCut.length - 1;
        int h = 1;
        int v = 1;
        long result = 0;
        while (hIndex >= 0 || vIndex >= 0) {
            if (vIndex < 0 || (hIndex >= 0 && horizontalCut[hIndex] > verticalCut[vIndex])) {
                result += horizontalCut[hIndex--] * v;
                h++;
            } else {
                result += verticalCut[vIndex--] * h;
                v++;
            }
        }
        return result;
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    public boolean dfs(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }

        if (head.val == root.val) {
            return dfs(head.next, root.left) || dfs(head.next, root.right);
        } else {
            return false;
        }
    }

    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> indexs = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                indexs.add(i);
            }
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i];
            if (index > indexs.size()) {
                result[i] = -1;
            } else {
                result[i] = indexs.get(index - 1);
            }
        }
        return result;
    }

    public boolean isSubstringPresent(String s) {
        int length = s.length();
        Map<Character, Set<Character>> map = new HashMap<>();
        for (int i = length - 1; i > 0; i--) {
            char ch = s.charAt(i);
            char lastCh = s.charAt(i - 1);
            Set<Character> set = map.getOrDefault(ch, new HashSet<>());
            set.add(lastCh);
            map.put(ch, set);
        }

        for (int i = 0; i < length - 1; i++) {
            char ch = s.charAt(i);
            char lastCh = s.charAt(i + 1);
            Set<Character> set = map.getOrDefault(ch, new HashSet<>());
            if (set.contains(lastCh)) {
                return true;
            }
        }
        return false;
    }

    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        return minimumCost(0, m - 1, 0, n - 1, horizontalCut, verticalCut);
    }

    private int minimumCost(int sRow, int eRow, int sCol, int eCol, int[] horizontalCut, int[] verticalCut) {
        if (eRow == sRow && eCol == sCol) {
            return 0;
        }
        boolean isH = true;
        int index = 0;
        int max = 0;
        for (int i = sRow; i < eRow; i++) {
            if (max < horizontalCut[i]) {
                max = horizontalCut[i];
                index = i;
                isH = true;
            }
        }
        for (int i = sCol; i < eCol; i++) {
            if (max < verticalCut[i]) {
                max = verticalCut[i];
                index = i;
                isH = false;
            }
        }

        if (isH) {
            return max + minimumCost(sRow, index, sCol, eCol, horizontalCut, verticalCut) + minimumCost(index + 1, eRow, sCol, eCol, horizontalCut, verticalCut);
        } else {
            return max + minimumCost(sRow, eRow, sCol, index, horizontalCut, verticalCut) + minimumCost(sRow, eRow, index + 1, eCol, horizontalCut, verticalCut);
        }
    }

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            if (i < n - 1) {
                list.add(i + 1);
            }
            map.put(i, list);
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int ui = query[0];
            int vi = query[1];
            map.get(ui).add(vi);

            int step = minStep(map, n);
            result[i] = step;
        }
        return result;
    }

    private int minStep(Map<Integer, List<Integer>> map, int n) {
        int[] dist = new int[n];
        for (int i = 1; i < n; i++) {
            dist[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int x = q.poll();
            for (int y : map.get(x)) {
                if (dist[y] >= 0) {
                    continue;
                }
                q.add(y);
                dist[y] = dist[x] + 1;
            }
        }
        return dist[n - 1];
    }

    private int minStep(int startIndex, int endIndex, Map<Integer, List<Integer>> map) {
        if (startIndex == endIndex) {
            return 0;
        }
        int minStep = Integer.MAX_VALUE;
        List<Integer> integers = map.get(startIndex);
        for (Integer integer : integers) {
            minStep = Math.min(minStep(integer, endIndex, map), minStep);
        }
        return minStep + 1;
    }


    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(-101);
        newHead.next = head;

        ListNode currentNode = newHead;
        while (currentNode.next != null) {
            if (currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return newHead.next;
    }

    public void setZeroes(int[][] matrix) {
        Set<Integer> colZero = new HashSet<>();
        Set<Integer> rowZero = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowZero.add(i);
                    colZero.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (colZero.contains(j) || rowZero.contains(i)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public int countCompleteDayPairsOptimized(int[] hours) {
        int h = 24;
        int count = 0;
        int[] cnt = new int[h];
        for (int hour : hours) {
            count += cnt[(h - hour % h) % h];
            cnt[hour % h]++;
        }
        return count;
    }


    public int countCompleteDayPairs(int[] hours) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int length = hours.length;
        for (int i = 0; i < length; i++) {
            hours[i] = hours[i] % 24;
            List<Integer> list = map.computeIfAbsent(hours[i], key -> new ArrayList<Integer>());
            list.add(i);
        }

        int count = 0;
        for (int i = 0; i < length; i++) {
            int hour = hours[i];
            int needHour = (24 - hour) % 24;
            List<Integer> list = map.get(needHour);
            if (list != null) {
                for (Integer integer : list) {
                    if (integer > i) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }

    private void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }

    public int minDistance(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        int[][] dp = new int[word1Length + 1][word2Length + 1];
        for (int i = 1; i <= word1Length; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= word2Length; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= word1Length; i++) {
            char ch1 = word1.charAt(i);
            for (int j = 1; j <= word2Length; j++) {
                char ch2 = word2.charAt(j);
                if (ch1 == ch2) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
        return dp[word1Length][word2Length];
    }

    //最小差值
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int diff = nums[n - 1] - nums[0];
        for (int i = 1; i < n; i++) {
            int max = Math.max(nums[i - 1] + k, nums[n - 1] - k);
            int min = Math.min(nums[0] + k, nums[i] - k);
            diff = Math.min(diff, max - min);
        }
        return diff;
    }

    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Deque<String> stack = new ArrayDeque<String>();
        for (String name : split) {
            if (name.equals("..")) {
                stack.pollLast();
            } else if (name.equals(".") || name.isEmpty()) {
                continue;
            } else {
                stack.offerLast(name);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append("/");
            sb.append(stack.pollFirst());
        }
        sb.append("/");
        return sb.toString();
    }

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
//        return climbStairs(n - 1) + climbStairs(n - 2);
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public boolean isNumber(String s) {
        Map<State, Map<CharType, State>> transfer = new HashMap<State, Map<CharType, State>>();
        Map<CharType, State> initialMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
            put(CharType.CHAR_SIGN, State.STATE_INT_SIGN);
        }};
        transfer.put(State.STATE_INITIAL, initialMap);
        Map<CharType, State> intSignMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
        }};
        transfer.put(State.STATE_INT_SIGN, intSignMap);
        Map<CharType, State> integerMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_EXP, State.STATE_EXP);
            put(CharType.CHAR_POINT, State.STATE_POINT);
        }};
        transfer.put(State.STATE_INTEGER, integerMap);
        Map<CharType, State> pointMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
            put(CharType.CHAR_EXP, State.STATE_EXP);
        }};
        transfer.put(State.STATE_POINT, pointMap);
        Map<CharType, State> pointWithoutIntMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
        }};
        transfer.put(State.STATE_POINT_WITHOUT_INT, pointWithoutIntMap);
        Map<CharType, State> fractionMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
            put(CharType.CHAR_EXP, State.STATE_EXP);
        }};
        transfer.put(State.STATE_FRACTION, fractionMap);
        Map<CharType, State> expMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
            put(CharType.CHAR_SIGN, State.STATE_EXP_SIGN);
        }};
        transfer.put(State.STATE_EXP, expMap);
        Map<CharType, State> expSignMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
        }};
        transfer.put(State.STATE_EXP_SIGN, expSignMap);
        Map<CharType, State> expNumberMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
        }};
        transfer.put(State.STATE_EXP_NUMBER, expNumberMap);

        int length = s.length();
        State state = State.STATE_INITIAL;

        for (int i = 0; i < length; i++) {
            CharType type = toCharType(s.charAt(i));
            if (!transfer.get(state).containsKey(type)) {
                return false;
            } else {
                state = transfer.get(state).get(type);
            }
        }
        return state == State.STATE_INTEGER || state == State.STATE_POINT || state == State.STATE_FRACTION || state == State.STATE_EXP_NUMBER || state == State.STATE_END;
    }

    private CharType toCharType(char ch) {
        if (ch >= '0' && ch <= '9') {
            return CharType.CHAR_NUMBER;
        } else if (ch == 'e' || ch == 'E') {
            return CharType.CHAR_EXP;
        } else if (ch == '.') {
            return CharType.CHAR_POINT;
        } else if (ch == '+' || ch == '-') {
            return CharType.CHAR_SIGN;
        } else {
            return CharType.CHAR_ILLEGAL;
        }
    }

    enum State {
        STATE_INITIAL, STATE_INT_SIGN, STATE_INTEGER, STATE_POINT, STATE_POINT_WITHOUT_INT, STATE_FRACTION, STATE_EXP, STATE_EXP_SIGN, STATE_EXP_NUMBER, STATE_END
    }

    enum CharType {
        CHAR_NUMBER, CHAR_EXP, CHAR_POINT, CHAR_SIGN, CHAR_ILLEGAL
    }

    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        List<List<Integer>> result = new ArrayList<>();
        combine(nums, new ArrayList<>(), result, k, 0);
        return result;
    }

    public void combine(int[] nums, List<Integer> temp, List<List<Integer>> result, int k, int index) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            combine(nums, temp, result, k, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public int uniquePathsWithObstaclesDp(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        // 定义 dp 数组并初始化第 1 行和第 1 列。
        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return uniquePathsWithObstacles(obstacleGrid, 0, 0);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid, int x, int y) {
        if (x == obstacleGrid.length - 1 && y == obstacleGrid[x].length - 1) {
            return 1;
        }

        if (x >= obstacleGrid.length || y >= obstacleGrid[x].length || obstacleGrid[x][y] == 1) {
            return 0;
        }
        return uniquePathsWithObstacles(obstacleGrid, x + 1, y) + uniquePathsWithObstacles(obstacleGrid, x, y + 1);
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            length++;
            current = current.next;
        }
        length = length % k;
        int step = k - length;
        current.next = head;

        while (step-- > 0) {
            current = current.next;
        }
        ListNode ret = current.next;
        current.next = null;
        return ret;
    }

    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        boolean[] visited = new boolean[n];
        List<String> list = new ArrayList<>();
        permutation(nums, visited, list, n, k, new StringBuilder());
        return list.get(k - 1);
    }

    private void permutation(int[] nums, boolean[] visited, List<String> list, int n, int k, StringBuilder stringBuilder) {
        if (list.size() == k) {
            return;
        }
        if (stringBuilder.length() == n) {
            list.add(stringBuilder.toString());
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                stringBuilder.append(nums[i]);
                permutation(nums, visited, list, n, k, stringBuilder);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                visited[i] = false;
            }
        }
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        List<Integer> result = new ArrayList<>();

        while (left <= right && up <= down) {
            for (int temp = left; temp <= right; temp++) {
                result.add(matrix[up][temp]);
            }
            up++;
            for (int temp = up; temp <= down; temp++) {
                result.add(matrix[temp][right]);
            }
            right--;
            if (up <= down) {
                for (int temp = right; temp >= left; temp--) {
                    result.add(matrix[down][temp]);
                }
            }
            down--;
            if (left <= right) {
                for (int temp = down; temp >= up; temp--) {
                    result.add(matrix[temp][left]);
                }
            }
            left++;
        }
        return result;
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        for (int[] interval : intervals) {
            if (null == newInterval) {
                result.add(interval);
                continue;
            }
            int min = interval[0];
            int max = interval[1];
            if (max < newInterval[0]) {
                result.add(interval);
                continue;
            }
            if (min > newInterval[1]) {
                result.add(newInterval);
                newInterval = null;
                result.add(interval);
                continue;
            }
            newInterval[0] = Math.min(min, newInterval[0]);
            newInterval[1] = Math.max(max, newInterval[1]);
        }
        if (newInterval != null) {
            result.add(newInterval);
        }
        return result.toArray(new int[result.size()][]);
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode prev = newHead;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        ListNode cur = prev.next;
        ListNode next = null;
        for (int i = left; i < right; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return newHead.next;
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> merged = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0) {
                merged.add(intervals[i]);
            } else {
                int[] prevInts = merged.get(merged.size() - 1);
                int[] interval = intervals[i];
                if (interval[0] > prevInts[1]) {
                    merged.add(interval);
                } else {
                    prevInts[1] = Math.max(interval[1], prevInts[1]);
                }
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (isExist(board, word, 0, visited, i, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isExist(char[][] board, String word, int index, boolean[][] visited, int column, int row) {
        if (index == word.length()) {
            return true;
        }
        if (column < 0 || column >= board.length || row < 0 || row >= board[0].length || visited[column][row]) {
            return false;
        }
        visited[column][row] = true;
        boolean isExist = word.charAt(index) == board[column][row] && (isExist(board, word, index + 1, visited, column, row - 1) || isExist(board, word, index + 1, visited, column, row + 1) || isExist(board, word, index + 1, visited, column - 1, row) || isExist(board, word, index + 1, visited, column + 1, row));
        visited[column][row] = false;
        return isExist;
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;

        while (indexA >= 0 || indexB >= 0 || carry == 1) {
            int aNum = 0;
            if (indexA >= 0) {
                aNum = a.charAt(indexA) - '0';
            }
            int bNum = 0;
            if (indexB >= 0) {
                bNum = b.charAt(indexB) - '0';
            }
            int sum = aNum + bNum + carry;
            char currentChar = (char) (sum % 2 + '0');
            sb.insert(0, currentChar); // Insert at the beginning to maintain the correct order
            carry = sum / 2;
            indexA--;
            indexB--;
        }
        return sb.toString();
    }


    public int findValueOfPartition(int[] nums) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, (nums[i] - nums[i - 1]));
        }
        return min;
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
            if (p.charAt(i - 1) != '*') {
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
                    if ((ch == ')' && peek == '(') || (ch == '}' && peek == '{') || (ch == ']' && peek == '[')) {
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
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
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