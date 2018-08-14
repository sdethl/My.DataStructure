package leetcode;

import datastructure.TreeNode;

import java.util.*;

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

    /**
     * Breadth First Traversal (Or Level Order Traversal)
     Depth First Traversals
     Postorder Traversal (Left-Right-Root)
     Inorder Traversal (Left-Root-Right)
     Preorder Traversal (Root-Left-Right)
     *
     */
    public void printTreeDFS(TreeNode root){
        if(root==null) return;
        printTreeDFS2(root.left);
        printTreeDFS2(root.right);
        System.out.print(root.val + " -> ");
    }

    public void printTreeDFS2(TreeNode root){
        if(root==null) return;
        printTreeDFS2(root.left);
        System.out.print(root.val + " -> ");
        printTreeDFS2(root.right);
    }

    public void printTreeDFS3(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " -> ");
        printTreeDFS3(root.left);
        printTreeDFS3(root.right);
    }

    public void printTreeBFS(TreeNode root){
        Queue q = new LinkedList();
        int totalOfNodesInLevel;
        if( root==null) return;
        q.add(root);
        while( !q.isEmpty() ){
            totalOfNodesInLevel = q.size();
            while( totalOfNodesInLevel > 0){
                TreeNode node = (TreeNode) q.remove();
                System.out.print(node.val + " -> ");
                if( node.left != null){
                    q.add(node.left);
                }
                if( node.right != null){
                    q.add(node.right);
                }
                totalOfNodesInLevel--;
            }
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

    /**
     * # 104. Maximum Depth of Binary Tree
     * Given a binary tree, find its maximum depth.
     The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     */
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int minDepth(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    /**
     * #617. Merge Two Binary Trees
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if( t1==null )
            return t2;
        if( t2==null )
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t2.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    /**
     * # 637. Average of Levels in Binary Tree
     * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
     */
    public List<Double> averageValueOfLevel(TreeNode root){
        if(root==null) return null;
        int totalOfNodesInLevel;
        double ave = 0.0f;
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList();
        q.add(root);

        while(!q.isEmpty()){
            totalOfNodesInLevel = q.size();
            int temp = totalOfNodesInLevel;
            while( totalOfNodesInLevel > 0){
                TreeNode node = q.remove();
                ave += node.val;
                if(node.left != null)
                averageValueOfLevel(node.left);
                if(node.right != null)
                averageValueOfLevel(node.right);
                totalOfNodesInLevel--;
            }
            ave = ave/temp;
        }
        result.add(ave);
        return result;
    }


    //not working
    public int[] treeToArray(TreeNode root){
        int[] result = null;
        List<Integer> list = new ArrayList<>();
        if( root!=null){
            list.add(root.val);
            treeToArray(root.left);
            treeToArray(root.right);
        }
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
