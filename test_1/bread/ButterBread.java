package test_1.bread;

import java.util.LinkedHashMap;

public class ButterBread extends Bread {

    @Override
    public void setType() {
        super.breadResult.breadType = "butter";
    }

    @Override
    public void setRecipe() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("flour", 100);
        map.put("water", 100);
        map.put("butter", 50);
        super.breadResult.recipe = map;
    }
}

