module es.wara {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;
    requires org.slf4j;

    opens es.wara to javafx.fxml;
    exports es.wara;
}
