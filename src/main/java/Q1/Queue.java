package Q1;

import java.util.*;

public class Queue<T> {

    private class Node<T> {
        protected static int n;
        private static long insertions;
        private int priority;
        private T value;
        private long order;

        public Node(int priority, T value){
            this.priority = (priority <= n) ? priority : n;
            this.order = insertions++;
            this.value = value;
        }
        public int getPriority(){
            return this.priority;
        }
        public T getValue(){
            return this.value;
        }
        public long getOrder(){
            return this.order;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(value, node.value);
        }

    }

    private class Compare implements Comparator<Node> {
        public int compare(Node n1, Node n2)
        {
            if(n1.getPriority() == n2.getPriority()){
                return n1.getOrder() < n2.getOrder() ? -1: 1;
            }
            return n1.getPriority()< n2.getPriority() ? -1: 1;
        }
    }

    private PriorityQueue<Node> arr;


    public Queue(int n) {
        Node.n = n;
        this.arr = new PriorityQueue<Node>(new Compare());
    }

    public void add(T value, int priority){
        arr.add(new Node<T>(priority,value));
    }
    public T poll(){
        return arr.isEmpty() ? null : (T) arr.poll().getValue();
    }

    public boolean contains(T obj){
        for(Node node : arr){
            if(obj.equals(node)){
                return true;
            }
        }
        return false;
    }

    public boolean remove(T obj){
        long order;
        int priority;
        int index;

        ArrayList<Node> l = new ArrayList<>(this.arr);
        l.sort(new Compare());
        for( Node n : l){
            if (n.equals(obj)){
                arr.remove(n);
                return true;
            }
        }
        return false;
    }

    public int size(){
        return arr.size();
    }


    public Iterator<T> iterator(){
        ArrayList<Node> l = new ArrayList<>(this.arr);
        l.sort(new Compare());
        ArrayList<T> res = new ArrayList<>();
        for(Node n : l){
            res.add((T)n.getValue());
        }
        return  res.iterator();
    }

}
