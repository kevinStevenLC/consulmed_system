module com.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.project.ui.controllers;

    opens com.project to javafx.fxml;

    exports com.project.ui.controllers;

    exports com.project;
}
