package datastructure.Tree;

import java.util.*;

public class BinarySearchTree {

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
        if( root.value == x)
            return root;
        else if( x< root.value)
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
    public void printTreePostOrder(TreeNode root){
        if(root==null) return;
        printTreeInOrder(root.left);
        printTreeInOrder(root.right);
        System.out.print(root.value + " -> ");
    }

    public void printTreeInOrder(TreeNode root){
        if(root==null) return;
        printTreeInOrder(root.left);
        System.out.print(root.value + " -> ");
        printTreeInOrder(root.right);
    }

    public void printTreePreOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.value + " -> ");
        printTreePreOrder(root.left);
        printTreePreOrder(root.right);
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
                System.out.print(node.value + " -> ");
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
            temp.add(String.valueOf(root.value));
            if (root.left != null)
                temp.add(String.valueOf(root.left.value));
            if (root.right != null)
                temp.add(String.valueOf(root.right.value));
        }
        return temp.toString();
    }

    /**
     * # 257. Binary Tree Paths
     * Given a binary tree, return all root-to-leaf paths. (pre-order traversal)
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
            path = path + root.value;
            result.add(path);
        }
        if( root.left != null){
            binaryTreePath(root.left, path+root.value +"->", result);
        }
        if (root.right != null){
            binaryTreePath(root.right,path+root.value +"->", result);
        }
    }

    private boolean isLeaf(TreeNode treeNode){
        if( treeNode!=null && treeNode.left == null && treeNode.right== null )
            return true;
        else
            return false;
    }

    /**
     * #. 98 Valid BST
     * Given a binary tree, determine if it is a valid binary search tree (BST).
     *
     * Assume a BST is defined as follows:
     *
     * The left subtree of a node contains only nodes with keys less than the node's key.
     * The right subtree of a node contains only nodes with keys greater than the node's key.
     * Both the left and right subtrees must also be binary search trees.
     *
     * Note: compare the root node and subtrees
     *       rather than left node and right node
     */

    public boolean isBST(TreeNode root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Max of the left subtree
    // Min of the right subtree
    private boolean isBST(TreeNode root, int min, int max){
        if( root == null){
            return true;
        }
        if( root.value > max || root.value < min){
            return false;
        }
        return isBST(root.left, min, root.value-1) && isBST(root.right, root.value+1, max);
    }

    /**
     * # 104. Maximum Depth of Binary Tree
     * Given a binary tree, find its maximum depth.
     The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     */

    //O(N)
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
        t1.value += t2.value;
        t1.left = mergeTrees(t1.left, t2.left);
        t2.right = mergeTrees(t1.right, t2.right);
        return t1;
    }


    //The max is always the
    public int findMax(TreeNode root){
        TreeNode current;
        if( isLeaf(root )){
            return root.getValue();
        }else {
            current = root;
            current = current.right;
            if( isLeaf(current)){
                return current.value;
            }
            if( current.left != null && current.right == null){
                return current.left.getValue();
            }
        }
        return current.getValue();
    }

//    public int findMin(){
//
//    }

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
                ave += node.value;
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

    public void insert(TreeNode root, int number){

        TreeNode newNode = new TreeNode(number);
        if( root == null ){
            root = newNode;
            return;
        }
        else{
            TreeNode currentNode = root;
            //TreeNode currentNode;
            while( true){
                if( root.value > number){
                    currentNode = currentNode.left; //if not leaf node, will traverse until gets to a leaf
                    if( isLeaf(currentNode)){
                        currentNode.setLeft(newNode);
                        return;
                    }
                }else{
                    currentNode = currentNode.right;
                    if( isLeaf(currentNode)){
                        currentNode.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    // Leaf node: delete
    // Node with on child: the whole subTree will replace the deleted node
    // Node with 2 children:
//    public boolean delete(TreeNode root, TreeNode toBeDeletedNode){
//
//        TreeNode current = root;
//        TreeNode parent = root;
//
//        //leaf node
//
//
//
//
//    }

    //not working
    public int[] treeToArray(TreeNode root){
        int[] result = null;
        List<Integer> list = new ArrayList<>();
        if( root!=null){
            list.add(root.value);
            treeToArray(root.left);
            treeToArray(root.right);
        }
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }

    /**
     * #108.
     * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.     *
     * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
     *
     * Example:
     * Given the sorted array: [-10,-3,0,5,9],     *
     * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
     *
     *       0
     *      / \
     *    -3   9
     *    /   /
     *  -10  5
     *
     *  O(N), O(logN)
     */
    public TreeNode sortedArrayToBST(int[] nums){
        int length = nums.length;
        if( length == 0 ){
            return null;
        }else if( length == 1){
            return new TreeNode(nums[0]);
        }
        return sortedArrayToBST(nums, 0, length-1);
    }

    private TreeNode sortedArrayToBST(int[] array, int start, int end){
        if( start > end ){
            return null;
        }
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(array[mid]);
        root.left = sortedArrayToBST(array, start, mid);
        root.right = sortedArrayToBST(array, mid+1, end);
        return  root;
    }

    /**
     *  # 543
     *  Given a binary tree, you need to compute the length of the diameter of the tree.
     *  The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
     *  This path may or may not pass through the root.
     * Example:
     * Given a binary tree
     *           1
     *          / \
     *         2   3
     *        / \
     *       4   5
     * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
     *
     * Note: The length of path between two nodes is represented by the number of edges between them.
     */

    /**
     * Solution: MaxPathForRootNode = Max(leftChildTree, rightChildTree) + 1
     *
     */

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root){
        int diameter=0;
        if (root == null) return 0;
        depthOfSubTree(root);
        return diameter -2;
    }

    private int depthOfSubTree(TreeNode root){
        if(root == null)
            return 0;
        int left = depthOfSubTree(root.left) + 1;
        int right = depthOfSubTree(root.right) + 1;
        if( left+right >diameter )
            diameter = left+right;
        return left >= right? left: right;
    }
}
