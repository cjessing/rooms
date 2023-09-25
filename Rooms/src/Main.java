import java.util.ArrayList;

public class Main {
    static Adventure adventure = new Adventure();

    public static void main(String[] args) {
        adventure.initialize();
        adventure.setupConnections();

        ArrayList<Room> rooms = adventure.getRooms();

        for (Room room : rooms) {
            System.out.println(room.getName() + ", adjacent to " + room.getAdjacentRooms());
        }
    }
}