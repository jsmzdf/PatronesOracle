package edu.domicilio;

import javax.swing.JOptionPane;

import edu.cableado.Entrega;

public class Domicilio implements Entrega {

    @Override
    public void despacharPedidos() {
        JOptionPane.showMessageDialog(null, "Entrega pedido");
    }

    @Override
    public void despacharServicio() {
        JOptionPane.showMessageDialog(null, "Entrega servicio");
    }

    @Override
    public void validarprocesoEntrega() {
        JOptionPane.showMessageDialog(null, "Validar proceso de entrega");
    }

}
