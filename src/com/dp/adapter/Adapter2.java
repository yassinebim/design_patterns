package com.dp.adapter;

import com.dp.adapter_ext.AdaptedImplementation;

//Adapter by composition
public class Adapter2 implements Standard {
    private AdaptedImplementation adapted = new AdaptedImplementation();
    @Override
    public void someMethod(int nbr1, int nbr2) {
        int res = adapted.op2(nbr1, nbr2);
        adapted.op3(res);
    }
}
