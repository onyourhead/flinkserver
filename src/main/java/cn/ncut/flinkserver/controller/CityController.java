package cn.ncut.flinkserver.controller;

import cn.ncut.flinkserver.entity.City;
import cn.ncut.flinkserver.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * title: CityController
 * projectName： flinkserver
 * author： 张政淇
 * date： 2019/10/14
 * time： 9:59
 */
@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;


    @RequestMapping("/{countryId}/items")
    @ResponseBody
    public List<City> getCityListByCountryId(@PathVariable("countryId") Integer countryId) {
        return cityService.getCityListByCountryId(countryId);
    }

    @GetMapping("/cityList")
    public String getCityList(Model model) {
        List<City> cityList = cityService.getCityListByCountryId(6);
        model.addAttribute("cityList", cityList);
        return "city";
    }
}
