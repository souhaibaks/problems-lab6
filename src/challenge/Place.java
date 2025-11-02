package challenge;

public class Place implements Comparable<Place> {
    private String name;
    private int distance;

    public Place(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return name + " (" + distance + " km)";
    }

    @Override
    public int compareTo(Place other) {
        return Integer.compare(this.distance, other.distance);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Place place = (Place) obj;
        return name.equalsIgnoreCase(place.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }
}
