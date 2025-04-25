package org.example;

public class GameOfLife extends Matrix {

    //constructor to create board
    public GameOfLife(int rows, int cols) {
        super(rows, cols);
    }

    //add shape to the board. error arises if out of bounds
    public void addShape(Shape shape, int x, int y){
        int[][] shapeData = shape.getData();
        int[][] gameData = getData();

        if (x + shapeData.length > getRowCount() || y + shapeData[0].length > getColCount())
            throw new IllegalArgumentException("Shape out of bounds.");

        for (int i = 0; i < shapeData.length; i++){
            for (int j = 0; j < shapeData[0].length; j++){
                gameData[x + i][y + j] = shapeData[i][j];
            }
        }
        setData(gameData);
    }

    //lets the game move one step using conway rule
    public void step() {
        int[][] oldData = getData();
        int rows = getRowCount();
        int cols = getColCount();
        int[][] newData = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                int liveNeighbors = countLiveNeighbors(oldData, i, j);
                if (oldData[i][j] == 1){
                    newData[i][j] = (liveNeighbors == 2 || liveNeighbors == 3) ? 1 : 0;
                } else{
                    newData[i][j] = (liveNeighbors == 3) ? 1 : 0;
                }
            }
        }
        setData(newData);
    }

    //counts live neighbors of the cell at row, col.
    private int countLiveNeighbors(int[][] data, int row, int col){
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int r = row + i, c = col + j;
                if (i == 0 && j == 0) continue;
                if (r >= 0 && r < getRowCount() && c >= 0 && c < getColCount()) {
                    count += data[r][c];
                }
            }
        }
        return count;
    }
}
