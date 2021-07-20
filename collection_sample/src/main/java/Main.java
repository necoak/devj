import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        Integer collectionSize = 10000;

        System.out.println("LinkedList");
        measure(new LinkedList<String>(), collectionSize);

        System.out.println("ArrayList");
        measure(new ArrayList<String>(), collectionSize);

        System.out.println("CopyOnWriteArrayList");
        measure(new CopyOnWriteArrayList<String>(), collectionSize);
    }

    private static void measure(List<String> list, Integer collectionSize) {
        // 処理前の時刻を取得
        long startTime = System.nanoTime();

        // add
        for (int i = 0; i < collectionSize; i++) {
            list.add(Integer.toString(i));
        }
        long lap1Time = System.nanoTime();

        //  search
        for (int i = 0; i < collectionSize; i++) {
            list.contains(Integer.toString(i));
        }
        long lap2Time = System.nanoTime();

        // replace
        for (int i = 0; i < collectionSize; i++) {
            list.set(i, "replaced:" + i);
        }
        long lap3Time = System.nanoTime();

        System.out.println(String.format("末尾追加[nano sec]: %,d", (lap1Time -startTime)));
        System.out.println(String.format("要素探索[nano sec]: %,d", (lap2Time -lap1Time)));
        System.out.println(String.format("要素置換[nano sec]: %,d", (lap3Time -lap2Time)));

    }


}
