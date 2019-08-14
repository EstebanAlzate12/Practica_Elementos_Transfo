/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velocity;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author s205e13
 */
public class Velocity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per1 = new Persona("Pablo Esteban Alzate Giraldo","result\\imagenes\\jet.jpg","Aca va un texto");
        
        per1.Add_estudios("Udem", "ingenieria telecomuniocacione ", "13/08/2019");
        
    }
    
}
