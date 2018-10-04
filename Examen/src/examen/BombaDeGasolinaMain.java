/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.Scanner;
/**
 *
 * @author PC08
 */
public class BombaDeGasolinaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numBomba,tipoDeGasolina,precio,capacidad,contadorDeLitros=0,ventaNLitros;
        int op;
        BombaDeGasolina nueva=new BombaDeGasolina();
        do
        {
        System.out.println("Bienvenido ¿que accion desea realizar?");
        System.out.println("1- Iniciar la bomba");
        System.out.println("2- Verificar inventario");
        System.out.println("3- Hacer una venta");
        System.out.println("4- Calcular venta total");
        System.out.println("5-Salir");
        op = in.nextInt();
        switch(op)
        {
            case 1:
                System.out.println("Digite el numero de la bomba");
                numBomba = in.nextInt();
                System.out.println("Digite el tipo de gasolina");
                tipoDeGasolina = in.nextInt();
                System.out.println("Digite el precio de la gasolina");
                precio = in.nextInt();
            
                nueva.setNumBomba(numBomba);
                nueva.setTipoDeGasolina(tipoDeGasolina);
                nueva.setPrecio(precio);
            break;
            case 2:
                capacidad=nueva.verificar();
                System.out.println("Este es el invetario disponible:"+ capacidad);
                break;
            case 3:
                int cantidad=0;
                System.out.println("Cuantos litros va a vender?");
                cantidad = in.nextInt();
                
                int costo=nueva.venta(cantidad);
                System.out.println("Este es el costo:"+ costo);
                break;
            case 4:
                int ventatotal=nueva.ventaTotal();
                System.out.println("Esto fue la venta total:"+ ventatotal);
                break;
            case 5:
                System.out.println("Vuelva Pronto");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
                
        }
        }while(op!=5);
        
        
    }
    
}
