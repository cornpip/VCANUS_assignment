package test_1;

import test_1.bread.Bread;
import test_1.bread_factory.BreadFactory;
import test_1.bread_factory.ButterBreadFactory;
import test_1.bread_factory.CreamBreadFactory;
import test_1.bread_factory.SugarBreadFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BreadFactory[] factoryArray = {
                new CreamBreadFactory(),
                new SugarBreadFactory(),
                new ButterBreadFactory(),
        };

        ArrayList<Bread> breadList = new ArrayList<>();
        for (BreadFactory factory : factoryArray){
            breadList.add(factory.newBread());
        }

        for (Bread bread: breadList){
            System.out.println(bread.toString());
        }
    }
}

