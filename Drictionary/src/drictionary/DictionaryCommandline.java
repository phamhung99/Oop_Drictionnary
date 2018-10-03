/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drictionary;



/**
 *
 * @author phamh
 */
public class DictionaryCommandline {
   public void showAllWords(){
       if(!Dictionary.listWord.isEmpty()){
          System.out.println("No    | English 		| Vietnamese");
          int i = 1;
          for(Word tmp : Dictionary.listWord){
              System.out.printf("%-4d", i);
              tmp.showWord();
              i++;
          }
       }
   }
   
   public void dictionaryBasic() {
       DictionaryManagement dic = new DictionaryManagement();
       dic.insertFromCommandline();
       this.showAllWords();
        
       
   }
   
}

