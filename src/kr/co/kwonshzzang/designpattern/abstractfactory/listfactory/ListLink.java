package kr.co.kwonshzzang.designpattern.abstractfactory.listfactory;

import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Link;

public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href = \"" + url + "\">" + caption + "</a></li>\n";
    }
}
