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
@Table(name = "T_CLAIM_DISCOUNT")
public class TClaimDiscount {
	
	 @Id
	 @Column(name="FAKTUR_NO", length=20, nullable = false)
	 private String tcldFakturNo;
	 
	 @Column(name="FAKTUR_DATE")
	 private Date tcldFakturDate;

	 @Column(name="NILAI_HNA")
	 private BigDecimal tcldHna;
	 
	 @Column(name="DISCOUNT1")
	 private BigDecimal tcldDiscount;
	 
	 @Column(name="NILAI_HNA2")
	 private BigDecimal tcldHna2;
	 
	 @Column(name="DISCOUNT2")
	 private BigDecimal tcldDiscount2;
	 
	 @Column(name="NILAI_HNA3")
	 private BigDecimal tcldHna3;
	 
	 @Column(name="NILAI_PPN")
	 private BigDecimal tcldPpn;
	 
	 @Column(name="GRANT_TOTAL")
	 private BigDecimal tcldGrantTotal;
	
}
