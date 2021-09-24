package edu.pago;

import javax.swing.JOptionPane;

import edu.cableado.Recaudo;

public class pago implements Recaudo {

	@Override
	public void efectuarPago() {
		JOptionPane.showMessageDialog(null, "se efectua pago");
	}

	@Override
	public void verificarMetodoPago() {
		JOptionPane.showMessageDialog(null, "metodo pago productos");
	}

}
