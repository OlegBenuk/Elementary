package jav.Task_1;

class GenerateBoard {

    private int width;
    private int height;
    private String first;
    private String second;
    private String element;
    private StringBuilder sb = new StringBuilder();

    GenerateBoard(Board board) {
        this.width = board.getWidth();
        this.height = board.getHeight();
        this.element = board.getElement();
        generateStrings();

    }


    private void generateStrings() {
        int isEven = width % 2;
        int halfWidth = width / 2 + 1;
        for (int i = 0; i < halfWidth; i++) {
            sb.append(element);
        }
        first = sb.substring(0, sb.length() - 2 + isEven);
        second = sb.substring(1, sb.length() - 1 + isEven);
    }

    String returnsString() {
        sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) sb.append(first).append("\n");
            else sb.append(second).append("\n");
        }
        return sb.toString();
    }


}
