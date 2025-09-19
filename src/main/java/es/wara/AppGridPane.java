package es.wara;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Aplicación JavaFX principal que implementa un editor de texto con interfaz gráfica.
 * Esta clase extiende Application y se encarga de inicializar y mostrar la ventana principal
 * de la aplicación, cargando los archivos FXML y CSS necesarios.
 *
 * <p>La aplicación utiliza un GridPane como contenedor principal y permite al usuario
 * interactuar con controles de texto para editar y manipular cadenas.</p>
 *
 * @author Wara Pacheco
 * @version 1.0
 * @since 2025-09-19
 */
public class AppGridPane extends Application {

    /**
     * Escena principal de la aplicación JavaFX.
     * Contiene todos los elementos de la interfaz gráfica cargados desde el archivo FXML.
     */
    private static Scene scene;

    /**
     * Logger para registrar eventos y depuración de la aplicación.
     * Utiliza SLF4J para proporcionar logging flexible durante la ejecución.
     */
    private static final Logger loger = LoggerFactory.getLogger(AppGridPane.class);

    /**
     * Método principal de inicialización de la aplicación JavaFX.
     * Se ejecuta automáticamente cuando se lanza la aplicación y se encarga de:
     * <ul>
     *   <li>Cargar el archivo FXML con la interfaz de usuario</li>
     *   <li>Aplicar la hoja de estilos CSS</li>
     *   <li>Configurar las propiedades de la ventana principal</li>
     *   <li>Mostrar la aplicación al usuario</li>
     * </ul>
     *
     * @param stage El escenario principal proporcionado por JavaFX
     * @throws IOException Si ocurre un error al cargar los archivos FXML o CSS
     */
    @Override
    public void start(Stage stage) throws IOException {
        loger.debug("Buscando archivo FXML.");
        FXMLLoader fxmlLoader = new FXMLLoader(AppGridPane.class.getResource( "fxml/pantalla.fxml"));
        scene = new Scene(fxmlLoader.load());
        loger.debug("Archivo FXML cargado.");
        stage.setTitle("Editor..");
        loger.debug("Buscando hoja de estilos CSS.");
        String url = getClass().getResource("/es/wara/css/style.css").toString();
        scene.getStylesheets().addAll(url);
        loger.debug("Hoja de estilos cargada correctamente.");
        stage.setScene(scene);
        stage.setMinHeight(380);
        stage.setMinWidth(440);
        stage.setMaxHeight(700);
        stage.setMaxWidth(1000);
        stage.show();
    }

    /**
     * Punto de entrada principal de la aplicación.
     * Invoca el método launch() de JavaFX para inicializar el runtime de JavaFX
     * y ejecutar el método start().
     *
     * @param args Argumentos de línea de comandos pasados a la aplicación
     */
    public static void main(String[] args) {
        loger.info("INICIO DE APPGRIDPANE.");
        launch();
    }

}