package collection1.homework.custom;

import java.util.Objects;

public class CustomLinkedList <T>{

     Node<T> head;
      Node<T> tail;
     int size;
    public CustomLinkedList(){
        head=null;
        size=0;
    }


    public void add(T t){
        Node node=new Node<>();
        node.val=t;


        if (head==null){
            head=node;
        }else {
            tail.next=node;
            node.prev=tail;
        }
        tail=node;
        size++;
    }

    public static class Node<T>{
        T val;
        Node<T> prev;
        Node<T>next;


       public Node(T val){
            this(val,null,null);
        }
        public Node(T val, Node<T> prev, Node<T> next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

        public Node() {

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(val, node.val) && Objects.equals(prev, node.prev) && Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, prev, next);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +

                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CustomLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
    public T getVal(int idx){
        if(idx>=size||idx<0) throw new IndexOutOfBoundsException();

        Node n=head;
        for (int i=0;i<idx;i++){
            n=n.next;
        }
        return (T) n.val;


    }
}
