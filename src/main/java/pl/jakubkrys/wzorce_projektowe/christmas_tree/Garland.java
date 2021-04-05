package pl.jakubkrys.wzorce_projektowe.christmas_tree;

public class Garland extends TreeDecorator {

    public Garland(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}
