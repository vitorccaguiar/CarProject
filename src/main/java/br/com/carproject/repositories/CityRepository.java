package br.com.carproject.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.carproject.entities.City;

@Repository
public interface CityRepository extends CrudRepository<City, String>
{

    List<City> findByUf(String uf);
}
