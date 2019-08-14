/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velocity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s205e13
 */
public class Persona {
    private String Nombre;
    private String Foto;
    private String Perfil;
    private List<Estudios> estudios;  

  

    public Persona(String Nombre, String Foto, String Perfil) {
        this.Nombre = Nombre;
        this.Foto = Foto;
        this.Perfil = Perfil;
        this.estudios= new ArrayList<Estudios>();
        
    }
    
    public static void Add_estudios(String univ,String titulo,String fecha) {
        Estudios est = new Estudios(univ, titulo, fecha);
    }

    public List<Estudios> getEstudios() {
        return estudios;
    }

    public void setEstudios(List<Estudios> estudios) {
        this.estudios = estudios;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }
    

    
}
