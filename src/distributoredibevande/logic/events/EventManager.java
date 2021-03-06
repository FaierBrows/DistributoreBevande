/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributoredibevande.logic.events;

import distributoredibevande.gui.ChoicePanels;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author loren
 */
public class EventManager {
    
    private static EventManager _instance = null;
    private List<EventListener> listeners = new LinkedList<>();
    private List<TastierinoListener> tastierinoListener = new LinkedList<>();
    
    
    public static EventManager getInstance() {
        if (_instance == null) {
            _instance = new EventManager();
        }
        return _instance;
    }
    
    private EventManager() {
        super();
    }
    
    public void addListeners(EventListener listener){
        this.listeners.add(listener);
    }
    
    public void addTastierinoListener(TastierinoListener listener){
        this.tastierinoListener.add(listener);
    }
    
    public void removeTastierinoListener(TastierinoListener listener){
        this.tastierinoListener.remove(listener);
    }
    
    public void changePanel(ChoicePanels panel){
        for (EventListener listener : listeners) {
            listener.changePanel(panel);
        }
    }
    
    public void buttonSelected(int numero){
        for (TastierinoListener listener : tastierinoListener) {
            listener.buttonSelected(numero);
        }
    }
    
    public void confirmSelected(int numero){
        for (TastierinoListener listener : tastierinoListener) {
            listener.confirmSelected(numero);
        }
    }
}
