package com.leet.examp.small;

public class CreatingBinaryTree {

    class TreeNode {
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

    public static void main(String[] args) {
        int[] nums = new int[] {-4, -3,-2, 0, 1,2,3,4,5,6};
        CreatingBinaryTree ct = new CreatingBinaryTree();
        ct.traversePreOrder(ct.sortedArrayToBST(nums));

    }

    public void traversePreOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            traversePreOrder(root.left);
            traversePreOrder(root.right);
        }
        System.out.println("------");
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int size = nums.length;
        return sortedArrayToBST(nums, 0, size-1);
    }



    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = start + (end - start)/ 2;
        TreeNode leftLeg = sortedArrayToBST(nums, start, mid-1);
        TreeNode rightLeg = sortedArrayToBST(nums, mid + 1, end);
        TreeNode middle = new TreeNode(nums[mid]);
        middle.left = leftLeg;
        middle.right = rightLeg;
        return middle;
    }

}
