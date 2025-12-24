package kr.co.kwonshzzang.designpattern.abstractfactory.factory;

public abstract class Factory {

    public static Factory getFactory(String classname) {
        Factory factory = null;

        try {
               Class<?> factoryClass =  Class.forName(classname);
               factory = (Factory)factoryClass.getConstructor(null).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("클래스 " + classname + " 이 발견되지 않습니다.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String caption, String author);
}
