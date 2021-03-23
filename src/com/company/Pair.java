package com.company;

public class Pair implements Comparable<Pair>{
    int a, b;

    public Pair() {
    }

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Pair o) {
        if(a == o.a){
            return Integer.compare(b, o.b);
        }
        return Integer.compare(a, o.a);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
