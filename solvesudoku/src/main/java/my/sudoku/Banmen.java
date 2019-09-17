package my.sudoku;

public class Banmen {
    public int[][] val = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}};

    public Banmen() {
    }

    @Override
    public Banmen clone() {
        Banmen newBanmen = null;

        try {
            newBanmen = (Banmen)super.clone();
            for (int i=0; i < this.val.length; i++){
                System.arraycopy(this.val[i], 0, newBanmen.val[i], 0, this.val[i].length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newBanmen;
    }
}
