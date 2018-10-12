/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.Scanner;

/**
 *
 * @author phamh
 */
public class DictionaryCommandline {
    
   
   public void dictionaryBasic() {
       DictionaryManagement dic = new DictionaryManagement();
       dic.insertFromCommandline();
       DictionaryManagement dm = new DictionaryManagement();
       dm.showAllWords();
        
       
   }
   public void dictionaryAdvanced() {
      DictionaryManagement dic = new DictionaryManagement();
      dic.insertFromFile();
      DictionaryManagement dm = new DictionaryManagement();
      dm.showAllWords();
      dic.dictionaryLookup();
   }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DictionaryManagement DicM = new DictionaryManagement();
        DicM.insertFromFile();
        int option;
        do {
            System.out.println("    ------Từ điển Anh - Việt------  ");
            System.out.println("------------Nhập lựa chọn-----------");
            System.out.println("    1. Tra từ");
            System.out.println("    2. Thêm từ");
            System.out.println("    3. Sửa từ");
            System.out.println("    4. Xóa từ");
            System.out.println("    5. In tất cả các từ trong từ điển");
            System.out.println("    6. Ghi danh sách từ điển ra file");
            System.out.println("    7. Kết thúc");
            System.out.println("------------------------------------");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    DicM.dictionarySearcher();
                    break;
                case 2:
                    DicM.insertFromCommandline();
                    break;
                case 3:
                    DicM.edit();
                    break;
                case 4:
                    DicM.delete();
                    break;
                case 5:
                    DicM.showAllWords();
                    break;
                case 6:
                    DicM.dictionaryExportToFile();
                    break;
            }
            

        } while (option >= 1 && option <= 6);
    }
   
}
