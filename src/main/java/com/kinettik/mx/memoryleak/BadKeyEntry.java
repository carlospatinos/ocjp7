
package com.kinettik.mx.memoryleak;

import java.util.HashMap;
import java.util.Map;

class BadKey {
    int id;

    BadKey(final Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class BadKeyEntry {
    public static void main(final String[] args) {
        final Map<BadKey, String> m = new HashMap<BadKey, String>();
        while (true) {
            for (int i = 0; i < 10000; i++) {
                if (!m.containsKey(new BadKey(i))) {
                    m.put(new BadKey(i), "Number:" + i);
                }
            }
        }
    }
}
