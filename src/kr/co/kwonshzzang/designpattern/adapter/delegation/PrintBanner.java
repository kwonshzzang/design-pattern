package kr.co.kwonshzzang.designpattern.adapter.delegation;

public class PrintBanner extends Print {
    private final Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }
}
