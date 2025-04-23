package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        int tam = personas.length;
        for(int i = 1; i<tam;++i){
            Persona aux =personas[i];
            int j = i-1;
            while(j>=0 && aux.getEdad() <  personas[j].getEdad()){
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1]=aux;
        }


        
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int bajo=0;
        int alto=personas.length-1;
        while(alto>=bajo){
            int central = (alto+bajo)/2;

            if(personas[central].getEdad() == edad ){
                System.out.println();
                return personas[central];
            }
            if(personas[central].getEdad() > edad){
                System.out.println();
                alto = central-1;
            }else{
                System.out.println();
                bajo=central+1;
            }

        } return null;
        
        

    }
}
