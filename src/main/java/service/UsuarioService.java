/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Model.Usuario;
import java.util.List;

public interface UsuarioService {
    Usuario crearUsuario(Usuario usuario);
    Usuario obtenerUsuarioPorId(Long id);
    List<Usuario> obtenerTodosLosUsuarios();
    Usuario actualizarUsuario(Long id, Usuario usuario);
    void eliminarUsuario(Long id);
}