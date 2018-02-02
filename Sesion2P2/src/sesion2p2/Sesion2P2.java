package sesion2p2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author euced
 */
public class Sesion2P2 {

    public static void main(String[] args) {
        char respuesta = 's', res = 's';
        String opcion, opt;
        String nombre, edad, nacionalidad, aniosLab, nivel, usuario, password, index;
        int contDtcv = 0;
        ArrayList<detective> lstDetectives = new ArrayList();
        do {
            opcion = JOptionPane.showInputDialog(null, "Menú 1. Administrar Detectives \n 2.LogIn ");
            while (verificaNum(opcion)) {
                JOptionPane.showMessageDialog(null, "Opcion Invalida, ingrese de nuevo");
                opcion = JOptionPane.showInputDialog(null, "Menú 1. Administrar Detectives \n 2.LogIn");
            }
            switch (Integer.parseInt(opcion)) {
                case 1:
                    while (res == 's' || res == 'S') {
                        opt = JOptionPane.showInputDialog(null, "Administrar Detectives: 1. Agregar Detectives \n 2.Modificar Detectives \n Eliminar Detectives ");
                        while (verificaNum(opt)) {
                            JOptionPane.showMessageDialog(null, "Opcion Invalida, ingrese de nuevo");
                            opt = JOptionPane.showInputDialog(null, "Administrar Detectives: 1. Agregar Detectives \n 2.Modificar Detectives \n Eliminar Detectives ");
                        }
                        switch (Integer.parseInt(opt)) {
                            case 1:
                                nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre del Detective");
                                edad = JOptionPane.showInputDialog(null, "Ingrese edad del Detective");
                                while (verificaNum(edad)) {
                                    JOptionPane.showMessageDialog(null, "Numero Invalido, ingrese de nuevo");
                                    edad = JOptionPane.showInputDialog(null, "Ingrese edad del detective");
                                }
                                nacionalidad = JOptionPane.showInputDialog(null, "Ingrese nacionalidad del Detective");
                                aniosLab = JOptionPane.showInputDialog(null, "Ingrese Años Laborando del Detective");
                                while (verificaNum(aniosLab)) {
                                    JOptionPane.showMessageDialog(null, "Numero Invalido, ingrese de nuevo");
                                    aniosLab = JOptionPane.showInputDialog(null, "Ingrese años laborando del detective");
                                }
                                nivel = JOptionPane.showInputDialog(null, "Ingrese nivel del Detective");
                                while (verificaNum(nivel)) {
                                    JOptionPane.showMessageDialog(null, "Numero Invalido, ingrese de nuevo");
                                    nivel = JOptionPane.showInputDialog(null, "Ingrese nivel del detective");
                                }
                                usuario = JOptionPane.showInputDialog(null, "Ingrese usuario del Detective");
                                while (verfUser(usuario, lstDetectives)) {
                                    JOptionPane.showMessageDialog(null, "Usuario ya existente :(, ingrese de nuevo");
                                    nivel = JOptionPane.showInputDialog(null, "Ingrese usuario del detective");
                                }
                                password = JOptionPane.showInputDialog(null, "Ingrese password del Detective");
                                detective dtcv = new detective(nombre, Integer.parseInt(edad), nacionalidad, Integer.parseInt(aniosLab),
                                        Integer.parseInt(nivel), usuario, password, contDtcv);
                                lstDetectives.add(dtcv);
                                contDtcv++;
                                break;
                            case 2:
                                index = JOptionPane.showInputDialog(null, "Ingrese el detective que desea modificar");
                                while (verificaNum(index)) {
                                    JOptionPane.showMessageDialog(null, "Numero Invalido, ingrese de nuevo");
                                    index = JOptionPane.showInputDialog(null, "Ingrese el detective que desea modificar");
                                }
                                if (Integer.parseInt(index) < lstDetectives.size()) {
                                    nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre del Detective");
                                    edad = JOptionPane.showInputDialog(null, "Ingrese edad del Detective");
                                    while (verificaNum(edad)) {
                                        JOptionPane.showMessageDialog(null, "Numero Invalido, ingrese de nuevo");
                                        edad = JOptionPane.showInputDialog(null, "Ingrese edad del detective");
                                    }
                                    nacionalidad = JOptionPane.showInputDialog(null, "Ingrese nacionalidad del Detective");
                                    aniosLab = JOptionPane.showInputDialog(null, "Ingrese Años Laborando del Detective");
                                    while (verificaNum(aniosLab)) {
                                        JOptionPane.showMessageDialog(null, "Numero Invalido, ingrese de nuevo");
                                        aniosLab = JOptionPane.showInputDialog(null, "Ingrese años laborando del detective");
                                    }
                                    nivel = JOptionPane.showInputDialog(null, "Ingrese nivel del Detective");
                                    while (verificaNum(nivel)) {
                                        JOptionPane.showMessageDialog(null, "Numero Invalido, ingrese de nuevo");
                                        nivel = JOptionPane.showInputDialog(null, "Ingrese nivel del detective");
                                    }
                                    usuario = JOptionPane.showInputDialog(null, "Ingrese usuario del Detective");
                                    while (verfUser(usuario, lstDetectives)) {
                                        JOptionPane.showMessageDialog(null, "Usuario ya existente :(, ingrese de nuevo");
                                        nivel = JOptionPane.showInputDialog(null, "Ingrese usuario del detective");
                                    }
                                    password = JOptionPane.showInputDialog(null, "Ingrese password del Detective");
                                    int pastDtcv = lstDetectives.get(Integer.parseInt(index)).getCodigoDtcv();
                                    detective dtcvTemp = new detective(nombre, Integer.parseInt(edad), nacionalidad, Integer.parseInt(aniosLab),
                                            Integer.parseInt(nivel), usuario, password, pastDtcv);
                                    lstDetectives.set(Integer.parseInt(index), dtcvTemp);
                                } else {
                                    JOptionPane.showMessageDialog(null, "No existe ese detective en la base");
                                }
                                break;
                            case 3:
                                index = JOptionPane.showInputDialog(null, "Ingrese el detective que desea eliminar");
                                while (verificaNum(index)) {
                                    JOptionPane.showMessageDialog(null, "Numero Invalido, ingrese de nuevo");
                                    index = JOptionPane.showInputDialog(null, "Ingrese el detective que desea eliminar");
                                }
                                if (Integer.parseInt(index) < lstDetectives.size()) {
                                    int mejorDt = mejorNivel(lstDetectives);

                                }
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion Inválida");
                        }
                        res = JOptionPane.showInputDialog(null, "Desea regresar al menú de Administrar Detectives? (s/n)").charAt(0);
                    }
                    break;
                case 2:
                    usuario = JOptionPane.showInputDialog(null, "Ingrese el usuario");
                    password = JOptionPane.showInputDialog(null, "Ingrese la contraseña del usuario");
                    int codigo;
                    if (verfUsuario(usuario, password, lstDetectives)) {
                        for (detective d : lstDetectives) {
                            if (d.getUsuario().equals(usuario)) {
                                codigo = d.getCodigoDtcv();
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Menú Usuarios: \n 1. Modificar datos \n 2.Listar datos \n 3.Registrar Caso \n 4. Modificar Caso \n 5.Listar Casos \n 6.Enviar Mensaje \n 7.");
                                
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario Invalido");
                    }

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Inválida");
            }

            respuesta = JOptionPane.showInputDialog(null, "Desea regresar al menú? (s/n)").charAt(0);
        } while (respuesta == 's' || respuesta == 'S');

    }

    //verifica si la cadena es entero
    public static boolean verificaNum(String str) {
        int cont = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                cont++;
            }
        }
        if (cont == str.length()) {
            return false;
        } else {
            return true;
        }
    }

    //devuelve detective con nivel mas alto
    public static int mejorNivel(ArrayList<detective> lst) {
        int mayor = 0;
        for (detective dtc : lst) {
            if (dtc.getNivel() > mayor) {
                mayor = dtc.getNivel();
            }
        }
        return mayor;
    }

    //verifica el login
    public static boolean verfUsuario(String user, String pass, ArrayList<detective> lst) {
        boolean flag = false;
        for (detective dtc : lst) {
            if (dtc.getUsuario().equals(user) && dtc.getPassword().equals(pass)) {
                flag = true;
            }
        }
        return flag;
    }

    //verfica si hay algun usuario existente
    public static boolean verfUser(String user, ArrayList<detective> lst) {
        boolean flag = false;
        for (detective dtc : lst) {
            if (dtc.getUsuario().equals(user)) {
                flag = true;
            }
        }
        return flag;
    }
}
