package org.example.swinggui.v2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Comm00_DefaultRuleScreen extends JFrame{

    private JPanel jp1;
    private JLabel jl1,jl2,jl3;
    private JTextField jtf1, jtf2, jtf3;
    private JTextArea jta1, jta2, jta3;
    private JScrollPane jsp1,jsp2,jsp3;
    private JButton btn1,btn2,btn3;

    TexttingC textingC;



    Comm00_DefaultRuleScreen(UtilSysV2 usv2){


        textingC = new TexttingC();


        jp1=new JPanel();
        jl1 = new JLabel("Check Default Rule.\n");
        jl2 = new JLabel("0. version save 1. version load");
        jtf1 = new JTextField(20);
        jl3 = new JLabel("How do I try like, this. 'Number input and enter.'"); //Design, add or extract this line.
        jta1 = new JTextArea(5,20);
        jsp1 = new JScrollPane(jta1);
        jsp1.setPreferredSize(new Dimension(600,400));

       /* jta1.setText();

        */
        if("".equals(usv2.saveText)){
            jta1.setText(textingC.sys02InitTextDefault2);
        }else{
            jta1.setText(usv2.saveText);
        }



       // btn1 = new JButton("버튼 입력");

        jp1.add(jsp1);
       //jp1.add(btn1);
        jp1.add(jl1);
        jp1.add(jl2);
        jp1.add(jtf1);
        jp1.add(jl3);

        setTitle(usv2.tableName);
        setVisible(true);
        setResizable(true);
        add(jp1);
        setBounds(150,100,620,500);
        jtf1.setText("");
        jtf1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {

                //btn1.setText("처음으로");

                if(jtf1.getText() == null || jtf1.getText().equals(null)|| jtf1.getText().equals("")) {
                    if("".equals(usv2.saveText)){
                        jta1.setText(textingC.sys02InitTextDefault2);
                    }
                    else{
                        jta1.setText(usv2.saveText);
                    }

                }
                else if(jtf1.getText().equals("0")){

                    usv2.queryYNScreenStr1 = "Rule Default Type";
                    usv2.saveText = jta1.getText();
                    jtf1.setText("");
                    new QueryYNSaveScreen(usv2);


                }
                else if(jtf1.getText().equals("1")){
                    usv2.queryYNScreenStr1 = "Rule Default Type";
                    jtf1.setText("");
                    new QueryYNLoadScreen(usv2);
                }
                else if(jtf1.getText().equals("2")){}
                else if(jtf1.getText().equals("3")){}
            }
        });
    }


}
