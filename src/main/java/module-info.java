module com.indra.estudosjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.indra.estudosjava to javafx.fxml;
    exports com.indra.estudosjava;
}