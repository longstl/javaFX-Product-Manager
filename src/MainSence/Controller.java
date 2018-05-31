package MainSence;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private JFXButton btnHome;

    @FXML
    private JFXButton btnProduct;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnList;

    @FXML
    private JFXButton actOrder;

    @FXML
    private VBox vbox_Left_Menu;

    public void actHome(ActionEvent actionEvent) {
    }

    public void actAdd(ActionEvent actionEvent) {
    }

    public void actList(ActionEvent actionEvent) {
    }

    public void actOrder(ActionEvent actionEvent) {
    }

    public void actProduct(ActionEvent actionEvent) {
        vbox_Left_Menu.getChildren().addAll(btnAdd);
        vbox_Left_Menu.getChildren().addAll(btnList);
        btnAdd.setVisible(true);
        btnList.setVisible(true);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        vbox_Left_Menu.getChildren().remove(btnAdd);
        vbox_Left_Menu.getChildren().remove(btnList);
    }
}
