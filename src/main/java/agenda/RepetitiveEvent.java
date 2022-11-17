package agenda;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Description : A repetitive Event
 */
public class RepetitiveEvent extends Event {
    ChronoUnit frequency;
    protected ArrayList<LocalDate>  DateException = new ArrayList<LocalDate>() ;

    /**
     * Constructs a repetitive event
     *
     * @param title the title of this event
     * @param start the start of this event
     * @param duration myDuration in seconds
     * @param frequency one of :
     * <UL>
     * <LI>ChronoUnit.DAYS for daily repetitions</LI>
     * <LI>ChronoUnit.WEEKS for weekly repetitions</LI>
     * <LI>ChronoUnit.MONTHS for monthly repetitions</LI>
     * </UL>
     */
    public RepetitiveEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency) {
        super(title, start, duration);
        this.frequency=frequency;

    }

    /**
     * Adds an exception to the occurrence of this repetitive event
     *
     * @param date the event will not occur at this date
     */
    public void addException(LocalDate date) {
        DateException.add(date);
    }



    /**
     *
     * @return the type of repetition
     */
    public ChronoUnit getFrequency() {
        return frequency;
    }
    public boolean isInDay(LocalDate aDay) {
        boolean test = false ;
        int a = 0;
        int b=0;
        LocalDate finevnmt = myStart.plus(myDuration).toLocalDate();
        if ( (myStart.toLocalDate().equals(aDay) ) || (finevnmt.isAfter(aDay) && myStart.toLocalDate().isBefore(aDay)) || (finevnmt.equals(aDay))){
            test=true;}
        for (int i=1;i<=11;i++) {if (aDay!=myStart.toLocalDate().plus(i,frequency)){b=b+1;}
        if(b==0){test=true;}}
        if (DateException.size()!=0){
        for (LocalDate ld : DateException){
            if (ld.equals(aDay)){
                a=a+1;
            }}
            if (a!=0){test=false;}

        }
        return test;

}}
