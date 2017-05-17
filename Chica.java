/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorio;

import java.util.ArrayList;

/**
 *
 * @author O. Apolinar
 */
public abstract class Chica {
    ArrayList Nombre;
    ArrayList Telefono;

    public Chica(ArrayList Nombre, ArrayList Telefono) {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getTelefono() {
        return Telefono;
    }

    public void setTelefono(ArrayList Telefono) {
        this.Telefono = Telefono;
    }
    public abstract void IngresarNombre(String nombres);
    public abstract void IngresarTelefono(int telefono);
    public abstract void EliminarNombre(String nombres);
    public abstract void EliminarTelefono(int telefono);
    public abstract String BuscarNombre(String nombres);
    public abstract int BuscarTelefono(int telefono);
}
