package Windows;

import Controller.КонтроллерПользователя;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ОкноПрофиля extends JFrame{
    private КонтроллерПользователя контроллер;
    private JTextArea никнеймTextArea;
    private JTextArea фамилияTextArea;
    private JTextArea имяTextArea;
    private JTextArea отчествоTextArea;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JScrollBar scrollBar1;
    private JPanel Panel;
    private JButton создатьКоллекциюButton;

    public ОкноПрофиля(){
        super("Личный кабинет");

        this.setContentPane(Panel);
        this.pack();
        this.setVisible(true);
    }

    void посмотретьКоллекции(){};
    void посмотретьИмя(){};
    void посмотретьНикнейм(){};
    void посмотретьФамилию(){};
    void посмотретьПрава(){};
}
