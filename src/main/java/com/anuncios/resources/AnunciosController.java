package com.anuncios.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anuncios.entities.anuncios;
import com.anuncios.services.AnunciosService;

import ch.qos.logback.core.net.server.Client;


@RequestMapping("anuncios")
@RestController
public class AnunciosController {
    @Autowired
    private AnunciosService anunciosService;
    
    private ResponseEntity <anuncios> getAnuncio(@PathVariable int id) {
        anuncios Anuncio = AnunciosService.getAnunciosById(id);
        return ResponseEntity.ok().body(Anuncio);
    }

    @GetMapping

    public ResponseEntity <List<anuncios>> getAnuncio() {
        List<anuncios> Anuncios = anunciosService.getAnuncios();
        return ResponseEntity.ok().body(Anuncios);
    }

}
