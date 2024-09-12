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
@Table(name = "REP_FAKTUR_MASTER")
public class ReportFakturCash {
	
	 @Id
	 @Column(name="RFCS_FMNO",length=40,  nullable = false)
	 private String rfcsFmNo;
	 
	 @Column(name="RFCS_MSO_NO",length=30,  nullable = false)
	 private String rfcsmSONo;
	 
	 @Column(name="RFCS_CUSNAME")
	 private String rfcsCustName;
	 
	 @Column(name="RFCS_ADDR1",length=100)
	 private String rfcsAddr1;
	 
	 @Column(name="RFCS_ADDR2",length=100)
	 private String rfcsAddr2;
	 
	 @Column(name="RFCS_KOTA",length=100)
	 private String rfcsKota;
	 
	 @Column(name="RFCS_DATE",length=15)
	 private String rfcsDate;
	 
	 @Column(name="RFCS_DISCOUNT")
	 private BigDecimal rfcsDiscount;
	 
	 @Column(name="RFCS_CUSTCODE",length=10)
	 private String rfcsCustCode;
	 
	 @Column(name="RFCS_NPWP",length=30)
	 private String rfcsNpwp;
	 
	 @Column(name="RFCS_JTEMP",length=15)
	 private String rfcsJtempo;
	
	 @Column(name="RFCS_TOTALVALUE")
	 private BigDecimal rfcsTotalValue;
	   
	 @Column(name="RFCS_DESC",length=100)
	 private String rfcsDesc;
	 
	 @Column(name="RFCS_POT2")
	 private BigDecimal rfcsPot2;
	 
	 @Column(name="RFCS_TOTAL")
	 private BigDecimal rfcsTotal;
	 
	 @Column(name="RFCS_PPN")
	 private BigDecimal rfcsPpn;
	 
	 @Column(name="RFCS_PPH22")
	 private BigDecimal rfcsPph22;
	 
	 @Column(name="RCFS_TOTSEL")
	 private BigDecimal rfcsTotSel;
	 
	 @Column(name="RFCS_TOTAL2")
	 private BigDecimal rfcsTotal2;
	 
	 @Column(name="RFCS_MATERAI")
	 private BigDecimal rfcsMaterai;
	 
	 @Column(name="RFCS_NILAIHNA")
	 private BigDecimal rfcsNilaiHna;
	 
	 @Column(name="RFCS_POTONGAN")
	 private BigDecimal rfcsPotongan;
	 
	 @Column(name="RFCS_HNA2")
	 private BigDecimal rfcsHna2;
	 
	 
}
