package com.zhigar.algoritm;

public class Detail {

    private Integer st1;
    private Integer st2;

    public Detail(Integer st1, Integer st2) {
        this.st1 = st1;
        this.st2 = st2;
    }

    public Integer getSt1() {
        return st1;
    }

    public Integer getSt2() {
        return st2;
    }

    @Override
    public String toString() {
        return st1.toString() + " " + st2.toString();
    }

}

