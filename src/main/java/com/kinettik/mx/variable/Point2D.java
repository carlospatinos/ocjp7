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
package com.kinettik.mx.variable;

class Point2D {
    private int x, y;

    public Point2D(int x, int y) {
        x = x;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    public static void main(String[] args) {
        Point2D point = new Point2D(10, 20);
        System.out.println(point);
    }
}