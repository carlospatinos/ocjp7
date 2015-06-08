
package com.kinettik.mx.memoryleak;

import java.util.HashMap;
import java.util.Map;

class SimpleKey {
    int id;

    SimpleKey(final Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class SimpleKeyEntry {
    final Map<SimpleKey, String> map = new HashMap<SimpleKey, String>();

    public void addValueToMyMap(final int i) {
        if (!map.containsKey(new SimpleKey(i))) {
            map.put(new SimpleKey(i), "Importnant Number:" + i);
        }
    }

    // Other methods to get information from the map
}
