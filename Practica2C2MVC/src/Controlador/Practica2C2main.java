    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ProductoPerecedero;
import Modelo.ProductoNoPerecedero;
import Modelo.Factura;
import javax.swing.JOptionPane;
import Vista.vdlgFactura;
import javax.swing.JFrame;
/**
 *
 * @author PC21
 */
public class Practica2C2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProductoPerecedero nuevoPp= new ProductoPerecedero();
        ProductoNoPerecedero nuevoPnp= new ProductoNoPerecedero();
        Factura nueva=new Factura();
        vdlgFactura vista=new vdlgFactura(new JFrame(),true);
        Controlador controlador=new Controlador(nuevoPnp,nuevoPp,nueva,vista);
    }     
}
