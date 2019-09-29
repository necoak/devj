import java.util.Random;

public class SolveMontyHall {

    public static void main(String[] args) {
	// write your code here
        System.out.println("モンティ・ホール問題のシミュレーションをします");

        int simulateNum = 100;
        int totyuPrintNum = 10;

        // プログラム引数で試行回数と途中出力の単位を設定する
        if (args.length >= 2) {
            simulateNum = Integer.parseInt(args[0]);
            totyuPrintNum = Integer.parseInt(args[1]);
        }

        System.out.println(String.format("試行回数:%d, 途中出力:%d", simulateNum, totyuPrintNum));

        simulate(simulateNum, totyuPrintNum);
    }

    // 規定回数の試行
    static void simulate(int simulateNum, int totyuPrintNum) {
        String[] simulateResult = new String[simulateNum];
        int countApattern = 0, countBpattern = 0;

        for(int i=0; i<simulateNum; i++) {
            String result = simulate1();
            if (result.equals("A")) {
                countApattern++;
            } else {
                countBpattern++;
            }
            if (i % totyuPrintNum ==0 && i != 0) {
                printResult(i, countApattern, countBpattern);
            }
        }
        printResult(simulateNum, countApattern, countBpattern);

    }

    static void printResult(int simulateNum, int countApattern, int countBpattern) {
        System.out.println(String.format("%d, %d, %.2f%%, %d, %.2f%%",
                simulateNum, countApattern, countApattern * 100.0 / simulateNum,
                countBpattern , countBpattern * 100.0 / simulateNum));
    }

    // 試行1回のシミュレート
    static String simulate1() {
        Boolean[] doors = new Boolean[3];
        Random random = new Random();

        int atariIndx = random.nextInt(3);
        doors[atariIndx] = true;

        // 3つ選択肢のうち1つを選択する(Aパターン)
        int selectIndxPatternA = random.nextInt(3);

        // Aパターンで当たっていれば当たりはA、そうでなければBパターン
        if (selectIndxPatternA == atariIndx) {
            return "A";
        } else {
            return "B";
        }
    }
}
