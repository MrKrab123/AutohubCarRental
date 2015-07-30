/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Class.DBconnection;
import Class.User;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
/**
 *
 * @author MrKrab
 */
public final class frm_AddUser extends javax.swing.JFrame {

    /**
     * Creates new form frm_AddUser
     */
    
    User ur;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
     public String finalid;
     
     
//     public final JDesktopPane desktop;
    public frm_AddUser() {
        initComponents();
     //   this.desktop = desktop;
        FillcomboPosition();
        emp_id();
    }

   public void emp_id () {  
     Calendar  cal = new GregorianCalendar();
                    int Month = cal.get(Calendar.MONTH);
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int year = cal.get(Calendar.YEAR);
      
     String sql = "Select MAX(emp_id)  from tbl_employee";
        try {
                conn = DBconnection.jdbcConnect();
                Statement st = conn.createStatement();
                rs = st.executeQuery(sql);
                if (rs.next()) {
                   String id = rs.getString("MAX(emp_id)");
                   String format = id.substring(9);
                   int id1 = Integer.parseInt(format) + 1;
                   
                   if(id1 <= 9 && id1 >= 1){
                       finalid = "USR"+"-"+String.valueOf(year)+"-"+"000"+id1;
                   }else if(id1 <= 99 && id1 >= 10){
                       finalid = "USR"+"-"+String.valueOf(year)+"-"+"00"+id1;
                   }else if(id1 <= 999 && id1 >= 100){
                       finalid = "USR"+"-"+String.valueOf(year)+"-"+"0"+id1;
                   }else if(id1 <= 9999 && id1 >= 1000){
                       finalid = "USR"+"-"+String.valueOf(year)+"-"+id1;
                   }
                 }
        } catch (Exception e) {
 
            finalid = "USR"+"-"+String.valueOf(year)+"-"+"0001";
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_m = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        cbo_userlevel = new javax.swing.JComboBox();
        Exit = new javax.swing.JLabel();
        btn_Cancel1 = new javax.swing.JButton();
        btn_Save1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_fname.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_fname.setBorder(null);
        txt_fname.setOpaque(false);
        getContentPane().add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 96, 270, 30));

        txt_lname.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_lname.setBorder(null);
        txt_lname.setOpaque(false);
        getContentPane().add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 270, 30));

        txt_m.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_m.setBorder(null);
        txt_m.setOpaque(false);
        txt_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mActionPerformed(evt);
            }
        });
        getContentPane().add(txt_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 228, 265, 30));

        txt_username.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_username.setBorder(null);
        txt_username.setOpaque(false);
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 295, 265, 30));

        cbo_userlevel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cbo_userlevel.setOpaque(false);
        cbo_userlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_userlevelActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_userlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 300, 30));

        Exit.setText("  ");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 45, 18));

        btn_Cancel1.setBackground(new java.awt.Color(35, 31, 32));
        btn_Cancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employee/Cancel.png"))); // NOI18N
        btn_Cancel1.setBorder(null);
        btn_Cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Cancel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Cancel1MouseExited(evt);
            }
        });
        btn_Cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cancel1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 465, 173, 53));

        btn_Save1.setBackground(new java.awt.Color(35, 31, 32));
        btn_Save1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employee/Save.png"))); // NOI18N
        btn_Save1.setBorder(null);
        btn_Save1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Save1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Save1MouseExited(evt);
            }
        });
        btn_Save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Save1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 465, 173, 53));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employee/EmployeeInformationAdd.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mActionPerformed

    private void cbo_userlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_userlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_userlevelActionPerformed

    private void FillcomboPosition(){
         try{
            conn = DBconnection.jdbcConnect();
            String sql = "Select user_level from tbl_userlevel";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                cbo_userlevel.addItem(rs.getString("user_level"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    } 
    
    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        this.dispose();
        new frm_User().setVisible(true);
        
    }//GEN-LAST:event_ExitMouseClicked

    private void btn_Cancel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cancel1MouseEntered

        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/CancelFocused.png"));

        btn_Cancel1.setIcon(II);
    }//GEN-LAST:event_btn_Cancel1MouseEntered

    private void btn_Cancel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cancel1MouseExited

        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/Cancel.png"));

        btn_Cancel1.setIcon(II);
    }//GEN-LAST:event_btn_Cancel1MouseExited

    private void btn_Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cancel1ActionPerformed


        this.setVisible(false);
        new frm_User().setVisible(true);
 
    }//GEN-LAST:event_btn_Cancel1ActionPerformed

    private void btn_Save1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Save1MouseEntered
        
        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/SaveFocused.png"));

        btn_Save1.setIcon(II);
    }//GEN-LAST:event_btn_Save1MouseEntered

    private void btn_Save1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Save1MouseExited
        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/Save.png"));

        btn_Save1.setIcon(II);
    }//GEN-LAST:event_btn_Save1MouseExited

    
    private void btn_Save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Save1ActionPerformed

        String fname = txt_fname.getText();
        String lname = txt_lname.getText();
        String m = txt_m.getText();
        String uname = txt_username.getText();
        String ulevel = cbo_userlevel.getSelectedItem().toString();

       

        if(txt_fname.getText().equals("") || txt_lname.getText().equals("") || txt_m.getText().equals("") || txt_username.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please fill up all the field");
        }else{
            
                     int p = JOptionPane.showConfirmDialog(this,"Are you sure you want to save ?","Confirm",JOptionPane.YES_NO_OPTION);
                    if(p==0){

                        try{

                            ur = new User();
                            ur.SaveToEmployee(fname, lname, m, uname, ulevel , finalid);
                            txt_fname.setText("");
                            txt_lname.setText("");
                            txt_m.setText("");
                            txt_username.setText("");
                            cbo_userlevel.setEnabled(false);
                            JOptionPane.showMessageDialog(null,"Saved");
    
                           this.hide();
                           
                           frm_User user = new frm_User();
                           user.removeAll();
                           user.repaint();
                           user.revalidate();
                           
                           user.show(true);
                           
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, e);
                        }

                }              
        }
    }//GEN-LAST:event_btn_Save1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Exit;
    private javax.swing.JButton btn_Cancel1;
    private javax.swing.JButton btn_Save1;
    private javax.swing.JComboBox cbo_userlevel;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_m;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
