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
@Table(name = "DETAIL_BAYAR_DISTRIBUTOR")
public class DistBayarDetail {

    @Id
    @Column(name="DYD_NO")
    private Long dydNo;

    @Column(name="DYD_MBD_NO",length=5)
    private String dydMbdNo;

    @Column(name="MBD_DYD_URUT",length=50)
    private String dydMbdUrut;

    @Column(name="DYD_MBD_TAHUN",length=4)
    private String dydMbdTahun;

    @Column(name="DYD_MBD_BULAN",length=2)
    private String DydMbdBulan;

    @Column(name="DYD_DATE")
    private Date dydDate;

    @Column(name="DYD_CUS_CODE",length=6,  nullable = false)
    private String dydCusCode;

    @Column(name="DYD_FM_NO")
    private String dydFmDate;

    @Column(name="DYD_FM_DATE")
    private Date dydFmNo;

    @Column(name="DYD_AMOUNT")
    private Long dydAmount;

    @Column(name="DYD_ADMIN")
    private Integer dydAdmin;

    @Column(name="DYD_PPH23")
    private Integer dydPph23;

    @Column(name="DYD_ONGKIR")
    private Integer dydOngkir;

    @Column(name="DYD_PROV")
    private Integer dydProv;

    @Column(name="DYD_DESC",length=200)
    private String dydDesc;

    @Column(name="PAYMENT_STATUS",length=1)
    private String paymentStatus;

    @Column(name="CREATED_BY")
    private String CreatedBy;

    @Column(name="CREATED_DATE")
    private Date CreatedDate;

    @Column(name="UPDATED_BY")
    private String UpdatedBy;

    @Column(name="UPDATED_DATE")
    private Date UpdatedDate;

    @Column(name="DYD_MATERAI")
    private Integer dydMaterai;

    @Column(name="DYD_PPH22")
    private Integer dydPph22;

    @Column(name="DYD_TOTAL")
    private Long dydTotal;

    @Column(name="DYD_DEPOSIT")
    private Integer dydDeposit;

    @Column(name="LIS",length=1)
    private String lis;


}
