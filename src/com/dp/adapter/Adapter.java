package com.dp.adapter;

import com.dp.adapter_ext.AdaptedImplementation;


//Adapter using inheritance
public class Adapter extends AdaptedImplementation implements Standard {

    @Override
    public void someMethod(int nbr1, int nbr2) {
        int res = op2(nbr1, nbr2);
        op3(res);
    }
}
