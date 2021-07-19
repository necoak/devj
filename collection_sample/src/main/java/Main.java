import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //String collectionType = args[0];
        //Integer collectionSize = Integer.parseInt(args[1]);
        Integer collectionSize = 100000;
        //List<String> list = new ArrayList<String>();
        List<String> list = new LinkedList<String>();
        //List<String> list = new Vector<String>();

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

        System.out.println(String.format("末尾追加[nano sec]: %d", (lap1Time -startTime)));
        System.out.println(String.format("要素探索[nano sec]: %d", (lap2Time -lap1Time)));
        System.out.println(String.format("要素置換[nano sec]: %d", (lap3Time -lap2Time)));
    }
}
