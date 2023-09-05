package test_1.bread_factory;

import test_1.bread.Bread;
import test_1.bread.SugarBread;

public class SugarBreadFactory extends BreadFactory {
    @Override
    Bread creatBread() {
        return new SugarBread();
    }
}

