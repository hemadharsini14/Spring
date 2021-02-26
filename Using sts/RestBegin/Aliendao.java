package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

public interface Aliendao extends CrudRepository<Alien, String> {
	/*List<Alien> findByname(String name);
	List<Alien>findByidGreaterThan(String id);
	@Query("from Alien where name=?1 order by id")
	List<Alien>findByTechSorted(String name);*/

}
