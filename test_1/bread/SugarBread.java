package test_1.bread;

import java.util.LinkedHashMap;

public class SugarBread extends Bread {

    @Override
    public void setType() {
        super.breadResult.breadType = "sugar";
    }

    @Override
    public void setRecipe() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("flour", 100);
        map.put("water", 50);
        map.put("sugar", 200);
        super.breadResult.recipe = map;
    }
}

