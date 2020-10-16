/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import static Interfaces.Requisition.getitemsbyreqId;
import csse_dekstop_application.Procurement_Impl;
import csse_dekstop_application.Procurement_Interface;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;
import java.text.*;
import java.awt.print.*;
import javafx.print.Printer;
import javax.swing.JTextArea;
/**
 *
 * @author Lahiru Lakruwan
 */
public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form ReceivedItems
     */
    public Invoice() {
        initComponents();
        
        
        
          Procurement_Interface procurement = (Procurement_Interface) new Procurement_Impl();

        Invoice.getInvoiceIds =   procurement.getInvoiceIds();
        System.out.println(getInvoiceIds);
       JSONArray jsonArr = new JSONArray(getInvoiceIds); 
        
         for (int i = 0; i < jsonArr.length(); i++) 
              {
                       JSONObject object = jsonArr.getJSONObject(i);
                       String requestionId = object.getString("reqID");
                                   
                       invoiceIdComboBox.addItem(requestionId);
               }
    }
     public static  String getInvoiceIds ="";
     public static  String getInvoiceInfo = "";
     public static  int totalAmount = 0;     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        invoiceIdComboBox = new javax.swing.JComboBox();
        searchbtn1 = new javax.swing.JButton();
        approverRequisition = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtreceipt = new javax.swing.JTextArea();
        approverRequisition1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Invoice ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Invoice Ids");

        invoiceIdComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                invoiceIdComboBoxPopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        invoiceIdComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceIdComboBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                invoiceIdComboBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                invoiceIdComboBoxMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                invoiceIdComboBoxMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                invoiceIdComboBoxMouseReleased(evt);
            }
        });
        invoiceIdComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceIdComboBoxActionPerformed(evt);
            }
        });
        invoiceIdComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                invoiceIdComboBoxKeyPressed(evt);
            }
        });

        searchbtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchbtn1.setText("SEARCH");
        searchbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtn1ActionPerformed(evt);
            }
        });

        approverRequisition.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        approverRequisition.setText("CLEAR");
        approverRequisition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approverRequisitionActionPerformed(evt);
            }
        });

        jtxtreceipt.setColumns(20);
        jtxtreceipt.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jtxtreceipt.setRows(5);
        jtxtreceipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(jtxtreceipt);

        approverRequisition1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        approverRequisition1.setText("PRINT");
        approverRequisition1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approverRequisition1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(invoiceIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(searchbtn1)
                        .addGap(31, 31, 31)
                        .addComponent(approverRequisition, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(jLabel4)))
                .addContainerGap(313, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(855, Short.MAX_VALUE)
                    .addComponent(approverRequisition1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(164, 164, 164)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceIdComboBox)
                    .addComponent(searchbtn1)
                    .addComponent(approverRequisition))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(116, 116, 116)
                    .addComponent(approverRequisition1)
                    .addContainerGap(476, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invoiceIdComboBoxPopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_invoiceIdComboBoxPopupMenuCanceled
        // TODO add your handling code here:

    }//GEN-LAST:event_invoiceIdComboBoxPopupMenuCanceled

    private void invoiceIdComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceIdComboBoxMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_invoiceIdComboBoxMouseClicked

    private void invoiceIdComboBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceIdComboBoxMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_invoiceIdComboBoxMouseEntered

    private void invoiceIdComboBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceIdComboBoxMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_invoiceIdComboBoxMouseExited

    private void invoiceIdComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceIdComboBoxMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_invoiceIdComboBoxMousePressed

    private void invoiceIdComboBoxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceIdComboBoxMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_invoiceIdComboBoxMouseReleased

    private void invoiceIdComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceIdComboBoxActionPerformed

    }//GEN-LAST:event_invoiceIdComboBoxActionPerformed

    private void invoiceIdComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invoiceIdComboBoxKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_invoiceIdComboBoxKeyPressed

    private void searchbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtn1ActionPerformed
               
       String invoiceid = invoiceIdComboBox.getSelectedItem().toString();
        
          Procurement_Interface procurement = (Procurement_Interface) new Procurement_Impl();

          
       Invoice.getInvoiceInfo   =   procurement.getInvoiceInfo(invoiceid);
       JSONObject object = new JSONObject(getInvoiceInfo);
       
       String orderId =  object.getString("OrderID");
       String employeeName =  object.getString("employeeName");
         String supplierName =  object.getString("approvedName");
          
         jtxtreceipt.append("\t\t\t Order Receipt \n\n"+
                
                "\t Order Id      : "+orderId+ "\n"+
                 "\t Employee Name : "+ employeeName + "\n"+
                 "\t Supplier Name : "+supplierName+ "\n"+
          "\n\t===============================================\n"+
                "\t\t\t Items Information \n"+
                "\n\t===============================================\n"+
                "\t Item Name \t  Item Quantity    Item Price  \n "+
                "\n\t===============================================\n"
         );
          System.out.println(object.getJSONArray("itemsInfo").get(1));
          JSONObject object2 = new JSONObject();
   
              for (int i = 0; i < object.getJSONArray("itemsInfo").length(); i++) 
              {
                       object2  = (JSONObject) object.getJSONArray("itemsInfo").get(i);
                       String itemDescription = object2.getString("itemName");
                       int itemQty = object2.getInt("itemQty");
                       int itemPrice = object2.getInt("itemPrice");
                       Invoice.totalAmount = Invoice.totalAmount +(itemPrice * itemQty);
                   jtxtreceipt.append(
               "\t"+ itemDescription+ "\t\t\t" +itemQty + "\t\t" +itemPrice+ "\n" 
                );
               }
                 
             jtxtreceipt.append(
                      "\n\t===============================================\n"+
                 "\t Total Amount :"+"\t\t\t\t"+Invoice.totalAmount+ "\n"+
                 "\t\t \t\t\t\t"+"====="+ "\n"             
                              ); 
    }//GEN-LAST:event_searchbtn1ActionPerformed

    private void approverRequisitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approverRequisitionActionPerformed
        // TODO add your handling code here:
       
             jtxtreceipt.setText("");
             Invoice.totalAmount = 0;
       
    }//GEN-LAST:event_approverRequisitionActionPerformed

    private void approverRequisition1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approverRequisition1ActionPerformed
        // TODO add your handling code here:
        try{
          jtxtreceipt.print();
        }
        catch(PrinterException e)
        {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_approverRequisition1ActionPerformed

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approverRequisition;
    private javax.swing.JButton approverRequisition1;
    private javax.swing.JComboBox invoiceIdComboBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jtxtreceipt;
    private javax.swing.JButton searchbtn1;
    // End of variables declaration//GEN-END:variables
}
