package com.kinettik.mx.memoryleak;

import java.util.HashMap;
import java.util.Map;

class Key {
    Integer id;

    Key(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

public class KeylessEntry {
    public static void main(String[] args) {
        Map<Key, String> m = new HashMap<Key, String>();
        while (true) {
            for (int i = 0; i < 10000; i++) {
                if (!m.containsKey(new Key(i))) {
                    m.put(new Key(i), "Number:" + i);
                }
            }
        }
    }
}