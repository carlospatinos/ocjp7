/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.kinettik.mx.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMethod {
    public Map getFlowsFromSomewhere(final Map<String, String> originalMap, String defaultValue) {
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
