/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import com.sun.javafx.css.Combinator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author phamh
 */
public class DictionaryManagement {
    private Scanner sc = new Scanner(System.in);
    
    public void insertFromCommandline(){
        System.out.println("---------Thêm từ vào từ điển---------");
        System.out.print("Nhập số lượng từ muốn thêm: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.print("Nhập từ muốn thêm: ");
            String target = sc.nextLine();
            System.out.print("Nhập nghĩa Tiếng Việt: ");
            String explain = sc.nextLine();
            Dictionary.listWord.add(new Word(target, explain));
        } 
        
        System.out.println("Đã thêm thành công");
        Collections.sort(Dictionary.listWord, (Word w1, Word w2) -> (w1.getWord_target().compareTo(w2.getWord_target())));
        for(Word w : Dictionary.listWord){
            System.out.println(w.getWord_target() + " " + w.getWord_explain());
        }
    }
    
    public void insertFromFile(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("dictionaries.txt"), "UTF-8"));
            
            String line = br.readLine();

            while (line != null) {

                if (!line.contains("\t")) {
                    line = br.readLine();
                    continue;
                }
                Word w = new Word();
                w.setWord_target(line.substring(0, line.indexOf("\t")));
                w.setWord_explain(line.substring(line.indexOf("\t") + 1));
                Dictionary.listWord.add(w);
                line = br.readLine();
            }
            
            br.close();
        } catch(IOException e){
            System.out.println("Quá trình đọc file bị lỗi !!!");
        }

        Collections.sort(Dictionary.listWord, (Word w1, Word w2) -> (w1.getWord_target().compareTo(w2.getWord_target())));
        
        
    }
    
    public void dictionaryLookup(){
        System.out.println("Nhập từ cần tìm :");
        String s = sc.nextLine();
        
        Comparator<Word> w = new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o1.getWord_target().compareTo(o2.getWord_target());
            }
        };
        int index = Collections.binarySearch(Dictionary.listWord,new Word(s, null), w);
        if(index >=0){
           
            Dictionary.listWord.get(index).showWord();
        }else{
            System.out.println("Không tim thấy từ bạn nhâp !!!");
            System.out.println("Nhập lại :");
            dictionaryLookup();
        }
    }
   
    
    public void dictionaryExportToFile() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("fileDic"), "UTF-8"));
            for (Word ele : Dictionary.listWord) {
                bw.write(ele.getWord_target() + "\t" + ele.getWord_explain());
                bw.newLine();
            }
            System.out.println("Quá trình ghi thành công");
            bw.close();
            
        } catch (IOException ex) {
            System.out.println("Quá trình ghi file bị lỗi !!!");
        }
    }
    
    public void showAllWords(){
       if(!Dictionary.listWord.isEmpty()){
          System.out.println("No  | English 		 | Vietnamese");
          int i = 1;
          for(Word tmp : Dictionary.listWord){
              System.out.printf("%-4d", i);
              tmp.showWord();
              i++;
              
          }
       }
     
   }
    
    
    
}
