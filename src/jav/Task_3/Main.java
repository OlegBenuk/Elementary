package jav.Task_3;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        String lineConsole = new ScanConsole().scanConsole();
        ParseLine parseLine = new ParseLine(lineConsole);
        Triangle triangle = parseLine.createTriangle();


        Map<String, Double> triangleTreeMap = new TreeMap<>();
        triangleTreeMap.put(triangle.getName(),triangle.getSquare());
        triangleTreeMap.entrySet();
        for(Map.Entry<String, Double> m:triangleTreeMap.entrySet())
            System.out.println(m.getKey()+" "+m.getValue());

        AddToMap addToMap = new AddToMap(parseLine.createTriangle());


    }
}
