package com.rv.receivevoucher.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RETUR_JUAL_DETAIL")
@IdClass(ReturJualDetailCompKey.class)
public class ReturJualDetail {
    @Id
    @Column(name="RJD_NO",length=50,  nullable = false)
    private String rjdNo;

    @Id
    @Column(name="RJD_FM_NO",length=50,  nullable = false)
    private String rjdFmNo;

    @Column(name="RJD_BR_CODE",length=20)
    private String rjdBrCode;

    @Column(name="RJD_NO_BATCH",length=15)
    private String rjdNoBatch;

    @Column(name="RJD_QTY")
    private Integer rjdQty;

    @Column(name="RJD_HRG")
    private Long rjdHrg;

    @Column(name="RJD_TOTAL")
    private Long rjdTotal;

    @Column(name="RJD_KETERANGAN",length=200)
    private String rjdKeterangan;

    @Column(name="RJD_STATUS",length=1)
    private String rjdStatus;

    @Column(name="RJD_TERPAKAI",length=1)
    private String rjdTerpakai="N";

    @Column(name="RJD_POT")
    private Long rjdPot;

    @Column(name="CREATED_BY",length=20)
    private String rjdCreateBy;

    @Column(name="CREATED_DATE")
    private Date rjdCreateDate;

    @Column(name="PPK",length=100)
    private String rjdPpk;

}
