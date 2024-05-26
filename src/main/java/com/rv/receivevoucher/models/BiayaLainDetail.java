package com.rv.receivevoucher.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BIAYA_LAIN_DETAIL")
public class BiayaLainDetail {
	@Id
	@Column (name="BLD_NO")
    private BigDecimal bildNo;

	 @Column (name="BA_FM_NO")
	 private String bildFmNo;
	
	 @Column (name="KD_BAHAN", length=12)
	  private String bildKdBahan;
	 
	 @Column (name="TIPE_BAHAN", length=1)
	  private String bildTipeBahan;
	 
	 @Column (name="SAT", length=10)
	  private String bildSat;
	 
	 @Column (name="QTY")
	  private BigDecimal bildQty;
	 
	 @Column (name="HRG_SATUAN")
	  private BigDecimal bildHrdSatuan;
	 
	 @Column (name="DISC")
	  private BigDecimal bildDisc;
	 
	 @Column (name="PPN")
	  private BigDecimal bildPpn;
	 
	 @Column (name="PPH23")
	  private BigDecimal bildPph23;
	 
	 @Column (name="PPH22")
	  private BigDecimal bildPph22;
	 
	 @Column (name="TOTAL")
	  private BigDecimal bildTotal;
	 
	 @Column (name="KURS", length=5)
	  private String bildKurs;
	 
	 @Column (name="RATE")
	  private BigDecimal bildRate;
	 
	 @Column (name="TOTAL_KURS")
	  private BigDecimal bildTotalKurs;
	 
	 @Column (name="TOTAL_RP")
	  private BigDecimal bildTotalRp;
	 
	 @Column (name="POTONGAN")
	  private BigDecimal bildPotongan;
	 
	 
	
	
	      
	        
	
}
