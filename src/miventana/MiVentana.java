package miventana;

import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame{
    
    public MiVentana(String titulo) {
        super (titulo);
        setSize(400, 300);
        setLayout(new FlowLayout());
        setLayout(new BorderLayout());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel miPanel = new JPanel();
        miPanel.setLayout(new FlowLayout());
        add(miPanel, BorderLayout.CENTER);
        
        for (int i = 0; i < 10; i++) {
            miPanel.add(new JButton("Boton" + i));
            add(new JTextField("Texto"), BorderLayout.NORTH);
            add(new JCheckBox("CheckBox"), BorderLayout.SOUTH);
        }
        setVisible(true);
    }
    public static void main(String[] args) {
        MiVentana myWin = new MiVentana("My Window");       
    }
    
}
