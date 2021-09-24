package edu.despacho;

import javax.swing.JOptionPane;

import edu.cableado.GestionDespacho;

public class Despacho implements GestionDespacho {

	@Override
	public void gestionServicioPeluqueria() {
		JOptionPane.showMessageDialog(null, " salida servicio Peluqueria");
	}

	@Override
	public void gestionSalidaProductos() {
		JOptionPane.showMessageDialog(null, " Salida productos");
	}

}
