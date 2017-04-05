package DataStorage;

/**
 * Created by maxwkw on 4/4/2017.
 */

public class Event {
    String destination;
    String location;
    int startDate;
    int endDate;
    User organizer;
    int maxTraveler;
    String housing;
    String description;

    Event(String location, String destination, int startDate, int endDate, User organizer) {
        this.location = location;
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.organizer = organizer;
    }

    public void setMaxTraveler(int maxTraveler1) {
        this.maxTraveler = maxTraveler1;
    }

    public void setHousing(String housing1) {
        this.housing = housing1;
    }

    public void setDescription(String description1) {
        this.description = description1;
    }
}
