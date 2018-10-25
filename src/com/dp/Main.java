package com.dp;

import com.dp.adapter.Adapter;
import com.dp.adapter.Adapter2;
import com.dp.adapter.Standard;
import com.dp.adapter.StandardImpl;
import com.dp.singleton.Singleton;
import com.dp.singleton.ThreadTask;

public class Main {

    public static void main(String[] args) {

        // ***********************  Singleton ************************
//        for(int i=1;i<=5;i++) {
//            ThreadTask threadTask= new ThreadTask("Task "+ i);
//            threadTask.start();
//        }
        // ***********************  End of Singleton ************************


        // ***********************  Adapter ************************
        Standard standard = new StandardImpl();
        standard.someMethod(5,4);

        Standard standard1 = new Adapter();
        standard1.someMethod(5,4);

        Standard standard2 = new Adapter2();
        standard2.someMethod(5,4);

    }
}
