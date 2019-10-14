package cn.ncut.flinkserver.entity;

import lombok.Data;

import java.util.Date;

/**
 * title: City
 * projectName： flinkserver
 * author： 张政淇
 * date： 2019/10/14
 * time： 9:33
 */
@Data
public class City {
    private Integer cityId;
    private String city;
    private Integer countryId;
    private Date lastUpdate;
}
