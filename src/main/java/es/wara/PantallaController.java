package es.wara;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controlador para la pantalla principal de la aplicación.
 * Permite al usuario ingresar cadenas de texto y concatenarlas en un área de texto.
 * Proporciona funcionalidad para agregar nuevo texto y limpiar el contenido.
 *
 * @author Wara Pacheco
 * @version 1.0
 * @since 2025-09-19
 */
public class PantallaController {

    /**
     * Logger para registrar eventos y operaciones del controlador.
     * Utiliza SLF4J para proporcionar información sobre las acciones del usuario.
     */
    private static final Logger loger = LoggerFactory.getLogger(PantallaController.class);

    /**
     * Área de texto donde se muestra la cadena concatenada completa.
     * Muestra el resultado de todas las cadenas agregadas por el usuario.
     */
    @FXML
    private TextArea txtAreaDescription;

    /**
     * Campo de texto donde el usuario ingresa nuevas cadenas.
     * Se limpia automáticamente después de cada agregado exitoso.
     */
    @FXML
    private TextField txtName;

    /**
     * Etiqueta que muestra el estado actual de la aplicación.
     * Proporciona feedback al usuario sobre las operaciones realizadas.
     * Valor inicial: "Ready"
     */
    @FXML
    private Label labelEstado;

    /**
     * Cadena interna que almacena la concatenación de todos los textos agregados.
     * Se inicializa como cadena vacía y se va construyendo con cada operación.
     */
    private String cadena = "";


    /**
     * Maneja el evento del botón Cancelar.
     * Cierra completamente la aplicación cuando el usuario presiona el botón.
     * Registra la acción en el log antes de ejecutar el cierre.
     *
     * <p>Este método utiliza {@link Platform#exit()} para cerrar la aplicación
     * de forma segura, lo que permite que JavaFX termine correctamente todos
     * los hilos y libere los recursos.</p>
     *
     * @param event El evento de acción generado por el botón cancelar
     * @see Platform#exit()
     */
    @FXML
    void btnCancel(ActionEvent event) {
        loger.info("CERRANDO APLICACIÓN.");
        Platform.exit();
    }

    /**
     * Maneja el evento del botón OK.
     * Valida y agrega el texto ingresado por el usuario a la cadena principal.
     * Si el texto es válido, lo concatena y actualiza la interfaz.
     * Si el texto está vacío o solo contiene espacios, muestra un mensaje de error.
     *
     * @param event El evento de acción generado por el botón OK
     */
    @FXML
    void btnOk(ActionEvent event) {
        String nuevaCadena = txtName.getText();

        // Validar que la cadena no esté vacía ni contenga solo espacios
        if (!nuevaCadena.trim().isEmpty()) {
            // Agregar separador si ya hay contenido previo
            if (!cadena.isEmpty()) {
                cadena += " ";
            }

            cadena += nuevaCadena.trim();
            actualizarTxt();
            labelEstado.setText("Se ha añadido: " + nuevaCadena);
            txtName.clear();
            loger.info("Texto añadido exitosamente. Longitud total de cadena: {}. Cadena: {}", cadena.length(),cadena);
        } else {
            labelEstado.setText("No se ha añadido nada al texto.");
        }
    }

    /**
     * Actualiza el contenido del área de texto con la cadena actual.
     * Este método se encarga únicamente de sincronizar la cadena interna
     * con lo que se muestra en la interfaz gráfica.
     * No modifica el estado del label, permitiendo que cada operación
     * maneje su propio mensaje de feedback.
     */
    private void actualizarTxt() {
        txtAreaDescription.setText(cadena);
        loger.info("Área de texto actualizada - Contenido actual: {} caracteres", cadena.length());
    }
}