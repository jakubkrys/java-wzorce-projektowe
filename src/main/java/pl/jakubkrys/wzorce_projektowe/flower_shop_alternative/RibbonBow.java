package pl.jakubkrys.wzorce_projektowe.flower_shop_alternative;

public class RibbonBow extends BouquetDecorator {

    public RibbonBow(FlowerBouquet flowerBouquet) {
        super(flowerBouquet);
    }

    public String decorate() {
        return super.decorate() + decorateWithRibbonBow();
    }

    private String decorateWithRibbonBow() {
        return " with Ribbon Bow";
    }
}
