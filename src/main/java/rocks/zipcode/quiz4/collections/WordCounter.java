package rocks.zipcode.quiz4.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordCounter {
    HashMap<String,Integer> map = new HashMap<>();

    public WordCounter(String... strings) {
           for(String e : strings){
               Integer count = (map.containsKey(e)) ? map.get(e) + 1 : 1;
               map.put(e,count);
           }
    }

    public Map<String, Integer> getWordCountMap() {
        return map;
    }
}
