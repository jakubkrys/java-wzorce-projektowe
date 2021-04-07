package pl.jakubkrys.wzorce_projektowe.flower_shop_alternative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrchidBouquetTest {

    @Test
    public void orchidBouquetWithPaperWrapper() {
        OrchidBouquet orchidBouquet = new OrchidBouquet();

        FlowerBouquet bouquet = new PaperWrapper(orchidBouquet);

        assertEquals(bouquet.decorate(), "Orchid bouquet with Paper Wrapper");
    }

    @Test
    public void roseBouquetWithRibbonBowWithPaperWrapperWithGlitter() {
        OrchidBouquet orchidBouquet = new OrchidBouquet();

        FlowerBouquet bouquet = new Glitter(new PaperWrapper(new RibbonBow(orchidBouquet)));

        assertEquals(bouquet.decorate(), "Orchid bouquet with Ribbon Bow with Paper Wrapper with Glitter");
    }
}
