/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Satellites;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Dell
 */
public class Insert extends javax.swing.JFrame {

    /**
     * Creates new form Insert
     */
    public Insert() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        missions1 = new javax.swing.JButton();
        location = new javax.swing.JButton();
        lifespan = new javax.swing.JButton();
        scientist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert Data");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\MiniProject\\Database Project Logo\\Back-48.png")); // NOI18N
        jButton2.setText("  Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 56)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText(" Insert Into,");

        missions1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        missions1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\MiniProject\\Database Project Logo\\Y-Wing-Star-Wars-64.png")); // NOI18N
        missions1.setText("     Missions");
        missions1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        missions1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        missions1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missions1ActionPerformed(evt);
            }
        });

        location.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        location.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\MiniProject\\Database Project Logo\\Location-flat-brown-64.png")); // NOI18N
        location.setText("     Location");
        location.setActionCommand(" Scientists");
        location.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        location.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        lifespan.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lifespan.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\MiniProject\\Database Project Logo\\clock_64.png")); // NOI18N
        lifespan.setText("     Life Span");
        lifespan.setActionCommand(" Scientists");
        lifespan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lifespan.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        lifespan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lifespanActionPerformed(evt);
            }
        });

        scientist.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        scientist.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\MiniProject\\Database Project Logo\\Business Man Blue_64.png")); // NOI18N
        scientist.setText("     Scientist");
        scientist.setActionCommand(" Scientists");
        scientist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scientist.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        scientist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scientistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(missions1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(269, 269, 269)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scientist, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lifespan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(missions1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scientist, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lifespan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(220, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new AdminPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        new AdminPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void missions1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missions1ActionPerformed
        // TODO add your handling code here:
        new MissionInsert().setVisible(true);
        dispose();
    }//GEN-LAST:event_missions1ActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
        new LocationInsert().setVisible(true);
        dispose();

    }//GEN-LAST:event_locationActionPerformed

    private void lifespanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lifespanActionPerformed
        // TODO add your handling code here:
        new LifeSpanInsert().setVisible(true);
        dispose();
    }//GEN-LAST:event_lifespanActionPerformed

    private void scientistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scientistActionPerformed
        // TODO add your handling code here:
        new ScientistInsert().setVisible(true);
        dispose();
    }//GEN-LAST:event_scientistActionPerformed

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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lifespan;
    private javax.swing.JButton location;
    private javax.swing.JButton missions1;
    private javax.swing.JButton scientist;
    // End of variables declaration//GEN-END:variables
}
