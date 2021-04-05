package pl.jakubkrys.wzorce_projektowe.christmas_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChristmasTreeTest {

    @Test
    public void christmasTreeWithGarland() {
        ChristmasTreeImpl christmasTreeImpl = new ChristmasTreeImpl();

        ChristmasTree tree1 = new Garland(christmasTreeImpl);

        assertEquals(tree1.decorate(), "Christmas tree with Garland");
    }

    @Test
    public void christmasTreeWithGarlandWithGarlandWithBubbleLights() {


        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));

        assertEquals(tree2.decorate(), "Christmas tree with Garland with Garland with Bubble Lights");
    }
}