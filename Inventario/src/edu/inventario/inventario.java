package edu.inventario;

import javax.swing.JOptionPane;

import edu.cableado.Inventariable;

public class inventario implements Inventariable {

	@Override
	public void gestionarStock() {
		JOptionPane.showMessageDialog(null, "Invetario servicio Peluqueria");
	}

	@Override
	public void gestionarDisponibilidadServicio() {
		JOptionPane.showMessageDialog(null, "Invetario productos");
	}

}
