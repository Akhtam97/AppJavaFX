module com.example.appjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.appjavafx to javafx.fxml;
    exports com.example.appjavafx;
    exports com.example.appjavafx.Controller;
    opens com.example.appjavafx.Controller to javafx.fxml;
}