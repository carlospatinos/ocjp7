package com.kinettik.mx.inheritance;

/**
 * In Base.foo() 
 * In Derived.bar()
 */
class Base {
    public static void foo(Base bObj) {
        System.out.println("In Base.foo()");
        bObj.bar();
    }

    public void bar() {
        System.out.println("In Base.bar()");
    }
}

class Derived extends Base {
    public static void foo(Base bObj) {
        System.out.println("In Derived.foo()");
        bObj.bar();
    }

    @Override
    public void bar() {
        System.out.println("In Derived.bar()");
    }
}

class OverrideTest {
    public static void main(String[] args) {
        Base bObj = new Derived();
        bObj.foo(bObj);
    }
}