/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.layerd.view;

import java.awt.Color;
import static java.awt.Color.green;
import static java.awt.Color.lightGray;
import static java.awt.Color.red;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import pos.layerd.controller.ItemController;
import pos.layerd.dto.ItemDto;


/**
 *
 * @author TOSHIBA
 */
public class ItemPanel extends javax.swing.JPanel {

    private ItemController itemController;
    public ItemPanel() throws Exception {
         itemController=new ItemController();
        initComponents();
         loadAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basepanel = new javax.swing.JPanel();
        headerpanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        homepanel = new javax.swing.JPanel();
        descriptionLabel = new javax.swing.JLabel();
        descriptiontext = new javax.swing.JTextField();
        itemIdLabel = new javax.swing.JLabel();
        itemIdtext = new javax.swing.JTextField();
        unitPriceLabel = new javax.swing.JLabel();
        unitPricetext = new javax.swing.JTextField();
        quentityonhandtext = new javax.swing.JTextField();
        quentityOnHandLabel = new javax.swing.JLabel();
        customerDOBLabel1 = new javax.swing.JLabel();
        packSizetext = new javax.swing.JTextField();
        tablepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        deleteItemButton = new javax.swing.JButton();
        updateItemButton = new javax.swing.JButton();
        addItemButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(765, 579));

        basepanel.setPreferredSize(new java.awt.Dimension(800, 500));

        headerpanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerpanel.setPreferredSize(new java.awt.Dimension(800, 500));

        headerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerlabel.setText("Manage Item");
        headerlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        homepanel.setPreferredSize(new java.awt.Dimension(800, 400));

        descriptionLabel.setText("Description");

        descriptiontext.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));
        descriptiontext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descriptiontextKeyReleased(evt);
            }
        });

        itemIdLabel.setText("Item Id");

        itemIdtext.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));
        itemIdtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemIdtextKeyReleased(evt);
            }
        });

        unitPriceLabel.setText("Unit Price");

        unitPricetext.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));
        unitPricetext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unitPricetextKeyReleased(evt);
            }
        });

        quentityonhandtext.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));
        quentityonhandtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quentityonhandtextKeyReleased(evt);
            }
        });

        quentityOnHandLabel.setText("QoH");

        customerDOBLabel1.setText("Pack Size");

        packSizetext.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));
        packSizetext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                packSizetextKeyReleased(evt);
            }
        });

        tablepanel.setPreferredSize(new java.awt.Dimension(750, 750));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 600));

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        itemTable.setPreferredSize(new java.awt.Dimension(900, 900));
        itemTable.setShowGrid(false);
        itemTable.setShowVerticalLines(true);
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemTable);

        deleteItemButton.setText("Delete Item");
        deleteItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemButtonActionPerformed(evt);
            }
        });

        updateItemButton.setText("Update Item");
        updateItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemButtonActionPerformed(evt);
            }
        });

        addItemButton.setText("Save Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablepanelLayout = new javax.swing.GroupLayout(tablepanel);
        tablepanel.setLayout(tablepanelLayout);
        tablepanelLayout.setHorizontalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tablepanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        tablepanelLayout.setVerticalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablepanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteItemButton)
                    .addComponent(updateItemButton)
                    .addComponent(addItemButton))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(homepanelLayout.createSequentialGroup()
                                    .addComponent(customerDOBLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(packSizetext))
                                .addGroup(homepanelLayout.createSequentialGroup()
                                    .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(itemIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(descriptiontext, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(homepanelLayout.createSequentialGroup()
                                .addComponent(quentityOnHandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quentityonhandtext, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(homepanelLayout.createSequentialGroup()
                                .addComponent(unitPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unitPricetext, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homepanelLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(itemIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(749, Short.MAX_VALUE)))
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptiontext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(itemIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packSizetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerDOBLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitPricetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quentityonhandtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quentityOnHandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
            .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homepanelLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(itemIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(790, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout headerpanelLayout = new javax.swing.GroupLayout(headerpanel);
        headerpanel.setLayout(headerpanelLayout);
        headerpanelLayout.setHorizontalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerpanelLayout.setVerticalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout basepanelLayout = new javax.swing.GroupLayout(basepanel);
        basepanel.setLayout(basepanelLayout);
        basepanelLayout.setHorizontalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        basepanelLayout.setVerticalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(basepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
        try {
            searchItem();
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemTableMouseClicked

    private void deleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemButtonActionPerformed
        try {
            deleteItem();
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteItemButtonActionPerformed

    private void updateItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemButtonActionPerformed
        try {
            updateItem();
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateItemButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
         formValidate();
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void itemIdtextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemIdtextKeyReleased
        if(((LineBorder)itemIdtext. getBorder()).getLineColor()==red &(itemIdtext.getText().equals("")==false) ){
    itemIdtext.setBorder(BorderFactory. createLineBorder(Color. green)); 
    
}else if(((LineBorder)itemIdtext. getBorder()).getLineColor()==green  &(itemIdtext.getText().equals("")==true)){
  
    itemIdtext.setBorder(BorderFactory. createLineBorder(Color. red)); 
        }else if((itemIdtext.getText().equals("")==false)){
           itemIdtext.setBorder(BorderFactory. createLineBorder(Color. green));     
                
    } else{
            
        }   
    }//GEN-LAST:event_itemIdtextKeyReleased

    private void descriptiontextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptiontextKeyReleased
         if(((LineBorder)descriptiontext. getBorder()).getLineColor()==red &(descriptiontext.getText().equals("")==false) ){
    descriptiontext.setBorder(BorderFactory. createLineBorder(Color. green)); 
    
}else if(((LineBorder)descriptiontext. getBorder()).getLineColor()==green  &(descriptiontext.getText().equals("")==true)){
  
    descriptiontext.setBorder(BorderFactory. createLineBorder(Color. red)); 
        }else if((descriptiontext.getText().equals("")==false)){
           descriptiontext.setBorder(BorderFactory. createLineBorder(Color. green));     
                
    } else{
            
        }   
    }//GEN-LAST:event_descriptiontextKeyReleased

    private void packSizetextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_packSizetextKeyReleased
       
        if(((LineBorder)packSizetext. getBorder()).getLineColor()==red &(packSizetext.getText().equals("")==false) ){
    packSizetext.setBorder(BorderFactory. createLineBorder(Color. green)); 
    
}else if(((LineBorder)packSizetext. getBorder()).getLineColor()==green  &(packSizetext.getText().equals("")==true)){
  
    packSizetext.setBorder(BorderFactory. createLineBorder(Color. red)); 
        }else if((packSizetext.getText().equals("")==false)){
           packSizetext.setBorder(BorderFactory. createLineBorder(Color. green));     
                
    } else{
            
        }   
    }//GEN-LAST:event_packSizetextKeyReleased

    private void unitPricetextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitPricetextKeyReleased
       if(((LineBorder)unitPricetext. getBorder()).getLineColor()==red &(isDouble(unitPricetext.getText())==true) ){
    unitPricetext.setBorder(BorderFactory. createLineBorder(Color. green)); 
    
}else if(((LineBorder)unitPricetext. getBorder()).getLineColor()==green  &(isDouble(unitPricetext.getText())==false)){
  
  unitPricetext.setBorder(BorderFactory. createLineBorder(Color. red)); 
        }else if(isDouble(unitPricetext.getText())==true){
         unitPricetext.setBorder(BorderFactory. createLineBorder(Color. green));       
                
    } else if(((LineBorder)unitPricetext. getBorder()).getLineColor()==red &(isDouble(unitPricetext.getText())==false)){
        unitPricetext.setBorder(BorderFactory. createLineBorder(Color. red)); 
    } else{
        
    }   
        
    }//GEN-LAST:event_unitPricetextKeyReleased

    private void quentityonhandtextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quentityonhandtextKeyReleased
        if(((LineBorder)quentityonhandtext. getBorder()).getLineColor()==red &(isInteger(quentityonhandtext.getText())==true) ){
    quentityonhandtext.setBorder(BorderFactory. createLineBorder(Color. green)); 
    
}else if(((LineBorder)quentityonhandtext. getBorder()).getLineColor()==green  &(isInteger(quentityonhandtext.getText())==false)){
  
  quentityonhandtext.setBorder(BorderFactory. createLineBorder(Color. red)); 
        }else if(isInteger(quentityonhandtext.getText())==true){
         quentityonhandtext.setBorder(BorderFactory. createLineBorder(Color. green));       
                
    } else if(((LineBorder)quentityonhandtext. getBorder()).getLineColor()==red &(isInteger(quentityonhandtext.getText())==false)){
        quentityonhandtext.setBorder(BorderFactory. createLineBorder(Color. red)); 
    } else{
        
    }   
        
    }//GEN-LAST:event_quentityonhandtextKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel basepanel;
    private javax.swing.JLabel customerDOBLabel1;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField descriptiontext;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JPanel homepanel;
    private javax.swing.JLabel itemIdLabel;
    private javax.swing.JTextField itemIdtext;
    private javax.swing.JTable itemTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField packSizetext;
    private javax.swing.JLabel quentityOnHandLabel;
    private javax.swing.JTextField quentityonhandtext;
    private javax.swing.JPanel tablepanel;
    private javax.swing.JLabel unitPriceLabel;
    private javax.swing.JTextField unitPricetext;
    private javax.swing.JButton updateItemButton;
    // End of variables declaration//GEN-END:variables

    private void searchItem() throws Exception {
     try {
            String itemCode=itemTable.getValueAt(itemTable.getSelectedRow(), 0).toString();
            ItemDto itemDto=itemController.getItem(itemCode);
            
            if(itemDto!=null){
                
               itemIdtext.setText(itemDto.getItemCode());
               descriptiontext.setText(itemDto.getDescription());
               packSizetext.setText(itemDto.getPackSize());
               unitPricetext.setText(Double.toString(itemDto.getUnitPrice()));
               quentityonhandtext.setText(Integer.toString(itemDto.getQoh()));
               
    
                
                
                }else{
                
                JOptionPane.showMessageDialog(this,"Item Not Found");
                
                
            }
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
}
        
        public void updateItem() throws Exception{
    
        try {
            ItemDto item=new ItemDto(itemIdtext.getText(),
                    descriptiontext.getText(),
                   packSizetext.getText(),
                    
                    Double.parseDouble(unitPricetext.getText()),
                    Integer.parseInt(quentityonhandtext.getText()));
                    
           String resp= itemController.updateItem(item);
           
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
           
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    
           
        
        
        
        
        
    }

    private void deleteItem() throws Exception {
       try {
            String itemCode=itemIdtext.getText();
            String resp= itemController.deleteItem(itemCode);
            
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
}  
        
        
         
    }

    
        
        
        
        
        
         
    

    private void saveItem() {
        
       try {
           ItemDto itemDto = new ItemDto(itemIdtext.getText(), descriptiontext.getText(), packSizetext.getText(),Double.parseDouble(unitPricetext.getText()), Integer.parseInt(quentityonhandtext.getText()));
           
           String result=itemController.addItem(itemDto);
           JOptionPane.showMessageDialog(this, result);
           
           loadAllItems();
           clear();
           
       } catch (Exception ex) {
           Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
       }
    
     
        
        
    }

    private void loadAllItems() throws Exception {
      try {
            String[] Columns={"Item Code","Description","PackSize","UnitPrice","QtyOnHand"};
            DefaultTableModel dtm=new DefaultTableModel(Columns,0){
                
                public boolean isCellEditable(int row,int column){
                    return false;
                }
                
            };
            
            itemTable.setModel(dtm);
            
            ArrayList<ItemDto> items=itemController.getAllItems();
            
            for(ItemDto item :items){
                Object[] rowData={item.getItemCode(),item.getDescription(),"           "+"   "+item.getPackSize(),"        "+" "+item.getUnitPrice(),item.getQoh()};
                dtm.addRow(rowData);
            }  } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        
        
    }

    private void clear() {
        
         itemIdtext.setText("");
    descriptiontext.setText("");
    packSizetext.setText("");
    unitPricetext.setText("");
    quentityonhandtext.setText("");
    
    itemIdtext.setBorder(BorderFactory.createLineBorder(lightGray));
    
    descriptiontext.setBorder(BorderFactory.createLineBorder(lightGray));
     packSizetext.setBorder(BorderFactory.createLineBorder(lightGray));
    unitPricetext.setBorder(BorderFactory.createLineBorder(lightGray));
      quentityonhandtext.setBorder(BorderFactory.createLineBorder(lightGray));       
      
    
    
    
        
    }

    private boolean isDouble(String input) {
     
        try {
            Double.parseDouble(input);
            
            return true;
        } catch (NumberFormatException e) {
            
            return false;
        }
    
    
   }
    
    private boolean isInteger(String input){
      try {
            Integer.parseInt(input);
            
            return true;
        } catch (NumberFormatException e) {
            
            return false;
        }  
        
        
        
        
    }
    
  private void formValidate() {
       
        String id=itemIdtext.getText();
        
          String name=descriptiontext.getText();
          String pack=packSizetext.getText();
          String unitprice=unitPricetext.getText();
             String qoh=quentityonhandtext.getText();
              
                
                if(id.equals("")){
                   JOptionPane.showMessageDialog(this, "Please enter Item Id");
                  itemIdtext.setBorder(BorderFactory. createLineBorder(Color. red));
                   
                  
                                      
                }else if(name.equals("")){
                   
                   JOptionPane.showMessageDialog(this, "Please enter Item Description");
                   
                   
                }else if(pack.equals("")){
                    
                     
                   JOptionPane.showMessageDialog(this, "Please enter Pack Size");
                   packSizetext.setBorder(BorderFactory. createLineBorder(Color. red));
                }
      
                else if(unitprice.equals("")){
                    
                  JOptionPane.showMessageDialog(this, "Please enter Unit Price");
                unitPricetext .setBorder(BorderFactory. createLineBorder(Color. red));   
               
               
               }else if(qoh.equals("")){
                    
                   JOptionPane.showMessageDialog(this, "Please enter qoh");
                   quentityonhandtext.setBorder(BorderFactory. createLineBorder(Color. red));
                   
               }else if((isDouble(unitprice))==false){
                  
                    JOptionPane.showMessageDialog(this, "Please enter Valid Unit Price");  
                   unitPricetext.setBorder(BorderFactory. createLineBorder(Color. red)); 
                 
                  }else if((isInteger(qoh))==false){
                  
                    JOptionPane.showMessageDialog(this, "Please enter Valid qoh");  
                   unitPricetext.setBorder(BorderFactory. createLineBorder(Color. red)); 
                   
                    
                }else{
                   
                    saveItem();
                }
        
        
        
        
        
        
        
        
    }  
    
    
    
    
}
