package com.example.cc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * @author ht
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("欢迎来到 JavaFX 应用程序！");
    }
}