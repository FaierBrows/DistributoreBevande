/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributoredibevande.logic;

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
    
    public void changePanel(ChoicePanels panel){
        for (EventListener listener : listeners) {
            listener.changePanel(panel);
        }
    }
}
