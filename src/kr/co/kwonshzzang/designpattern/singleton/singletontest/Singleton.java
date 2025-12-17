package kr.co.kwonshzzang.designpattern.singleton.singletontest;

public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }

    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
