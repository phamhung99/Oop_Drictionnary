/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author phamh
 */
public class DictionaryApplication extends javax.swing.JFrame {

    /**
     * Creates new form DictionaryApplication
     */
    
    public static DefaultListModel dlmWord = new DefaultListModel();
    //public static JList<String> listAdd = new JList<String>();
    private static String selected = "";
    private static int index = -1;
   
    
    public DictionaryApplication() {
        initComponents();
        this.setLocation(500, 200);
        try {
            DictionaryManagement dicm = new DictionaryManagement(); 
            dicm.insertFromFile();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tải dữ liệu thất bại.Thử lại sau !!!");
        }
        
        
        String s = "" ; 
        for(int i = 0; i < Dictionary.listWord.size();i++){
            s += Dictionary.listWord.get(i).getWord_target() + "\t\t" + Dictionary.listWord.get(i).getWord_explain() + "\n";
            
        }
        
       showAllWord();
     
       
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        btSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/image/add.png"))); // NOI18N
        btAdd.setText("Thêm từ");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/image/edit.png"))); // NOI18N
        btEdit.setText("Sửa từ");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/image/remove.png"))); // NOI18N
        btDelete.setText("Xóa từ");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        jList.setBackground(new java.awt.Color(204, 255, 204));
        jList.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList);

        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/image/search_add.png"))); // NOI18N
        btSearch.setText("Tìm kiếm");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame Add = new Add();
                Add.setVisible(true); //hiện giao diện 
                Add.setLocation(700, 400);
               
                dlmWord.removeAllElements();
     
        
            for (int i = 0; i < Dictionary.listWord.size(); i++) {
                dlmWord.addElement(Dictionary.listWord.get(i).getWord_target() + " :         " + Dictionary.listWord.get(i).getWord_explain());
            }
             
            jList.setModel(dlmWord);
              
            }
            
        });
        
        
    }//GEN-LAST:event_btAddActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if(index >= 0){
            Dictionary.listWord.remove(index);
             dlmWord.remove(index);
            jList.setModel(dlmWord);
            JOptionPane.showMessageDialog(null, "Từ bạn chọn đã được xóa");
        }else{
            JOptionPane.showMessageDialog(null, "Bạn phải chọn từ trong danh sách để xóa !");
        }
       
    }//GEN-LAST:event_btDeleteActionPerformed

    private void jListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListValueChanged
        index = jList.getSelectedIndex();
    }//GEN-LAST:event_jListValueChanged

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        if(index >= 0){
            Dictionary.listWord.remove(index);
             dlmWord.remove(index);
            SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame edit = new Edit();
                edit.setVisible(true); //hiện giao diện 
                edit.setLocation(700, 400);
               
                dlmWord.removeAllElements();
       
        
        
            for (int i = 0; i < Dictionary.listWord.size(); i++) {
                dlmWord.addElement(Dictionary.listWord.get(i).getWord_target() + " :         " + Dictionary.listWord.get(i).getWord_explain());
            }
             
            jList.setModel(dlmWord);
              
            }
            
        });
            
        }else{
            JOptionPane.showMessageDialog(null, "Bạn phải chọn từ trong danh sách để chỉnh sửa !");
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame search = new Search();
                search.setVisible(true); //hiện giao diện 
                search.setLocation(700, 400);
            }
            
        });
    }//GEN-LAST:event_btSearchActionPerformed

    public  void showAllWord(){
        
        dlmWord.removeAllElements();
     
        
            for (int i = 0; i < Dictionary.listWord.size(); i++) {
                dlmWord.addElement(Dictionary.listWord.get(i).getWord_target() + " :         " + Dictionary.listWord.get(i).getWord_explain());
            }
            jList.setModel(dlmWord);
    }
    
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btSearch;
    private javax.swing.JList<String> jList;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

