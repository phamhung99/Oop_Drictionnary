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
   
   
}
