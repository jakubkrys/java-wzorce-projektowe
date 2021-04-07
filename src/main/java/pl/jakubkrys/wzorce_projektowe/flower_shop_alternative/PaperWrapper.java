package pl.jakubkrys.wzorce_projektowe.flower_shop_alternative;

public class PaperWrapper extends BouquetDecorator {

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        super(flowerBouquet);
    }

    public String decorate() {
        return super.decorate() + decorateWithPaperWrapper();
    }

    private String decorateWithPaperWrapper() {
        return " with Paper Wrapper";
    }
}
