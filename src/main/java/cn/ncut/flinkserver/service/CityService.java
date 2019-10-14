package cn.ncut.flinkserver.service;

import cn.ncut.flinkserver.dao.CityDao;
import cn.ncut.flinkserver.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * title: CityService
 * projectName： flinkserver
 * author： 张政淇
 * date： 2019/10/14
 * time： 9:59
 */
@Service
public class CityService {
    @Autowired
    private CityDao cityDao;
    public List<City> getCityListByCountryId(Integer countryId) {
        return cityDao.getCityListByCountryId(countryId);
    }
}
