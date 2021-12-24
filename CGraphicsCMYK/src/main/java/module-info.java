module com.example.cgraphicscmyk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cgraphicscmyk to javafx.fxml;
    exports com.example.cgraphicscmyk;
}