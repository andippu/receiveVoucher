package com.rv.receivevoucher.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MASTER_BAYAR_DISTRIBUTOR")
public class DistBayarMaster {
    @Id
    @Column(name="MBD_URUT",length=50,  nullable = false)
    private String mbdUrut;

    @Column(name="MBD_NO",length=5,  nullable = false)
    private String mbdNo;

    @Column(name="MBD_TAHUN",length=4,  nullable = false)
    private String mbdTahun;

    @Column(name="MBD_BULAN",length=2)
    private String mbdBulan;

    @Column(name="MBD_TGL_LUNAS")
    private Date mbdTglLunas;

    @Column(name="MBD_INPUT_DATE")
    private Date mbdInputDate;

    @Column(name="MBD_TGL")
    private Date mbdTgl;

    @Column(name="MBD_VALUE")
    private Long mbdValue;

    @Column(name="MBD_TYPE")
    private String mbdType;

    @Column(name="MBD_FLAG")
    private String mbdFlag;

    @Column(name="MBD_TGL_GIRO")
    private Date mbdTglGiro;

    @Column(name="MBD_DEPOSIT")
    private Long mbdDeposit;

    @Column(name="MBD_CREATE_BY")
    private String mbdCreateBy;

    @Column(name="MBD_CREATE_DATE")
    private Date mbdCreateDate;

    @Column(name="MBD_UPDATE_BY")
    private String mbdUpdateBy;

    @Column(name="MBD_UPDATE_DATE")
    private Date mbdUpdateDate;

}
