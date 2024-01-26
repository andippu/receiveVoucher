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
@Table(name = "FAKTUR_TMP_MASTER")
public class FakturTmpMaster {
    @Id
    @Column(name="FTM_NO", nullable = false)
    private Integer ftmNo;

    @Column(name="FTM_SPB_NO",length=30)
    private String ftmPbNoSpb;

    @Column(name="FTM_SPB_DATE",length=15)
    private String ftmSpbDate;

    @Column(name="FTM_CUST_ID",length=20)
    private String ftmCustId;

    @Column(name="FTM_CUST_NAME",length=100)
    private String ftmCustName;

    @Column(name="FTM_SP_NO",length=30)
    private String ftmSpNo;

    @Column(name="FTM_PO_NO",length=30)
    private String ftmPoNo;

    @Column(name="FTM_UPLOAD_DATE",length=15)
    private String ftmUploadDate;

    @Column(name="FTM_CUST_FLAG",length=1)
    private String ftmCustFlag;

    @Column(name="FTM_BR_FLAG",length=1)
    private String ftmBrFlag;

    @Column(name="FTM_BATCH_FLAG",length=1)
    private String ftmBatchFlag;


}
