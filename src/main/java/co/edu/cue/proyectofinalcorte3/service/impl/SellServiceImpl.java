package co.edu.cue.proyectofinalcorte3.service.impl;

import co.edu.cue.proyectofinalcorte3.model.Food;
import co.edu.cue.proyectofinalcorte3.model.Ticket;
import co.edu.cue.proyectofinalcorte3.service.SellService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.Stylesheet;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;


import java.util.ArrayList;

public class SellServiceImpl implements SellService {



    private final ArrayList<Ticket> movie1 = new ArrayList<Ticket>(); //Wakanda
    private final ArrayList<Ticket> movie2 = new ArrayList<Ticket>(); //Strange World
    private final ArrayList<Ticket> movie3 = new ArrayList<Ticket>(); //Black Adam
    private final ArrayList<Ticket> movie4 = new ArrayList<Ticket>(); //Avatar
    private final ArrayList<Ticket> client = new ArrayList<Ticket>(); //Sillas del cliente
    private final ArrayList<Food> foodList = new ArrayList<Food>();

    ObservableList<Ticket> ticketsView = FXCollections.observableArrayList();
    ObservableList<Food> foodView = FXCollections.observableArrayList();

    public ObservableList<Ticket> getTicketsView() {
        return ticketsView;
    }

    //Funciones de la vista ticket

    public void loadChairs(ArrayList<Button> chairs, String movie,TableView<Ticket> ticketList){
        switch (movie){
            case "Wakanda por siempre":
               showChairs(chairs,movie1);
               showTbl(ticketList,client);
                break;
            case "Strange world":
                showChairs(chairs,movie2);
                showTbl(ticketList,client);
                break;
            case "Black Adam":
                showChairs(chairs,movie3);
                showTbl(ticketList,client);
                break;
            case "Avatar 2":
                showChairs(chairs,movie4);
                showTbl(ticketList,client);
                break;
        }
    }

    public void chairMovie(String movie,String chair,double price,ArrayList<Button> chairs,TableView<Ticket> ticketList){
        Ticket ticket = new Ticket(chair,price);
        switch (movie) {
            case "Wakanda por siempre":
                movie1.add(ticket);
                client.add(ticket);
            break;
            case "Strange world":
                movie2.add(ticket);
                client.add(ticket);
                break;
            case "Black Adam" :
                movie3.add(ticket);
                client.add(ticket);
                break;
            case "Avatar 2" :
                movie4.add(ticket);
                client.add(ticket);
                break;
        }
        loadChairs(chairs,movie,ticketList);
    }

    public void showChairs(ArrayList<Button> chair,ArrayList<Ticket> movie) {
        for (Ticket movies : movie) {
            for (Button chairs : chair) {
                if (chairs.getText().equals(movies.getChair())) {
                    chairs.setOpacity(-1);
                }
            }
        }
    }

    //Funciones de la vista Sell

    public void tblSell(String movie,TableView<Ticket> ticketList) {
        showTbl(ticketList,client);
    }
    public void foodTbl(String movie,TableView<Food> foodTbl,String food,double price) {
        Food foodAux = new Food(food, price);
        foodList.add(foodAux);
        foodView.add(foodAux);
        foodTbl.setItems(foodView);
        foodTbl.refresh();

    }
    public void showTbl(TableView<Ticket> ticketList,ArrayList<Ticket> movie){
        ticketsView.clear();
        for (Ticket tickets :movie) {
                ticketsView.add(tickets);
                ticketList.setItems(ticketsView);
                ticketList.refresh();
            }
    }

    //Factura
    public void deleteTbl(){
        client.clear();
        foodList.clear();
        foodView.clear();
    }

}
