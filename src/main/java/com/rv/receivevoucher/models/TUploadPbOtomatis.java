package com.rv.receivevoucher.models;

import jakarta.persistence.Column;                     
import jakarta.persistence.Entity;                     
import jakarta.persistence.Id;                         
import jakarta.persistence.IdClass;                    
import jakarta.persistence.Table;                      
import lombok.AllArgsConstructor;                      
import lombok.Data;                                    
import lombok.NoArgsConstructor;                       
                                                       
@Data                                                  
@NoArgsConstructor                                     
@AllArgsConstructor                                    
@Entity                                                
@Table(name = "T_UPLOAD_PB_OTOMATIS")                    
@IdClass(TUploadPbOtomatisCompKey.class)   
public class TUploadPbOtomatis {
	
	 @Id                                                  
	 @Column(name="PB_NO",length=80,  nullable = false)  
	 private String tupoPbNo;  
	 
	 @Id                                                  
	 @Column(name="SP_NO",length=80,  nullable = false)  
	 private String tupoSpNo;  
	 
	 @Id                                                  
	 @Column(name="SPB_PRODUCTID",length=80,  nullable = false)  
	 private String tupoProductId;  
	 
	 @Id
	 @Column(name="SPB_BATCHNO",length=80)  
	 private String tupoBatchNo; 
	 
	 @Id
	 @Column(name="UNIT_KECIL",length=80)  
	 private String tupoUnitKecil; 
	 
	 @Column(name="SPB_DATE",length=80)  
	 private String tupoSpbDate;  
	 
	 @Column(name="SPB_CUSTID",length=80)  
	 private String tupoSupId;  
	 
	 @Column(name="PO_NO",length=80)  
	 private String tupoPoNo; 
	 
	 @Column(name="SATUAN_KECIL",length=80)  
	 private String tupoSatuanKecil; 
	 
	 @Column(name="STATUS",length=80)  
	 private String tupoStatus; 
	 
	 @Column(name="DISC",length=80)  
	 private String tupoDiscount; 
	 
	 @Column(name="BONUS",length=80)  
	 private String tupoBonus; 
	 
	 @Column(name="CUST_NAME",length=100)  
	 private String tupoCustName; 
	 
	 @Column(name="ERRMSG",length=1000)  
	 private String tupoErrors; 
	 
}
