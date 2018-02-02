
package sesion2p2;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author euced
 */
public class detective {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private int aniosLab;
    private int nivel;
    private ArrayList<String[][]> casos = new ArrayList();
    private ArrayList<String[][]> buzon = new ArrayList();
    private String usuario;
    private String password;
    private int codigoDtcv;

    public detective(String nombre, int edad, String nacionalidad, int aniosLab, int nivel, String usuario, String password, int codigoDtcv) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.aniosLab = aniosLab;
        this.nivel = nivel;
        this.usuario = usuario;
        this.password = password;
        this.codigoDtcv = codigoDtcv;
    }
    public detective() {
    }

    public int getCodigoDtcv() {
        return codigoDtcv;
    }

    public void setCodigoDtcv(int codigoDtcv) {
        this.codigoDtcv = codigoDtcv;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAniosLab() {
        return aniosLab;
    }

    public void setAniosLab(int aniosLab) {
        this.aniosLab = aniosLab;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<String[][]> getCasos() {
        return casos;
    }

    public void setCasos(ArrayList<String[][]> casos) {
        this.casos = casos;
    }

    public ArrayList<String[][]> getBuzon() {
        return buzon;
    }

    public void setBuzon(ArrayList<String[][]> buzon) {
        this.buzon = buzon;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "detective{" + "nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", aniosLab=" + aniosLab + ", nivel=" + nivel + ", casos=" + casos + ", buzon=" + buzon + ", usuario=" + usuario + ", password=" + password + '}';
    }
    
    
}
