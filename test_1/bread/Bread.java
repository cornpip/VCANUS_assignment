package test_1.bread;

import test_1.bread_obj.BreadResult;

import java.util.Map;

public abstract class Bread {
    BreadResult breadResult = new BreadResult();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("breadType : ").append(breadResult.breadType).append("\n");
        sb.append("recipe\n");
        for (Map.Entry<String, Integer> entry : breadResult.recipe.entrySet()) {
            sb.append(entry.getKey()).append(": ");
            sb.append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public abstract void setType();

    public abstract void setRecipe();
}

