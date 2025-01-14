package org.academiadecodigo.vimdiesels.grid;

import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGrid;


public class GridFactory {

    /**
     * Creates a new grid
     *
     * @param cols     the number of columns of the grid
     * @param rows     the number of rows of the grid
     * @return the new grid
     */

    public static SimpleGfxGrid makeGrid(int cols, int rows) {
        return new SimpleGfxGrid(cols, rows);

    }

}
