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
@Table(name = "FAKTUR_MASTER_ALL")
public class FakturAll {
	
	 @Id
	    @Column(name="FM_NO",length=40,  nullable = false)
	    private String fmNo;

	    @Column(name="FM_DATE")
	    private Date fmdDate;

	    @Column(name="FM_PB_NO_SPB",length=40)
	    private String fmPbNoSpb;

	    @Column(name="FM_MSO_NO",length=40)
	    private String fmMsoNo;

	    @Column(name="FM_JATUH_TEMPO")
	    private Date fmJatuhTempo;

	    @Column(name="FM_TOTAL_VALUE")
	    private Integer fmTotalValue;

	    @Column(name="FM_CHGUSER", length = 40)
	    private String fmChgUser;

	    @Column(name="FM_CHGDATE")
	    private Date fmChgDate;

	    @Column(name="FM_DESC", length = 20)
	    private String fmDesc;

	    @Column(name="FM_IND", length = 1)
	    private String fmInd;

	    @Column(name="FM_KHUSUS", length = 1)
	    private String fmKhusus;

	    @Column(name="FM_DISCOUNT")
	    private Integer fmDiscount;

	    @Column(name="FM_NO_PJK", length = 20)
	    private String fmNoPajak;

	    @Column(name="FM_TAX_DATE")
	    private Date fmTaxDate;


	    @Column(name="FM_FLAG", length = 5)
	    private String fmFlag;

	    @Column(name="FM_OTO", length = 1)
	    private String fmOto;

	    @Column(name="FM_DISCOUNT_RP")
	    private Integer fmDiscountRp;

	    @Column(name="FM_PPH22", length = 40)
	    private String fmPhh22;

	    @Column(name="FM_NILAI_HNA")
	    private Integer fmNilaiHna;

	    @Column(name="FM_POTONGAN")
	    private Integer fmPotogan;

	    @Column(name="FM_NILAI_HNA2")
	    private Integer fmNilaiHna2;

	    @Column(name="FM_DISCOUNT_SEL")
	    private Integer fmDiscountSel;

	    @Column(name="FM_TOTAL")
	    private Integer fmTotal;

	    @Column(name="FM_PPN")
	    private Integer fmPpn;

	    @Column(name="FM_PPH23")
	    private Integer fmPph23;

	    @Column(name="FM_MATERAI")
	    private Integer fmMaterai;

	    @Column(name="FM_TOT_SEL")
	    private Integer fmTotSel;

	    @Column(name="FM_PPH_22")
	    private Integer fmPph222;

	    @Column(name="FM_LUNAS", length = 1)
	    private String fmLunas;

	    @Column(name="FM_JT_TMP")
	    private Integer fmJthtempo;

	    @Column(name="FM_CREDATE")
	    private Date fmCreDate;

	    @Column(name="FM_POT2")
	    private Integer fmPot2;

	    @Column(name="FM_TOTAL2")
	    private Integer fmTotal2;

	    @Column(name="FM_WIL_ID")
	    private Integer fmWilId;

	    @Column(name="FM_DRH_ID")
	    private Integer fmDrhId;

	    @Column(name="FM_CUS_CODE", length = 10)
	    private String fmCusCode;

	    @Column(name="FM_TYPE", length = 1)
	    private String fmType;

}
