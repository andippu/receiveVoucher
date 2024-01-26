package com.rv.receivevoucher.models;

import jakarta.persistence.Column;

import java.io.Serializable;

public class TempFakturCompKey implements Serializable {
    private String tFakSpbNo;
    private String tFakSpbProdId;

    private String tFakBatchNo;
}
