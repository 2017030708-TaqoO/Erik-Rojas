/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Administrador
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Vista.vdlgBomba;
import Modelo.BombaDeGasolina;
import Modelo.Gasolina;

public class Controlador implements ActionListener {
    private BombaDeGasolina hoy;
    private Gasolina tGasolina;
    private vdlgBomba vista;
    
    public Controlador(BombaDeGasolina hoy,Gasolina tGasolina,vdlgBomba vista)
    {
        this.hoy=hoy;
        this.tGasolina=tGasolina;
        this.vista=vista;
        vista.btnCalcular.addActionListener(this);
        vista.btnGuardar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnLimpiar2.addActionListener(this);
        vista.btnLimpiar3.addActionListener(this);
        vista.btnMostrar.addActionListener(this);
        vista.btnMostrar2.addActionListener(this);
        vista.btnMostrar3.addActionListener(this);
        vista.btnLimpiar4.addActionListener(this);
        vista.setTitle("Bomba De Gasolina");
        vista.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==vista.btnLimpiar)
        {
            vista.txtId.setText("");
            vista.txtNumBomba.setText("");
            vista.txtTipo.setText("");
            vista.txtPrecioBase.setText("");
            vista.txtCapacidad.setText("");
            vista.txtMarca.setText("");
        }
        
        if(ae.getSource()==vista.btnMostrar)
        {
            vista.txtId.setText(String.valueOf(tGasolina.getId()));
            vista.txtNumBomba.setText(String.valueOf(hoy.getNumBomba()));
            vista.txtTipo.setText(String.valueOf(tGasolina.getTipo()));
            vista.txtPrecioBase.setText(String.valueOf(tGasolina.getPrecioBase()));
            vista.txtCapacidad.setText(String.valueOf(hoy.getCapacidad()));
            vista.txtMarca.setText(tGasolina.getMarca());
        }
        
        if(ae.getSource()==vista.btnGuardar)
        {
            tGasolina.setId(Integer.parseInt(vista.txtId.getText()));
            tGasolina.setMarca((vista.txtMarca.getText()));
            tGasolina.setTipo(Integer.parseInt(vista.txtTipo.getText()));
            tGasolina.setPrecioBase(Integer.parseInt(vista.txtPrecioBase.getText()));
            hoy.setNumBomba(Integer.parseInt(vista.txtNumBomba.getText()));
            hoy.setCapacidad(Integer.parseInt(vista.txtCapacidad.getText()));
            hoy.settGasolina(tGasolina);
        }
        
        if(ae.getSource()==vista.btnLimpiar2)
        {
            vista.txtInventario.setText("");
        }
        
        if(ae.getSource()==vista.btnLimpiar3)
        {
            vista.txtVentaTotal.setText("");
        }
        
        if(ae.getSource()==vista.btnMostrar2)
        {
            vista.txtInventario.setText(String.valueOf(hoy.verificarInventario()));
        }
        
        if(ae.getSource()==vista.btnMostrar3)
        {
            vista.txtVentaTotal.setText(String.valueOf(hoy.ventaTotal()));
        }
        
        if(ae.getSource()==vista.btnCalcular)
        {
            vista.txtCosto.setText(String.valueOf(hoy.venta(Integer.parseInt(vista.txtLitros.getText()))));
        }   
        
        if(ae.getSource()==vista.btnLimpiar4)
        {
            vista.txtLitros.setText("");
            vista.txtCosto.setText("");
        }
                    
    }
    
}
