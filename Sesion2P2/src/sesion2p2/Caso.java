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
public class Caso {
    private String lugar;
    private String descripcion;
    private int tipo;
    private int codDetective;
    private int estadoCaso;

    public Caso(String lugar, String descripcion, int tipo, int codDetective, int estadoCaso) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.codDetective = codDetective;
        this.estadoCaso = estadoCaso;
    }

    public Caso() {
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCodDetective() {
        return codDetective;
    }

    public void setCodDetective(int codDetective) {
        this.codDetective = codDetective;
    }

    public int getEstadoCaso() {
        return estadoCaso;
    }

    public void setEstadoCaso(int estadoCaso) {
        this.estadoCaso = estadoCaso;
    }

    @Override
    public String toString() {
        return "Caso{" + "lugar=" + lugar + ", descripcion=" + descripcion + ", tipo=" + tipo + ", codDetective=" + codDetective + ", estadoCaso=" + estadoCaso + '}';
    }
    
    
}
