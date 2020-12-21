package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import javax.swing.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    public TextField filePathTextField;
    public RadioButton copyAllOfTypeRB, copyAllFilesRB;
    public ToggleGroup radios;
    public String image, other;
    public ComboBox fileTypeComboBox;
    @FXML
    public Button browseButton;
    public CheckBox keepHierarchyCheckBox;


    @FXML
    private void browseFiles(ActionEvent event) {
        System.out.println("browseButton pressed!");

        Window window = ((Node) (event.getSource())).getScene().getWindow();

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        File file = fileChooser.showOpenDialog(window);

        String filePath = file.getAbsolutePath();
        ((TextField)window.getScene().lookup("#filePathTextField")).setText(filePath);

        event.consume();
    }

    @FXML
    private void allOfTypeSelected(ActionEvent event) {
        System.out.println("Copy all of type selected!");

        Window window = ((Node) (event.getSource())).getScene().getWindow();
        window.getScene().lookup("#fileTypeCB").setDisable(false);
    }

    @FXML
    private void allFilesSelected(ActionEvent event) {
        System.out.println("Copy all files selected!");

        Window window = ((Node) (event.getSource())).getScene().getWindow();
        window.getScene().lookup("#fileTypeCB").setDisable(true);
    }

    @FXML
    private void keepHierarchy(ActionEvent event) {
        System.out.println("Keep hierarchy selected!");
    }
}
