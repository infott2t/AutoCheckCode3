package org.example.swinggui.v2;

import javax.swing.*;
import java.awt.*;

public class QueryYNScreen extends JFrame{

    private JPanel jp1;
    private JLabel jl1,jl2,jl3;
    private JTextField jtf1, jtf2, jtf3;
    private JTextArea jta1, jta2, jta3;
    private JScrollPane jsp1,jsp2,jsp3;
    private JButton btn1,btn2,btn3;
    public QueryYNScreen(UtilSysV2 usv2) {
        jp1=new JPanel();
        jl1 = new JLabel("Saving... *"+usv2.queryYNScreenStr1+ "*\n");
        jl2 = new JLabel("... Input File Name : ");
        jtf1 = new JTextField(20);
        btn1 = new JButton("Ok");
        btn2 = new JButton("Cancel");

        //jp1.add(jsp1);
        //jp1.add(btn1);
        jp1.add(jl1);
        jp1.add(jl2);
        jp1.add(jtf1);
        jp1.add(btn1);
        jp1.add(btn2);

        setTitle("?. File Save ***" + usv2.queryYNScreenStr1);

        setVisible(true);
        setResizable(true);
        add(jp1);
        setBounds(150,100,620,200);
        jtf1.setText("");
    }
}
