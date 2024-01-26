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
@Table(name = "PENGIRIMAN_BRG")
public class PengirimanBarang {

    @Id
    @Column(name="PB_NO_SPB",length=40,  nullable = false)
    private String pbNoSPb;

    @Column(name="PB_MSO_NO",length=40)
    private String pbMsoNo;

    @Column(name="PB_MSO_SEQ")
    private Integer pbMsoSeq;

    @Column(name="PB_DATE")
    private Date pbDate;

    @Column(name="PB_CHGUSER",length=40)
    private String pbChgUser;

    @Column(name="PB_CHGDATE")
    private Date pbChgDate;

    @Column(name="PB_DESC")
    private Date pbDesc;

    @Column(name="PD_FLAG",length=1)
    private String pbFlag;

    @Column(name="PD_FLAG2",length=1)
    private String pbFlag2;

    @Column(name="NO_URUT",length=18)
    private String pbUrut;

    @Column(name="PD_NO",length=20)
    private String pbNo;

    @Column(name="PB_TUJUAN",length=200)
    private String pbTujuan;

    @Column(name="PB_CREADATE")
    private Date pbCreDate;

    @Column(name="PB_STATUS",length=1)
    private String pbStatus;

    @Column(name="PB_CREUSER",length=40)
    private String pbCreUser;

}
