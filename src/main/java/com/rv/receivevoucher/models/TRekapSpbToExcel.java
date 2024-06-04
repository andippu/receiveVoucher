package com.rv.receivevoucher.models;

import java.math.BigDecimal;
import java.util.Date;

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
@Table(name = "T_REKAP_SPB_EXCEL")
public class TRekapSpbToExcel {
	
	  @Id
	  @Column(name="TRSE_FAKTUR_NO",length=30,  nullable = false)
	  private String trseFakturNo;
	  
	  @Column(name="TRSE_SPB_NO",length=30,  nullable = false)
	  private String trseSpbNo;
	  
	  @Column(name="TRSE_MSO_NO",length=30,  nullable = false)
	  private String trseMsoNo;
	  
	  @Column(name="TRSE_PAJAK_NO",length=30,  nullable = false)
	  private String trsepAJAKNo;
	  
	  @Column(name="TRSE_PP22")
	  private BigDecimal trsePph22;
	  
	  @Column(name="TRSE_DISTRIBUTOR",length=60,  nullable = false)
	  private String trseDistributor;

	 
}
