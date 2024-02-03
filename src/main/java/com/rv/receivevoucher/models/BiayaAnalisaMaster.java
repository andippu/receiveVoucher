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
@Table(name = "BIAYA_ANALISA_MASTER")
public class BiayaAnalisaMaster {
    @Id
    @Column(name="BA_FM_NO",length=50,  nullable = false)
    private String baFmNo;

    @Column(name="BA_DATE")
    private Date baDate;

    @Column(name="BA_TGL_TEMP")
    private Date baTgltemp;

    @Column(name="BA_NO_PAJAK",length=50)
    private String baNoPajak;

    @Column(name="TIPE",length=50)
    private String baTipe;

    @Column(name="BA_CUS_CODE",length=10)
    private String baCustCode;

    @Column(name="LUNAS",length=10)
    private Integer baLunas;

    @Column(name="BA_CREATED_BY")
    private String baCreatedBy;

    @Column(name="BA_CREATED_DATE")
    private Date baCreatedDate;

    @Column(name="BA_UPDATED_BY")
    private String baUpdatedBy;

    @Column(name="BA_UPDATED_DATE")
    private Date baUpdatedDate;

}
