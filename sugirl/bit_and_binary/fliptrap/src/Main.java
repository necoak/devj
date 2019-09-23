import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    static Integer[] calcNextCells(Integer[] cells, Integer nextButtonVal) {
        Integer[] nextCells = cells.clone();
        if(nextCells[nextButtonVal] == 0)
            nextCells[nextButtonVal] = 1;
        else
            nextCells[nextButtonVal] = 0;
        return nextCells;
    }


    static boolean isError (ArrayList<Integer[]> cells, Integer[] nextCell){
        // 重複のセルパターンがあったらエラー
        for (Integer[] cell : cells) {
            if ((cell[0] == nextCell[0]) &&
                    (cell[1] == nextCell[1]) &&
                    (cell[2] == nextCell[2]) &&
                    (cell[3] == nextCell[3]))
                return true;
        }
        return false;
    }

    static void printCell(Integer[] cell) {
        System.out.println("" + cell[0] + cell[1] + cell[2] + cell[3]);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("4桁のフリップ・トラップをやりましょう");
        System.out.println("値を変えるためスイッチを選択します。0から3の数値を入力してください。-1を入れたらすべての値をリセットします。");
        Scanner scan = new Scanner(System.in);

        Integer[] currentCell = new Integer[4];
        currentCell[0] = 0;
        currentCell[1] = 0;
        currentCell[2] = 0;
        currentCell[3] = 0;

        printCell(currentCell);

        ArrayList<Integer[]> historicalCells = new ArrayList<Integer[]>();
        ArrayList<Integer> historicalButton = new ArrayList<Integer>();

        historicalCells.add(currentCell);

        while(true) {


            System.out.print("[ターン:" + historicalCells.size() + "] > ");
            String pushButton = scan.next();
            Integer pushButtonVal = Integer.parseInt(pushButton);

            if ((pushButtonVal >= 0) && (pushButtonVal < 4)) {

                Integer[] nextCell = calcNextCells(currentCell, pushButtonVal);
                if (isError(historicalCells, nextCell)) {
                    System.out.println("ERROR!");
                    continue;
                }
                historicalButton.add(pushButtonVal);
                historicalCells.add(nextCell);
                printCell(nextCell);
                currentCell = nextCell;

                if (historicalCells.size() == 15) {
                    System.out.println("終了");
                    for (Integer[] cell : historicalCells) {
                        printCell(cell);
                    }
                    System.exit(0);
                }

            } else if (pushButtonVal == -1) {
                // reset
                currentCell[0] = 0;
                currentCell[1] = 0;
                currentCell[2] = 0;
                currentCell[3] = 0;
                // reset history
                historicalCells.clear();
                System.out.println("リセットしました。");
                printCell(currentCell);
                historicalCells.add(currentCell);
            } else {
                System.err.println("誤った入力です。再入力しなさい。");
                continue;
            }
        }


    }
}
