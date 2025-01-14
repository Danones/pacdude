package org.academiadecodigo.vimdiesels.grid.position;

import org.academiadecodigo.vimdiesels.grid.GridColor;
import org.academiadecodigo.vimdiesels.grid.GridDirection;

/**
 * A position on the grid that is capable of moving around
 */
public interface GridPosition {

    /**
     * Gets the position column in the grid
     *
     * @return the position column
     */
    int getCol();

    /**
     * Gets the position row in the grid
     *
     * @return the position row
     */
    int getRow();

    /**
     * Updates the position column and row
     *
     * @param col the new position column
     * @param row the new position row
     */
    void moveTo(int col, int row);

    /**
     * Gets the position color
     *
     * @return the position color
     */
    GridColor getColor();

    /**
     * Changes the color of this grid position
     *
     * @param color the new position
     */
    void setColor(GridColor color);


    /**
     * Moves this grid position towards a specified direction
     *
     * @param direction the direction to move to
     * @param distance  the number of positions to move
     */
    void moveInDirection(GridDirection direction, int distance);

    /**
     * Tests equality with another position
     *
     * @param position the position to test against
     * @return true if positions are equal
     */
    boolean equals(GridPosition position);

}
