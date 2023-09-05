package test_1.bread_factory;

import test_1.bread.Bread;
import test_1.bread.CreamBread;

public class CreamBreadFactory extends BreadFactory {
    @Override
    Bread creatBread() {
        return new CreamBread();
    }
}

