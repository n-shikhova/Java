import java.util.*;

public class Main {

    public static <K, V> Map<V, Collection<K>> inverse(Map<? extends K, ? extends V> map){
        Map<V, Collection<K>> resultMap = new HashMap<>();

        Set<K> keys = (Set<K>) map.keySet();
        for(K key : keys){
            V value = map.get(key);
            Set<K> set = (Set<K>) resultMap.get(value);
            if(set == null){
                set = new HashSet<K>();
                resultMap.put(value, set);
            }
            set.add(key);
        }

        return resultMap;
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "один");
        map.put(2, "два");
        map.put(4, "один");
        map.put(3, "три");

        System.out.println(inverse(map));
    }
}
