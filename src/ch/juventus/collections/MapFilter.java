package ch.juventus.collections;

import java.util.Iterator;
import java.util.Map;

public class MapFilter<K, V> {
    public Map<K, V> cleanup(Map<K, V> map, V value) {
        map.entrySet().removeIf(entry -> !entry.getValue().equals(value));
        return map;
    }
}
