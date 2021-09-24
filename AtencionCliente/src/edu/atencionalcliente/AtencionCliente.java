package edu.atencionalcliente;

import javax.swing.JOptionPane;

import edu.cableado.Soporte;

public class AtencionCliente implements Soporte {

	@Override
	public void brindarSoporteAsesoria() {
		JOptionPane.showMessageDialog(null, "Brindar soporte y asesoria");
	}
}
