package fr.wikiproject.Observable;


public class Subject extends Observable {
    
    private int value; // value in the class we want to be observable
    
    public void changeValue(int newValue) { // when we edit the value, we also tell the observers that the value has changed
        this.value = newValue;  // update the value
        setChanged();           // the observers can know the value has changed
        this.notifyObservers(this.value); // notify the observers
    }

    @Override
    public String toString() {
        return "" + value;
    }
    
}
