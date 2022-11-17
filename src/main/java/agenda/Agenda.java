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
        for (int i = 0; i < myEvents.size(); i++) {
            if(myEvents.get(i).isInDay(day)){
                evnmtcejour.add(myEvents.get(i));

            }
        }
        return evnmtcejour;
    }

} //ferme la classe

