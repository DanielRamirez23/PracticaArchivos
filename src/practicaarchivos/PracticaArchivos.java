
package practicaarchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class PracticaArchivos {

    
    public static void main(String[] args) {
        String nombres[]={
            "Daniel",
            "Arturo",
            "David",
            "Alba",
            "Araceli",
            "Damian",
            "Cristian",
            "Oscar",
            "Manuel",
            "Sergio",
            "Paola",
            "Jose",
            "Ivan",
            "Juan",
            "Uriel",
            "Pedro",
        };
        //Recorrer una lista o un arreglo
        for (int nombre = 0; nombre< nombres.length;nombre++) {
            try {
                Files.write(
                        Paths.get("nombres.txt"),
                      ( nombres[nombre]+ "\r\n").getBytes(),
                        StandardOpenOption.APPEND);
            }catch (IOException e){
                
                
            }    }
        }
    
    
    
    
    
    
    
    
    
    
    }
    

