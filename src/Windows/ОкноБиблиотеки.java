package Windows;

import Controller.КонтроллерПросмотраБиблиотеки;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ОкноБиблиотеки extends JFrame {
    private КонтроллерПросмотраБиблиотеки контроллер;
    private JButton личныйКабинетButton;
    private JButton библиотекаButton;
    private JPanel Panel;
    private JButton поискButton;
    private JScrollBar scrollBar1;

    public ОкноБиблиотеки(){
        super("Библиотека");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Panel);
        this.pack();

        личныйКабинетButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame3 = new ОкноПрофиля();
                frame3.pack();
                frame3.setVisible(true);
            }
        });

    }


    void посмотретьКниги(){};
    void ОтсортироватьКниги(){};


}
