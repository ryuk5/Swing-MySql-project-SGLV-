/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent;

import authentication.Home;
import cars.Car;
import cars.CarCrudSystem;
import clients.Client;
import clients.ClientCrudSystem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Med Amine Ben Ammar
 */
public class RentCrudSystemUI extends javax.swing.JFrame {

    /**
     * Creates new form RentCrudSystem
     */
    public RentCrudSystemUI() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) rents_data.getModel();
        for(Rent list:RentCrudSystem.getAllRents())
        {
            Object[] row = { list.getNcin(), list.getId(), list.getDate(), list.getNbd() , list.getPd() };
            model.addRow(row);
        }
    }
    
    
    public void setAdminInfo(String name)
    {
        c_admin_name.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rents_data = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        r_pd = new javax.swing.JTextField();
        r_ncin = new javax.swing.JTextField();
        r_id = new javax.swing.JTextField();
        r_date = new javax.swing.JTextField();
        r_nbd = new javax.swing.JTextField();
        r_res = new javax.swing.JButton();
        r_add = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        v_date = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        u_r_pd = new javax.swing.JTextField();
        u_r_ncin = new javax.swing.JTextField();
        u_r_id = new javax.swing.JTextField();
        u_r_date = new javax.swing.JTextField();
        u_r_nbd = new javax.swing.JTextField();
        r_delete = new javax.swing.JButton();
        u_r_find = new javax.swing.JButton();
        r_update = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        c_admin_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rents_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ncin", "Mat", "Date", "NBD", "PD"
            }
        ));
        jScrollPane1.setViewportView(rents_data);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("View Rent", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("PD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Ncin");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Date");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("NBD");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 50));
        jPanel2.add(r_pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 170, 40));

        r_ncin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_ncinActionPerformed(evt);
            }
        });
        jPanel2.add(r_ncin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 170, 40));
        jPanel2.add(r_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, 40));
        jPanel2.add(r_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, 40));
        jPanel2.add(r_nbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 170, 40));

        r_res.setBackground(new java.awt.Color(255, 255, 255));
        r_res.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        r_res.setText("Reset");
        r_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_resActionPerformed(evt);
            }
        });
        jPanel2.add(r_res, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 120, 60));

        r_add.setBackground(new java.awt.Color(255, 255, 255));
        r_add.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        r_add.setText("Add Rent");
        r_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_addActionPerformed(evt);
            }
        });
        jPanel2.add(r_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 120, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/files-and-folders.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 140, 170));

        jTabbedPane1.addTab("Add Rent", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("Check by Date :");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 100));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("Rental Form");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 130, 100));
        jPanel4.add(v_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 280, 70));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 90, 70));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer-support.png"))); // NOI18N
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 160, 140));

        jTabbedPane1.addTab("Rental Form", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("PD");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Ncin");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("ID");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Date");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("NBD");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 80, 30));
        jPanel3.add(u_r_pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 160, 40));
        jPanel3.add(u_r_ncin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 160, 40));
        jPanel3.add(u_r_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 160, 40));
        jPanel3.add(u_r_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, 40));
        jPanel3.add(u_r_nbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, 40));

        r_delete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        r_delete.setText("Delete");
        r_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(r_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 140, 50));

        u_r_find.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        u_r_find.setText("Find");
        u_r_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_r_findActionPerformed(evt);
            }
        });
        jPanel3.add(u_r_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 170, 70));

        r_update.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        r_update.setText("Update");
        r_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_updateActionPerformed(evt);
            }
        });
        jPanel3.add(r_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 140, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telegram.png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 180, 150));

        jTabbedPane1.addTab("Update / Delete", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 690, 350));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 70, 70));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_pic.png"))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 70));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setText("Admin Name : ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 110, 60));

        c_admin_name.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        c_admin_name.setText("jLabel12");
        getContentPane().add(c_admin_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 110, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        Home home = new Home();
        home.setHomeUsername(c_admin_name.getText());
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        Home home = new Home();
        home.setHomeUsername(c_admin_name.getText());
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void r_ncinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_ncinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_ncinActionPerformed

    private void r_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_resActionPerformed
        // TODO add your handling code here:
        r_ncin.setText("");
        r_id.setText("");
        r_date.setText("");
        r_nbd.setText("");
        r_pd.setText("");
        r_ncin.setEditable(true);
        r_id.setEditable(true);
        r_date.setEditable(true);
    }//GEN-LAST:event_r_resActionPerformed

    private void r_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_addActionPerformed
        // TODO add your handling code here:
        String t_r_ncin = r_ncin.getText();
        String t_r_id = r_id.getText();
        String t_r_date = r_date.getText();
        String t_r_nbd = r_nbd.getText();
        String t_r_pd = r_pd.getText();
        
        int ncin = Integer.parseInt(t_r_ncin);
        int id = Integer.parseInt(t_r_id);
        int nbd = Integer.parseInt(t_r_nbd);
        int pd = Integer.parseInt(t_r_pd);
        
        Rent rent = new Rent(ncin,id,t_r_date,nbd,pd);
        Rent test_existence = RentCrudSystem.getRent(ncin, id, t_r_date);
        
        Car car = CarCrudSystem.getCar(id);
        Client clt = ClientCrudSystem.getClient(ncin);
        if(clt.getNcin() == 0)
        {
           JOptionPane.showMessageDialog(jPanel3,"Ncin Not Found Error 404 !!!","Warning",JOptionPane.ERROR_MESSAGE); 
        }
        else if(car.getId() == 0)
        {
            JOptionPane.showMessageDialog(jPanel3,"ID Not Found Error 404 !!!","Warning",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            //Rent
                if (test_existence.getNcin() == 0) {
                    int status = RentCrudSystem.save(rent);
                    if(status > 0)
                    {
                        JOptionPane.showMessageDialog(jPanel3,"Rent Added succesfully");
                        this.setVisible(false);
                        RentCrudSystemUI ui = new RentCrudSystemUI();
                        ui.setAdminInfo(c_admin_name.getText());
                        ui.setVisible(true);   

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(jPanel3,"Sorry! Error Occured","Warning",JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(jPanel3,"Valeur Dupliquer","Warning",JOptionPane.ERROR_MESSAGE);
                }
        }
        
                
        
           
    }//GEN-LAST:event_r_addActionPerformed

    private void u_r_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_r_findActionPerformed
        // TODO add your handling code here:
        String t_ncin = u_r_ncin.getText();
        String t_id = u_r_id.getText();
        String t_date = u_r_date.getText();
        
        
        int ncin = Integer.parseInt(t_ncin);
        int id = Integer.parseInt(t_id);
        
        
        Car car = CarCrudSystem.getCar(id);
        Client clt = ClientCrudSystem.getClient(ncin);
        Rent rent = RentCrudSystem.getRent(ncin, id, t_date);
        if(car.getId() == 0)
        {
            //karhba mch mawjouda fél base de donnée
            JOptionPane.showMessageDialog(jPanel3,"Sorry! ID Not Found Error Occured","Warning",JOptionPane.ERROR_MESSAGE);
            u_r_ncin.setEditable(true);
            u_r_id.setEditable(true);
            u_r_date.setEditable(true);
        }
        else if(clt.getNcin() == 0)
        {
            //enssen mch mawjoud
            JOptionPane.showMessageDialog(jPanel3,"Sorry! Ncin Not Found Error Occured","Warning",JOptionPane.ERROR_MESSAGE);
            u_r_ncin.setEditable(true);
            u_r_id.setEditable(true);
            u_r_date.setEditable(true);
        }
        else if(rent.getNcin() == 0)
        {
            //rent mch mawjoud
            JOptionPane.showMessageDialog(jPanel3,"Sorry! Rent Not Found Error Occured","Warning",JOptionPane.ERROR_MESSAGE);
            u_r_ncin.setEditable(true);
            u_r_id.setEditable(true);
            u_r_date.setEditable(true);
        }
        else
        {
            u_r_ncin.setEditable(false);
            u_r_id.setEditable(false);
            u_r_date.setEditable(false);
            
            String s_nbd = Integer.toString(rent.getNbd());
            String s_pd = Integer.toString(rent.getPd());
            u_r_nbd.setText(s_nbd);
            u_r_pd.setText(s_pd);
        }
    }//GEN-LAST:event_u_r_findActionPerformed

    private void r_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_deleteActionPerformed
        // TODO add your handling code here:
        String t_ncin = u_r_ncin.getText();
        String t_id = u_r_id.getText();
        String t_date = u_r_date.getText();
        
        
        int ncin = Integer.parseInt(t_ncin);
        int id = Integer.parseInt(t_id);
        
        int status = RentCrudSystem.delete(ncin, id, t_date);
            if(status > 0)
            {
                JOptionPane.showMessageDialog(jPanel3,"Record Deleted succesfully");
                this.setVisible(false);
                RentCrudSystemUI ui = new RentCrudSystemUI();
                ui.setAdminInfo(c_admin_name.getText());
                ui.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel3,"Sorry! Error Occured","Warning",JOptionPane.ERROR_MESSAGE);
            } 
        
    }//GEN-LAST:event_r_deleteActionPerformed

    private void r_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_updateActionPerformed
        // TODO add your handling code here:
        String t_ncin = u_r_ncin.getText();
        String t_id = u_r_id.getText();
        String t_date = u_r_date.getText();
        String t_nbd = u_r_nbd.getText();
        String t_pd = u_r_pd.getText();
        
        int ncin = Integer.parseInt(t_ncin);
        int id = Integer.parseInt(t_id);
        int nbd = Integer.parseInt(t_nbd);
        int pd = Integer.parseInt(t_pd);
        
        Rent rent = new Rent(ncin,id,t_date,nbd,pd);
        
        int status = RentCrudSystem.update(rent);
            if(status > 0)
            {
                JOptionPane.showMessageDialog(jPanel3,"Rent Updated succesfully");
                this.setVisible(false);
                RentCrudSystemUI ui = new RentCrudSystemUI();
                ui.setAdminInfo(c_admin_name.getText());
                ui.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel3,"Sorry! Error Occured","Warning",JOptionPane.ERROR_MESSAGE);
            } 
    }//GEN-LAST:event_r_updateActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        String date = this.v_date.getText();
        RentalFileUI v_rentUI = new RentalFileUI(date);
        v_rentUI.setAdmin(c_admin_name.getText());
        this.setVisible(false);
        v_rentUI.setVisible(true);
       
    }//GEN-LAST:event_jLabel18MouseClicked

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
            java.util.logging.Logger.getLogger(RentCrudSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentCrudSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentCrudSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentCrudSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RentCrudSystemUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c_admin_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel pic;
    private javax.swing.JButton r_add;
    private javax.swing.JTextField r_date;
    private javax.swing.JButton r_delete;
    private javax.swing.JTextField r_id;
    private javax.swing.JTextField r_nbd;
    private javax.swing.JTextField r_ncin;
    private javax.swing.JTextField r_pd;
    private javax.swing.JButton r_res;
    private javax.swing.JButton r_update;
    private javax.swing.JTable rents_data;
    private javax.swing.JTextField u_r_date;
    private javax.swing.JButton u_r_find;
    private javax.swing.JTextField u_r_id;
    private javax.swing.JTextField u_r_nbd;
    private javax.swing.JTextField u_r_ncin;
    private javax.swing.JTextField u_r_pd;
    private javax.swing.JTextField v_date;
    // End of variables declaration//GEN-END:variables
}
