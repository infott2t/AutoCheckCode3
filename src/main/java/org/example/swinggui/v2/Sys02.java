package org.example.swinggui.v2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sys02 extends JFrame {

    private JPanel jp1;
    private JLabel jl1,jl2,jl3;
    private JTextField jtf1, jtf2, jtf3;
    private JTextArea jta1, jta2, jta3;
    private JScrollPane jsp1,jsp2,jsp3;
    private JButton btn1,btn2,btn3;

    static UtilSysV2 usv2;

    Sys02(){
        /***
         *  환경 설정. 파일저장할 폴더를 선택해주세요.
         *  Config, File save folder, this --->   usv2.fileSaveDirectory
         * **/
        usv2.fileSaveDirectory = "C:\\category\\";

        jp1=new JPanel();
        jl1 = new JLabel("Long method texting. Help note.");
        jl2 = new JLabel("\n0. defalut type save, 1. save, 2. load,  3.new 4.erase");
        jtf1 = new JTextField(20);
        jl3 = new JLabel("Number input and click.");
        jta1 = new JTextArea(5,20);
        jsp1 = new JScrollPane(jta1);
        jsp1.setPreferredSize(new Dimension(300,200));

        jta1.setText("Let's safely life. \n Java Swing, I mading, AutoCheckCode3. ...\n Hello. How about this. Let's go there. Church. \nJesus Christ. Calling. Social resting place.\n" +
                " I like this writing. Thank you. \n\n - writter, https://github.com/infott2t ");
        btn1 = new JButton("버튼 입력");

        jp1.add(jl1);
        jp1.add(jl2);
        jp1.add(jtf1);
        jp1.add(jl3);
        jp1.add(jsp1);
        jp1.add(btn1);

        setTitle("Automation code, care work");
        setVisible(true);
        setResizable(true);
        add(jp1);
        setBounds(150,100,380,500);
        jtf1.setText("");
        btn1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {

                //btn1.setText("처음으로");

                if(jtf1.getText() == null || jtf1.getText().equals(null)|| jtf1.getText().equals("")) {
                    if (btn1.getText().equals("버튼 입력")) {
                        jta1.setText("Clicked. Thank you.");
                        btn1.setText("처음으로");
                    } else if (btn1.getText().equals("처음으로")) {
                        jta1.setText("Let's safely life. \n Java Swing, I mading, AutoCheckCode3. ...\n Hello. How about this. Let's go there. Church. \nJesus Christ. Calling. Social resting place.\n" +
                                " I like this writing. Thank you. \n\n - writter, https://github.com/infott2t ");

                        btn1.setText("버튼 입력");
                    }
                }
                else if(jtf1.getText().equals("0")){
                    //new some class. How about this. Comm00. So,  new Comm00();
                    //And We sending, variable... vari. like this. new Comm00(int a, int b, String aStr);
                    //New Screen.
                    usv2 = new UtilSysV2("0. Rule Default Type.");
                    new Comm00_DefaultRuleScreen(usv2);
                    /**
                     * Let's safely use smartphones, etc. ; 스마트기기. 안전하게 사용합시다. 좋은 습관을 만들어요.
                     * Long sentences. ; 장문이네요.
                     * ...
                     *
                     * 전에 만들던 노트 붙이고... 텍스트 제목은, 클래스이름, I, C 이렇게 붙여도 되고... 제목에 클래스이름, 메소드.... 이렇게 적어도 되구요. 다 사람마다 방법이 있겠죠.
                     * 기본형태. 메소드 1개만 할 것인가, 메소드 1개에 어떤 순서를 해줘야하는가... 이런 부분. 배열을 통해 값을 빼오는 경우, 또, 형변환도 있을 수 있겠죠.
                     * 메소드가 커지면, 헷갈리더군요. 규칙이 있는편이 개발할 때 더 수월할 것 같아요. 저의 Github참조해보세요. 공부, 해보세요. 감사합니다.
                     *
                     * 조금 쉬어야겠군요. 저의 Github, 봐 주셔서 감사합니다. 작성자,  https://github.com/infott2t
                     * 그리고, 이 Git은, https://github.com/infott2t/AutoCheckCode3 일검니다. 공부하신다면...
                     * 웹프로그래밍 공부하셔도 좋구요. 자바 스윙이네요.
                     *
                     * https://github.com/infott2t/Auto_writting_JavaCode_makeSwing3
                     *
                     * SpringBoot의 경우, QueryDSL사용 추천해보네요. 셀렉트할 때는 QueryDSL. 괜찮은 것 같아요. 인프런이라는 학습사이트에 관련 강좌 있다고 하구요.
                     * 또, 교회. 다녀보세요. 기독교. 전화도 해보세요. 사회에서 쉴 곳. 하고 싶은 말이네요.
                     *
                     * 좋은 하루되세요.
                     *
                     * 저의 글, 봐 주셔서 감사합니다.
                     * ***/
                }
                else if(jtf1.getText().equals("1")){

                }
                else if(jtf1.getText().equals("2")){}
                else if(jtf1.getText().equals("3")){

                }
            }
        });
    }

    public static void main(String[] args) {
        new Sys02();
    }
}

