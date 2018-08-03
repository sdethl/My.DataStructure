package leetcode;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeSearch {

    /**
     *
     * 700. Search in a Binary Search Tree
     * Given the root node of a binary search tree (BST) and a value.
     * You need to find the node in the BST that the node's value equals the given value.
     * Return the subtree rooted with that node.
     * If such node doesn't exist, you should return NULL.
     *
     */
    public TreeNode searchBST(TreeNode root, int x){
        if( root == null)
            return null;
        if( root.val == x)
            return root;
        else if( x< root.val)
            return searchBST(root.left, x);
        else
            return searchBST(root.right, x);
    }

    public void printTree(TreeNode root){
        if( root != null){
            System.out.print(root.val + " -> ");
            if(root.left != null)
                printTree(root.left);
            if(root.right != null)
                printTree(root.right);

        }
    }
    public String toString(TreeNode root) {
        ArrayList<String> temp = new ArrayList<>();
        if (root != null) {
            temp.add(String.valueOf(root.val));
            if (root.left != null)
                temp.add(String.valueOf(root.left.val));
            if (root.right != null)
                temp.add(String.valueOf(root.right.val));
        }
        return temp.toString();
    }

        /**
         * # 257. Binary Tree Paths
         * Given a binary tree, return all root-to-leaf paths.
         */
    public List<String> paths(TreeNode root){
        List<String> result = new ArrayList<>();
        if(root!=null){
            binaryTreePath(root, "", result);
        }
        for(String s: result){
            System.out.println(s);
        }
        return result;
    }

    private void binaryTreePath (TreeNode root, String path, List<String> result){
        if( isLeaf(root)){
            path = path + root.val;
            result.add(path);
        }
        if( root.left != null){
            binaryTreePath(root.left, path+root.val+"->", result);
        }
        if (root.right != null){
            binaryTreePath(root.right,path+root.val+"->", result);
        }
    }

    private boolean isLeaf(TreeNode treeNode){
        if( treeNode!=null && treeNode.left == null && treeNode.right== null )
            return true;
        else
            return false;
    }

}
