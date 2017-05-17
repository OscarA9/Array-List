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
public class Auxiliar extends Chica {

    public Auxiliar(ArrayList Nombre, ArrayList Telefono) {
        super(Nombre, Telefono);
    }

    @Override
    public void IngresarNombre(String nombres) {
        super.Nombre.add(nombres);
        
    }

    @Override
    public void IngresarTelefono(int telefono) {
        super.Telefono.add(telefono);
    }

    @Override
    public void EliminarNombre(String nombres) {
        super.Nombre.remove(super.Nombre.indexOf(nombres));
        
    }

    @Override
    public void EliminarTelefono(int telefono) {
        super.Telefono.remove(super.Telefono.indexOf(telefono));
    }

    @Override
    public String BuscarNombre(String nombres) {
        String buscarnombre="";
        if (super.Nombre.contains(nombres)== true){
            buscarnombre=super.Nombre.get(super.Nombre.indexOf(nombres)).toString(); 
        }else{
            buscarnombre="Ya no existe su nombre";    
        }
     return buscarnombre;
    }

    @Override
    public int BuscarTelefono(int telefono) {
       int buscartelefono=0;
       if(super.Telefono.contains(telefono)== true){
           buscartelefono=Integer.parseInt(super.Telefono.get(super.Telefono.indexOf(telefono)).toString());
       }else{
       buscartelefono=0;
       }
       return buscartelefono;
    }
    
    
}
