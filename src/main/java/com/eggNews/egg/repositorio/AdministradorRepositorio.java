/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggNews.egg.repositorio;

import com.eggNews.egg.entidades.Periodista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public interface AdministradorRepositorio extends JpaRepository<Periodista, String> {
    
}