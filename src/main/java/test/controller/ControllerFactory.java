package test.controller;

import test.controller.empl.DeleteDepartmnetsController;
import test.controller.empl.ShowAllDepartmnetsController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 04.04.16.
 */
public class ControllerFactory {

    private Map<String, InternalController> controllerMap = new HashMap<String, InternalController>();

    private InternalController defaultController = new ShowAllDepartmnetsController();


    {
        controllerMap.put("/", defaultController);
        controllerMap.put("/deleteDepartment", new DeleteDepartmnetsController());
        controllerMap.put("/addDepartment", new AddDepartmnetsController());

    }

    public InternalController getControllerByName(String name){
        return controllerMap.get(name);
    }

    public InternalController getDefaultController(){
        return defaultController;
    }

}
