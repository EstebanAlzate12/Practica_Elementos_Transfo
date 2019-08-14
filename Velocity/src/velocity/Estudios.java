/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velocity;

import java.util.Date;

/**
 *
 * @author s205e13
 */
public class Estudios {
    
    private String Universidad;
    private String titulo;
    private String fecha;

    public Estudios(String Universidad, String titulo, String fecha) {
        this.Universidad = Universidad;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
