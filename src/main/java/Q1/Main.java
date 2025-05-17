package Q1;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Queue<String> q = new Queue<>(10);
        q.add("a",2);
        q.add("b",2);
        q.add("c",3);
        q.add("d",4);
        q.add("e",5);

        Iterator<String> it = q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    private static void forEach(Iterator<String> iterator) {
    }


}