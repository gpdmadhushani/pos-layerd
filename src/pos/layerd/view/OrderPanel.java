/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.layerd.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.layerd.controller.CustomerController;
import pos.layerd.controller.ItemController;
import pos.layerd.controller.OrderController;
import pos.layerd.dto.CustomerDto;
import pos.layerd.dto.ItemDto;
import pos.layerd.dto.OrderDetailDto;
import pos.layerd.dto.OrderDto;

/**
 *
 * @author TOSHIBA
 */
public class OrderPanel extends javax.swing.JPanel {
 private CustomerController customerController;
    
     private ItemController itemController;
     private OrderController orderController;
     
     ArrayList<OrderDetailDto> orderDetailDto=new ArrayList<>();
    public OrderPanel() {
        customerController=new CustomerController();
        itemController=new ItemController();
        orderController=new OrderController();
        
        initComponents();
        
        loadTable();
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
        homepanel = new javax.swing.JPanel();
        customerLabel = new javax.swing.JLabel();
        customertext = new javax.swing.JTextField();
        orderIdLabel = new javax.swing.JLabel();
        orderIdtext = new javax.swing.JTextField();
        tablepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        itemIdLabel = new javax.swing.JLabel();
        quentitytext = new javax.swing.JTextField();
        searchitemButton = new javax.swing.JButton();
        itemdetailsLabel = new javax.swing.JLabel();
        quentityIdLabel = new javax.swing.JLabel();
        itemIdtext1 = new javax.swing.JTextField();
        discountLabel = new javax.swing.JLabel();
        discounttext = new javax.swing.JTextField();
        addItemButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        totalTextField = new javax.swing.JTextField();
        placeOrdereButton = new javax.swing.JButton();
        itemDetailsLabel = new javax.swing.JLabel();
        itemlabel2 = new javax.swing.JLabel();
        itemdetailLabel3 = new javax.swing.JLabel();
        iemqohlabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        custdetails = new javax.swing.JLabel();
        headerlabel = new javax.swing.JLabel();

        basepanel.setPreferredSize(new java.awt.Dimension(800, 900));

        headerpanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerpanel.setPreferredSize(new java.awt.Dimension(800, 500));

        homepanel.setPreferredSize(new java.awt.Dimension(800, 400));

        customerLabel.setText("Customer");

        orderIdLabel.setText("Order Id");

        tablepanel.setPreferredSize(new java.awt.Dimension(800, 750));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 600));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
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
        orderTable.setPreferredSize(new java.awt.Dimension(900, 900));
        orderTable.setShowGrid(false);
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderTable);

        itemIdLabel.setText("Item Id");

        searchitemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchitemButton.setText("Search");
        searchitemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchitemButtonActionPerformed(evt);
            }
        });

        quentityIdLabel.setText("QTY");

        discountLabel.setText("Discount");

        addItemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        totalLabel.setText("Total Price");

        placeOrdereButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        placeOrdereButton.setText("Place Order");
        placeOrdereButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrdereButtonActionPerformed(evt);
            }
        });

        itemdetailLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        iemqohlabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        javax.swing.GroupLayout tablepanelLayout = new javax.swing.GroupLayout(tablepanel);
        tablepanel.setLayout(tablepanelLayout);
        tablepanelLayout.setHorizontalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tablepanelLayout.createSequentialGroup()
                            .addComponent(discountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(discounttext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(addItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(tablepanelLayout.createSequentialGroup()
                            .addComponent(itemIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(itemIdtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(searchitemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tablepanelLayout.createSequentialGroup()
                        .addComponent(quentityIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quentitytext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemdetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tablepanelLayout.createSequentialGroup()
                        .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(itemDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(itemlabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
                            .addComponent(itemdetailLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tablepanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(iemqohlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablepanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tablepanelLayout.createSequentialGroup()
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(placeOrdereButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
        );
        tablepanelLayout.setVerticalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchitemButton)
                    .addComponent(itemdetailsLabel)
                    .addComponent(itemIdtext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemDetailsLabel)
                    .addComponent(itemlabel2)
                    .addComponent(itemdetailLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablepanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quentityIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quentitytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tablepanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(iemqohlabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discounttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItemButton))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeOrdereButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        custdetails.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(orderIdtext, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(customertext))
                .addGap(18, 18, 18)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(custdetails, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(homepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton)))
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(custdetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(457, 457, 457))
        );

        javax.swing.GroupLayout headerpanelLayout = new javax.swing.GroupLayout(headerpanel);
        headerpanel.setLayout(headerpanelLayout);
        headerpanelLayout.setHorizontalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerpanelLayout.setVerticalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanelLayout.createSequentialGroup()
                .addComponent(homepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout basepanelLayout = new javax.swing.GroupLayout(basepanel);
        basepanel.setLayout(basepanelLayout);
        basepanelLayout.setHorizontalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        basepanelLayout.setVerticalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(394, Short.MAX_VALUE))
        );

        headerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerlabel.setText(" Order");
        headerlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(basepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                    .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlabel)
                .addGap(18, 18, 18)
                .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked

    }//GEN-LAST:event_orderTableMouseClicked

    private void searchitemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchitemButtonActionPerformed

           
     try {
         searchItem();
     } catch (Exception ex) {
         Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
     }
    
    }//GEN-LAST:event_searchitemButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
addToTable();        
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
       searchCustomer();       
    }//GEN-LAST:event_searchButtonActionPerformed

    private void placeOrdereButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrdereButtonActionPerformed
placeOrder() ;      
    }//GEN-LAST:event_placeOrdereButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel basepanel;
    private javax.swing.JLabel custdetails;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JTextField customertext;
    private javax.swing.JLabel discountLabel;
    private javax.swing.JTextField discounttext;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JPanel homepanel;
    private javax.swing.JLabel iemqohlabel;
    private javax.swing.JLabel itemDetailsLabel;
    private javax.swing.JLabel itemIdLabel;
    private javax.swing.JTextField itemIdtext1;
    private javax.swing.JLabel itemdetailLabel3;
    private javax.swing.JLabel itemdetailsLabel;
    private javax.swing.JLabel itemlabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel orderIdLabel;
    private javax.swing.JTextField orderIdtext;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton placeOrdereButton;
    private javax.swing.JLabel quentityIdLabel;
    private javax.swing.JTextField quentitytext;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchitemButton;
    private javax.swing.JPanel tablepanel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        
      String[] Columns={"Item Code","Qty","Discount"};
 DefaultTableModel dtm=new DefaultTableModel(Columns,0){
     
     public boolean isCellEditable(int row,int column){
                    return false;
                }
                 
     };
orderTable.setModel(dtm);   
        
        
    }

    private void searchCustomer() {
       
     try {
            String custId=customertext.getText();
            CustomerDto customer=customerController.getCustomer(custId);
            if(customer!=null){
                custdetails.setText("Customer Name:"+customer.getName()+"  | Address:"+customer.getAddress());
            }else{
                 JOptionPane.showMessageDialog(this,"Customer Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }   
        
        
    }
    
 private void searchItem() throws Exception{
    
    try {
            String itemId=itemIdtext1.getText();
            ItemDto item=itemController.getItem(itemId);
            if(item!=null){
                itemdetailLabel3.setText("Item Name :"+item.getDescription()+"|Unit Price : "+item.getUnitPrice());
                iemqohlabel.setText("QtyOnHand :"+item.getQoh());
            }else{
                 JOptionPane.showMessageDialog(this,"Item Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(this,ex.getMessage());
        } 
    
    
}
   
  private void addToTable() {
    OrderDetailDto od =new OrderDetailDto(itemIdtext1.getText(), Integer.parseInt(quentitytext.getText()), Double.parseDouble(discounttext.getText()));
orderDetailDto.add(od);
Object[] rowData={od.getItemCode(),"                   "+od.getOrderQTY(),"       "+od.getDiscount()};

DefaultTableModel dtm=(DefaultTableModel) orderTable.getModel();
dtm.addRow(rowData);
       try {
            //loadtotal();
        } catch (Exception ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
cleanItemData();
}  

    private void cleanItemData() {
      itemIdtext1.setText("");
    quentitytext.setText("");
    discounttext.setText("");
    itemdetailsLabel.setText("");
      
        
        
    }

    private void placeOrder() {
        try{
       OrderDto orderDto =new OrderDto (orderIdtext.getText(),customertext.getText(),orderDetailDto);
   String result=orderController.placeOrder(orderDto);
   JOptionPane.showMessageDialog(this, result);
        } catch (Exception ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
   
   
   }
    
    }