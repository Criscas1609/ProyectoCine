package co.edu.cue.proyectofinalcorte3.service.impl;

import co.edu.cue.proyectofinalcorte3.service.*;

public class TheaterServiceImpl {

    private final ClientService clientService;
    private final EmployeeService employeeService;
    private final LoginService loginService;
    private final SellService sellService;

    public TheaterServiceImpl(){
        clientService = (ClientService) new ClientServiceImpl();
        employeeService = (EmployeeService) new EmployeeServiceImpl();
        loginService = (LoginService) new LoginServiceImpl();
        sellService = (SellService) new SellServiceImpl();
    }

    public ClientService getClientService() {
        return clientService;
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public SellService getSellService() {return sellService;}
    public LoginService getLoginService() {return loginService;}



}
