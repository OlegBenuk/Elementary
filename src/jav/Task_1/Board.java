package jav.Task_1;

class Board {
    private int width;
    private int height;
    private String element = "* ";


    Board(String[] args) {
        this.width = Integer.parseInt(args[0]);
        this.height = Integer.parseInt(args[1]);
    }

    int getWidth() {
        return width;

    }

    int getHeight() {
        return height;
    }

    String getElement() {
        return element;
    }
}
