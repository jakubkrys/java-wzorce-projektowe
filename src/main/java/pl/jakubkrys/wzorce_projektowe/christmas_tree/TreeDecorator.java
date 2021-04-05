package pl.jakubkrys.wzorce_projektowe.christmas_tree;

public abstract class TreeDecorator implements ChristmasTree {

    ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate(){
        return christmasTree.decorate();
    }
}
