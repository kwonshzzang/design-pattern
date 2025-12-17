package kr.co.kwonshzzang.designpattern.singleton.singletontest;

public class Main extends Thread {
    public Main(String name) {
        super(name);
    }
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(getName() + ": " + singleton);
    }

    public static void main(String[] args) {
        System.out.println("Start......");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        System.out.println("End........");
    }
}
