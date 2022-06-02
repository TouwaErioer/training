package leetcode.problem;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description LRU 缓存机制 - https://leetcode-cn.com/problems/lru-cache/
 * @Author dohongyu
 * @Data 2021/9/22 17:18
 **/
class LRUCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;
    private Map<Integer, Integer> map = new LinkedHashMap<>();  // 保持插入顺序

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int value = map.get(key);
            // 保证每次操作后，元素都在末尾
            map.remove(key);
            map.put(key, value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
        } else if (map.size() == capacity) {
            // 删除第一个元素
            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
            iterator.next();
            iterator.remove();
        }
        map.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1); // 1 -> 1
        lruCache.put(2, 2); // 2 -> 2 , 1 -> 1
        lruCache.get(1);    // 1 -> 1 , 2 -> 2
        lruCache.put(3, 3); // 3 -> 3 , 1 -> 1
        System.out.println(lruCache.get(2)); // -1
    }
}
