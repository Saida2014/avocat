module com.example.avocat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.avocat to javafx.fxml;
    exports com.example.avocat;
}