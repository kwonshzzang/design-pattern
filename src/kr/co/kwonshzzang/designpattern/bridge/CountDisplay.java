package kr.co.kwonshzzang.designpattern.bridge;

public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int timmes) {
        open();
        for (int i = 0; i < timmes; i++) {
            print();
        }
        close();
    }
}
