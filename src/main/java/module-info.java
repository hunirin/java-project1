module com.java.project1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.java.project1 to javafx.fxml;
    exports com.java.project1;
}