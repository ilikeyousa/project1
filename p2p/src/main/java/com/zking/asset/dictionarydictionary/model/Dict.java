package com.zking.asset.dictionarydictionary.model;

import lombok.Data;

@Data
public class Dict {
    private String id;

    private String dictype;

    private String dicremark;

    private String dicname;

    private String dicvalue;


    public Dict(String id, String dictype, String dicremark, String dicname, String dicvalue) {
        this.id = id;
        this.dictype = dictype;
        this.dicremark = dicremark;
        this.dicname = dicname;
        this.dicvalue = dicvalue;
    }

    public Dict() {
    }
}