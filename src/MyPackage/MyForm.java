/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author dhakadJr
 */
public class MyForm extends javax.swing.JFrame {

    /**
     * Creates new form MyForm
     */
    public MyForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEncrypt = new javax.swing.JButton();
        btnDecrypt = new javax.swing.JButton();
        txtEncrypt = new javax.swing.JTextField();
        txtDecrypt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Welcome to Image Encryption and Decryption Softaware Created By ROHIT DHAKAD ");

        btnEncrypt.setBackground(new java.awt.Color(0, 0, 0));
        btnEncrypt.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnEncrypt.setForeground(new java.awt.Color(0, 204, 0));
        btnEncrypt.setText("Encrypt My Image");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        btnDecrypt.setBackground(new java.awt.Color(0, 0, 0));
        btnDecrypt.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnDecrypt.setForeground(new java.awt.Color(0, 204, 0));
        btnDecrypt.setText("Decrypt My Image");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        txtEncrypt.setBackground(new java.awt.Color(255, 255, 255));
        txtEncrypt.setForeground(new java.awt.Color(0, 0, 0));

        txtDecrypt.setBackground(new java.awt.Color(255, 255, 255));
        txtDecrypt.setForeground(new java.awt.Color(0, 0, 0));

        jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 0));
        jTextArea2.setRows(5);
        jTextArea2.setText("\t\t\t\tABOUT\n\t\n\t                      Do you want to convert your image to a from in which no one can see it ???\n\t\t\t                                                                                                                                                                  \n\tIf your answer is \"YES\"  then this software is definately for you   .If \"Encrypt My Image\" is the option You select \n                      delow ,it takes image to choose and encrypt it whith the password you entered  and thus make them unreadable.\n                     \tThis way ,image won't open.Executable files will not be in a state to be executed .The rendered images will have \n                      \".enc\" extension in ENCRYPTION.\n\n                                          Do You want your encrypted image back in the original form??\n \n\t\"Decrypt My Image\" is the option you should select.It perform. DECRYPTION of the given encrypted image.\n \t  The software does not your PASSWORD .You have to enter the password to Decrypt your image");
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(216, 216, 216)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEncrypt)
                                    .addComponent(txtDecrypt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        // TODO add your handling code here:
        String str=txtEncrypt.getText();
        int temp=Integer.parseInt(str);
        JFileChooser fileChooser=new JFileChooser();
          fileChooser.showOpenDialog(null);
          
          File file=fileChooser.getSelectedFile();
          int i=0;
          try {
              FileInputStream fis=new FileInputStream(file);
              byte []data=new byte[fis.available()];
              fis.read(data);
              
              for(byte b:data)
              {
                 data[i]=(byte)(b^temp);
                 i++;
              }
              FileOutputStream fos=new FileOutputStream(file);
              fos.write(data);
              fos.close();
              fis.close();
              JOptionPane.showMessageDialog(null,"Encrypted Successfully !!","Done",JOptionPane.INFORMATION_MESSAGE);
              
              
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error in File Opening !!","Error",JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        // TODO add your handling code here:
         String str=txtEncrypt.getText();
        int temp=Integer.parseInt(str);
        JFileChooser fileChooser=new JFileChooser();
          fileChooser.showOpenDialog(null);
          
          File file=fileChooser.getSelectedFile();
          int i=0;
          try {
              FileInputStream fis=new FileInputStream(file);
              byte []data=new byte[fis.available()];
              fis.read(data);
              
              for(byte b:data)
              {
                 data[i]=(byte)(b^temp);
                 i++;
              }
              FileOutputStream fos=new FileOutputStream(file);
              fos.write(data);
              fos.close();
              fis.close();
              JOptionPane.showMessageDialog(null,"Decrypted Successfully !!","Done",JOptionPane.INFORMATION_MESSAGE);
              
              
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error in File Opening !!","Error",JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
        }
    }//GEN-LAST:event_btnDecryptActionPerformed

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
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txtDecrypt;
    private javax.swing.JTextField txtEncrypt;
    // End of variables declaration//GEN-END:variables
}
