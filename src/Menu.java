import controlador.ControladorAjedrez;
import vista.VistaAjedrez;

public class Menu {
    public static void main(String args[]) {
        VistaAjedrez vista = new VistaAjedrez();
        ControladorAjedrez controlador = new ControladorAjedrez(vista);
        vista.setVisible(true);
    }
}
