package org.academiadecodigo.vimdiesels.grid.position;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.GridColor;
import org.academiadecodigo.vimdiesels.grid.GridDirection;

/**
 * Base skeleton for a grid position
 *
 * @see GridPosition
 */
public abstract class AbstractGridPosition implements GridPosition {

    private int col;
    private int row;
    private GridColor color;
    private Grid grid;
    private Picture picture;

    /**
     * Construct a new grid position at a specific column and row
     *
     * @param col  the column of the grid position
     * @param row  the row of the grid position
     * @param grid the grid in which the position will be displayed
     */
    public AbstractGridPosition(int col, int row, Grid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;
        this.color = GridColor.NO_COLOR;
    }


    /**
     * @see GridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        this.color = color;
    }

    public Grid getGrid() {
        return grid;
    }


    /**
     * @see GridPosition#getCol()
     */
    @Override
    public int getCol() {
        return col;
    }

    /**
     * @see GridPosition#getRow()
     */
    @Override
    public int getRow() {
        return row;
    }

    /**
     * @see GridPosition#getColor()
     */
    @Override
    public GridColor getColor() {
        return color;
    }

    /**
     * @see GridPosition#moveTo(int, int)
     */
    @Override
    public void moveTo(int col, int row) {
        this.col = col;
        this.row = row;
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        switch (direction) {

            case UP:
                moveUp(distance);
                break;
            case DOWN:
                moveDown(distance);
                break;
            case LEFT:
                moveLeft(distance);
                break;
            case RIGHT:
                moveRight(distance);
                break;
        }

    }

    /**
     * @see GridPosition#equals(GridPosition)
     */
    @Override
    public boolean equals(GridPosition pos) {
        return this.col == pos.getCol() && this.row == pos.getRow();
    }

    private void moveUp(int dist) {
        int maxRowsUp = Math.min(dist, getRow());
        moveTo(getCol(), getRow() - maxRowsUp);
    }

    private void moveDown(int dist) {
        int maxRowsDown = Math.min(getGrid().getRows() - (getRow() + 1), dist);
        moveTo(getCol(), getRow() + maxRowsDown);
    }

    private void moveLeft(int dist) {
        int maxRowsLeft = Math.min(dist, getCol());
        moveTo(getCol() - maxRowsLeft, getRow());
    }

    private void moveRight(int dist) {
        int maxRowsRight = Math.min(getGrid().getCols() - (getCol() + 1), dist);
        moveTo(getCol() + maxRowsRight, getRow());
    }

    @Override
    public String toString() {
        return "GridPosition{" +
                "col=" + col +
                ", row=" + row +
                ", getColor=" + color +
                '}';
    }



}
