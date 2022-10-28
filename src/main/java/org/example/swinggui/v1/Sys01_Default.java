package org.example.swinggui.v1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sys01_Default extends JFrame {

    private JPanel jp1;
    private JLabel jl1,jl2,jl3;
    private JTextField jtf1, jtf2, jtf3;
    private JTextArea jta1, jta2, jta3;
    private JScrollPane jsp1,jsp2,jsp3;
    private JButton btn1,btn2,btn3;

    static UtilSysV1 usv1;

    Sys01_Default(){
        jp1=new JPanel();
        jl1 = new JLabel("Title...");
        jl2 = new JLabel("?");
        jtf1 = new JTextField(20);
        jl3 = new JLabel("설명을 적어주세요. ...");
        jta1 = new JTextArea(5,20);
        jsp1 = new JScrollPane(jta1);
        jsp1.setPreferredSize(new Dimension(300,200));

        jta1.setText(" Let's safely life. \n Java Swing, I mading, AutoCheckCode3. ...\n Hello. How about this. Let's go there. Jesus Christ.\n Calling. Social resting place.\n" +
                " I like this writing. Thank you. \n\n - writter, https://github.com/infott2t ");
        btn1 = new JButton("버튼 입력");

        jp1.add(jl1);
        jp1.add(jl2);
        jp1.add(jtf1);
        jp1.add(jl3);
        jp1.add(jsp1);
        jp1.add(btn1);

        setVisible(true);
        setResizable(true);
        add(jp1);
        setBounds(150,100,380,500);

        btn1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {

                //btn1.setText("처음으로");
                if(btn1.getText().equals("버튼 입력")){
                    jta1.setText("Clicked.");
                    btn1.setText("처음으로");
                }else if(btn1.getText().equals("처음으로")){
                    jta1.setText("Let's safely life. \n Java Swing, I mading, AutoCheckCode3. ...\n Hello. How about this. Let's go there. Jesus Christ.\n Calling. Social resting place.\n" +
                            " I like this writing. Thank you. \n\n - writter, https://github.com/infott2t ");

                    btn1.setText("버튼 입력");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Sys01_Default();
    }
}

