package fr.wikiproject.observable;


public class SubjectObserver implements Observer {
    
    private int value = 0;  // value stored in this class, will be copied from the observable
    
    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public void update(Observable observable, Object data) {    // when we call the observer update
        this.value = ((int) data);  // we update the value
    }
}