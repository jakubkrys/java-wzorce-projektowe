package pl.jakubkrys.wzorce_projektowe.flower_shop_alternative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoseBouquetTest {

    @Test
    public void roseBouquetWithGlitter() {
        RoseBouquet roseBouquet = new RoseBouquet();

        FlowerBouquet bouquet = new Glitter(roseBouquet);

        assertEquals(bouquet.decorate(), "Rose bouquet with Glitter");
    }

    @Test
    public void roseBouquetWithRibbonBow() {
        RoseBouquet roseBouquet = new RoseBouquet();

        FlowerBouquet bouquet = new RibbonBow(roseBouquet);

        assertEquals(bouquet.decorate(), "Rose bouquet with Ribbon Bow");
    }
}




