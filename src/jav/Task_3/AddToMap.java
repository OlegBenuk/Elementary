package jav.Task_3;

import java.util.Map;
import java.util.TreeMap;

public class AddToMap {
    Triangle triangle;
    static Map<String, Double> triangleTreeMap = new TreeMap<>();

    public AddToMap(Triangle triangle) {
        this.triangle = triangle;
        addToMap();
    }

    private void addToMap() {
        triangleTreeMap.put(triangle.getName(), triangle.getSquare());
    }


}
