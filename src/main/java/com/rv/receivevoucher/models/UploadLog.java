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
@Table(name = "UPLOAD_LOG")
public class UploadLog {

    @Id
    @Column(name = "UPLOG_ID")
    private Integer uplogId;

    @Column(name = "UPLOG_SPB_NO")
    private String uplogSpbNo;

    @Column(name = "UPLOG_PO_NO")
    private String uplogPoNo;

    @Column(name = "UPLOG_TYPE")
    private String uplogType;

    @Column(name = "UPLOG_ERROR")
    private String uplogError;

}
