module com.example.repo3_fibonaccisequence {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repo3_fibonaccisequence to javafx.fxml;
    exports com.example.repo3_fibonaccisequence;
}