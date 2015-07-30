
package Form;

import Class.*;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author MrKrab
 */

public class frm_User extends javax.swing.JInternalFrame {

    /**
     * Creates new form frm_User
     */
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    User ur;
    int m = new frm_Main().frm_user;
    
    
    int xMouse, yMouse;
    
    
    public frm_User() {
        initComponents();
         FillcomboPosition();
         UpdateTableEmployee();
        txt_fname.enable(false);
        txt_lname.enable(false);
        txt_m.enable(false);
        txt_username.enable(false);
        cbo_userlevel.disable();
        lbl_id.enable(false);
        
        btn_Update.setEnabled(false);
        btn_Cancel1.setEnabled(false);
        btn_Edit1.setEnabled(false);
        

        
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_m = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        cbo_userlevel = new javax.swing.JComboBox();
        btn_Edit1 = new javax.swing.JButton();
        btn_Add1 = new javax.swing.JButton();
        btn_Cancel1 = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_employee = new javax.swing.JTable();
        lbl_id = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("User");
        setFocusable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setText("  ");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1, 45, 20));

        txt_fname.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_fname.setBorder(null);
        txt_fname.setOpaque(false);
        txt_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_fnameKeyPressed(evt);
            }
        });
        getContentPane().add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 153, 230, 30));

        txt_lname.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_lname.setBorder(null);
        txt_lname.setOpaque(false);
        txt_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_lnameKeyPressed(evt);
            }
        });
        getContentPane().add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 219, 230, 30));

        txt_m.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_m.setBorder(null);
        txt_m.setOpaque(false);
        txt_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mActionPerformed(evt);
            }
        });
        txt_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_mKeyPressed(evt);
            }
        });
        getContentPane().add(txt_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 285, 230, 30));

        txt_username.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_username.setBorder(null);
        txt_username.setOpaque(false);
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usernameKeyPressed(evt);
            }
        });
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 353, 230, 30));

        cbo_userlevel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cbo_userlevel.setOpaque(false);
        cbo_userlevel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_userlevelMouseClicked(evt);
            }
        });
        cbo_userlevel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbo_userlevelPropertyChange(evt);
            }
        });
        getContentPane().add(cbo_userlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 250, 40));

        btn_Edit1.setBackground(new java.awt.Color(35, 31, 32));
        btn_Edit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employee/Edit.png"))); // NOI18N
        btn_Edit1.setBorder(null);
        btn_Edit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Edit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Edit1MouseExited(evt);
            }
        });
        btn_Edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Edit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, 173, 53));

        btn_Add1.setBackground(new java.awt.Color(35, 31, 32));
        btn_Add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employee/Add.png"))); // NOI18N
        btn_Add1.setBorder(null);
        btn_Add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Add1MouseExited(evt);
            }
        });
        btn_Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 173, 53));

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
        getContentPane().add(btn_Cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 173, 53));

        btn_Update.setBackground(new java.awt.Color(35, 31, 32));
        btn_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employee/Update.png"))); // NOI18N
        btn_Update.setBorder(null);
        btn_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateMouseExited(evt);
            }
        });
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 173, 53));

        tbl_employee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbl_employee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        )
        {public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        }
    );
    tbl_employee.setEditingColumn(0);
    tbl_employee.setEditingRow(0);
    tbl_employee.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_employeeMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tbl_employee);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 57, 700, 370));

    lbl_id.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
    lbl_id.setText("   ");
    getContentPane().add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 93, 230, 30));

    Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employee/EmployeeInformation.png"))); // NOI18N
    getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

    pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
      m = 0;
        this.dispose();
      
    }//GEN-LAST:event_ExitMouseClicked

    private void txt_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mActionPerformed

    private void tbl_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_employeeMouseClicked
        try{
            conn = DBconnection.jdbcConnect();

            int row = tbl_employee.getSelectedRow();
            String Table_Click =(tbl_employee.getModel().getValueAt(row,0).toString());
            String sql = "Select * from tbl_employee where emp_id = '"+Table_Click+"'";
            pst = conn.prepareStatement(sql);
            rs =pst.executeQuery();

            if(rs.next()){

                String id = rs.getString("emp_id");
                lbl_id.setText(id);
                
                String fname = rs.getString("emp_fname");
                txt_fname.setText(fname);

                String lname = rs.getString("emp_lname");
                txt_lname.setText(lname);

                String mi = rs.getString("emp_mi");
                txt_m.setText(mi);

                String username = rs.getString("username");
                txt_username.setText(username);
                
                String add = rs.getString("user_level");
                cbo_userlevel.setSelectedItem(add);

                   txt_fname.enable(false);
                   txt_lname.enable(false);
                   txt_m.enable(false);
                   txt_username.enable(false);
                   cbo_userlevel.setEnabled(false);
                   
                btn_Cancel1.setEnabled(false);
                btn_Add1.setEnabled(true);
                btn_Edit1.setEnabled(true);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_tbl_employeeMouseClicked

    private void btn_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateMouseEntered
       
        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/UpdateFocused.png"));
        
        btn_Update.setIcon(II);
    }//GEN-LAST:event_btn_UpdateMouseEntered

    private void btn_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateMouseExited
             
        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/Update.png"));
        
        btn_Update.setIcon(II);
    }//GEN-LAST:event_btn_UpdateMouseExited

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        String id = lbl_id.getText();
        String fname = txt_fname.getText();
        String lname = txt_lname.getText();
        String m = txt_m.getText();
        String uname = txt_username.getText();
        String ulevel = cbo_userlevel.getSelectedItem().toString();
        
        
      int p = JOptionPane.showConfirmDialog(this,"Do you want to save the changes ?","Confirm",JOptionPane.YES_NO_OPTION);
      
      if(p==0){
          
        try{
            
            ur = new User();
            ur.UpdateToEmployee(fname, lname, m, uname, ulevel,id);
            UpdateTableEmployee();
            
            txt_fname.setText("");
            txt_lname.setText("");
            txt_m.setText("");
            txt_username.setText("");
            cbo_userlevel.setEnabled(false);
            
            btn_Update.setEnabled(false);
            btn_Cancel1.setEnabled(false);
             btn_Add1.setEnabled(true);
            btn_Edit1.setEnabled(true);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }      
        
      }

    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_Cancel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cancel1MouseEntered
       
        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/CancelFocused.png"));
        
        btn_Cancel1.setIcon(II);
    }//GEN-LAST:event_btn_Cancel1MouseEntered

    private void btn_Cancel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cancel1MouseExited
             
        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/Cancel.png"));
        
        btn_Cancel1.setIcon(II);
    }//GEN-LAST:event_btn_Cancel1MouseExited

    private void btn_Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cancel1ActionPerformed
         int p = JOptionPane.showConfirmDialog(this,"Are yoru sure you want to Cancel","Confirm",JOptionPane.YES_NO_OPTION);
        if(p==0){
            lbl_id.setText("");
            txt_fname.setText("");
            txt_lname.setText("");
            txt_m.setText("");
            txt_username.setText("");
            
            tbl_employee.enable();
            
            txt_fname.enable(false);
            txt_lname.enable(false);
            txt_m.enable(false);
            txt_username.enable(false);
            cbo_userlevel.setEnabled(false);
            
            btn_Update.setEnabled(false);
            btn_Cancel1.setEnabled(false);
           btn_Add1.setEnabled(true);
            
            tbl_employee.setEnabled(true);
            
        }
    }//GEN-LAST:event_btn_Cancel1ActionPerformed

    private void btn_Edit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Edit1MouseEntered
        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/EditFocused.png"));
        
        btn_Edit1.setIcon(II);
    }//GEN-LAST:event_btn_Edit1MouseEntered

    private void btn_Edit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Edit1MouseExited
        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/Edit.png"));
        
        btn_Edit1.setIcon(II);
    }//GEN-LAST:event_btn_Edit1MouseExited

    private void btn_Edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Edit1ActionPerformed
       txt_fname.setEnabled(true);
        txt_lname.setEnabled(true);
        txt_m.setEnabled(true);
        txt_username.setEnabled(true);
        cbo_userlevel.setEnabled(true);
        
        btn_Edit1.setEnabled(false);
        btn_Cancel1.setEnabled(true);
        btn_Add1.setEnabled(false);

        
        
    }//GEN-LAST:event_btn_Edit1ActionPerformed

    private void btn_Add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Add1MouseEntered
              
        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/AddFocused.png"));
        
        btn_Add1.setIcon(II);
    }//GEN-LAST:event_btn_Add1MouseEntered

    private void btn_Add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Add1MouseExited
        ImageIcon II = new ImageIcon(this.getClass().getResource("/Image/Employee/Add.png"));
        
        btn_Add1.setIcon(II);
    }//GEN-LAST:event_btn_Add1MouseExited

    private void btn_Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add1ActionPerformed

    
        
    }//GEN-LAST:event_btn_Add1ActionPerformed

    private void txt_fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fnameKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_BACKSPACE){
               btn_Update.setEnabled(true);
               btn_Cancel1.setEnabled(true);
               btn_Add1.setEnabled(false);
               btn_Edit1.setEnabled(false);
               }
    }//GEN-LAST:event_txt_fnameKeyPressed

    private void txt_lnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lnameKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_BACKSPACE){
               btn_Update.setEnabled(true);
               btn_Cancel1.setEnabled(true);
               btn_Add1.setEnabled(false);
               btn_Edit1.setEnabled(false);
               }
    }//GEN-LAST:event_txt_lnameKeyPressed

    private void txt_mKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_BACKSPACE){
               btn_Update.setEnabled(true);
               btn_Cancel1.setEnabled(true);
               btn_Add1.setEnabled(false);
               btn_Edit1.setEnabled(false);
               }
    }//GEN-LAST:event_txt_mKeyPressed

    private void txt_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_BACKSPACE){
               btn_Update.setEnabled(true);
               btn_Cancel1.setEnabled(true);
               btn_Add1.setEnabled(false);
               btn_Edit1.setEnabled(false);
               }
    }//GEN-LAST:event_txt_usernameKeyPressed

    private void cbo_userlevelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_userlevelMouseClicked

               btn_Update.setEnabled(true);
               btn_Cancel1.setEnabled(true);
               btn_Add1.setEnabled(false);
               btn_Edit1.setEnabled(false);
               
      
    }//GEN-LAST:event_cbo_userlevelMouseClicked

    private void cbo_userlevelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbo_userlevelPropertyChange

    }//GEN-LAST:event_cbo_userlevelPropertyChange

    public void UpdateTableEmployee(){
    
    try {
        conn = DBconnection.jdbcConnect();
        
       String sql = "Select emp_id as 'ID', emp_fname as 'Firstname', emp_mi as 'Middle', emp_lname as 'Lastname', username as 'Username', user_level as 'User level' from tbl_employee";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        tbl_employee.setModel(DbUtils.resultSetToTableModel(rs));
        pst.close();
        rs.close();
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);  
    }
    }
    
    //Get the Value of the table user from tbl_userlevel
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
            java.util.logging.Logger.getLogger(frm_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Exit;
    private javax.swing.JButton btn_Add1;
    private javax.swing.JButton btn_Cancel1;
    private javax.swing.JButton btn_Edit1;
    private javax.swing.JButton btn_Update;
    private javax.swing.JComboBox cbo_userlevel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tbl_employee;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_m;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}