/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author PC08
 */
import javax.swing.JOptionPane;
public class ExamenMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numPuesto,nivelAcademico,tipoPuesto,numMaterias,numEmpleado;
        String descripcion,funciones,nombre,fechaIngreso;
        float pagoH;
        
        Object menu[]={"1) Captura de empleado docente","2) Captura de Puesto",
                       "3) Calculo de pago de docente","4) Calculo de persecciones",
                       "5) Calculo de impuesto","6) Total a pagar"};
        String opcMenu="";
        
        JOptionPane.showInternalOptionDialog(null, menu, null, 0, 0, null, menu, menu[0]);
        JOptionPane.showOptionDialog(null, OK_CANCEL_OPTION, , tipoPuesto, numMaterias,null, menu, menu[0]);
        
    }
}
