module com.hrms.hrms {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;


    opens com.hrms.hrms to javafx.fxml;
    exports com.hrms.hrms;
}