package com.dp.adapter;

public class StandardImpl implements Standard {
    @Override
    public void someMethod(int nbr1, int nbr2) {
        System.out.println("Standard implementation result "+ nbr1*nbr2);
    }
}
