
package com.kinettik.mx.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMethod {
    public Map getFlowsFromSomewhere(final Map<String, String> originalMap, final String defaultValue) {
        Map modifiedMap = new HashMap<String, String>();
        modifiedMap.putAll(originalMap);
        if (defaultValue != null && defaultValue.equals("A")) {
            if (originalMap != null) {
                originalMap.put("DEFAULT", "X");
            } else {
                modifiedMap = new HashMap<String, String>();
                originalMap.put("DEFAULT", "X");
            }
        } else {
            if (originalMap != null) {
                originalMap.put("DEFAULT", "y");
            } else {
                modifiedMap = new HashMap<String, String>();
                originalMap.put("DEFAULT", "y");
            }
        }
        return modifiedMap;
    }
}
