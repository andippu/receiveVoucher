package com.rv.receivevoucher.models;


import java.math.BigDecimal;

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
@Table(name = "V_T_UPLOAD_PB_OTOMATIS")                    
@IdClass(VTUploadPbOtomatisCompKey.class) 
public class VTUploadPbOtomatis {
	
	 @Id
	 @Column(name="PB_NO", length=80,nullable=false)
	 private String vtupoPbNo;
	 
	 @Id
	 @Column(name="SP_NO", length=80,nullable=false)
	 private String vtupoSpNo;
	 
	 @Id
	 @Column(name="PO_NO", length=80,nullable=false)
	 private String vtupoPoNo;
	 
	 @Column(name="SPB_DATE", length=80)
	 private String vtupoSpbDate;
	 
	 @Column(name="SPB_CUSTID", length=80)
	 private String vtupoCustId;
	 
	 @Column(name="CUST_NAME", length=80)
	 private String vtupoCustName;	
	 
	 @Column(name="STATUS", length=80)
	 private String vtupoStatus;
	 
	 @Column(name="ERRMSG", length=1000)
	 private String vtupoError;	
	 
}
