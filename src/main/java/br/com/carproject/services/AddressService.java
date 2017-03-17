package br.com.carproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carproject.entities.City;
import br.com.carproject.repositories.CityRepository;

@Service
public class AddressService
{

    @Autowired
    private CityRepository cityRepository;

    public List<City> listCities(String uf)
    {
        return cityRepository.findByUf(uf);
    }
}
