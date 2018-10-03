/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drictionary;

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
}
