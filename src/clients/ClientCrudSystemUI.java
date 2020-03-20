/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import authentication.Home;

/**
 *
 * @author Med Amine Ben Ammar
 */
public class ClientCrudSystemUI extends javax.swing.JFrame {

    /**
     * Creates new form ClientCrudSystem
     */
    public ClientCrudSystemUI() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) clients_data.getModel();
        for(Client list:ClientCrudSystem.getAllClients())
        {
            Object[] row = { list.getNcin(), list.getFname(), list.getLname(), list.getTel() , list.getAdr() };
            model.addRow(row);
        }
       
         
         
        
           

    }
    
    
    public void setAdminInfo(String name)
    {
        clt_admin_name.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clients_data = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adr = new javax.swing.JTextField();
        ncin = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        u_clt = new javax.swing.JButton();
        u_adr = new javax.swing.JTextField();
        u_ncin = new javax.swing.JTextField();
        u_fname = new javax.swing.JTextField();
        u_lname = new javax.swing.JTextField();
        u_tel = new javax.swing.JTextField();
        find_clt = new javax.swing.JButton();
        del_clt = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        v_ncin = new javax.swing.JTextField();
        v_clt = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        clt_admin_name = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        clients_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ncin", "First Name", "Last Name", "Tel", "Adress"
            }
        ));
        jScrollPane1.setViewportView(clients_data);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("View Client Data", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Adress");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Ncin : ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("First Name : ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Last Name :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Tél : ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 40));

        adr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adrActionPerformed(evt);
            }
        });
        jPanel3.add(adr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 190, 50));

        ncin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ncin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ncinActionPerformed(evt);
            }
        });
        jPanel3.add(ncin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 190, 50));

        fname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 190, 50));

        lname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 190, 50));

        tel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        jPanel3.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 190, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_logo.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 270, 340));

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel3.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 200, 80));

        add1.setBackground(new java.awt.Color(255, 255, 255));
        add1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        add1.setText("Add Client");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel3.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 200, 80));

        jTabbedPane1.addTab("Insert Client", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Adress");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Ncin");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("First Name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Last Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 130, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Tel");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 50, 40));

        u_clt.setBackground(new java.awt.Color(51, 255, 255));
        u_clt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        u_clt.setText("Update Client");
        u_clt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_cltActionPerformed(evt);
            }
        });
        jPanel2.add(u_clt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 200, 60));
        jPanel2.add(u_adr, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 150, 30));
        jPanel2.add(u_ncin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 150, 30));
        jPanel2.add(u_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 150, 30));
        jPanel2.add(u_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 150, 30));
        jPanel2.add(u_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 150, 30));

        find_clt.setBackground(new java.awt.Color(51, 255, 255));
        find_clt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        find_clt.setText("Find");
        find_clt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_cltActionPerformed(evt);
            }
        });
        jPanel2.add(find_clt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 120, 30));

        del_clt.setBackground(new java.awt.Color(51, 255, 255));
        del_clt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        del_clt.setText("Delete CLient");
        del_clt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_cltActionPerformed(evt);
            }
        });
        jPanel2.add(del_clt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 200, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/advisor.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 280, 300));

        jTabbedPane1.addTab("Upadate / Delete Client", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("Ncin :");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 70));
        jPanel4.add(v_ncin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 260, 70));

        v_clt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        v_clt.setText("Client File");
        v_clt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_cltActionPerformed(evt);
            }
        });
        jPanel4.add(v_clt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 200, 70));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/support.png"))); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 160, 140));

        jTabbedPane1.addTab("Client File", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 450));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_pic.png"))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 70));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setText("Admin Name : ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 110, 60));

        clt_admin_name.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        clt_admin_name.setText("jLabel12");
        getContentPane().add(clt_admin_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 110, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 70, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adrActionPerformed

    private void ncinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ncinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ncinActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        ncin.setText("");
        fname.setText("");
        lname.setText("");
        tel.setText("");
        adr.setText("");
        u_ncin.setEditable(true);
    }//GEN-LAST:event_resetActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:
        String t_ncin = ncin.getText();
        String _fname = fname.getText();
        String _lname = lname.getText();
        String t_tel = tel.getText();
        String _adr = adr.getText();
        
        int ncin = Integer.parseInt(t_ncin);
        int tel = Integer.parseInt(t_tel);
        
        Client client = new Client(ncin,_fname,_lname,tel,_adr);
        Client test_existence = ClientCrudSystem.getClient(ncin);
        
        if(test_existence.getNcin() == 0)
        {
           int status = ClientCrudSystem.save(client);
            if(status > 0)
            {
                JOptionPane.showMessageDialog(jPanel3,"Record Added succesfully");
                this.setVisible(false);
                ClientCrudSystemUI ui = new ClientCrudSystemUI();
                ui.setAdminInfo(clt_admin_name.getText());
                ui.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel3,"Sorry! Error Occured","Warning",JOptionPane.ERROR_MESSAGE);
            } 
        }
        else
        {
            JOptionPane.showMessageDialog(jPanel3,"Valeur Dupliquer","Warning",JOptionPane.ERROR_MESSAGE);
        }
           
        
        
            
    }//GEN-LAST:event_add1ActionPerformed

    private void find_cltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_cltActionPerformed
        // TODO add your handling code here:
        String t_ncin = u_ncin.getText();
        int ncin = Integer.parseInt(t_ncin);
        Client test_existence = ClientCrudSystem.getClient(ncin);
        
        if(test_existence.getNcin() != 0)
        {
            //JOptionPane.showMessageDialog(jPanel3,"Record Added succesfully");
            u_ncin.setEditable(false);
            u_fname.setText(test_existence.getFname());
            u_lname.setText(test_existence.getLname());
            int tel = test_existence.getTel();
            String s_tel = Integer.toString(tel);
            u_tel.setText(s_tel);
            u_adr.setText(test_existence.getAdr());
            
        }
        else
        {
            JOptionPane.showMessageDialog(jPanel3,"Ncin Not Found Error 404!!!","Warning",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_find_cltActionPerformed

    private void del_cltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_cltActionPerformed
        // TODO add your handling code here:
        String t_ncin = u_ncin.getText();
        int ncin = Integer.parseInt(t_ncin);
        
        int status = ClientCrudSystem.delete(ncin);
            if(status > 0)
            {
                JOptionPane.showMessageDialog(jPanel3,"Record Deleted succesfully");
                this.setVisible(false);
                ClientCrudSystemUI ui = new ClientCrudSystemUI();
                ui.setAdminInfo(clt_admin_name.getText());
                ui.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel3,"Sorry! Error Occured","Warning",JOptionPane.ERROR_MESSAGE);
            } 
        
    }//GEN-LAST:event_del_cltActionPerformed

    private void u_cltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_cltActionPerformed
        // TODO add your handling code here:
        String t_ncin = u_ncin.getText();
        String _fname = u_fname.getText();
        String _lname = u_lname.getText();
        String t_tel = u_tel.getText();
        String _adr = u_adr.getText();
        
        int ncin = Integer.parseInt(t_ncin);
        int tel = Integer.parseInt(t_tel);
        
        Client client = new Client(ncin,_fname,_lname,tel,_adr);
        
        int status = ClientCrudSystem.update(client);
            if(status > 0)
            {
                JOptionPane.showMessageDialog(jPanel3,"Record Updated succesfully");
                this.setVisible(false);
                ClientCrudSystemUI ui = new ClientCrudSystemUI();
                ui.setAdminInfo(clt_admin_name.getText());
                ui.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel3,"Sorry! Error Occured","Warning",JOptionPane.ERROR_MESSAGE);
            } 
    }//GEN-LAST:event_u_cltActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        Home home = new Home();
        home.setHomeUsername(clt_admin_name.getText());
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void v_cltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_cltActionPerformed
        // TODO add your handling code here:
        String t_ncin = v_ncin.getText();
        
        int ncin = Integer.parseInt(t_ncin);
        
        Client clt = ClientCrudSystem.getClient(ncin);
        if(clt.getNcin() == 0)
        {
            //error handling
            JOptionPane.showMessageDialog(jPanel3,"Sorry! Client Not Found Error 404","Warning",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            ClientFileUI cltFUI = new ClientFileUI(clt);
            cltFUI.setAdminInfo(this.clt_admin_name.getText());
            this.setVisible(false);
            cltFUI.setVisible(true);
            
        }
    }//GEN-LAST:event_v_cltActionPerformed

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
            java.util.logging.Logger.getLogger(ClientCrudSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientCrudSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientCrudSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientCrudSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClientCrudSystemUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1;
    private javax.swing.JTextField adr;
    private javax.swing.JTable clients_data;
    private javax.swing.JLabel clt_admin_name;
    private javax.swing.JButton del_clt;
    private javax.swing.JButton find_clt;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField ncin;
    private javax.swing.JLabel pic;
    private javax.swing.JButton reset;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField u_adr;
    private javax.swing.JButton u_clt;
    private javax.swing.JTextField u_fname;
    private javax.swing.JTextField u_lname;
    private javax.swing.JTextField u_ncin;
    private javax.swing.JTextField u_tel;
    private javax.swing.JButton v_clt;
    private javax.swing.JTextField v_ncin;
    // End of variables declaration//GEN-END:variables

    
}
