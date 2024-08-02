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
@Table(name = "RPT_REKAP_FAKTURT_NEW2_BA")
public class ReportRekapFakturtNew2Ba {
	
	 @Id
	 @Column(name="RRFNBA_FMNO",length=50,  nullable = false)
	 private String rrfnbaFmNo;
	 
	 @Column(name="RRFNBA_CUSCODE",length=10)
	 private String rrfnbaCustNo;
	 
	 @Column(name="RRFNBA_CUSNAME",length=50)
	 private String rrfnbaCusName;
	 
	 @Column(name="RRFNBA_DATE",length=10)
	 private String rrfnbaDate;
	 
	 @Column(name="PERIOD",length=7)
	 private String rrfnbaPeriod;
	 
	 @Column(name="RRFNBA_HNA")
	 private BigDecimal rrfnbaHna;
	 
	 @Column(name="RRFNBA_PPN")
	 private BigDecimal rrfnbaPpn;
	 
	 @Column(name="RRFNBA_TOTAL")
	 private BigDecimal rrfnbaTotal;
	 
	 
}
