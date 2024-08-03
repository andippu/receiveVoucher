package com.rv.receivevoucher.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RPT_LAP_BONUS")
public class ReportLapBonus {
	
	@Id
	@Column(name="RLBO_FMNO",length=50,  nullable = false)
	 private String rlboFmNo;
	
	@Column(name="RLBO_NOPJK",length=20)
	 private String rlboNoPajak;
	
	@Column(name="RLBO_CUSCODE",length=6)
	 private String rlboCusCode;
	
	@Column(name="RLBO_CUSNAME",length=50)
	 private String rlboCusName;
	
	@Column(name="RLBO_BRNAME",length=50)
	 private String rlboBrName;
	
	@Column(name="BLBO_BATCHNO",length=12)
	 private String rlboBatchNo;
	
	@Column(name="BLBO_PERIOD",length=7)
	 private String rlboPeriod;
	
	@Column(name="RLBO_QTY")
	 private Integer rlboQty;
	
	@Column(name="RLBO_HRGPK")
	 private Integer rlboHargaPk;
	
	@Column(name="RLBO_HRG")
	 private Integer rlboHarga;
	
	@Column(name="RLBO_HJP")
	 private Integer rlboHjp;
	
	@Column(name="RLBO_HNA")
	 private Integer rlboHna;
	
	@Column(name="RLBO_PPN")
	 private Integer rlboPpn;
	
	

}
