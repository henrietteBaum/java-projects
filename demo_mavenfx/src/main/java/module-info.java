module info.zoomin {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens info.zoomin to javafx.fxml;
    exports info.zoomin;
}
