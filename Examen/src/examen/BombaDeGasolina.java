/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
/**
 *
 * @author PC08
 */
public class BombaDeGasolina {
    private int numBomba;
    private int tipoDeGasolina;
    private int precio;
    private int capacidad;
    private int contadorDeLitros;
    private int ventaNLitros;
    
    public BombaDeGasolina()
    {
        numBomba=01;
        tipoDeGasolina=01;
        precio=15;
        capacidad=1000;
        contadorDeLitros=00;
        ventaNLitros=00;
    }
    
    public BombaDeGasolina(int nBomba,int tGasolina,int precioG,int capacidadL, int cLitros,int vNumLitros)
    {
        numBomba=nBomba;
        tipoDeGasolina=tGasolina;
        precio=precioG;
        capacidad=capacidadL;
        contadorDeLitros=cLitros;
        ventaNLitros=vNumLitros;
    }
    
    public BombaDeGasolina(BombaDeGasolina otra)
    {
        numBomba=otra.numBomba;
        tipoDeGasolina=otra.tipoDeGasolina;
        precio=otra.precio;
        capacidad=otra.capacidad;
        contadorDeLitros=otra.contadorDeLitros;
        ventaNLitros=otra.ventaNLitros;
    }

    /**
     * @return the numBomba
     */
    public int getNumBomba() {
        return numBomba;
    }

    /**
     * @param numBomba the numBomba to set
     */
    public void setNumBomba(int numBomba) {
        this.numBomba = numBomba;
    }

    /**
     * @return the tipoDeGasolina
     */
    public int getTipoDeGasolina() {
        return tipoDeGasolina;
    }

    /**
     * @param tipoDeGasolina the tipoDeGasolina to set
     */
    public void setTipoDeGasolina(int tipoDeGasolina) {
        this.tipoDeGasolina = tipoDeGasolina;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the contadorDeLitros
     */
    public int getContadorDeLitros() {
        return contadorDeLitros;
    }

    /**
     * @param contadorDeLitros the contadorDeLitros to set
     */
    public void setContadorDeLitros(int contadorDeLitros) {
        this.contadorDeLitros = contadorDeLitros;
    }

    /**
     * @return the ventaNLitros
     */
    public int getVentaNLitros() {
        return ventaNLitros;
    }

    /**
     * @param ventaNLitros the ventaNLitros to set
     */
    public void setVentaNLitros(int ventaNLitros) {
        this.ventaNLitros = ventaNLitros;
    }
    
    public int verificar()
    {
        int inventario;
        inventario=capacidad-contadorDeLitros;
        return inventario;
    }
    
    public int venta(int litros)
    {
        if(litros<capacidad)
        {
            this.contadorDeLitros=contadorDeLitros+litros;
            int costo=litros*precio;
            return costo;
        }
        else
        {
            System.out.println("No hay suficiente gasolina en la bomba");
            return 0;
        }  
    }
    
    public int ventaTotal()
    {
        int total=contadorDeLitros*precio;
        return total;
    }
    
    public int contador()
    {
        return contadorDeLitros;
    }
}
