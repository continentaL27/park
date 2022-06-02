package com.conti.parkrestapi.model;

import lombok.Data;

@Data
public class Park {

    private Long id;
    private String address;
    private String description;
    private int size;

}
