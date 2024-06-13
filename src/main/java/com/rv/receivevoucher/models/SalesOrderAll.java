package com.rv.receivevoucher.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SALES_ORDER_ALL")
public class SalesOrderAll {
	
	@Id
	@Column(name="DSO_MSO_NO",length=50,  nullable = false)
    private String solDsoMsoNo;
	
	@Column(name="DSO_BR_CODE",length=12)
    private String solDsoBrCode;
	
	@Column(name="DSO_BATCH_NO",length=12)
    private String solDsoBatchNo;
	
	@Column(name="DSO_QTY_PESAN")
    private BigDecimal solDsoQtyPesan;
	
	@Column(name="DSO_SAT_CODE",length=4)
    private String solDsoSatCode;
	
	@Column(name="DSO_QTY_JADI")
    private BigDecimal solDsoQtyJadi;
	
	@Column(name="FA_BR_HARGA_PK")
    private BigDecimal solDsobrharga;
	
	@Column(name="FA_CUS_POT")
    private BigDecimal solDsoCusPot;
	
	@Column(name="FA_TOTAL")
    private BigDecimal solFaTotal;
	
	@Column(name="DSO_CHGUSER",length=12)
    private String solDsoChgUser;
	
	@Column(name="DSO_CHGDATE")
    private Date solDsoChgDate;
	
	@Column(name="DSO_QTY_BONUS")
    private BigDecimal solDsoQtyBonus;
	
	@Column(name="DSO_CREDATE")
    private Date solDsoCreDate;
	
	@Column(name="POT1")
    private BigDecimal solPot1;
	
	@Column(name="TOTAL2")
    private BigDecimal solTot2;
	
	@Column(name="POT2")
    private BigDecimal solPot2;
	
	@Column(name="TOTAL3")
    private BigDecimal solTot3;
	
	@Column(name="PPN")
    private BigDecimal solPpn;
	
	@Column(name="PPH22")
    private BigDecimal solPph22;
	
	@Column(name="BONUS")
    private BigDecimal solBonus;
	
	@Column(name="DSO_BARANG",length=200)
    private String solBarangr;
	
	@Column(name="DSO_FM_NO",length=25)
    private String solFmNo;
	
	

}
