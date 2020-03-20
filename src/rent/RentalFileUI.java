/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent;

import authentication.Home;
import cars.CarCrudSystem;
import clients.Client;
import clients.ClientCrudSystem;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Med Amine Ben Ammar
 */
public class RentalFileUI extends javax.swing.JFrame {

    /**
     * Creates new form RentalFormUI
     * @param date
     */
    public RentalFileUI(String date) {
        initComponents();
        v_date_display.setText(date);
        DefaultTableModel model = (DefaultTableModel) v_rent.getModel();
        int i = 0;
        String lname;
        int tel;
        
        
        System.out.println(date);
        for(Rent list:RentCrudSystem.getAllRentsByDate(date))
        {
            i++;
            lname = ClientCrudSystem.getClient(list.getNcin()).getLname();
            tel = ClientCrudSystem.getClient(list.getNcin()).getTel();
            String mar = CarCrudSystem.getCar(list.getId()).getMar();
            Object[] row = { i, list.getNcin(), lname, tel, list.getId() , mar, list.getPd(), list.getNbd(), list.getPd() * list.getNbd() };
            model.addRow(row);
        }
    }

    private RentalFileUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void setDate(String date)
    {
        v_date_display.setText(date);
    }
    
    
    public void setAdmin(String admin)
    {
        r_admin_name.setText(admin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        v_rent = new javax.swing.JTable();
        v_date_display = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        r_admin_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        v_rent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N : ", "Ncin", "Last Name", "Tel", "ID", "Mark", "Price Per Day", "Number Of Days", "Price"
            }
        ));
        jScrollPane1.setViewportView(v_rent);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 590, 380));
        getContentPane().add(v_date_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 180, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Retour");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 60, 40));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_pic.png"))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 70));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setText("Admin Name : ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 110, 60));

        r_admin_name.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        r_admin_name.setText("jLabel12");
        getContentPane().add(r_admin_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 110, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Home home = new Home();
        home.setHomeUsername(r_admin_name.getText());
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(RentalFileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentalFileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentalFileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentalFileUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RentalFileUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel r_admin_name;
    private javax.swing.JLabel v_date_display;
    private javax.swing.JTable v_rent;
    // End of variables declaration//GEN-END:variables
}