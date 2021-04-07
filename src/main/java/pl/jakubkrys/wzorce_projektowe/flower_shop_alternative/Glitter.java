package pl.jakubkrys.wzorce_projektowe.flower_shop_alternative;

public class Glitter extends BouquetDecorator {

    public Glitter(FlowerBouquet flowerBouquet) {
        super(flowerBouquet);
    }

    public String decorate() {
        return super.decorate() + decorateWithGlitter();
    }

    private String decorateWithGlitter() {
        return " with Glitter";
    }
}
