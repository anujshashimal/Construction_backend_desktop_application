/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csse_dekstop_application;

import org.json.JSONArray;

/**
 *
 * @author Lahiru Lakruwan
 */
public interface Procurement_Interface {
    
     public  String  validateLoginDetails(String userName,String password); 
     
     public  String  getRequestionIds();
     
     public String getItemByReqNumbers(String ItemId);
     
     public String approveReq(JSONArray jsonarrayOfObjects);
     
     public String getSuppliernames();
     
     public String placePurchaseOrder(String reqId,String supplierName,String addressLine1,String addressLin2,String other,String requiredDate);
  
     public String getInvoiceIds();
             
     public String getInvoiceInfo(String reqId);
}
