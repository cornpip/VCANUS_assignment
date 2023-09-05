package test_1.bread_factory;

import test_1.bread.Bread;
import test_1.bread.ButterBread;

public class ButterBreadFactory extends BreadFactory {
    @Override
    Bread creatBread() {
        return new ButterBread();
    }
}