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

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RPT_REKAP_FAKTUR_CUST_BRG")
@IdClass(ReportRekapCustBrgCompKey.class)
public class ReportRekapCustBrg {
	 @Id
	 @Column(name="RFCB_CUS_CODE",length=50,  nullable = false)
	 private String rfcbCusCode;
	 
	 @Id
	 @Column(name="RFCB_BRNAME",length=50,  nullable = false)
	 private String rrcbBrName;
	 
	 @Column(name="RFCB_CUSNAME")
	 private String rrcbCusName;
	 
	 @Column(name="RFCB_HRG_PK")
	 private BigDecimal rrcbHrgPk;
	 
	 @Column(name="RFCB_HRG_POT")
	 private BigDecimal rrcbHrgPot;
	 
	 @Column(name="RFCB_HRG_TOT1")
	 private BigDecimal rrcbHrgTot1;
	 
	 @Column(name="RFCB_HRG_TOT2")
	 private BigDecimal rrcbHrgTot2;
	 
	 @Column(name="RFCB_PERIODE")
	 private String rrcbPeriode;
	 
	 @Column(name="RFCB_PPN")
	 private BigDecimal rrcbPpn;
	 
	 @Column(name="RFCB_UNIT")
	 private BigDecimal rrcbUnit;
	 
	 @Column(name="RFCB_FLAG_BPJS")
	 private String rrcbFlagBpjs;
	 
	 

}
