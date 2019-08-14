/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velocity;

import java.io.StringWriter;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

/**
 *
 * @author s205e13
 */
public class Vm {
    private Persona Per;

    public Vm(Persona Per) {
        this.Per = Per;
    }
    
    
    
    public void transformar(Persona Per) {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();
    
        Template t = velocityEngine.getTemplate("index.vm");
        
        VelocityContext context = new VelocityContext();
        context.put("name", "World");

        StringWriter writer = new StringWriter();
        t.merge( context, writer );
    }
}
