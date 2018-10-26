package datastructure.LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> head;
    private int sizeOfList;

    @Override
    public void insert(T data) {
        ++this.sizeOfList;
        if( head == null){
            this.head = new Node<>(data);
        }else{
            addToFront(data);
        }

    }

    //O(1)
    private void addToFront(T data){
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(head);
        this.head = newNode;
        sizeOfList++;
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
     * 3. traverse the list from head(head)
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
        if( this.head == null){
            return;
        }
        --this.sizeOfList;
        if( this.head.getData().compareTo(data) == 0){
            this.head = this.head.getNextNode();
        }else{
            remove(data, head, head.getNextNode());
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
        if( this.head == null) return;
        Node<T> currentNode = this.head;
        while( currentNode != null){
            currentNode = currentNode.getNextNode();
        }
    }

    public void reverse(){
        Node<T> currentNode = this.head;
        Node<T> previousNode = null;
        Node<T> nextNode = null;

        while( currentNode != null){
            nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        this.head = previousNode;
    }

    @Override
    public int size() {
        return this.sizeOfList;
    }
}
