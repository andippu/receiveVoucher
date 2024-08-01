package com.rv.receivevoucher.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DetilSalesOrderCompKey implements Serializable {
    private String dsoMsoNo;

    private String dsoBrgCode;

    private String dsoBatchNo;


}
