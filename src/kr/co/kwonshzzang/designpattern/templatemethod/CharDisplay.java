package kr.co.kwonshzzang.designpattern.templatemethod;

public class CharDisplay extends AbstractDisplay{          // CharDisplay는 AbstractDisplay의 하위 클래스
    private char ch;                                       // 표시해야 할 문자

    public CharDisplay(char ch) {                          // 생성자에서 전달된 문자 ch를 필드에 기억해 둔다.
        this.ch = ch;
    }

    @Override
    public void open() {                                   // 상위클래스에서는 추상메소드였다.
        System.out.print("<<");                            // 여기에서 오버라이드해서 구현한다.
    }                                                      // 개시 문자열 "<<"을 표시한다.

    @Override
    public void print() {                                  // print 메소드도 여기에서 구현한다.
        System.out.print(ch);                              // 이것이 display에서 반복해서 호출된다.
    }                                                      // 필드에 기억해 둔 문자를 1개 표시한다.

    @Override
    public void close() {                                  // close 메소드도 여기에서 구현한다.
        System.out.println(">>");                            // 종료 문자열 ">>"을 표시한다. s
    }
}
