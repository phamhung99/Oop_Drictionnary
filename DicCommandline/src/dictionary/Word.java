/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author phamh
 */
public class Word {
    private String word_target , word_explain ;
    
    public Word() {
    
    }
    
    public Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }
     public Word(String lineInFile) {
        this.word_target = lineInFile.substring(0, lineInFile.indexOf("\t"));
        this.word_explain = lineInFile.substring(lineInFile.indexOf("\t") + 1);
    }

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
    
     public void showWord() {
        System.out.printf("%s%-20s%s%-20s\n","|",  word_target,"|", word_explain);
        
    }
}
