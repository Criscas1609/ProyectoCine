package co.edu.cue.proyectofinalcorte3.service;

import co.edu.cue.proyectofinalcorte3.model.Client;
import javafx.collections.ObservableList;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public interface ClientService {
    void addClient(String name, String id, String lastName, String birthday, String phoneNumber, String address, ObservableList<Client> clientsView, TableView<Client> tblClient);
    void showTbl(ObservableList<Client> clientsView, TableView<Client> tblClient);
    void selectClient(TextField nameClient, TextField lastName, TextField idClient, TextField phoneCliente, TextField emailCliente, DatePicker birthday, ObservableList<Client> clientsView, TableView<Client> tblClient);
    void deleteClient(ObservableList<Client> clientsView, TableView<Client> tblClient);
    void editClient(ObservableList<Client> clientsView, TableView<Client> tblClient,Client aux);
    void search(TableView<Client> tblClient, String search);

}
