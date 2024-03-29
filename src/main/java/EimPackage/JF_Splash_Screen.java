/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EimPackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class JF_Splash_Screen extends javax.swing.JFrame {

    /**
     * Creates new form JF_Splash_Screen
     */
    public JF_Splash_Screen() {
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

        pnl_Splash = new javax.swing.JPanel();
        pb_Splash = new javax.swing.JProgressBar();
        lbl_Splash = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setName("form_Splash_Screen"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(500, 350));

        pnl_Splash.setBackground(new java.awt.Color(153, 0, 153));
        pnl_Splash.setDoubleBuffered(false);
        pnl_Splash.setName("pnl_Splash"); // NOI18N
        pnl_Splash.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnl_SplashComponentShown(evt);
            }
        });

        pb_Splash.setBackground(new java.awt.Color(153, 0, 153));
        pb_Splash.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        pb_Splash.setForeground(new java.awt.Color(0, 0, 0));
        pb_Splash.setBorder(null);
        pb_Splash.setFocusable(false);
        pb_Splash.setName("pb_Splash"); // NOI18N
        pb_Splash.setStringPainted(true);

        lbl_Splash.setFont(new java.awt.Font("Monospaced", 3, 40)); // NOI18N
        lbl_Splash.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Splash.setText("LOADING...");

        javax.swing.GroupLayout pnl_SplashLayout = new javax.swing.GroupLayout(pnl_Splash);
        pnl_Splash.setLayout(pnl_SplashLayout);
        pnl_SplashLayout.setHorizontalGroup(
            pnl_SplashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SplashLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(pb_Splash, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_SplashLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Splash, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        pnl_SplashLayout.setVerticalGroup(
            pnl_SplashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_SplashLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(lbl_Splash, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(pb_Splash, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Splash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Splash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_SplashComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnl_SplashComponentShown
        // TODO add your handling code here:
       //if(pb_Splash.getValue()!=100){
         
          //Thread.sleep(50);
         // int count = pb_Splash.getValue()+10;
        //  pb_Splash.setValue(count);
       //}
      
    }//GEN-LAST:event_pnl_SplashComponentShown

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
            java.util.logging.Logger.getLogger(JF_Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }
    
    public static void fill(){
        //JF_Login login = new JF_Login();
        JF_Splash_Screen splash = new JF_Splash_Screen();
        //JF_Manager_Home mHome = new JF_Manager_Home();
        //login.setVisible(false);
        //splash.setEnabled(true);
        //splash.setVisible(true);
        //splash.pnl_Splash.setVisible(true);
        try {
            //splash.setVisible(true);
            for (int i=0;i<=100;i++) {
                splash.pb_Splash.setValue(i);
                //Thread.sleep(50);
                //for (int j=0;j<=5;j++){
                //    sc.lbl_Splash.setText("Loading...");
                //    Thread.sleep(10);
                //    sc.lbl_Splash.setText("Loading..");
                //}
                
            }
            //JF_Manager_Home mHome = new JF_Manager_Home();
            //mHome.setVisible(true);
            splash.setVisible(false);
            //splash.dispose();
        }catch (Exception e) {
            
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_Splash;
    public javax.swing.JProgressBar pb_Splash;
    public static javax.swing.JPanel pnl_Splash;
    // End of variables declaration//GEN-END:variables
}
