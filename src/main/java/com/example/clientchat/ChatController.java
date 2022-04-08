package com.example.clientchat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    @FXML
    private TextArea messageArea;
    @FXML
    private TextField messageField;
    @FXML
    private Label welcomeText;

    @FXML
    private void sendButtonClick(ActionEvent actionEvent) {
        final String inputText = messageField.getText();
        if (inputText.isEmpty()) {
            return;
        }
        messageArea.setWrapText(true);
        messageArea.appendText("User:" + "\n" + inputText + "\n");
        messageField.clear();
        messageField.requestFocus();
    }


}