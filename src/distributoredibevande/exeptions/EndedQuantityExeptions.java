/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package distributoredibevande.exeptions;

/**
 *
 * @author Studente
 */
public class EndedQuantityExeptions extends Exception{
    
    public enum Field{
        NOTFOUND,
        NOTEXISTING,
        OUTOFSTOCK;
    }
    
    public EndedQuantityExeptions(){
        super("Qualcosa è andato storto");
    }
    
    public EndedQuantityExeptions(Field field, String detail){
        super("<html><div>["+ field.name()+"] problem: "+ detail+ "</div>");
    }
    
}
