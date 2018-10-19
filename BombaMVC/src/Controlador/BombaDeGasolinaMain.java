/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BombaDeGasolina;
import Modelo.Gasolina;
import Vista.vdlgBomba;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Software 05
 */
public class BombaDeGasolinaMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BombaDeGasolina hoy = new BombaDeGasolina ();
        Gasolina tGasolina=new Gasolina();
        vdlgBomba vista = new vdlgBomba(new JFrame(),true);
        Controlador controlador=new Controlador(hoy,tGasolina,vista);
    }
}

