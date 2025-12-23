package kr.co.kwonshzzang.designpattern.builder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameBuilder extends Builder implements ActionListener {
    private final JFrame frame = new JFrame();
    private final Box box = new Box(BoxLayout.Y_AXIS);


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }

    @Override
    public void makeTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void makeString(String str) {
        box.add(new JLabel(str));
    }

    @Override
    public void makeItems(String[] items) {
        Box innerBox = new Box(BoxLayout.Y_AXIS);
        for (String item : items) {
            JButton button = new JButton(item);
            button.addActionListener(this);
            innerBox.add(button);
        }
        box.add(innerBox);
    }

    @Override
    public void close() {
        frame.getContentPane().add(box);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public JFrame getResult() {
        return frame;
    }

}
