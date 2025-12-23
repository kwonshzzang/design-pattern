package kr.co.kwonshzzang.designpattern.builder.itf;

public class Director {
    private final Builder builder;
    public Director(Builder builder) {          // Builder의 하위 클래스의 인스턴스가 주어지므로
        this.builder = builder;                 // builder 필드에 저장해둔다.
    }

    public void construct() {                   // 문서구축
        builder.makeTitle("Greeting");          // 타이틀

        builder.makeString("아침과 낮에");      // 문자열
        builder.makeItems(new String[] {        // 개별항목
                "좋은 아침입니다.",
                "안녕하세요.",
        });

        builder.makeString("밤에");             // 별도의 문자열
        builder.makeItems(new String[] {        // 개별항목
                "안녕하세요.",
                "안녕히 주무세요.",
                "안녕히 계세요.",
        });

        builder.close();                        // 문서를 완성시킨다.
    }
}
