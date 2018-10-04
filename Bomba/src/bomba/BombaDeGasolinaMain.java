/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomba;

    import java.util.Scanner;
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
        Scanner in =new Scanner(System.in);
        
        int numBomba=0,capacidad=1000,contadorLV=0,id=0,tipo=0;
        float precioBase=0.0F;
        String marca="";
        Gasolina tGasolina=null;
        Object menu[] = {"1.- Iniciar Bomba","2.- Realizar Venta","3.- Revisar Inventario","4.- Calcular Venta Total","5.- Salir"};
        String opcMenu = "";
        BombaDeGasolina hoy=new BombaDeGasolina();
        Gasolina nueva=new Gasolina();
        opcMenu = (String) JOptionPane.showInputDialog(null,"Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
        switch(opcMenu)
        {
            case "1.- Iniciar Bomba":
                id= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el id de la Gasolina","Gasolina",JOptionPane.QUESTION_MESSAGE));
                marca=(JOptionPane.showInputDialog(null,"Digite la marca de la gasolina", "Gasolina", JOptionPane.QUESTION_MESSAGE));
                tipo= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tipo de la Gasolina EXAMPLE 1/2/3","Gasolina",JOptionPane.QUESTION_MESSAGE));}
                precioBase= Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el precio base de la Gasolina","Gasolina",JOptionPane.QUESTION_MESSAGE));
                numBomba = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero del boleto", "Bomba", JOptionPane.QUESTION_MESSAGE));
                capacidad= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la capacidad de la bomba","Bomba",JOptionPane.QUESTION_MESSAGE));
                
                nueva.setId(id);
                nueva.setMarca(marca);
                nueva.setTipo(tipo);
                nueva.setPrecioBase(precioBase);
                hoy.setNumBomba(numBomba);
                hoy.setCapacidad(capacidad);
                  
            case "2.- Realizar Venta":
                
            case "3.- Revisar Inventario":
                
            case "4.- Calcular Venta Total":
                
            case "5.- Salir":
        }
    }
    
}
