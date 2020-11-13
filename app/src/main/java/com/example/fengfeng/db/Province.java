package com.example.fengfeng.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provienceCode;

    public int getProvienceCode() {

        return provienceCode;
    }

    public void setProvienceCode(int provienceCod) {

        this.provienceCode = provienceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceNNNName) {
        this.provinceName = provinceNNNName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }
}
