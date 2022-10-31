package org.example.swinggui.v2.screen;

import org.example.swinggui.v2.UtilSysV2;

import javax.swing.*;

public class NewScreen extends JFrame {
    private JPanel jp;
    private JLabel jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9;
    private JTextField jtf, jtf2,jtf3,jtf4,jtf5;
    private JTextArea jta,jta2,jta3,jta4;
    private JScrollPane jsp,jsp2,jsp3,jsp4;
    private JButton btn;

    public String className;

    public NewScreen(UtilSysV2 usc){
        className = usc.tableName;
        jp= new JPanel();
        jl = new JLabel(" ");
        jta = new JTextArea(20,50);
        jsp = new JScrollPane(jta);
        //btn = new JButton("");
        jp.add(jl);
        jp.add(jsp);
        // jp.add(btn);
        add(jp);
        setVisible(true);
        setResizable(true);
        setTitle(": " + className);
        setBounds(300,300,650,500);

        jta.setText("");

        String code = jta.getText();
        /*
        try {
            File file = new File("C:\\category\\" + className + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(code);
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        */
    }
}
