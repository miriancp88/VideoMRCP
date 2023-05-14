module com.example.entornos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.entornos to javafx.fxml;
    exports com.example.entornos;
}