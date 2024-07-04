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
	 @Column(name="PB_NO",length=50,  nullable = false)  
	 private String tupoPbNo;  
	 
	 @Id                                                  
	 @Column(name="SP_NO",length=50,  nullable = false)  
	 private String tupoSpNo;  
	 
	 @Id                                                  
	 @Column(name="SPB_PRODUCTID",length=50,  nullable = false)  
	 private String tupoProductId;  
	 
	 @Column(name="SPB_DATE",length=50)  
	 private String tupoSpbDate;  
	 
	 @Column(name="SPB_CUSTID",length=50)  
	 private String tupoSupId;  
	 
	 @Column(name="PO_NO",length=50)  
	 private String tupoPoNo; 
	 
	 @Column(name="SPB_BATCHNO",length=50)  
	 private String tupoBatchNo; 
	 
	 @Column(name="UNIT_KECIL",length=50)  
	 private String tupoUnitKecil; 
	 
	 @Column(name="SATUAN_KECIL",length=50)  
	 private String tupoSatuanKecil; 
	 
	 @Column(name="STATUS",length=50)  
	 private String tupoStatus; 
	 
	 @Column(name="DISC",length=50)  
	 private String tupoDiscount; 
	 
	 @Column(name="BONUS",length=50)  
	 private String tupoBonus; 
	 
}
