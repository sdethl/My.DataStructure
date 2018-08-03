package leetcode;

import datastructure.TreeNode;
import org.junit.Test;

public class testBTS {

    @Test
    public void testCase_1(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        BinaryTreeSearch bts = new BinaryTreeSearch();
        bts.printTree(root);
        System.out.println("");
        bts.printTree(bts.searchBST(root, 2));
    }

    @Test
    public void testRootToLeafPath(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        BinaryTreeSearch b = new BinaryTreeSearch();
        b.paths(root);
    }
}
