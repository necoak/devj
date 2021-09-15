import java.util.*;

public class SortMain {
    public static void main(String[] args) {
        System.out.println("配列・リストのソートサンプル");
        Integer[] originalValues = {0, 2, 3, 1, 1, 4, 5};

        // 配列操作
        Integer[] sortedValues01 = Arrays.copyOf(originalValues, originalValues.length);
        System.out.println("# 配列のソート");
        // 昇順
        Arrays.sort(sortedValues01);
        print_values(sortedValues01);
        // 降順
        Arrays.sort(sortedValues01, Collections.reverseOrder());
        print_values(sortedValues01);

        // リスト操作
        List<Integer> sortedValues02 = Arrays.asList(originalValues);
        System.out.println("# リストのソート");
        // 昇順
        Collections.sort(sortedValues02);
        sortedValues02.sort(Comparator.naturalOrder());
        print_values(sortedValues02);
        // 降順
        sortedValues02.sort(Comparator.reverseOrder());
        print_values(sortedValues02);
    }

    private static void print_values(Integer[] values) {
        for (Integer value : values){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void print_values(List<Integer> values){
        for (Integer value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
