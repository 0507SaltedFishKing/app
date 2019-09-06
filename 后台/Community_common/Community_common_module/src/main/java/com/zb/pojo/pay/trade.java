package com.zb.pojo.pay;

import java.io.Serializable;

public class trade implements Serializable {
    private String id;
    private String orderNo;
    private String tradeNo;
    private Integer payMethod;
    private Double amount;
    private String createdTime;
    private String updatedTime;
}
