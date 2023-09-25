import java.util.ArrayList;

public class Room {
    private int number;
    private String name;
    private ArrayList<Room> adjacentRooms;

    public Room(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAdjacentRooms(ArrayList<Room> adjacentRooms) {
        this.adjacentRooms = adjacentRooms;
    }

    public ArrayList<Room> getAdjacentRooms() {
        return this.adjacentRooms;
    }
}
