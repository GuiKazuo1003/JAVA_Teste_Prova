package com.anuncios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuncios.entities.anuncios;
import com.anuncios.repositories.AnuncioRepository;

import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.EntityNotFoundException;

@Service
public class AnunciosService {
    @Autowired
    private static AnuncioRepository anuncioRepository;

    public static anuncios getAnunciosById (int id){
        return anuncioRepository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Cliente não encontrado")
        );
    }
    public List<anuncios> getAnuncios() {
        return anuncioRepository.findAll();
    }

    public anuncios save(anuncios Anuncios) {
        return anuncioRepository.save(Anuncios);
    }
}
