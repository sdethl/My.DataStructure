package leetcode;

import datastructure.TreeNode;
import org.junit.Test;

import java.util.List;

public class testBTS {

    BinaryTreeSearch bts = new BinaryTreeSearch();
    @Test
    public void testCase_1(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        bts.printTreeDFS(root);
        System.out.println("");

        bts.printTreeDFS2(root);
        System.out.println("");

        bts.printTreeDFS3(root);
        System.out.println("");
        //bts.printTreeDFS(bts.searchBST(root, 2));
    }

    @Test
    public void testRootToLeafPath(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        bts.paths(root);
    }

    @Test
    public void testTraversal(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        bts.printTreeBFS(root);
        System.out.println("");
        System.out.println("maximum " + bts.maxDepth(root));
        System.out.println("minimum " + bts.minDepth(root));

    }

    @Test
    public void testMergeTrees(){
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(1);

        TreeNode t2 = new TreeNode(2);
        t2.right = new TreeNode(3);

        bts.printTreeBFS(bts.mergeTrees(t1, t2));

    }
    @Test
    public void testTreeToArray(){
        bts.treeToArray(generateTree());
    }

    private TreeNode generateTree(){
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(1);
        return t1;
    }

    @Test
    public void testAverage(){
        List<Double> list = bts.averageValueOfLevel(generateTree());
        for(double d : list){
            System.out.print("ave: " + d);
        }
    }
}
