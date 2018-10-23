package com.dp.singleton;

public class Singleton {
    private static Singleton ourInstance = new Singleton();
    private int counter;
    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
        System.out.println(" ************  Instanciation of Singleton  ***************");

    }

    public void someMethod(String taskName){
        System.out.println("Begining of Method ..... for "+ taskName);
        for(int i=0;i<5;i++){
            synchronized (this){
                ++counter;
            }
            System.out.println(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of Method ..... for "+ taskName+"  counter = "+ counter);

    }

}
