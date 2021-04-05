package pl.jakubkrys.wzorce_projektowe.christmas_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChristmasTreeImplTest {

    @Test
    public void christmasTreeWithGarland() {
        ChristmasTreeImpl christmasTreeImpl = new ChristmasTreeImpl();

        ChristmasTree tree = new Garland(christmasTreeImpl);

        assertEquals(tree.decorate(), "Christmas tree with Garland");
    }

    @Test
    public void christmasTreeWithGarlandWithGarlandWithBubbleLights() {

        ChristmasTree tree = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));

        assertEquals(tree.decorate(), "Christmas tree with Garland with Garland with Bubble Lights");
    }
}