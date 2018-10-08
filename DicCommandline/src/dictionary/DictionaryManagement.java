/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
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
    }
    
    public void insertFromFile(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("dictionaries.txt"), "UTF-8"));
            
            String line = br.readLine();;

            while (line != null) {

                if (line.indexOf("\t") == -1) {
                    line = br.readLine();
                    continue;
                }
                Word w = new Word(line);
           //     w.setWord_target(line.substring(0, line.indexOf("\t")));
           //     w.setWord_explain(line.substring(line.indexOf("\t") + 1));
                Dictionary.listWord.add(w);
                line = br.readLine();
            }

            br.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }
    
    public void dictionaryLookup(){
        System.out.println("Nhập từ cần tìm :");
        String s = sc.nextLine();
        for (Word tmp : Dictionary.listWord) {
            if (tmp.getWord_target().equals(s)) {
                tmp.showWord();
                return;
            }
        }
        System.out.println("Không tìm thấy từ yêu cầu !!!");
    }
}
