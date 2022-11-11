/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggNews.egg.entidades;

import com.eggNews.egg.Enumeraciones.Rol;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Usuario
 */
@Entity
public class Administrador extends Usuario{

    public Administrador(String id, String nombreUsuario, String password, Date alta, Rol rol, boolean activo) {
        super(id, nombreUsuario, password, alta, rol, activo);
    }
    
}
