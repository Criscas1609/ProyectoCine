package co.edu.cue.proyectofinalcorte3.service;

import co.edu.cue.proyectofinalcorte3.model.Food;
import co.edu.cue.proyectofinalcorte3.model.Ticket;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public interface SellService {
    void loadChairs(ArrayList<Button> chairs, String movie,TableView<Ticket> ticketList);
    void chairMovie(String movie, String chair, double price, ArrayList<Button> chairs, TableView<Ticket> ticketList );
    void tblSell(String movie,TableView<Ticket> ticketList);
    ObservableList<Ticket> getTicketsView();

    //Vista de la Venta
    void foodTbl(String movie,TableView<Food> foodTbl,String food,double price);

    //Venta finalizada
    void deleteTbl();
}
