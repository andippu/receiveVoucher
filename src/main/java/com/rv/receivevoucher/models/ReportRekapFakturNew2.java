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
@Table(name = "RPT_REKAP_FAKTURT_NEW2")
public class ReportRekapFakturNew2 {

	 @Id
	 @Column(name="RRCF_FM_NO",length=40,  nullable = false)
	 private String rrcfFmNo;
	 
	 @Column(name="RRCF_CUS_CODE",length=6)
	 private String rrcfCusCode;
	 
	 @Column(name="RRCF_CUS_NAME",length=50)
	 private String rrcfCusName;
	 
	 @Column(name="RRCF_SPB_NO",length=50)
	 private String rrcfSpbNo;
	 
	 @Column(name="RRCF_FM_DATE")
	 private String rrcfFmDate;
	 
	 @Column(name="RRCF_DISCOUNT")
	 private BigDecimal rrcfDiscount;
	 
	 @Column(name="RRCF_NO_PJK",length=20)
	 private String rrcfNoPjk;
	 
	 @Column(name="RRCF_JT_TEMPO")
	 private String rrcfJthTempo;
	 
	 @Column(name="RRCF_PPH22",length=50)
	 private String rrcfPph22;
	 
	 @Column(name="RRCF_HNA")
	 private BigDecimal rrcfHna;
	 
	 @Column(name="RRCF_POT")
	 private BigDecimal rrcfPot;
	 
	 @Column(name="RRCF_HNA2")
	 private BigDecimal rrcfHa2;
	 
	 @Column(name="RRCF_DISCOUNT_RP")
	 private BigDecimal rrcfDiscountRp;
	 
	 @Column(name="RRCF_DIS_SEL")
	 private BigDecimal rrcfDiscountSel;
	 
	 @Column(name="RRCF_TOTAL")
	 private BigDecimal rrcfTotal;
	 
	 @Column(name="RRCF_PPN")
	 private BigDecimal rrcfPpn;
	 
	 @Column(name="RRCF_PPH23")
	 private BigDecimal rrcfPph23;
	 
	 @Column(name="RRCF_MATERAI")
	 private BigDecimal rrcfMaterai;
	 
	 @Column(name="RRCF_TOT_SEL")
	 private BigDecimal rrcfTotSel;
	 
	 @Column(name="RRCF_PPH_22")
	 private BigDecimal rrcfPpH222;
	 
	 @Column(name="RRCF_PERIOD",length=50)
	 private String rrcfPeriod;
}
