package test_1.bread_obj;

import java.util.LinkedHashMap;
import java.util.Map;

public class BreadResult {
    public String breadType;
    public Map<String, Integer> recipe;

    public BreadResult(){
        this.breadType = "";
        this.recipe = new LinkedHashMap<>();
    }
}
