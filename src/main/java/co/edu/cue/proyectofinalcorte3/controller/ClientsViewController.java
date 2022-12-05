package co.edu.cue.proyectofinalcorte3.controller;

import co.edu.cue.proyectofinalcorte3.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ClientsViewController {

    @FXML
    private ChoiceBox<?> carreraProfesor;

    @FXML
    private TextField nombreProfesor;

    @FXML
    private TextField nombreProfesor1;

    @FXML
    private TextField nombreProfesor11;

    @FXML
    private TextField nombreProfesor111;

    @FXML
    private TextField nombreProfesor1111;

    @FXML
    private TextField nombreProfesor112;

    @FXML
    void ClientsView(ActionEvent event) throws IOException {
        HelloApplication.clientsViews(event);

    }

    @FXML
    void MoviesView(ActionEvent event) throws IOException {
        HelloApplication.moviesViews(event);
    }

    @FXML
    void loginView(ActionEvent event) throws IOException {
        HelloApplication.loginViews(event);
    }

    @FXML
    void mainView(ActionEvent event) throws IOException {
        HelloApplication.mainViews(event);
    }

    @FXML
    void userView(ActionEvent event) {

    }

}

