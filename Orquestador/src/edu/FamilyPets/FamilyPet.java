package edu.FamilyPets;

import javax.swing.JOptionPane;

import edu.cableado.Soporte;
import edu.cableado.Promocion;
import edu.cableado.GestionDespacho;
import edu.cableado.Entrega;
import edu.cableado.Inventariable;
import edu.cableado.Recaudo;
import edu.utilidades.Cargador;

public class FamilyPet {
	void moderar() {
		Class cls = null;

		final Cargador cf = new Cargador("front");
		// Atención al cliente
		cls = cf.getClase(Soporte.class.getName());
		try {
			final Soporte iac = (Soporte) cls.newInstance();
			iac.brindarSoporteAsesoria();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Atencion al cliente...");
		}

		// Catalogo
		cls = cf.getClase(Promocion.class.getName());
		try {
			final Promocion ic = (Promocion) cls.newInstance();
			ic.publicarProductosServicios();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Catalogo...");
		}

		// Domicilio
		cls = cf.getClase(Entrega.class.getName());
		try {
			final Entrega idom = (Entrega) cls.newInstance();
			idom.despacharPedidos();
			idom.despacharServicio();
			idom.validarprocesoEntrega();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Domicilio...");
		}

		final Cargador cb = new Cargador("back");
		// Despacho
		cls = cb.getClase(GestionDespacho.class.getName());
		try {
			final GestionDespacho ides = (GestionDespacho) cls.newInstance();
			ides.gestionServicioPeluqueria();
			ides.gestionSalidaProductos();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Despacho...");
		}

		// Inventario
		cls = cb.getClase(Inventariable.class.getName());
		try {
			final Inventariable iinv = (Inventariable) cls.newInstance();
			iinv.gestionarStock();
			iinv.gestionarDisponibilidadServicio();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Inventario...");
		}

		// Pago
		cls = cb.getClase(Recaudo.class.getName());
		try {
			final Recaudo ip = (Recaudo) cls.newInstance();
			ip.efectuarPago();
			ip.verificarMetodoPago();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Pago...");
		}
	}

	public static void main(final String[] args) {
		new FamilyPet().moderar();
	}

}