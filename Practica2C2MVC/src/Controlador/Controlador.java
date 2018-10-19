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
import Vista.vdlgFactura;
import Modelo.Factura;
import Modelo.NotaVenta;
import Modelo.Producto;
import Modelo.ProductoNoPerecedero;
import Modelo.ProductoPerecedero;

public class Controlador implements ActionListener {
    private ProductoNoPerecedero nuevoPnp;
    private ProductoPerecedero nuevoPp;
    private Factura nueva;
    private vdlgFactura vista;
    
    public Controlador(ProductoNoPerecedero nuevoPnp,ProductoPerecedero nuevoPp,
            Factura nueva,vdlgFactura vista)
    {
        this.nuevoPnp=nuevoPnp;
        this.nuevoPp=nuevoPp;
        this.nueva=nueva;
        this.vista=vista;
        vista.btnGuardar.addActionListener(this);
        vista.btnGuardar2.addActionListener(this);
        vista.btnGuardar3.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnLimpiar2.addActionListener(this);
        vista.btnLimpiar3.addActionListener(this);
        vista.btnLimpiar4.addActionListener(this);
        vista.btnLimpiar5.addActionListener(this);
        vista.btnMostrar.addActionListener(this);
        vista.btnMostrar2.addActionListener(this);
        vista.btnMostrar3.addActionListener(this);
        vista.btnCalcularImpuesto.addActionListener(this);
        vista.btnCalcularPP.addActionListener(this);
        vista.btnCalcularPnP.addActionListener(this);
        vista.btnCalcularSubTotal.addActionListener(this);
        vista.btnCalcularTotal.addActionListener(this);
        vista.setTitle("Factura");
        vista.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==vista.btnLimpiar)
        {
            vista.txtId.setText("");
            vista.txtNombre.setText("");
            vista.txtUnidad.setText("");
            vista.txtPrecioU.setText("");
            vista.txtFechaC.setText("");
            vista.txtTemperatura.setText("");
        }
        
        if(ae.getSource()==vista.btnLimpiar2)
        {
            vista.txtId2.setText("");
            vista.txtNombre2.setText("");
            vista.txtUnidad2.setText("");
            vista.txtPrecioU2.setText("");
            vista.txtLote.setText("");
        }
        
        if(ae.getSource()==vista.btnLimpiar3)
        {
            vista.txtPrecioUCalculo.setText("");
        }
        
        if(ae.getSource()==vista.btnLimpiar4)
        {
            vista.txtImpuesto.setText("");
            vista.txtSubTotal.setText("");
            vista.txtTotal.setText("");
        }
        
        if(ae.getSource()==vista.btnLimpiar5)
        {
            vista.txtNumNota.setText("");
            vista.txtFechaNota.setText("");
            vista.txtConcepto.setText("");
            vista.txtCantidad.setText("");
            vista.txtTipoPago.setText("");
            vista.txtRFC.setText("");
            vista.txtNombreC.setText("");
            vista.txtDomicilio.setText("");
            vista.txtFechaFactura.setText("");
            vista.txtIva.setText("");
        }
        
        if(ae.getSource()==vista.btnGuardar)
        {
            nuevoPp.setId(Integer.parseInt(vista.txtId.getText()));
            nuevoPp.setNombre(vista.txtNombre.getText());
            nuevoPp.setUnidad(Integer.parseInt(vista.txtUnidad.getText()));
            nuevoPp.setPrecioUnitario(Float.parseFloat(vista.txtPrecioU.getText()));
            nuevoPp.setFechaDeCaducidad(vista.txtFechaC.getText());
            nuevoPp.setTemperatura(Float.parseFloat(vista.txtTemperatura.getText()));
        }
        
        if(ae.getSource()==vista.btnGuardar2)
        {
            nuevoPnp.setId(Integer.parseInt(vista.txtId2.getText()));
            nuevoPnp.setNombre(vista.txtNombre2.getText());
            nuevoPnp.setUnidad(Integer.parseInt(vista.txtUnidad2.getText()));
            nuevoPnp.setPrecioUnitario(Float.parseFloat(vista.txtPrecioU2.getText()));
            nuevoPnp.setLote(vista.txtLote.getText());
        }
        
        if(ae.getSource()==vista.btnGuardar3)
        {
            nueva.setNumeroNota(Integer.parseInt(vista.txtNumNota.getText()));
         
            nueva.setFecha(vista.txtFechaNota.getText());
            nueva.setConcepto(vista.txtConcepto.getText());
            nueva.setCantidad(Integer.parseInt(vista.txtCantidad.getText()));
            nueva.setTipoPago(Integer.parseInt(vista.txtTipoPago.getText()));
            nueva.setProducto(nuevoPp);
            nueva.setRfc(vista.txtRFC.getText());
            nueva.setNombreCliente(vista.txtNombreC.getText());
            nueva.setDomicilio(vista.txtDomicilio.getText());
            nueva.setFechaF(vista.txtFechaFactura.getText());
            nueva.setIva(Integer.parseInt(vista.txtIva.getText()));
        }
        
        if(ae.getSource()==vista.btnMostrar)
        {
            vista.txtId.setText(String.valueOf(nuevoPp.getId()));
            vista.txtNombre.setText(nuevoPp.getNombre());
            vista.txtUnidad.setText(String.valueOf(nuevoPp.getUnidad()));
            vista.txtPrecioU.setText(String.valueOf(nuevoPp.getPrecioUnitario()));
            vista.txtFechaC.setText(nuevoPp.getFechaDeCaducidad());
            vista.txtTemperatura.setText(String.valueOf(nuevoPp.getTemperatura()));
        }
        
        if(ae.getSource()==vista.btnMostrar2)
        {
            vista.txtId2.setText(String.valueOf(nuevoPnp.getId()));
            vista.txtNombre2.setText(nuevoPnp.getNombre());
            vista.txtUnidad2.setText(String.valueOf(nuevoPnp.getUnidad()));
            vista.txtPrecioU2.setText(String.valueOf(nuevoPnp.getPrecioUnitario()));
            vista.txtLote.setText(nuevoPnp.getLote());
        }
        
        if(ae.getSource()==vista.btnMostrar3)
        {
            vista.txtNumNota.setText(String.valueOf(nueva.getNumeroNota()));
            vista.txtFechaNota.setText(nueva.getFecha());
            vista.txtConcepto.setText(nueva.getConcepto());
            vista.txtCantidad.setText(String.valueOf(nueva.getCantidad()));
            vista.txtTipoPago.setText(String.valueOf(nueva.getTipoPago()));
            vista.txtRFC.setText(nueva.getRfc());
            vista.txtNombreC.setText(nueva.getNombreCliente());
            vista.txtDomicilio.setText(nueva.getDomicilio());
            vista.txtFechaFactura.setText(nueva.getFechaF());
            vista.txtIva.setText(String.valueOf(nueva.getIva()));
        }
        
        if(ae.getSource()==vista.btnCalcularImpuesto)
        {
            vista.txtImpuesto.setText(String.valueOf(nueva.calcularImpuesto()));
        }
        
        if(ae.getSource()==vista.btnCalcularPP)
        {
            vista.txtPrecioUCalculo.setText(String.valueOf(nuevoPp.calcularPrecioUnitario()));
        }
        
        if(ae.getSource()==vista.btnCalcularPnP)
        {
            vista.txtPrecioUCalculo.setText(String.valueOf(nuevoPnp.calcularPrecioUnitario()));
        }
        
        if(ae.getSource()==vista.btnCalcularSubTotal)
        {
            vista.txtSubTotal.setText(String.valueOf(nueva.calcularPago()));
        }
        
        if(ae.getSource()==vista.btnCalcularTotal)
        {
            vista.txtTotal.setText(String.valueOf(nueva.calcularTotal()));
        }
    }
    
}
