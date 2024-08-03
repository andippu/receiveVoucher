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
@Table(name = "RPT_REKAP_FAKTURT_NEW2_PJ")
public class ReportRekapFakturtNew2Pj {
	
	@Id
	 @Column(name="RRFNPJ_FMNO",length=50,  nullable = false)
	 private String rrfnPjFmNo;
	
	 @Column(name="RRFNPJ_CUSCODE",length=10)
	 private String rrfnPjCusCode;
	 
	 @Column(name="RRFNPJ_CUSNAME",length=50)
	 private String rrfnPjCusName;
	 
	 @Column(name="RRFNPJ_DATE",length=10)
	 private String rrfnPjDate;
	
	 @Column(name="RRFNPJ_PERIOD",length=7)
	 private String rrfnPjPeriod;
	 
	 @Column(name="RRFNPJ_HNA",length=7)
	 private BigDecimal rrfnPjHna;
	 
	 @Column(name="RRFNPJ_POT",length=7)
	 private BigDecimal rrfnPjPot;
	 
	 @Column(name="RRFNPJ_HNA2",length=7)
	 private BigDecimal rrfnPjHna2;
	 
	 @Column(name="RRFNPJ_PPN",length=7)
	 private BigDecimal rrfnPjPpn;
	 
	 @Column(name="RRFNPJ_TOTAL",length=7)
	 private BigDecimal rrfnPjTotal;
}
