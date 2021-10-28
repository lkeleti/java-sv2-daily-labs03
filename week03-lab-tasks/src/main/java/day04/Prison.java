package day04;

public class Prison {
    private boolean[] cells = new boolean[100];

    public Prison() {
        for (int i = 0; i < cells.length; i++){
            cells[i] = false;
        };
    }

    public void openFreeCells() {
        for (int day = 0; day < cells.length; day++)
        {
            for (int cell = 0; cell < cells.length; cell++) {
                if ((cell+1) % (day + 1)== 0) {
                    cells[cell] = !cells[cell];
                }
            }
        }
    }

    public boolean[] getCells() {
        return cells;
    }
}
