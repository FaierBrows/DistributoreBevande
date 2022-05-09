/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package distributoredibevande.logic.exceptions;

/**
 *
 * @author Studente
 */
public class EndedQuantityExceptions extends Exception{
    
    public enum Field{
        NOTFOUND,
        NOTEXISTING,
        OUTOFSTOCK;
    }
    
    public EndedQuantityExceptions(){
        super("Qualcosa è andato storto");
    }
    
    public EndedQuantityExceptions(Field field, String detail){
        super("<html><div>["+ field.name()+"] problem: "+ detail+ "</div>");
    }
    
}
