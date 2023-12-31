/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.layerd.view;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author TOSHIBA
 */
public class LayoutView extends javax.swing.JFrame {

    /**
     * Creates new form LayoutView
     */
    public LayoutView() {
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

        headerpanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        sidnavpanel = new javax.swing.JPanel();
        manageorderButton = new javax.swing.JButton();
        manageCustButton1 = new javax.swing.JButton();
        manageItemButton1 = new javax.swing.JButton();
        bodypanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerpanel.setBackground(new java.awt.Color(102, 102, 255));

        headerLabel.setBackground(new java.awt.Color(102, 102, 255));
        headerLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Super Market");

        javax.swing.GroupLayout headerpanelLayout = new javax.swing.GroupLayout(headerpanel);
        headerpanel.setLayout(headerpanelLayout);
        headerpanelLayout.setHorizontalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerpanelLayout.setVerticalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidnavpanel.setBackground(new java.awt.Color(204, 204, 255));

        manageorderButton.setBackground(new java.awt.Color(153, 153, 255));
        manageorderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manageorderButton.setText("Order");
        manageorderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageorderButtonActionPerformed(evt);
            }
        });

        manageCustButton1.setBackground(new java.awt.Color(153, 153, 255));
        manageCustButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manageCustButton1.setText("Manage Customer");
        manageCustButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustButton1ActionPerformed(evt);
            }
        });

        manageItemButton1.setBackground(new java.awt.Color(153, 153, 255));
        manageItemButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manageItemButton1.setText("Manage Item");
        manageItemButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageItemButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidnavpanelLayout = new javax.swing.GroupLayout(sidnavpanel);
        sidnavpanel.setLayout(sidnavpanelLayout);
        sidnavpanelLayout.setHorizontalGroup(
            sidnavpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidnavpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidnavpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageCustButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(manageorderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(sidnavpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sidnavpanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(manageItemButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        sidnavpanelLayout.setVerticalGroup(
            sidnavpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidnavpanelLayout.createSequentialGroup()
                .addComponent(manageCustButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(manageorderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
            .addGroup(sidnavpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sidnavpanelLayout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(manageItemButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(453, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout bodypanelLayout = new javax.swing.GroupLayout(bodypanel);
        bodypanel.setLayout(bodypanelLayout);
        bodypanelLayout.setHorizontalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        bodypanelLayout.setVerticalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidnavpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidnavpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bodypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageorderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageorderButtonActionPerformed
       loadOrderPanel();
 
    }//GEN-LAST:event_manageorderButtonActionPerformed

    private void manageCustButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustButton1ActionPerformed
        loadCustomerPanel();
    }//GEN-LAST:event_manageCustButton1ActionPerformed

    private void manageItemButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageItemButton1ActionPerformed
        try {
            loadItemPanel();
        } catch (Exception ex) {
            Logger.getLogger(LayoutView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_manageItemButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodypanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JButton manageCustButton1;
    private javax.swing.JButton manageItemButton1;
    private javax.swing.JButton manageorderButton;
    private javax.swing.JPanel sidnavpanel;
    // End of variables declaration//GEN-END:variables

    private void loadCustomerPanel() {
        bodypanel.removeAll();
        CustomerPanel customerPanel=new CustomerPanel();
        customerPanel.setSize(bodypanel.getWidth(),bodypanel.getHeight());
        bodypanel.add(customerPanel);
        bodypanel.repaint();
        bodypanel.revalidate();
        
}

    private void loadItemPanel() throws Exception  {
        
         bodypanel.removeAll();
        ItemPanel itemPanel=new ItemPanel();
        itemPanel.setSize(bodypanel.getWidth(),bodypanel.getHeight());
        bodypanel.add(itemPanel);
        bodypanel.repaint();
        bodypanel.revalidate();
       
    }

   

    private void loadOrderPanel() {
         bodypanel.removeAll();
        OrderPanel orderPanel=new OrderPanel();
        orderPanel.setSize(bodypanel.getWidth(),bodypanel.getHeight());
        bodypanel.add(orderPanel);
        bodypanel.repaint();
        bodypanel.revalidate();
        
    }
}