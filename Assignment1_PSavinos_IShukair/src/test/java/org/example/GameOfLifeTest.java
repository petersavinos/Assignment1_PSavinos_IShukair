package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * <p>
 *     test for {@code GameOfLife}
 *     this confirms the correct pattern for the blinker
 *     after each evo step
 * </p>
 */
public class GameOfLifeTest {

    @Test
    public void testStepChanges(){
        GameOfLife game = new GameOfLife(5, 5);
        Shape blinker = new Shape("Blinker", new int[][]{
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0},
        });

        game.addShape(blinker, 0, 1);
        game.step();
        int[][] stateAfterOneStep = game.getData();

        assertEquals(1, stateAfterOneStep[1][1]);
        assertEquals(1, stateAfterOneStep[1][2]);
        assertEquals(1, stateAfterOneStep[1][3]);

        assertEquals(0, stateAfterOneStep[0][2]);
        assertEquals(0, stateAfterOneStep[2][2]);
    }


}
