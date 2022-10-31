package org.example.swinggui.v2;

import javax.swing.*;
import java.io.*;

public class UtilSysV2 {
    public static String tableName;
    public static String queryYNScreenStr1;
    public static String fileSaveDirectory;
    public static String saveText ="";

    public UtilSysV2(){

    }


    public UtilSysV2(String tableName){
        this.tableName = tableName;
    }


    public void fileSaveUtil(JTextArea jta1, String fileName){
        try {
            File file = new File(fileSaveDirectory + fileName );
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(jta1.getText());
            writer.close();
        }catch(Exception a){
            a.printStackTrace();
        }
    }

    public void fileSaveUtilText(String saveText, String fileName){
        try {
            File file = new File(fileSaveDirectory + fileName );
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(saveText);
            writer.close();
        }catch(Exception a){
            a.printStackTrace();
        }
    }


    public void fileLoadUtilText(String fileName) {
        String fileString = fileSaveDirectory + fileName;
        FileReader fr = null;
        saveText="";
        try{
            fr = new FileReader(fileString);
            if(fr!= null) {
                int ch;
                while((ch=fr.read())!=-1) {
                    saveText += (char)ch;
                }
                fr.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
