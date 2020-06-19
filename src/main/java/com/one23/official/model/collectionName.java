package com.one23.official.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "collectionName")
public class collectionName {

    @Id
    private String productid;
    private String productname;
    private String productdesc;
    private String category;
    private int productprice;
    private int productdiscount;

}
