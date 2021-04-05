package pl.jakubkrys.wzorce_projektowe.flower_shop;

public abstract class FlowerBouquet {

    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
