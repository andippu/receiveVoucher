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
@Table(name = "MASTER_SALES_ORDER")
//@IdClass(MasterSalesOrderCompKey.class)
public class MasterSalesOrder {
    @Id
    @Column(name="MSO_NO",length=50,  nullable = false)
    private String msoNo;


    @Column (name="MSO_DATE" , nullable = false)
    private Date msoDate;

    @Column(name="MSO_PO",length=50)
    private String msoPo;

    @Column(name="MSO_CUS_CODE",length=6)
    private String msoCusCode;

    @Column(name="MSO_CHGUSER",length=40)
    private String msoChgUser;

    @Column (name="MSO_CHGDATE" )
    private Date msoChgDate;

    @Column(name="MSO_CUS_CODE_TEMP",length=10)
    private String msoCusCodeTemp;

    @Column(name="MSO_CUST_UM")
    private Integer msoCusUm;

    @Column(name="MSO_CUST_CO")
    private Integer msoCusCo;

    @Column(name="MSO_LUNAS")
    private Integer msoLunas;

    @Column (name="MSO_CREDATE" )
    private Date msoCreDate;

    @Column(name="MSO_CREUSER",length=40)
    private String msoCreUser;

    @Column(name="MSO_STATUS",length=40)
    private String msoStatus;
}
