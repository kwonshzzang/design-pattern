package kr.co.kwonshzzang.designpattern.abstractfactory.listfactory;

import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Factory;
import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Link;
import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Page;
import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String caption, String author) {
        return new ListPage(caption, author);
    }
}
