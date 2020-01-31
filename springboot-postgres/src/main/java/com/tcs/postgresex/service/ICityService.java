package com.tcs.postgresex.service;



import java.util.List;

import com.tcs.postgresex.model.City;

public interface ICityService {

    List<City> findAll();
}