package fr.wikiproject.Obervable;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();    // we create an object observable
        SubjectObserver observer = new SubjectObserver();   // we create an observer
        subject.addObserver(observer);  // we add the observer to the observable object

        System.out.println(subject); // print 0
        System.out.println(observer); // print 0 too because when added as an observer it checks the value

        subject.changeValue(7);

        System.out.println(subject); // print 7
        System.out.println(observer); // print 7

        subject.removeObserver(observer); // remove the observer

        subject.changeValue(1);

        System.out.println(subject); // print 1
        System.out.println(observer); // print 7 because when removed it from the observers
    }
}
