package kr.co.kwonshzzang.designpattern.singleton.ticket;

public class TicketMaker {
    private static final TicketMaker instance = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return instance;
    }

    public synchronized int getNexTicketNumber() {
        return ticket++;
    }

}
