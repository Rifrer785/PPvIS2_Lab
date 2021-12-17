package Windows;

import Controller.КонтроллерАвторизации;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ОкноАвторизации extends JFrame {
    private КонтроллерАвторизации контроллер;
    private JTextField textField1;
    private JPanel panel1;
    private JButton button1;
    private JLabel Логин;
    private JPasswordField passwordField1;

    public ОкноАвторизации(){
        super("Окно авторизации");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        this.setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame frame2 = new ОкноБиблиотеки();
                frame2.pack();
                frame2.setVisible(true);
            }
        });
    }

    void ввестиЛогин(){};
    void ввестиПароль(){};

    public static void main(String[] args) {
        JFrame frame = new ОкноАвторизации();
    }
}
