package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameOfLifeTest {

    @Test
    public void testStepChanges(){
        GameOfLife game = new GameOfLife(5, 5);
        shape blinker = new Shape("Blinker", new int[][]{
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0},
        });

        game.addShape(blinker, 1, 1);
        game.stop();
        int[][] stateAfterOneStep = game.getData();

        assertEquals(1, stateAfterOneStep[2][1]);
        assertEquals(1, stateAfterOneStep[2][1]);

    }


}
