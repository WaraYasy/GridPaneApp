# Ejercicio: Práctica con JavaFX, FXML y GridPane

Este proyecto es un ejercicio para practicar habilidades aprendidas en JavaFX, el uso de Logger, la empaquetación de aplicaciones en archivos .jar ejecutables y el uso de FXML, explorando especialmente las funcionalidades del objeto **GridPane**.

## Descripción

La aplicación implementa un editor de texto con interfaz gráfica utilizando JavaFX. La interfaz está construida con un GridPane como contenedor principal que permite organizar los controles de manera estructurada en filas y columnas. El usuario puede interactuar con campos de texto para editar y manipular cadenas.

## Objetivos

- Practicar el uso de GridPane para el diseño de interfaces
- Integrar sistema de logging con SLF4J y Logback
- Generar un archivo .jar ejecutable
- Crear una aplicación JavaFX bien estructurada y documentada que cumpla el 'hexalogo' ^^.

## Características

- **Interfaz gráfica**: Diseñada con FXML y estilizada con CSS
- **GridPane**: Contenedor principal que organiza los elementos en una cuadrícula responsive
- **Controles incluidos**: 
  - Campo de texto para el nombre
  - Área de texto para descripción
  - Botones de acción (Ok, Cancel)
  - Etiquetas de estado
- **Sistema de logging**: Registra eventos de la aplicación para depuración
- **Ventana redimensionable**: Con límites mínimos y máximos configurados

## Requisitos

- **Java 11** o superior
- **Maven 3.8** o superior
- **Dependencias gestionadas automáticamente** por Maven (ver `pom.xml`):
  - JavaFX Controls (21.0.5)
  - JavaFX FXML (21.0.5)
  - SLF4J API (2.0.13)
  - Logback Classic y Core (1.5.13)

## Ejecución

### Con Maven (Recomendado)
Para compilar y ejecutar el proyecto con Maven:

```bash
mvn clean javafx:run
```

### Compilación y empaquetado
Para crear un JAR ejecutable con todas las dependencias:

```bash
mvn clean package
```

Esto generará un archivo JAR en `target/` junto con las librerías necesarias en `target/libs/`.

### Ejecución del JAR
Una vez compilado, puedes ejecutar el JAR directamente:

```bash
java -jar target/GridPaneApp-1.0-SNAPSHOT.jar
```

## Documentación

Para generar la documentación JavaDoc:

```bash
mvn javadoc:javadoc
```

## Logging

La aplicación incluye un sistema de logging configurado con Logback. Los logs se generan en:
- `logs/appGridPane-all.log` - Todos los eventos
- `logs/appGridPane-info.log` - Solo eventos informativos

---

*Ejercicio de DEIN para reforzar conceptos de JavaFX, FXML y el uso de GridPane como contenedor de interfaz.*
