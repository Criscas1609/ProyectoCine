package co.edu.cue.proyectofinalcorte3.controller;
import co.edu.cue.proyectofinalcorte3.model.Food;
import co.edu.cue.proyectofinalcorte3.model.Ticket;
import co.edu.cue.proyectofinalcorte3.service.*;
import co.edu.cue.proyectofinalcorte3.service.impl.TheaterServiceImpl;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import java.util.ArrayList;


public class ModelFactoryController implements ModelFactoryControllerService {

    TheaterServiceImpl theater;
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        theater = new TheaterServiceImpl();
    }

    //Funciones del Login
    public Boolean login(String userRegis, String passwordRegis){
        return theater.getLoginService().login(userRegis, passwordRegis);
    }


    //Ticketes
    void loadChairs(ArrayList<Button> chairs, String movie,TableView<Ticket> ticketList){
        theater.getSellService().loadChairs(chairs,movie,ticketList);
    }
    void chairMovie(String movie, String chair, double price, ArrayList<Button> chairs, TableView<Ticket> ticketList ){
        theater.getSellService().chairMovie(movie,chair,price,chairs,ticketList);
    }
    //Pestaña Venta
    void tblSell(String movie,TableView<Ticket> ticketList){
        theater.getSellService().tblSell(movie,ticketList);
    }

    void foodTbl(String movie, TableView<Food> foodTbl, String food, double price){
        theater.getSellService().foodTbl(movie,foodTbl,food,price);
    }

    //Venta Finalizada
    void deleteTbl(){
        theater.getSellService().deleteTbl();
    }

}
