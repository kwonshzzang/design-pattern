package kr.co.kwonshzzang.designpattern.abstractfactory.tablefactory;

import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Factory;
import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Link;
import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Page;
import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String caption, String author) {
        return new TablePage(caption, author);
    }
}
