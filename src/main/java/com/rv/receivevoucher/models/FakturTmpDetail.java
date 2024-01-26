package com.rv.receivevoucher.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FAKTUR_TMP_DETAIL")
public class FakturTmpDetail {

    @Id
    @Column(name="FTD_NO", nullable = false)
    private Integer ftdNo;

    @Column(name="FTD_FTM_NO")
    private Integer ftdFtmNo;

    @Column(name="FTD_PROD_ID",length=30)
    private String ftdProdId;

    @Column(name="FTD_PROD_NAME",length=100)
    private String ftdProdName;

    @Column(name="FTD_BATCH_NO",length=30)
    private String ftdBatchNo;

    @Column(name="FTD_QTY",length=20)
    private String ftdQty;

    @Column(name="FTD_SATUAN",length=30)
    private String ftdSatuan;

    @Column(name="FTD_STATUS",length=100)
    private String ftdStatus;

    @Column(name="FTD_DISC",length=10)
    private String ftdDisc;

    @Column(name="FTD_BONUS",length=10)
    private String ftdBonus;

    @Column(name="FTD_BR_FLAG",length=1)
    private String ftdBrFlag;

    @Column(name="FTD_BATCH_FLAG",length=1)
    private String ftdBatch;


}
