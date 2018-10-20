/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author phamh
 */
public class Voice {
    private com.sun.speech.freetts.Voice voice;
    
    public Voice(String word){
        this.voice = VoiceManager.getInstance().getVoice(word);
        this.voice.allocate();
       
    }
    public void speak(String w){
        this.voice.speak(w);
    }
    
   
            
}
