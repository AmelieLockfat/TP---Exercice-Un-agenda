package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {

    protected List<Event> myEvents = new LinkedList<>();

    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    public void addEvent(Event e) {
        myEvents.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        ArrayList<Event> evnmtcejour = new ArrayList<Event>();
        for (Event e : myEvents) {
            if ((e.getStart().toLocalDate()==day) || (e.getStart().toLocalDate().plus(e.getDuration()).compareTo(day)>0)){
                evnmtcejour.add(e);
            }
        }
        return evnmtcejour;
    }
} //ferme la classe

