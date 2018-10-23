package com.dp;

import com.dp.singleton.Singleton;
import com.dp.singleton.ThreadTask;

public class Main {

    public static void main(String[] args) {

        // ***********************  Singleton ************************
        for(int i=1;i<=5;i++) {
            ThreadTask threadTask= new ThreadTask("Task "+ i);
            threadTask.start();
        }
    }
}
