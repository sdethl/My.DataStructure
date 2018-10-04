package datastructure.LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data) {
        ++this.sizeOfList;
        if( root == null){
            this.root = new Node<>(data);
        }else{
            insertDataBeginning(data);
        }

    }

    //O(1)
    private void insertDataBeginning(T data){
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }
    //O(N)
    private void insertDataAtEnd(T data, Node<T> node){
        if( node.getNextNode() != null){
            insertDataAtEnd(data, node.getNextNode());
        }else{
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }


    /**
     * @param data: the element to be deleted
     *
     * 1. take care of edge cases
     * 2. take care of the list size
     * 3. traverse the list from head(root)
     *    and check if the current node is the data
     * 4. if yes:
     *            previous.next = current.next;
     *            current = null;
     * 5. if no, traverse to next node:
     *            previous = current;
     *            current = current.next;
     */
    @Override
    public void delete(T data) {
        if( this.root == null){
            return;
        }
        --this.sizeOfList;
        if( this.root.getData().compareTo(data) == 0){
            this.root = this.root.getNextNode();
        }else{
            remove(data, root, root.getNextNode());
        }
    }
    private void remove(T data, Node<T> previousNode, Node<T> currentNode){
        while( currentNode != null){
            if( currentNode.getData().compareTo(data) == 0){
                previousNode.setNextNode(currentNode.getNextNode());
                currentNode = null;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public void traverseList() {
        if( this.root == null) return;
        Node<T> currentNode = this.root;
        while( currentNode != null){
            currentNode = currentNode.getNextNode();
        }
    }

    public void reserver(){
        Node<T> currentNode = this.root;
        Node<T> previousNode = null;
        Node<T> nextNode = null;

        while( currentNode != null){
            nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        this.root = previousNode;
    }

    @Override
    public int size() {
        return this.sizeOfList;
    }
}
