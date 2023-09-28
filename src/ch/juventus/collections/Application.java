package ch.juventus.collections;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Test1");
        map.put(2, "Test2");
        map.put(3, "Test3");
        map.put(4, "Test4");
        map.put(5, "Test1");

        MapFilter<Integer, String> mapFilter = new MapFilter<>();
        Map<Integer, String> filteredMap = mapFilter.cleanup(map, "Test1");

        filteredMap.forEach((i, s) -> System.out.println("Key=" + i + ", Value=" + s));
    }
}
