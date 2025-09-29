package Control;

import View.viewResumen;
import View.viewHome;
import Model.modelResumen;

/**
 *
 * @author diana
 */

public class controlResumen {
    private modelResumen modelo;
    private viewResumen vista;

    public controlResumen(viewHome vista_g, modelResumen modelo) {
        this.modelo = modelo;
        this.vista = vista_g.getViewResumen();

        // Listener para Aceptar
        vista.getAceptar().addActionListener(e -> System.exit(0));

        // Listener para Regresar
        vista.getRegresar().addActionListener(e -> vista_g.showScreen("personalizar"));
    }

    // Método para actualizar la vista con los datos del modelo
    public void mostrarResumen() {
            vista.getValorCombo().setText(modelo.getCombo().crearComboconTipo(tipo)));
            vista.getValorBebida().setText(modelo.getPersonalizar().getBebida());
            vista.getValorAcompa().setText(modelo.getPersonalizar().getAcompa());
            vista.getValorExtra().setText(modelo.getPersonalizar().getExtra());
    }
}
