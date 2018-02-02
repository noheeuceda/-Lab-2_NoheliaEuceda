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
public class Evidencia {
    private String nombre;
    private String descripcion;
    private int nivelPeligrosidad;

    public Evidencia(String nombre, String descripcion, int nivelPeligrosidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public Evidencia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(int nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    @Override
    public String toString() {
        return "Evidencia{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", nivelPeligrosidad=" + nivelPeligrosidad + '}';
    }
    
}
