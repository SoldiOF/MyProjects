module com.seademo.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.seademo.demo to javafx.fxml;
    exports com.seademo.demo;
}