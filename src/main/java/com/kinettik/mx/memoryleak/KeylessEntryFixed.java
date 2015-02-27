package com.kinettik.mx.memoryleak;

import java.util.HashMap;
import java.util.Map;

class GoodKey {
    Integer id;

    GoodKey(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        boolean response = false;
        if (o instanceof GoodKey) {
            response = (((GoodKey) o).id).equals(this.id);
        }
        return response;
    }
}

public class KeylessEntryFixed {
    public static void main(String[] args) {
        Map<GoodKey, String> m = new HashMap<GoodKey, String>();
        while (true) {
            for (int i = 0; i < 10000; i++) {
                if (!m.containsKey(new GoodKey(i))) {
                    m.put(new GoodKey(i), "Number:" + i);
                }
            }
        }
    }
}
