package es.wara;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase lanzadora principal de la aplicación JavaFX.
 * Esta clase actúa como punto de entrada alternativo que proporciona logging
 * antes de inicializar la aplicación JavaFX principal.
 *
 * <p>Se utiliza como wrapper para el lanzamiento de {@link AppGridPane},
 * permitiendo un mejor control del proceso de inicio y registro de eventos.</p>
 *
 * @author Wara Pacheco
 * @version 1.0
 * @since 2025-09-19
 * @see AppGridPane
 */
public class Lanzador {

    /**
     * Punto de entrada principal de la aplicación.
     * Registra el evento de lanzamiento y delega la ejecución a la clase
     * principal de JavaFX {@link AppGridPane}.
     *
     * <p>Este método actúa como un proxy que permite añadir logging y
     * potencialmente otras operaciones de inicialización antes de
     * lanzar la interfaz gráfica.</p>
     *
     * @param args Argumentos de línea de comandos que se pasan a la aplicación JavaFX
     */
    public static void main(String[] args) {
        AppGridPane.main(args);
    }
}