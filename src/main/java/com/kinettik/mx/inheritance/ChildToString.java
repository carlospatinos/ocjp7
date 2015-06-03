
package com.kinettik.mx.inheritance;

public class ChildToString extends ParentToString {
    /*
     * (non-Javadoc)
     * @see com.kinettik.mx.inheritance.ParentToString#toString()
     */
    @Override
    public String toString() {
        return "Noooo!! I dont want you dark";
    }

    public static void main(final String[] args) {
        final ParentToString p = new ChildToString();
        System.out.println(p);
    }
}
