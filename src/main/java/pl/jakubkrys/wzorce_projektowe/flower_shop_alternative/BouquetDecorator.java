package pl.jakubkrys.wzorce_projektowe.flower_shop_alternative;

public abstract class BouquetDecorator implements FlowerBouquet{

    FlowerBouquet flowerBouquet;

    public BouquetDecorator(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String decorate() {return flowerBouquet.decorate();}
}
