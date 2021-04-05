package pl.jakubkrys.wzorce_projektowe.flower_shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlowerBouquetTest {

    @Test
    public void roseBouquetWithNoDecoration() {
        FlowerBouquet roseBouquet = new RoseBouquet();
        assertEquals("Rose bouquet $ 12.0",roseBouquet.getDescription() + " $ " + roseBouquet.cost());
    }

    @Test
    public void roseBouquetWithPaperWrapperRibbonBowGlitter() {
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBow(decoratedRoseBouquet);
        decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);
        assertEquals("Rose bouquet, paper wrap, ribbon bow, glitter $ 25.5",decoratedRoseBouquet.getDescription() + " $ " + decoratedRoseBouquet.cost());
    }

    @Test
    public void orchidBouquetWithDoublePaperWrapperRibbonBow() {
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet=new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet=new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet=new RibbonBow(decoratedOrchidBouquet);
        assertEquals("Orchid bouquet, paper wrap, paper wrap, ribbon bow $ 41.5",decoratedOrchidBouquet.getDescription() + " $ " + decoratedOrchidBouquet.cost());
    }
}
