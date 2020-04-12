package algorithm.code.linkedlist;
/*
 *@author xufan
 *@create 2020/4/12
 */


public class SinglyLinkedList<T>{
    private Node<T> headNode;
    private int length;
    private int cap;

    public SinglyLinkedList(){

    }

    public SinglyLinkedList(int cap){
        this.cap = cap;
    }


}

class Node<T>{
    private T data;
    private Node<T> node;

    public Node(){
        this.node =null;
    }

    public Node(T data){
        this.data =data;
    }

    public Node(T data,Node<T> node){
        this.data =data;
        this.node =node;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }
}
