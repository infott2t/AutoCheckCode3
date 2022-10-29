package org.example.swinggui.v2;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class UtilSysV2 {
    public static String tableName;
    public static String queryYNScreenStr1;
    public static String fileSaveDirectory;

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


}
