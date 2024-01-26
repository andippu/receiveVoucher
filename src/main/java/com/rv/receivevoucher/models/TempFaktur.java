package com.rv.receivevoucher.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TEMP_FAKTUR")
@IdClass(TempFakturCompKey.class)
public class TempFaktur {

    @Id
    @Column(name="SPB_NO",length=50, nullable = false)
    private String tFakSpbNo;

    @Id
    @Column(name="SPB_PRODUCTID",length=50)
    private String tFakSpbProdId;

    @Id
    @Column(name="SPB_BATCHNO",length=50)
    private String tFakBatchNo;

    @Column(name="SPB_DATE",length=15)
    private String tFakSpbDate;

    @Column(name="SPB_CUSTID",length=50)
    private String tFakCustId;

    @Column(name="SP_NO",length=50)
    private String tFakSpNo;

    @Column(name="PO_NO",length=50)
    private String tFakPoNo;

    @Column(name="UNIT_KECIL", length=12)
    private String tFakUnitKecil;

    @Column(name="SATUAN_KECIL",length=50)
    private String tFakSatuanKecil;

    @Column(name="STATUS",length=50)
    private String tFakStatus;

    @Column(name="DISC", length=12)
    private String tFakDisc;

    @Column(name="BONUS",length=50)
    private String tFakBonus;

    @Column(name="UPLOAD_DATE",length=20)
    private String tFakUploadDate;

}
