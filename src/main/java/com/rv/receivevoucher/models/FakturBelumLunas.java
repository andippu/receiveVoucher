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
@Table(name = "FAKTUR_BELUM_LUNAS")
public class FakturBelumLunas {

    @Id
    @Column(name="FBL_FM_NO", nullable = false)
    private String fblFmNo;

    @Column(name="FBL_FM_CUSTCODE")
    private String fblCustCode;

    @Column(name="FBL_FM_DATE")
    private Date fblFmDate;

    @Column(name="FBL_FM_TIPE")
    private String fblFmTipe;

    @Column(name="FBL_FM_TOTAL")
    private Long fblFmTotal;



}
