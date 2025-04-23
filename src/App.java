
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),

        };
        ViewConsole mostrar = new ViewConsole();
        PersonaController controlador = new PersonaController();
        mostrar.printMessage("--Arreglo de personas--");
        mostrar.printPersonsArray(personas);
        mostrar.printMessage("Arreglo personas ordenado");
        controlador.ordenarPorEdad(personas);
        mostrar.printPersonsArray(personas);
        mostrar.printMessage("Buscar personas con edad 40");
        Persona personaBuscada=controlador.buscarPorEdad(personas, 40) ;
        if (personaBuscada == null){
            mostrar.printMessage("No se encontro persona con edad 40");
        }else{
            mostrar.printMessage("Se encontro persona con edad 40");
            mostrar.printMessage(personaBuscada.toString());
        }

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
