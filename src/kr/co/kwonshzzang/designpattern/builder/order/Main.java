package kr.co.kwonshzzang.designpattern.builder.order;

import kr.co.kwonshzzang.designpattern.builder.Director;
import kr.co.kwonshzzang.designpattern.builder.HTMLBuilder;
import kr.co.kwonshzzang.designpattern.builder.TextBuilder;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1) {
            usage();
            System.exit(0);

        }

        if(args[0].equals("plain")) {
            kr.co.kwonshzzang.designpattern.builder.TextBuilder textBuilder = new TextBuilder();
            kr.co.kwonshzzang.designpattern.builder.Director director = new kr.co.kwonshzzang.designpattern.builder.Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if(args[0].equals("html")) {
            kr.co.kwonshzzang.designpattern.builder.HTMLBuilder htmlBuilder = new HTMLBuilder();
            kr.co.kwonshzzang.designpattern.builder.Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "가 작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main plain 일반 텍스트 문서작성");
        System.out.println("Usage: java Main html   HTML 파일로 문서작성");
    }
}
