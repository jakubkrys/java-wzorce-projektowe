package pl.jakubkrys.wzorce_projektowe.christmas_tree;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
