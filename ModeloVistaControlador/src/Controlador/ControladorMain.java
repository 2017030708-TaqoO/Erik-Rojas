/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author PC21
 */
import Modelo.Fecha;
import Vista.vdlgFecha;
import javax.swing.JFrame;
public class ControladorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha hoy = new Fecha();
        vdlgFecha vista = new vdlgFecha(new JFrame(),true);
        Controlador controlador = new Controlador(hoy,vista);
    }
    
}
