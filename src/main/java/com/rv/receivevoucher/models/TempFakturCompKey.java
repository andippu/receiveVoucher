package com.rv.receivevoucher.models;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TempFakturCompKey implements Serializable {
    private String tFakSpbNo;
    private String tFakSpbProdId;

    private String tFakBatchNo;
}
