package co.edu.uniquindio.proyectofinal.model.services;

import co.edu.uniquindio.proyectofinal.model.Usuario;

import java.util.ArrayList;

public interface IEmpresaDeEventos {

    public Usuario crearUsuario(String nombre, String apellido, String cedula, String fechaNacimiento) ;//throws EmpleadoException;
    public Boolean eliminarUsuario(String cedula);//throws EmpleadoException;
    boolean actualizarUsuario(String cedulaActual, Usuario usuario);// throws EmpleadoException;
    public boolean  verificarUsuarioExistente(String cedula);// throws EmpleadoException;
    public Usuario obtenerUsuario(String cedula);
    public ArrayList<Usuario> obtenerUsuarios();

}