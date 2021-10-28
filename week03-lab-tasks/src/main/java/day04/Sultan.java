package day04;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison();
        prison.openFreeCells();

        boolean[] cells = prison.getCells();
        for (int i = 0; i < cells.length; i++) {
            if (cells[i]) {
                System.out.println((i+1) + " sorszámú cella nyitva van.");
            }
        }
    }
}
