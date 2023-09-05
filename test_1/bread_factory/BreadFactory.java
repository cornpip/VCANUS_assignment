package test_1.bread_factory;

import test_1.bread.Bread;

public abstract class BreadFactory {
    public Bread newBread() {
        Bread bread = this.creatBread();
        bread.setType();
        bread.setRecipe();
        return bread;
    }

    abstract Bread creatBread();
}

