package test_1.bread;

import java.util.LinkedHashMap;

public class CreamBread extends Bread {

    @Override
    public void setType() {
        super.breadResult.breadType = "cream";
    }

    @Override
    public void setRecipe() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("flour", 100);
        map.put("water", 100);
        map.put("cream", 200);
        super.breadResult.recipe = map;
    }
}

