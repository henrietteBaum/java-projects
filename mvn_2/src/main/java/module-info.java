module zoomin {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens zoomin to javafx.fxml;
    exports zoomin;
}
