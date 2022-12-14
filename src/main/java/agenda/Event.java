package agenda;

import java.time.*;

public class Event {

    /**
     * The myTitle of this event
     */
    private String myTitle;
    
    /**
     * The starting time of the event
     */
    public LocalDateTime myStart;

    /**
     * The durarion of the event 
     */
    protected Duration myDuration;


    /**
     * Constructs an event
     *
     * @param title the title of this event
     * @param start the start time of this event
     * @param duration the duration of this event
     */
    public Event(String title, LocalDateTime start, Duration duration) {
        this.myTitle = title;
        this.myStart = start;
        this.myDuration = duration;
    }

    /**
     * Tests if an event occurs on a given day
     *
     * @param aDay the day to test
     * @return true if the event occurs on that day, false otherwise
     */
    public boolean isInDay(LocalDate aDay) {
        boolean test = false ;
        LocalDate finevnmt = myStart.plus(myDuration).toLocalDate();
        if ( (myStart.toLocalDate().equals(aDay) ) || (finevnmt.isAfter(aDay) && myStart.toLocalDate().isBefore(aDay)) || (finevnmt.equals(aDay))){
            test=true;
        }
        return test;
    }

    /**
     * @return the myTitle
     */
    public String getTitle() {
        return myTitle;
    }

    /**
     * @return the myStart
     */
    public LocalDateTime getStart() {
        return myStart;
    }


    /**
     * @return the myDuration
     */
    public Duration getDuration() {
        return myDuration;
    }

    public String toString()
    { return " Title : " + getTitle() + "  Début : " + getStart() + "  Durée : " + getDuration();

    }
}
