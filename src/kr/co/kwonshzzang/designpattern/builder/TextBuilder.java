package kr.co.kwonshzzang.designpattern.builder;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();            // 필드의 문서를 구축한다.

    @Override
    public void makeTitle(String title) {                        // 일반 텍스트의 제목
        buffer.append("==============================\n");       // 장식선
        buffer.append("* ").append(title).append(" * \n");        // ** 사용한 타이틀
        buffer.append("\n");                                     // 빈 행
    }

    @Override
    public void makeString(String str) {                         // 일반 텍스트에서의 문자열
        buffer.append("- ").append(str).append("\n");            // - 글머리 기호 붙은 문자열
        buffer.append("\n");                                     // 빈행
    }

    @Override
    public void makeItems(String[] items) {                      // 일반 텍스트의 개별항목
        for(String item : items) {
            buffer.append(" # ").append(item).append("\n");       // # 글머리 기호 붙은 항목
        }
        buffer.append("\n");                                     // 빈행
    }

    @Override
    public void close() {                                        // 문서의 완성
        buffer.append("==============================\n");       // 장식선
    }

    public String getResult() {                                  // 완성된 문서
        return buffer.toString();                                // StringBuffer를 String으로 변환
    }
}
