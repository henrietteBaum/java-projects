module info.zoomin {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens info.zoomin to javafx.fxml;
    exports info.zoomin;

}
