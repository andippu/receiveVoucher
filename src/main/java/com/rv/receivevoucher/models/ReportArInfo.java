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
@Table(name = "RPT_AR_INFO")
public class ReportArInfo {
	
	@Id
	@Column(name="RARIN_FMNO",length=50,  nullable = false)
	 private String rarinFmNo;
	
	@Column(name="RARIN_SPB_NO",length=50)
	 private String rarinSpbNo;
	
	@Column(name="RARIN_MSONO",length=50)
	 private String rarinMsoNo;
	
	@Column(name="RARIN_JTTEMPO",length=10)
	 private String rarinJTempo;
	
	@Column(name="RARIN_LUNAS",length=1)
	 private String rarinLunas;
	
	@Column(name="RARIN_FMDATE",length=10)
	 private String rarinFmDate;
	
	@Column(name="RARIN_CUS",length=57)
	 private String rarinCustName;
	
	@Column(name="RARIN_DUEDATE")
	 private BigDecimal rarinDueDate;
	
	@Column(name="RARIN_VOUCHER",length=14)
	 private String rarinVoucher;
	
	@Column(name="RARIN_AMOUNT")
	 private BigDecimal rarinAmount;

	@Column(name="RARIN_DATE",length=10)
	 private String rarinDate;
	
	@Column(name="RARIN_ADMIN")
	 private BigDecimal rarinAdmin;
	
	@Column(name="RARIN_PPH23")
	 private BigDecimal rarinpph23;
	
	@Column(name="RARIN_ONGKIR")
	 private BigDecimal rarinOngkir;
	
	@Column(name="RARIN_PROV")
	 private BigDecimal rarinProv;
	
	@Column(name="RARIN_MATERAI")
	 private BigDecimal rarinMaterai;
	
	@Column(name="RARIN_PPH22")
	 private BigDecimal rarinPph22;
	
	@Column(name="RARIN_TOTAL")
	 private BigDecimal rarintotal;
	
}
