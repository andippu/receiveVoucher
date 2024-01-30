package com.rv.receivevoucher.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "V_FAKTUR_BELUM_LUNAS")
public class VFakturBelumLunas {

    @Id
    @Column(name="FBL_FM_NO", length=50,  nullable = false)
    private String fblFmNo;

    @Column(name="FBL_FM_DATE")
    private String fblFmDate;

    @Column(name="FBL_FM_CUSTCODE", length=10)
    private String fblCustCode;

    @Column(name="FBL_FM_TOTAL")
    private Long fblFmTotal;

    @Column(name="FBL_FM_TIPE")
    private String fblFmTipe;

}
