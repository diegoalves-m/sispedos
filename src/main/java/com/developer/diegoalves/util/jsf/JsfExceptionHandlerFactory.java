
package com.developer.diegoalves.util.jsf;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

/**
 *
 * @author Diego Alves
 */
public class JsfExceptionHandlerFactory extends ExceptionHandlerFactory{
    
    private ExceptionHandlerFactory handlerFactory;
    
        
    public JsfExceptionHandlerFactory(ExceptionHandlerFactory factory) {
        this.handlerFactory = factory;
    }

    @Override
    public ExceptionHandler getExceptionHandler() {
        return new JsfExceptionHandler(handlerFactory.getExceptionHandler());
    }

}
