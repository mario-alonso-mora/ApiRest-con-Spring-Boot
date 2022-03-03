package com.apipeliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apipeliculas.entity.Peliculas;

@Repository
public interface IPeliculasRepository extends JpaRepository<Peliculas,Integer> {

}
