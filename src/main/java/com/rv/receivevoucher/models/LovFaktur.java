package com.rv.receivevoucher.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LOV_FAKTUR")
@IdClass(LovFakturCompKey.class)
public class LovFaktur {
	    @Id
	    @Column(name="LFM_FM_NO", nullable = false)
	    private String lfmFmNo;
	    
	    @Id
	    @Column(name="LFM_BR_CODE", nullable = false)
	    private String lfmBrCode;
	    
	    @Id
	    @Column(name="LFM_BATCHNO", nullable = false)
	    private String lfmBatchNo;
	    
	    @Column(name="LFM_CUST_CODE")
	    private String lfmCustCode;
	    
	    @Column(name="LFM_PRICE", nullable = false)
	    private long lfmPrice;
	    
	    @Column(name="LFM_CUS_POT", nullable = false)
	    private BigDecimal lfmCustPot;
	    
	
	   
	   

}
