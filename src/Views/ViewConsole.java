package Views;

import Models.Persona;

public class ViewConsole {

    public void printPersonsArray(Persona [] personas){

        
        for (Persona persona : personas) {
            System.out.println(persona);
            
        }
    }
    public void printMessage(String message){
        System.out.println(message);

    }
    
}
