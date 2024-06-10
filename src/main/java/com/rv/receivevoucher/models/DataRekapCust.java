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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DATA_REKAP_CUST")
public class DataRekapCust {
	
	@Id
    @Column(name="DRCS_FM_NO",length=40,  nullable = false)
    private String drcsFmNo;
	
	@Column(name="DRCS_FM_DATE",length=15)
	private String drcsFmDate;
	
	@Column(name="DRCS_CUST",length=100)
	private String drcsCust;
	
	@Column(name="DRCS_SPB",length=30)
	private String drcsSpb;
	
	@Column(name="DRCS_TOTAL1")
	private BigDecimal drcsTotal1;
	
	@Column(name="DRCS_POT")
	private BigDecimal drcsPot;
	
	@Column(name="DRCS_TOT2")
	private BigDecimal drcsTotal2;
	
	@Column(name="DRCS_PPN")
	private BigDecimal drcsPpn;	

	@Column(name="DRCS_PPH22")
	private BigDecimal drcsPph;
	
	@Column(name="DRCS_NILAIDOC")
	private BigDecimal drcsNIlaiDoc;
	
	@Column(name="DRCS_JATUH_TEMPO",length=100)
	private String drcsJthTempo;
	
	@Column(name="DRCS_MATERAI")
	private BigDecimal drcsMateraic;
}
