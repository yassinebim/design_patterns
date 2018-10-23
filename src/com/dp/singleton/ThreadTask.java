package com.dp.singleton;

public class ThreadTask extends Thread{

    private String taskName;

    public ThreadTask(String taskName){
        this.taskName = taskName;
    }

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        singleton.someMethod(taskName);
    }
}
