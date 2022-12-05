package co.edu.cue.proyectofinalcorte3.controller;

import co.edu.cue.proyectofinalcorte3.HelloApplication;
import co.edu.cue.proyectofinalcorte3.model.Food;
import co.edu.cue.proyectofinalcorte3.model.Ticket;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SellViewController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();

    @FXML
    private TableColumn<?, ?> colFood;

    @FXML
    private TableColumn<?, ?> colFoodPrice;
    @FXML
    private TableView<Food> foodTblView;
    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private TableColumn<?, ?> colChair;
    @FXML
    private TableView<Ticket> tblView;
    @FXML
    private Label showTime;

    @FXML
    private Label timeOfMovie;

    @FXML
    private TextField idClient;

    @FXML
    private ChoiceBox<?> idMember;

    @FXML
    private TextField nameClient;

    @FXML
    private Label nameMovie;

    @FXML
    void popCorn(ActionEvent event) {
        String name = "Palomitas";
        double price = 7500;
        mfc.foodTbl(nameMovie.getText(),foodTblView,name,price);
    }

    @FXML
    void drink(ActionEvent event) {
        String name = "Gaseosa";
        double price = 5000;
        mfc.foodTbl(nameMovie.getText(),foodTblView,name,price);
    }

    @FXML
    void movieView(ActionEvent event) throws IOException {
        HelloApplication.invoicesView(event);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameMovie.setText(MovieViewController.getMovie());
        showTime.setText(MovieViewController.getShowTime());
        timeOfMovie.setText(MovieViewController.getTime());
        colChair.setCellValueFactory(new PropertyValueFactory<>("chair"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colFood.setCellValueFactory(new PropertyValueFactory<>("food"));
        colFoodPrice.setCellValueFactory(new PropertyValueFactory<>("foodPrice"));
        tblSell();

    }
    void tblSell(){
        mfc.tblSell(nameMovie.getText(),tblView);
    }
}
