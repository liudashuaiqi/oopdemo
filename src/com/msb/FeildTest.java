package com.msb;

import java.util.Objects;

public class FeildTest {
    int a ;
    public static void main(String[] args) {
        //22.00
        System.out.println(1);
        System.out.println(2);
        int b;
        A a = new A();
        System.out.println(a.hashCode());
        A sss = a;
        System.out.println(sss.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeildTest feildTest = (FeildTest) o;
        return a == feildTest.a;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a);
    }
}
