package kr.co.kwonshzzang.designpattern.singleton.ticket;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start......");
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " : " + TicketMaker.getInstance().getNexTicketNumber());
        }
        System.out.println("End........");

    }
}
