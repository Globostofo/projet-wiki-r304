package fr.wikiproject.Obervable;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    boolean changed = false;
    List<Observer> observers = new ArrayList<>();

    Observable(){}

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void setChanged() {
        this.changed = true;
    }

    public boolean hasChanged(){
        return changed;
    }

    public void clearChanged(){
        changed = false;
    }

    public int countObservers(){
        return observers.size();
    }

    public void deleteObservers(){
        observers.clear();
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(Object arg) {
        if (!hasChanged()) return;
        for (Observer observer : observers ){
            observer.update(this, arg);
        }
        clearChanged();
    }
}
