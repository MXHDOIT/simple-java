package leetcode.editor.cn;

//输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。 
//
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
//
// 
//
// 示例 1: 
//
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
//preorder-and-inorder-traversal/ 
// Related Topics 树 数组 哈希表 分治 二叉树 
// 👍 964 👎 0

import java.util.Arrays;

public class ZhongJianErChaShuLcof {
    public static void main(String[] args) {
        Solution solution = new ZhongJianErChaShuLcof().new Solution();

    }

//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    /**
     * 前序遍历：第一个节点肯定是根元素
     * 中序遍历：root元素左边的元素肯定在左分支上，root元素右边的元素肯定在右分支上
     *
     * 递归操作.
     * [ 根节点, [左子树的前序遍历结果], [右子树的前序遍历结果] ]
     * [ [左子树的中序遍历结果], 根节点, [右子树的中序遍历结果] ]
     * 获取到根节点
     * 在中序遍历数组中获取到根节点左边的元素，建立当前节点的左分支
     * 在中序遍历数组中获取到根节点右边的元素，建立当前节点的右分支
     */
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder.length == 0) {
                return null;
            }
            int rootVal = preorder[0];
            TreeNode treeNode = new TreeNode(rootVal);
            int index = findValue(rootVal, inorder);
            treeNode.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
            treeNode.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, preorder.length));
            return treeNode;
        }

        private int findValue(int num, int[] arrays) {
            for (int i = 0; i < arrays.length; i++) {
                if (num == arrays[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}