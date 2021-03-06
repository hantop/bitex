package com.spark.bitrade.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * 地址
 *
 * @author Zhang Jinwei
 * @date 2018年01月02日
 */
@Data
@Embeddable
public class Location implements Serializable {
    private String country;
    private String province;
    private String city;
    private String district;
}
