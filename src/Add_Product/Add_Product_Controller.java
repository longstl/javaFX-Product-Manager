package Add_Product;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Add_Product_Controller implements Initializable {
    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtPrice;

    @FXML
    private JFXTextField txtImage;

    @FXML
    private JFXButton btnImageChooser;

    @FXML
    private JFXButton btnSubmit;

    @FXML
    private JFXButton btnReset;

    public void actImageChooser(ActionEvent actionEvent) {
    }

    public void actSubmit(ActionEvent actionEvent) {
    }

    public void actReset(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
