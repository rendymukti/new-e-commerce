package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class KeranjangRequest implements Serializable {

    private String produkId;
    private Double kuantitas;

}
