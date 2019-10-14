package cn.ncut.flinkserver.dao;

import cn.ncut.flinkserver.entity.City;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityDao {
    List<City> getCityListByCountryId (Integer countryId);
}
