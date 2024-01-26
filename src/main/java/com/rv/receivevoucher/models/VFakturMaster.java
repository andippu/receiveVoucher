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
@Table(name = "V_FAKTUR_MASTER")
public class VFakturMaster {

    @Id
    @Column(name = "VFM_NO", length = 40, nullable = false)
    private String vfmNo;

    @Column(name = "VFM_DATE", length = 10)
    private String vfmDate;

    @Column(name = "VFM_SPB_NO", length = 40, nullable = false)
    private String vfmSpbNo;

    @Column(name = "VFM_MSO_NO", length = 40, nullable = false)
    private String vfmMsoNo;

    @Column(name = "VFM_JTH_TEMP")
    private Date vfmJthTemp;

    @Column(name = "VFM_TOTAL_SPB")
    private Integer vfmTotalSpb;

    @Column(name = "VFM_POTONGAN")
    private Integer vfmPotongan;

    @Column(name = "VFM_TOTAL1")
    private Integer vfmTotal1;

    @Column(name = "VFM_DISCOUNT")
    private Integer vfmDiscount;

    @Column(name = "VFM_TOTAL_FAKTUR")
    private Integer vfmTotalFaktur;

    @Column(name = "VFM_PPN")
    private Integer vfmPpn;

    @Column(name = "VFM_PPH23")
    private Integer vfmPph23;

    @Column(name = "VFM_MATERAI")
    private Integer vfmMaterai;

    @Column(name = "VFM_TOTAL_ALL")
    private Integer vfmTotalAll;

    @Column(name = "VFM_PPH22")
    private Integer vfmPph22;

    @Column(name = "VFM_STATUS")
    private String vfmStatus;

    @Column(name = "VFM_CUS_NAME")
    private String vfmCusName;

    @Column(name = "VFM_DATE_PARAM")
    private String vfmDateParam;

    @Column(name = "VFM_TYPE")
    private String vfmType;

    @Column(name="FM_IND", length = 1)
    private String fmInd;

}
