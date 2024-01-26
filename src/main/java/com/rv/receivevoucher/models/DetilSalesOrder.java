package com.rv.receivevoucher.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DETIL_SALES_ORDER")
@IdClass(DetilSalesOrderCompKey.class)
public class DetilSalesOrder {

    @Id
    @Column(name="DSO_MSO_NO",length=50,  nullable = false)
    private String dsoMsoNo;

    @Id
    @Column(name="DSO_MSO_SEQ",length=50,  nullable = false)
    private Integer dsoMsoSeq;

    @Id
    @Column(name="DSO_BR_CODE",length=50,  nullable = false)
    private String dsoBrgCode;

    @Id
    @Column(name="DSO_BATCH_NO",length=50,  nullable = false)
    private String dsoBatchNo;

    @Column(name="DSO_QTY_PESAN")
    private Integer dsoQtyPesan;

    @Column(name="DSO_SAT_CODE", length=4)
    private String dsoSatCode;

    @Column(name="DSO_QTY_JADI")
    private Integer dsoQtyJadi;

    @Column(name="FA_BR_HARGA_PK")
    private Integer dsoBrHargaPk;

    @Column(name="FA_CUS_POT")
    private Integer dsoCusPot;

    @Column(name="FA_TOTAL")
    private Integer dsoTotal;

    @Column(name="DSO_CHGUSER", length=4)
    private String dsoChgUser;

    @Column(name="DSO_CHGDATE", length=4)
    private Date dsoChgDate;

    @Column(name="DSO_QTY_BONUS")
    private Integer dsoQtyBonus;

    @Column(name="DSO_CREDATE", length=4)
    private Date dsoCreDate;

    @Column(name="POT1")
    private Integer dsoPot1;

    @Column(name="TOTAL2")
    private Integer dsoTotal2;

    @Column(name="POT2")
    private Integer dsoPot2;

    @Column(name="TOTAL3")
    private Integer dsoTotal3;

    @Column(name="PPN")
    private Integer dsoPpn;

    @Column(name="PPH22")
    private Integer dsoPph22;

    @Column(name="BONUS")
    private Integer dsoBonus;

    @Column(name="DSO_CREUSER", length=4)
    private String dsoCreUser;

}
