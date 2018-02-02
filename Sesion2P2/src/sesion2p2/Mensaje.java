/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2p2;

/**
 *
 * @author euced
 */
public class Mensaje {
    private String emisor;
    private String receptor;
    private String contenido;
    private int nivelPrioridad;

    public Mensaje(String emisor, String receptor, String contenido, int nivelPrioridad) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.contenido = contenido;
        this.nivelPrioridad = nivelPrioridad;
    }

    public Mensaje() {
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    @Override
    public String toString() {
        return "contenido=" + contenido + ", nivelPrioridad=" + nivelPrioridad + '}';
    }
    
    
    
}
