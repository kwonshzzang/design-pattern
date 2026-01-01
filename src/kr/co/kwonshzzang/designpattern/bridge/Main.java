package kr.co.kwonshzzang.designpattern.bridge;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea!"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World!"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe!"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

        System.out.println("=============================================");
        RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello, Korea.!!"));
        d4.randomDisplay(10);

        System.out.println("=============================================");
        CountDisplay d5 = new CountDisplay(new FileDisplayImpl("star.txt"));
        d5.multiDisplay(3);

        System.out.println("=============================================");
        IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        d6.increaseDisplay(4);

        System.out.println("=============================================");
        IncreaseDisplay d7 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 1);
        d7.increaseDisplay(6);
    }
}
