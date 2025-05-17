package Q1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        testB();
        testC();
    }

    private static void testB() {
        Queue<String> q = new Queue<>(10);
        q.add("a", 1);
        q.add("b", 2);
        q.add("c", 3);
        q.add("d", 4);
        q.add("e", 5);
        q.add("ee", 5);
        q.add("bb", 2);
        Iterator<String> it = q.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(q.size());

        System.out.println(q.remove("bb"));
        System.out.println(q.contains("b"));
        System.out.println(q.poll());

        System.out.println(q.contains("a"));
        it = q.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void testC() {
        Queue<ReachOuts> q = new Queue<>(10);
        ArrayList<ReachOuts> ar = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ReachOuts r = new ReachOuts("name" + i, i + 1000, "content" + i);
            // make priority overlap with % operator
            q.add(r, i % 8);
            ar.add(r);
        }


        Iterator<ReachOuts> it = q.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(q.size());

        System.out.println(q.remove(ar.getFirst()));
        System.out.println(ar.get(2));
        System.out.println(q.poll());

        System.out.println(q.contains(ar.get(0)));
        it = q.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}