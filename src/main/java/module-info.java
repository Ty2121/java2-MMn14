module org.ty.java2mmn14 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.ty.java2mmn14 to javafx.fxml;
    exports org.ty.java2mmn14;
}