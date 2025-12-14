package kr.co.kwonshzzang.designpattern.templatemethod;

public abstract class AbstractDisplay {
    public abstract void open();  // 하위클래스에 구현을 맡기는 추상 메소드(1) open
    public abstract void print(); // 하위클래스에 구현을 맡기는 추상 메소드(2) print
    public abstract void close(); // 하위클래스에 구현을 맡기는 추상 메소드(3) close

    public final void display() {
        open();                        // 우선 open하고...
        for (int i = 0; i < 5; i++) {  // 5번 print 반복하고....
            print();
        }
        close();                       //.. 마지믹으로 close한다. 이것이 display 메소드에서 구현되고 있는 내용.
    }
}
