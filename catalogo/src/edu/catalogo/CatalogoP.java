package edu.catalogo;

import javax.swing.JOptionPane;

import edu.cableado.Promocion;

public class CatalogoP implements Promocion {

	@Override
	public void publicarProductosServicios() {
		JOptionPane.showMessageDialog(null, "Publicar lista de productos y servicios");
	}
}
