package cn.ncut.flinkserver.controller;

import cn.ncut.flinkserver.entity.City;
import cn.ncut.flinkserver.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * title: CityController
 * projectName： flinkserver
 * author： 张政淇
 * date： 2019/10/14
 * time： 9:59
 */
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;


    @RequestMapping("/{countryId}/items")

    public List<City> getCityListByCountryId(@PathVariable("countryId") Integer countryId) {
        return cityService.getCityListByCountryId(countryId);
    }
}
