package org.example;

public class Assignment {
    public void simple() {
        int x = 5;
        System.out.println(x);
        base();
        int y = x - 5;
        r(y);
    }

    public void base(){}

    public void r(int a) {
        System.out.println(a);
    }
}
