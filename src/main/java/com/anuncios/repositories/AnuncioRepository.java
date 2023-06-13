package com.anuncios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anuncios.entities.anuncios;

public interface AnuncioRepository extends JpaRepository <anuncios, Integer>{
    
}
